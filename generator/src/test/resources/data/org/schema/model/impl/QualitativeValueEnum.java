/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.Enumeration;
import org.schema.model.DefinedTerm;
import org.schema.model.datatype.Text;
import org.schema.model.MeasurementTypeEnumeration;
import org.schema.model.QualitativeValue;
import org.schema.model.StructuredValue;
import org.schema.model.PropertyValue;
import org.schema.model.QuantitativeValue;
import org.schema.model.Class;
import org.schema.model.Property;
import org.schema.model.CreativeWork;
import org.schema.model.datatype.URL;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.Thing;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import com.weedow.schemaorg.commons.model.JsonLdFieldTypes;
import org.schema.model.Intangible;
import com.weedow.schemaorg.commons.model.JsonLdSubTypes;

/**
 * A predefined value for a product characteristic, e.g. the power cord plug type 'US' or the garment sizes 'S', 'M', 'L', and 'XL'.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass</a>
 * @see <a href="https://schema.org/QualitativeValue">https://schema.org/QualitativeValue</a>
 */
@JsonLdTypeName("QualitativeValue")
@JsonLdSubTypes({ "SizeSpecificationEnum", "SteeringPositionValueEnum", "DriveWheelConfigurationValueEnum", "BedTypeEnum" })
public enum QualitativeValueEnum implements QualitativeValue {
    ;

    private final String enumValue;

    QualitativeValueEnum(String enumValue) {
        this.enumValue = enumValue;
    }

    public static QualitativeValueEnum from(String value) {
        for (QualitativeValueEnum item : values()) {
            if (item.enumValue.equals(value)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return enumValue;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  java.lang.String getContext() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  java.lang.String getId() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  java.lang.String getType() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  void setContext(java.lang.String arg0) {
        throw new java.lang.IllegalAccessError("Method 'setContext' not allowed for enum QualitativeValueEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  void setId(java.lang.String arg0) {
        throw new java.lang.IllegalAccessError("Method 'setId' not allowed for enum QualitativeValueEnum");
    }


    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getValueReference() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setValueReference(Enumeration valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setValueReference(DefinedTerm valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setValueReference(Text valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setValueReference(MeasurementTypeEnumeration valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setValueReference(QualitativeValue valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setValueReference(StructuredValue valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setValueReference(PropertyValue valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setValueReference(QuantitativeValue valueReference) {
        throw new java.lang.IllegalAccessError("Unable to set property 'valueReference': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public QualitativeValue getGreaterOrEqual() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setGreaterOrEqual(QualitativeValue greaterOrEqual) {
        throw new java.lang.IllegalAccessError("Unable to set property 'greaterOrEqual': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public QualitativeValue getNonEqual() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setNonEqual(QualitativeValue nonEqual) {
        throw new java.lang.IllegalAccessError("Unable to set property 'nonEqual': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public QualitativeValue getEqual() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setEqual(QualitativeValue equal) {
        throw new java.lang.IllegalAccessError("Unable to set property 'equal': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public QualitativeValue getLesser() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setLesser(QualitativeValue lesser) {
        throw new java.lang.IllegalAccessError("Unable to set property 'lesser': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public QualitativeValue getGreater() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setGreater(QualitativeValue greater) {
        throw new java.lang.IllegalAccessError("Unable to set property 'greater': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public PropertyValue getAdditionalProperty() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setAdditionalProperty(PropertyValue additionalProperty) {
        throw new java.lang.IllegalAccessError("Unable to set property 'additionalProperty': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public QualitativeValue getLesserOrEqual() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setLesserOrEqual(QualitativeValue lesserOrEqual) {
        throw new java.lang.IllegalAccessError("Unable to set property 'lesserOrEqual': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getSupersededBy() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSupersededBy(Enumeration supersededBy) {
        throw new java.lang.IllegalAccessError("Unable to set property 'supersededBy': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSupersededBy(Class supersededBy) {
        throw new java.lang.IllegalAccessError("Unable to set property 'supersededBy': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSupersededBy(Property supersededBy) {
        throw new java.lang.IllegalAccessError("Unable to set property 'supersededBy': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getMainEntityOfPage() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setMainEntityOfPage(CreativeWork mainEntityOfPage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'mainEntityOfPage': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setMainEntityOfPage(URL mainEntityOfPage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'mainEntityOfPage': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getAlternateName() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setAlternateName(Text alternateName) {
        throw new java.lang.IllegalAccessError("Unable to set property 'alternateName': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getName() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setName(Text name) {
        throw new java.lang.IllegalAccessError("Unable to set property 'name': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Action getPotentialAction() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setPotentialAction(Action potentialAction) {
        throw new java.lang.IllegalAccessError("Unable to set property 'potentialAction': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getImage() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setImage(URL image) {
        throw new java.lang.IllegalAccessError("Unable to set property 'image': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setImage(ImageObject image) {
        throw new java.lang.IllegalAccessError("Unable to set property 'image': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getUrl() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setUrl(URL url) {
        throw new java.lang.IllegalAccessError("Unable to set property 'url': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getDescription() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setDescription(Text description) {
        throw new java.lang.IllegalAccessError("Unable to set property 'description': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getSubjectOf() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSubjectOf(Event subjectOf) {
        throw new java.lang.IllegalAccessError("Unable to set property 'subjectOf': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSubjectOf(CreativeWork subjectOf) {
        throw new java.lang.IllegalAccessError("Unable to set property 'subjectOf': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getAdditionalType() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setAdditionalType(URL additionalType) {
        throw new java.lang.IllegalAccessError("Unable to set property 'additionalType': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getDisambiguatingDescription() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setDisambiguatingDescription(Text disambiguatingDescription) {
        throw new java.lang.IllegalAccessError("Unable to set property 'disambiguatingDescription': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getSameAs() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSameAs(URL sameAs) {
        throw new java.lang.IllegalAccessError("Unable to set property 'sameAs': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getIdentifier() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setIdentifier(URL identifier) {
        throw new java.lang.IllegalAccessError("Unable to set property 'identifier': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setIdentifier(Text identifier) {
        throw new java.lang.IllegalAccessError("Unable to set property 'identifier': method not allowed for enum Enum");
    }
    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setIdentifier(PropertyValue identifier) {
        throw new java.lang.IllegalAccessError("Unable to set property 'identifier': method not allowed for enum Enum");
    }
}
