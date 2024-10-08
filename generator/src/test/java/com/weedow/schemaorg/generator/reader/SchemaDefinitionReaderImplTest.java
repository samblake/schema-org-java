package com.weedow.schemaorg.generator.reader;

import com.weedow.schemaorg.generator.model.jsonld.ClassItem;
import com.weedow.schemaorg.generator.model.jsonld.DefaultItem;
import com.weedow.schemaorg.generator.model.jsonld.GraphItem;
import com.weedow.schemaorg.generator.model.jsonld.PropertyItem;
import com.weedow.schemaorg.generator.model.jsonld.SchemaDefinition;
import org.assertj.core.api.Assertions;
import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.comment;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.domainInclude;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.label;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.partOf;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.rangeInclude;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.source;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.subClassOf;
import static com.weedow.schemaorg.generator.model.handler.ModelHandlerTestUtils.supersededBy;
import static org.assertj.core.data.MapEntry.entry;

class SchemaDefinitionReaderImplTest {

    @Test
    void read() throws SchemaDefinitionReaderException {
        final SchemaDefinitionReader schemaDefinitionReader = new SchemaDefinitionReaderImpl();
        SchemaDefinition schemaDefinition = schemaDefinitionReader.read(getClass().getResourceAsStream("/schemaorg-current-https.jsonld"));

        Assertions.assertThat(schemaDefinition).isNotNull();
        Assertions.assertThat(schemaDefinition.getContext()).isNotEmpty()
                .containsExactly(
                        entry("brick", "https://brickschema.org/schema/Brick#"),
                        entry("csvw", "http://www.w3.org/ns/csvw#"),
                        entry("dc", "http://purl.org/dc/elements/1.1/"),
                        entry("dcam", "http://purl.org/dc/dcam/"),
                        entry("dcat", "http://www.w3.org/ns/dcat#"),
                        entry("dcmitype", "http://purl.org/dc/dcmitype/"),
                        entry("dcterms", "http://purl.org/dc/terms/"),
                        entry("doap", "http://usefulinc.com/ns/doap#"),
                        entry("foaf", "http://xmlns.com/foaf/0.1/"),
                        entry("geo", "http://www.opengis.net/ont/geosparql#"),
                        entry("odrl", "http://www.w3.org/ns/odrl/2/"),
                        entry("org", "http://www.w3.org/ns/org#"),
                        entry("owl", "http://www.w3.org/2002/07/owl#"),
                        entry("prof", "http://www.w3.org/ns/dx/prof/"),
                        entry("prov", "http://www.w3.org/ns/prov#"),
                        entry("qb", "http://purl.org/linked-data/cube#"),
                        entry("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"),
                        entry("rdfs", "http://www.w3.org/2000/01/rdf-schema#"),
                        entry("schema", "https://schema.org/"),
                        entry("sh", "http://www.w3.org/ns/shacl#"),
                        entry("skos", "http://www.w3.org/2004/02/skos/core#"),
                        entry("sosa", "http://www.w3.org/ns/sosa/"),
                        entry("ssn", "http://www.w3.org/ns/ssn/"),
                        entry("time", "http://www.w3.org/2006/time#"),
                        entry("vann", "http://purl.org/vocab/vann/"),
                        entry("void", "http://rdfs.org/ns/void#"),
                        entry("wgs", "https://www.w3.org/2003/01/geo/wgs84_pos#"),
                        entry("xsd", "http://www.w3.org/2001/XMLSchema#")
                );
        Assertions.assertThat(schemaDefinition.getGraph()).hasSize(2805);

        Assertions.assertThat(filter(schemaDefinition, graphItem -> graphItem instanceof DefaultItem)).hasSize(466);
        // Example with one DefaultItem
        Assertions.assertThat(filter(schemaDefinition, graphItem -> "schema:OriginalMediaContent".equals(graphItem.getId())))
                .extracting("class", "id", "types", "comment", "label", "domainIncludes", "rangeIncludes", "supersededBy", "subClassOf", "partOf", "source")
                .containsExactly(
                        Tuple.tuple(
                                DefaultItem.class,
                                "schema:OriginalMediaContent",
                                Arrays.asList("schema:MediaManipulationRatingEnumeration"),
                                comment("en",
                                        "Content coded 'as original media content' in a [[MediaReview]], considered in the context of how it was published or shared.\n\n" +
                                                "For a [[VideoObject]] to be 'original': No evidence the footage has been misleadingly altered or manipulated, though it may contain false or misleading claims.\n\n" +
                                                "For an [[ImageObject]] to be 'original': No evidence the image has been misleadingly altered or manipulated, though it may still contain false or misleading claims.\n\n" +
                                                "For an [[ImageObject]] with embedded text to be 'original': No evidence the image has been misleadingly altered or manipulated, though it may still contain false or misleading claims.\n\n" +
                                                "For an [[AudioObject]] to be 'original': No evidence the audio has been misleadingly altered or manipulated, though it may contain false or misleading claims.\n"
                                ),
                                label("en", "OriginalMediaContent"),
                                null, null, null, null, Arrays.asList(partOf("https://pending.schema.org")), Arrays.asList(source("https://github.com/schemaorg/schemaorg/issues/2450"))
                        )
                );

        Assertions.assertThat(filter(schemaDefinition, graphItem -> graphItem instanceof ClassItem)).hasSize(887);
        // Example with ClassItems
        Assertions.assertThat(filter(schemaDefinition, graphItem -> "schema:StatusEnumeration".equals(graphItem.getId())))
                .extracting("class", "id", "types", "comment", "label", "domainIncludes", "rangeIncludes", "supersededBy", "subClassOf", "partOf", "source")
                .containsExactly(
                        Tuple.tuple(
                                ClassItem.class,
                                "schema:StatusEnumeration",
                                Arrays.asList("rdfs:Class"),
                                comment("en", "Lists or enumerations dealing with status types."),
                                label("en", "StatusEnumeration"),
                                null, null, null, Arrays.asList(subClassOf("schema:Enumeration")), null, Arrays.asList(source("https://github.com/schemaorg/schemaorg/issues/2604"))
                        )
                );
        Assertions.assertThat(filter(schemaDefinition, graphItem -> "schema:URL".equals(graphItem.getId())))
                .extracting("class", "id", "types", "comment", "label", "domainIncludes", "rangeIncludes", "supersededBy", "subClassOf", "partOf", "source")
                .containsExactly(
                        Tuple.tuple(
                                ClassItem.class,
                                "schema:URL",
                                Arrays.asList("rdfs:Class"),
                                comment("en", "Data type: URL."),
                                label("en", "URL"),
                                null, null, null, Arrays.asList(subClassOf("schema:Text")), null, null
                        )
                );
        Assertions.assertThat(filter(schemaDefinition, graphItem -> "schema:Person".equals(graphItem.getId())))
                .extracting("class", "id", "types", "comment", "label", "domainIncludes", "rangeIncludes", "supersededBy", "subClassOf", "partOf", "source")
                .containsExactly(
                        Tuple.tuple(
                                ClassItem.class,
                                "schema:Person",
                                Arrays.asList("rdfs:Class"),
                                comment("en", "A person (alive, dead, undead, or fictional)."),
                                label("en", "Person"),
                                null, null, null, Arrays.asList(subClassOf("schema:Thing")), null, Arrays.asList(source("http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNews"))
                        )
                );

        Assertions.assertThat(filter(schemaDefinition, graphItem -> {
                    List<String> types = graphItem.getTypes();
                    return types.size() == 2 && types.contains("rdfs:Class") && types.contains("schema:DataType");
                }))
                .extracting("class", "id", "types", "comment", "label", "domainIncludes", "rangeIncludes", "supersededBy", "subClassOf", "partOf", "source")
                .containsExactly(
                        Tuple.tuple(
                                DefaultItem.class,
                                "schema:Text",
                                Arrays.asList("rdfs:Class", "schema:DataType"),
                                comment("en", "Data type: Text."),
                                label("en", "Text"),
                                null, null, null, null, null, null
                        ),
                        Tuple.tuple(
                                DefaultItem.class,
                                "schema:Date",
                                Arrays.asList("schema:DataType", "rdfs:Class"),
                                comment("en", "A date value in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)."),
                                label("en", "Date"),
                                null, null, null, null, null, null
                        ),
                        Tuple.tuple(
                                DefaultItem.class,
                                "schema:Number",
                                Arrays.asList("rdfs:Class", "schema:DataType"),
                                comment("en",
                                        "Data type: Number.\\n\\n" +
                                                "Usage guidelines:\\n\\n" +
                                                "* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similar Unicode symbols.\\n" +
                                                "* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator."
                                ),
                                label("en", "Number"),
                                null, null, null, null, null, null
                        ),
                        Tuple.tuple(
                                DefaultItem.class,
                                "schema:Time",
                                Arrays.asList("schema:DataType", "rdfs:Class"),
                                comment("en", "A point in time recurring on multiple days in the form hh:mm:ss[Z|(+|-)hh:mm] (see [XML schema for details](http://www.w3.org/TR/xmlschema-2/#time))."),
                                label("en", "Time"),
                                null, null, null, null, null, null
                        ),
                        Tuple.tuple(
                                DefaultItem.class,
                                "schema:Boolean",
                                Arrays.asList("schema:DataType", "rdfs:Class"),
                                comment("en", "Boolean: True or False."),
                                label("en", "Boolean"),
                                null, null, null, null, null, null
                        ),
                        Tuple.tuple(
                                DefaultItem.class,
                                "schema:DateTime",
                                Arrays.asList("schema:DataType", "rdfs:Class"),
                                comment("en", "A combination of date and time of day in the form [-]CCYY-MM-DDThh:mm:ss[Z|(+|-)hh:mm] (see Chapter 5.4 of ISO 8601)."),
                                label("en", "DateTime"),
                                null, null, null, null, null, null
                        )
                );

        Assertions.assertThat(filter(schemaDefinition, graphItem -> graphItem instanceof PropertyItem)).hasSize(1452);
        // Example with PropertyItems
        Assertions.assertThat(filter(schemaDefinition, graphItem -> "schema:season".equals(graphItem.getId())))
                .extracting("class", "id", "types", "comment", "label", "domainIncludes", "rangeIncludes", "supersededBy", "subClassOf", "partOf", "source")
                .containsExactly(
                        Tuple.tuple(
                                PropertyItem.class,
                                "schema:season",
                                Arrays.asList("rdf:Property"),
                                comment("en", "A season in a media series."),
                                label("en", "season"),
                                Arrays.asList(domainInclude("schema:VideoGameSeries"), domainInclude("schema:TVSeries"), domainInclude("schema:RadioSeries")),
                                Arrays.asList(rangeInclude("schema:URL"), rangeInclude("schema:CreativeWorkSeason")),
                                supersededBy("schema:containsSeason"),
                                null, null, null
                        )
                );
        Assertions.assertThat(filter(schemaDefinition, graphItem -> "schema:telephone".equals(graphItem.getId())))
                .extracting("class", "id", "types", "comment", "label", "domainIncludes", "rangeIncludes", "supersededBy", "subClassOf", "partOf", "source")
                .containsExactly(
                        Tuple.tuple(
                                PropertyItem.class,
                                "schema:telephone",
                                Arrays.asList("rdf:Property"),
                                comment("en", "The telephone number."),
                                label("en", "telephone"),
                                Arrays.asList(domainInclude("schema:Place"), domainInclude("schema:Organization"), domainInclude("schema:ContactPoint"), domainInclude("schema:Person")),
                                Arrays.asList(rangeInclude("schema:Text")),
                                null, null, null, null
                        )
                );
        Assertions.assertThat(filter(schemaDefinition, graphItem -> "schema:governmentBenefitsInfo".equals(graphItem.getId())))
                .extracting("class", "id", "types", "comment", "label", "domainIncludes", "rangeIncludes", "supersededBy", "subClassOf", "partOf", "source")
                .containsExactly(
                        Tuple.tuple(
                                PropertyItem.class,
                                "schema:governmentBenefitsInfo",
                                Arrays.asList("rdf:Property"),
                                comment("en", "governmentBenefitsInfo provides information about government benefits associated with a SpecialAnnouncement."),
                                label("en", "governmentBenefitsInfo"),
                                Arrays.asList(domainInclude("schema:SpecialAnnouncement")),
                                Arrays.asList(rangeInclude("schema:GovernmentService")),
                                null,
                                null,
                                Arrays.asList(partOf("https://pending.schema.org")), Arrays.asList(source("https://github.com/schemaorg/schemaorg/issues/2534"))
                        )
                );
    }

    @Test
    void throw_exception_when_read_invalid_jsonld() {
        final SchemaDefinitionReader schemaDefinitionReader = new SchemaDefinitionReaderImpl();
        Assertions.assertThatThrownBy(() -> schemaDefinitionReader.read(getClass().getResourceAsStream("/data/invalid-schemaorg.jsonld")))
                .isInstanceOf(SchemaDefinitionReaderException.class)
                .hasMessage("Could not read the JSON schema definition: Unrecognized token 'invalid': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')\n" +
                        " at [Source: (String)\"invalid json\"; line: 1, column: 8]");
    }

    private static List<GraphItem> filter(SchemaDefinition schemaDefinition, Predicate<GraphItem> predicate) {
        return schemaDefinition.getGraph().stream().filter(predicate).collect(Collectors.toList());
    }
}