package com.weedow.schemaorg.generator.model;

import com.jparams.verifier.tostring.ToStringVerifier;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.mock;

class ModelVerifierTest {

    @Test
    void equalsContract() {
        EqualsVerifier
                .forPackage(getClass().getPackageName())
                .except(Property.class, Type.class)
                // Skip '*Builder' classes
                .except(clazz -> clazz.getSimpleName().endsWith("Builder"))
                .verify();
    }

    @Test
    void equalsContractProperty() {
        EqualsVerifier
                .forClass(Property.class)
                .withPrefabValues(List.class, List.of(mock(Type.class)), List.of(mock(Type.class)))
                .withPrefabValues(Type.class, mock(Type.class), mock(Type.class))
                .withIgnoredFields("types")
                .verify();
    }

    @Test
    void equalsContractType() {
        EqualsVerifier
                .simple()
                .forClass(Type.class)
                .withPrefabValues(List.class, List.of(mock(Type.class)), List.of(mock(Type.class)))
                .withPrefabValues(Type.class, mock(Type.class), mock(Type.class))
                .withIgnoredFields("allProperties")
                .verify();
    }

    @Test
    void toStringContract() {
        ToStringVerifier
                .forPackage(getClass().getPackageName(), false)
                // Ignore fields that are not present in toString() method, or their toString representation is modified before being added (eg.Supplier fields)
                .withIgnoredFields(
                        "parents",
                        "fieldType",
                        "fieldTypeLinks", "returnFieldType", "cast",
                        "paramType", "paramValue"
                )
                .verify();
    }

    @Test
    void toStringContractProperty() {
        ToStringVerifier.forClass(Property.class).verify();
        Property property = newProperty("id", "name", "fieldName", "Lorem Ipsum is simply dummy text of the printing and typesetting industry.", List.of(new Type("id1").setName("type name 1"), new Type("id2").setName("type name 2")), List.of("partOf1", "partOf2"), List.of("source1", "source2"));
        Assertions.assertThat(property).hasToString(
                "Property(" +
                        "id=id" +
                        ", field=Property.Field(name=name, fieldType=Object)" +
                        ", accessor=Property.Accessor(name=name, description=Lorem Ipsum is simply dummy text of the printing and typesetting industry., partOf=[partOf1, partOf2], source=[source1, source2], fieldTypeLinks={@link Type}, returnFieldType=<T> T, cast=(T))" +
                        ", mutators=[Property.Mutator(name=name, description=Lorem Ipsum is simply dummy text of the printing and typesetting industry., partOf=[partOf1, partOf2], source=[source1, source2], paramType=Object, paramValue=fieldName)]" +
                        ", types=[" +
                        "Type(id=id1, javaType=null, name=type name 1, properties=[], allProperties=[], baseParent=null, partOf=[], source=[], enumerationType=null, enumerationMembers=[], description=null, parents=[])" +
                        ", Type(id=id2, javaType=null, name=type name 2, properties=[], allProperties=[], baseParent=null, partOf=[], source=[], enumerationType=null, enumerationMembers=[], description=null, parents=[])" +
                        "]" +
                        ")"
        );

        Property nullProperty = newProperty(null, null, null, null, null, null, null);
        Assertions.assertThat(nullProperty).hasToString(
                "Property(" +
                        "id=null" +
                        ", field=Property.Field(name=null, fieldType=Object)" +
                        ", accessor=Property.Accessor(name=null, description=null, partOf=null, source=null, fieldTypeLinks={@link Type}, returnFieldType=<T> T, cast=(T))" +
                        ", mutators=[Property.Mutator(name=null, description=null, partOf=null, source=null, paramType=Object, paramValue=null)]" +
                        ", types=null" +
                        ")"
        );
    }

    @Test
    void toFormattedStringContractType() {
        Type type = new Type("id")
                .setName("name")
                .setJavaType("javaType")
                .setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting industry.")
                .setPartOf(List.of("partOf1", "partOf2"))
                .setSource(List.of("source1", "source2"))
                .addEnumerationMember("enumMember1").addEnumerationMember("enumMember2")
                .addParent(new Type("parent1")).addParent(new Type("parent2"))
                .addProperty(newProperty("id1",
                        "name1",
                        "fieldName1",
                        "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                        List.of(new Type("id1").setName("type name 1"), new Type("id2").setName("type name 2")),
                        List.of("partOf1", "partOf2"),
                        List.of("source1", "source2")
                ))
                .addProperty(newProperty("id2",
                        "name2",
                        "fieldName2",
                        null,
                        List.of(new Type("id1").setName("type name 1")),
                        null,
                        null
                ));

        Assertions.assertThat(type.toFormattedString()).isEqualTo(
                "---------- id ----------\n" +
                        "name          = name\n" +
                        "description   = Lorem Ipsum is simply dummy text of the printing a\n" +
                        "parents       = [parent1, parent2]\n" +
                        "partOf        = partOf1, partOf2\n" +
                        "source        = source1, source2\n" +
                        "properties    = [\n" +
                        "    Property(id='id1', name='name1', description='Lorem Ipsum is simply dummy text of the printing a', types=[type name 1, type name 2], partOf=[partOf1, partOf2], source=[source1, source2])\n" +
                        "    Property(id='id2', name='name2', description='null', types=[type name 1], partOf=null, source=null)\n" +
                        "]\n" +
                        "enum members  = enumMember1, enumMember2\n"
        );

        Type nullType = new Type(null);

        Assertions.assertThat(nullType.toFormattedString()).isEqualTo(
                "---------- null ----------\n" +
                        "name          = null\n" +
                        "description   = null\n" +
                        "parents       = []\n" +
                        "partOf        = \n" +
                        "source        = \n" +
                        "properties    = []\n" +
                        "enum members  = \n"
        );
    }

    private static Property newProperty(String id, String name, String fieldName, String description, List<Type> types, List<String> partOf, List<String> source) {
        return new Property(
                id,
                new Property.Field(name, () -> "Object"),
                new Property.Accessor(name, description, partOf, source, () -> "{@link Type}", () -> "<T> T", () -> "(T)"),
                List.of(new Property.Mutator(name, description, partOf, source, () -> "Object", () -> fieldName)),
                types
        );
    }

}