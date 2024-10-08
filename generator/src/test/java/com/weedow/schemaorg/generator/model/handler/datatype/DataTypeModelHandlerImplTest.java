package com.weedow.schemaorg.generator.model.handler.datatype;

import com.weedow.schemaorg.generator.model.Type;
import com.weedow.schemaorg.generator.model.jsonld.GraphItem;
import org.assertj.core.api.Assertions;
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
import java.util.stream.Stream;

import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.comment;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.label;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.partOf;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.source;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.subClassOf;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DataTypeModelHandlerImplTest {

    @InjectMocks
    private DataTypeModelHandlerImpl modelHandler;

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
        when(graphItem.getId()).thenReturn("schema:MyType");
        when(graphItem.getLabel()).thenReturn(label("en", "MyType"));
        when(graphItem.getComment()).thenReturn(comment("en", "This is my Type"));
        when(graphItem.getPartOf()).thenReturn(Arrays.asList(partOf("https://pending.schema.org")));
        when(graphItem.getSource()).thenReturn(Arrays.asList(source("https://github.com/schemaorg/schemaorg/issues/2373")));
        when(graphItem.getSubClassOf()).thenReturn(Arrays.asList(subClassOf("rdfs:Class"), subClassOf("schema:Parent")));

        modelHandler.handle(schemaDefinitions, graphItem);
        Assertions.assertThat(schemaDefinitions).isNotEmpty().containsOnlyKeys("schema:MyType", "schema:Parent", "schema:DataType");
        Assertions.assertThat(schemaDefinitions.get("schema:MyType"))
                .extracting(
                        "id", "javaType", "name", "description",
                        "properties", "allProperties",
                        "parents", "baseParent",
                        "enumerationType", "enumerationMembers",
                        "partOf", "source"
                )
                .containsExactly(
                        "schema:MyType", null, "MyType", "This is my Type",
                        Collections.emptySet(), Collections.emptySet(),
                        Arrays.asList(schemaDefinitions.get("schema:Parent"), schemaDefinitions.get("schema:DataType")), null,
                        false, Collections.emptyList(),
                        Arrays.asList("https://pending.schema.org"), Arrays.asList("https://github.com/schemaorg/schemaorg/issues/2373")
                );
        Assertions.assertThat(schemaDefinitions.get("schema:Parent"))
                .extracting(
                        "id", "javaType", "name", "description",
                        "properties", "allProperties",
                        "parents", "baseParent",
                        "enumerationType", "enumerationMembers",
                        "partOf", "source"
                )
                .containsExactly(
                        "schema:Parent", null, null, null,
                        Collections.emptySet(), Collections.emptySet(),
                        Collections.emptyList(), null,
                        false, Collections.emptyList(),
                        Collections.emptyList(), Collections.emptyList()
                );
        Assertions.assertThat(schemaDefinitions.get("schema:DataType"))
                .extracting(
                        "id", "javaType", "name", "description",
                        "properties", "allProperties",
                        "parents",
                        "enumerationType", "enumerationMembers",
                        "partOf", "source"
                )
                .containsExactly(
                        "schema:DataType", null, null, null,
                        Collections.emptySet(), Collections.emptySet(),
                        Collections.emptyList(),
                        false, Collections.emptyList(),
                        Collections.emptyList(), Collections.emptyList()
                );
    }

    private static Stream<Arguments> supports() {
        return Stream.of(
                Arguments.of(Arrays.asList("rdfs:Class", "schema:DataType"), true),
                Arguments.of(Arrays.asList("rdfs:Class", "rdfs:OtherType"), false),
                Arguments.of(Arrays.asList("rdfs:OtherClass", "rdfs:DataType"), false)
        );
    }
}