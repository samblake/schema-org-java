package com.weedow.schemaorg.generator.model.handler.datatype;

import com.weedow.schemaorg.generator.model.Type;
import com.weedow.schemaorg.generator.model.jsonld.GraphItem;
import com.weedow.schemaorg.generator.model.jsonld.SubClassOf;
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
import static java.util.Collections.singletonList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SubDataTypeModelHandlerImplTest {

    @InjectMocks
    private SubDataTypeModelHandlerImpl modelHandler;

    @ParameterizedTest
    @MethodSource
    void supports(List<String> types, List<SubClassOf> subClasses, boolean expected) {
        GraphItem graphItem = mock(GraphItem.class);
        when(graphItem.getTypes()).thenReturn(types);
        when(graphItem.getSubClassOf()).thenReturn(subClasses);
        boolean result = modelHandler.supports(graphItem);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void handle() {
        Map<String, Type> schemaDefinitions = new HashMap<>();

        GraphItem graphItem = mock(GraphItem.class);
        when(graphItem.getId()).thenReturn("schema:XPathType");
        when(graphItem.getLabel()).thenReturn(label("en", "XPathType"));
        when(graphItem.getComment()).thenReturn(comment("en", "This is XPathType"));
        when(graphItem.getPartOf()).thenReturn(singletonList(partOf("https://pending.schema.org")));
        when(graphItem.getSource()).thenReturn(singletonList(source("https://github.com/schemaorg/schemaorg/issues/1672")));
        when(graphItem.getSubClassOf()).thenReturn(singletonList(subClassOf("schema:Text")));

        modelHandler.handle(schemaDefinitions, graphItem);
        Assertions.assertThat(schemaDefinitions).isNotEmpty().containsOnlyKeys("schema:Text", "schema:XPathType");

        Assertions.assertThat(schemaDefinitions.get("schema:Text"))
                .extracting(
                        "id", "javaType", "name", "description",
                        "properties", "allProperties",
                        "parents", "baseParent",
                        "enumerationType", "enumerationMembers",
                        "partOf", "source"
                )
                .containsExactly(
                        "schema:Text", null, null, null,
                        Collections.emptySet(), Collections.emptySet(),
                        Collections.emptyList(), null,
                        false, Collections.emptyList(),
                        Collections.emptyList(), Collections.emptyList()
                );

        Assertions.assertThat(schemaDefinitions.get("schema:XPathType"))
                .extracting(
                        "id", "javaType", "name", "description",
                        "properties", "allProperties",
                        "parents", "baseParent",
                        "enumerationType", "enumerationMembers",
                        "partOf", "source"
                )
                .containsExactly(
                        "schema:XPathType", "java.lang.String", "XPathType", "This is XPathType",
                        Collections.emptySet(), Collections.emptySet(),
                        Arrays.asList(schemaDefinitions.get("schema:Text")), null,
                        false, Collections.emptyList(),
                        Arrays.asList("https://pending.schema.org"), Arrays.asList("https://github.com/schemaorg/schemaorg/issues/1672")
                );
    }

    private static Stream<Arguments> supports() {
        return Stream.of(
                Arguments.of(Arrays.asList("rdfs:Class"), Arrays.asList(subClassOf("schema:Text")), true),
                Arguments.of(Arrays.asList("rdfs:Class"), null, false),
                Arguments.of(Arrays.asList("rdfs:Class", "schema:DataType"), Arrays.asList(subClassOf("schema:Text")), false),
                Arguments.of(Arrays.asList("rdfs:Class"), Arrays.asList(subClassOf("schema:OtherType")), false),
                Arguments.of(Arrays.asList("schema:OtherType"), Arrays.asList(subClassOf("schema:Text")), false)
        );
    }
}