package com.weedow.schemaorg.generator.model.handler;

import com.weedow.schemaorg.generator.model.Property;
import com.weedow.schemaorg.generator.model.Type;
import com.weedow.schemaorg.generator.model.jsonld.GraphItem;
import org.assertj.core.api.Assertions;
import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.comment;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.domainInclude;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.label;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.partOf;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.rangeInclude;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.source;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.supersededBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PropertyModelHandlerImplTest {

    @InjectMocks
    private PropertyModelHandlerImpl modelHandler;

    @ParameterizedTest
    @MethodSource
    void supports(List<String> types, boolean expected) {
        GraphItem graphItem = mock(GraphItem.class);
        when(graphItem.getTypes()).thenReturn(types);
        boolean result = modelHandler.supports(graphItem);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void handle() {
        Map<String, Type> schemaDefinitions = new HashMap<>();

        GraphItem graphItem = mock(GraphItem.class);
        when(graphItem.getId()).thenReturn("schema:MyProperty");
        when(graphItem.getRangeIncludes()).thenReturn(Arrays.asList(rangeInclude("schema:Text")));
        when(graphItem.getLabel()).thenReturn(label("en", "myProperty"));
        when(graphItem.getComment()).thenReturn(comment("en", "This is my Property"));
        when(graphItem.getPartOf()).thenReturn(Arrays.asList(partOf("https://pending.schema.org")));
        when(graphItem.getSource()).thenReturn(Arrays.asList(source("https://github.com/schemaorg/schemaorg/issues/2373")));
        when(graphItem.getDomainIncludes()).thenReturn(Arrays.asList(domainInclude("schema:MyType")));

        modelHandler.handle(schemaDefinitions, graphItem);
        Assertions.assertThat(schemaDefinitions).isNotEmpty().containsOnlyKeys("schema:Text", "schema:MyType");

        Assertions.assertThat(schemaDefinitions.get("schema:Text"))
                .extracting(
                        "id", "javaType", "name", "description",
                        "properties", "allProperties",
                        "parents",
                        "enumerationType", "enumerationMembers",
                        "partOf", "source"
                )
                .containsExactly(
                        "schema:Text", null, null, null,
                        Collections.emptySet(), Collections.emptySet(),
                        Collections.emptyList(),
                        false, Collections.emptyList(),
                        Collections.emptyList(), Collections.emptyList()
                );

        Type myType = schemaDefinitions.get("schema:MyType");
        Assertions.assertThat(myType)
                .extracting(
                        "id", "javaType", "name", "description",
                        /*"properties", "allProperties",*/
                        "parents",
                        "enumerationType", "enumerationMembers",
                        "partOf", "source"
                )
                .containsExactly(
                        "schema:MyType", null, null, null,
                        /*Collections.emptySet(), Collections.emptySet(),*/
                        Collections.emptyList(),
                        false, Collections.emptyList(),
                        Collections.emptyList(), Collections.emptyList()
                );

        Set<Property> properties = myType.getProperties();
        Assertions.assertThat(properties)
                .extracting("id", "field.name", "field.fieldName", "types")
                .containsExactly(
                        Tuple.tuple("schema:MyProperty", "myProperty", "myProperty", Arrays.asList(schemaDefinitions.get("schema:Text")))
                );
        Assertions.assertThat(properties)
                .extracting("accessor")
                .extracting("name", "fieldName", "getterMethod", "description", "partOf", "source", "fieldTypeLinks", "returnFieldType", "cast")
                .containsExactly(
                        Tuple.tuple("myProperty", "myProperty", "getMyPropertyList", "This is my Property", Arrays.asList("https://pending.schema.org"), Arrays.asList("https://github.com/schemaorg/schemaorg/issues/2373"), "{@link null}", null, null)
                );
        Assertions.assertThat(properties)
                .flatExtracting("mutators")
                .extracting("name", "fieldName", "setterMethod", "description", "partOf", "source", "paramType", "paramValue")
                .containsExactly(
                        Tuple.tuple("myProperty", "myProperty", "setMyProperty", "This is my Property", Arrays.asList("https://pending.schema.org"), Arrays.asList("https://github.com/schemaorg/schemaorg/issues/2373"), null, "myProperty")
                );

        Set<Property> allProperties = myType.getAllProperties();
        Assertions.assertThat(allProperties)
                .extracting("id", "field.name", "field.fieldName", "types")
                .containsExactly(
                        Tuple.tuple("schema:MyProperty", "myProperty", "myProperty", Arrays.asList(schemaDefinitions.get("schema:Text")))
                );
        Assertions.assertThat(allProperties)
                .extracting("accessor")
                .extracting("name", "fieldName", "getterMethod", "description", "partOf", "source", "fieldTypeLinks", "returnFieldType", "cast")
                .containsExactly(
                        Tuple.tuple("myProperty", "myProperty", "getMyPropertyList", "This is my Property", Arrays.asList("https://pending.schema.org"), Arrays.asList("https://github.com/schemaorg/schemaorg/issues/2373"), "{@link null}", null, null)
                );
        Assertions.assertThat(allProperties)
                .flatExtracting("mutators")
                .extracting("name", "fieldName", "setterMethod", "description", "partOf", "source", "paramType", "paramValue")
                .containsExactly(
                        Tuple.tuple("myProperty", "myProperty", "setMyProperty", "This is my Property", Arrays.asList("https://pending.schema.org"), Arrays.asList("https://github.com/schemaorg/schemaorg/issues/2373"), null, "myProperty")
                );
    }

    @Test
    void handle_with_deprecated_type() {
        Map<String, Type> schemaDefinitions = new HashMap<>();

        GraphItem graphItem = mock(GraphItem.class);
        when(graphItem.getRangeIncludes()).thenReturn(Collections.emptyList());
        when(graphItem.getSupersededBy()).thenReturn(supersededBy("NewProperty"));

        modelHandler.handle(schemaDefinitions, graphItem);
        Assertions.assertThat(schemaDefinitions).isEmpty();
    }

    private static Stream<Arguments> supports() {
        return Stream.of(
                Arguments.of(Arrays.asList("rdf:Property"), true),
                Arguments.of(Arrays.asList("rdf:Property", "rdfs:Class"), true),
                Arguments.of(Arrays.asList("rdfs:Class"), false)
        );
    }
}