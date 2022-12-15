package com.weedow.schemaorg.serializer.deserialization;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.weedow.schemaorg.commons.model.JsonLdNode;
import com.weedow.schemaorg.commons.model.JsonLdNodeImpl;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import com.weedow.schemaorg.serializer.JsonLdException;
import com.weedow.schemaorg.serializer.JsonLdNodeMixIn;
import com.weedow.schemaorg.serializer.deserialization.processor.DeserializerPostProcessorImpl;
import com.weedow.schemaorg.serializer.deserialization.processor.PostProcessor;
import com.weedow.schemaorg.serializer.serialization.JsonLdDataTypeSerializer;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JsonLdDeserializerImpl implements JsonLdDeserializer {

    private final PostProcessor postProcessor = new DeserializerPostProcessorImpl();

    private final ObjectMapper objectMapper;

    public JsonLdDeserializerImpl() {
        this(Collections.emptyMap());
    }

    public JsonLdDeserializerImpl(String packageName) {
        this(
                PackageScanner.getClassesIn(packageName)
                        .stream()
                        .collect(Collectors.toMap(
                                clazz -> {
                                    final JsonLdTypeName jsonLdTypeName = clazz.getAnnotation(JsonLdTypeName.class);
                                    return jsonLdTypeName != null && !jsonLdTypeName.value().isEmpty() ? jsonLdTypeName.value() : clazz.getSimpleName();
                                },
                                Function.identity()
                        ))
        );
    }

    public JsonLdDeserializerImpl(Map<String, Class<?>> otherTypes) {
        this.objectMapper = objectMapper(otherTypes);
    }

    private static ObjectMapper objectMapper(Map<String, Class<?>> otherTypes) {
        TypeFactory typeFactory = new JsonLdTypeFactory(otherTypes);

        JsonMapper.Builder builder = JsonMapper.builder()
                // Register support for Java 8 date/time types (specified in JSR-310 specification)
                .findAndAddModules()
                .enable(JsonGenerator.Feature.IGNORE_UNKNOWN)
                .enable(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY)
                .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
                .enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING)
                .enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)
                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .visibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
                .visibility(PropertyAccessor.CREATOR, JsonAutoDetect.Visibility.ANY)
                .visibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
                .activateDefaultTypingAsProperty(
                        BasicPolymorphicTypeValidator.builder()
                                .allowIfBaseType(Object.class)
                                .allowIfSubTypeIsArray()
                                .build(),
                        ObjectMapper.DefaultTyping.NON_FINAL,
                        "@type"
                )
                .typeFactory(typeFactory)
                .addMixIn(JsonLdNodeImpl.class, JsonLdNodeMixIn.class);

        SimpleModule dataTypeModule = new SimpleModule("JsonLdDataType Module")
                .addSerializer(new JsonLdDataTypeSerializer())
                .setDeserializerModifier(new JsonLdDataTypeDeserializerModifier());
        builder.addModule(dataTypeModule);

        return builder.build();
    }

    @Override
    public <T extends JsonLdNode> T deserialize(String json) throws JsonLdException {
        try {
            @SuppressWarnings("unchecked")
            T obj = (T) objectMapper.readValue(json, JsonLdNode.class);

            obj = postProcessor.process(obj);

            return obj;
        } catch (JsonProcessingException e) {
            throw new JsonLdException(String.format("JSON-LD deserialization internal error: %s.", e.getMessage()), e);
        }
    }
}
