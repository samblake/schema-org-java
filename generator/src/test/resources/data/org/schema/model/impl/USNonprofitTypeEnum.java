/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.Enumeration;
import org.schema.model.Class;
import org.schema.model.Property;
import org.schema.model.CreativeWork;
import org.schema.model.datatype.URL;
import org.schema.model.datatype.Text;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.Thing;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.NonprofitType;
import org.schema.model.USNonprofitType;

/**
 * USNonprofitType: Non-profit organization type originating from the United States.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/2543">https://github.com/schemaorg/schemaorg/issues/2543</a>
 * @see <a href="https://schema.org/USNonprofitType">https://schema.org/USNonprofitType</a>
 */
@JsonLdTypeName("USNonprofitType")
public enum USNonprofitTypeEnum implements USNonprofitType {
    NONPROFIT_501C4("Nonprofit501c4"),
    NONPROFIT_501C23("Nonprofit501c23"),
    NONPROFIT_501K("Nonprofit501k"),
    NONPROFIT_501C1("Nonprofit501c1"),
    NONPROFIT_501N("Nonprofit501n"),
    NONPROFIT_501C7("Nonprofit501c7"),
    NONPROFIT_501C9("Nonprofit501c9"),
    NONPROFIT_501C3("Nonprofit501c3"),
    NONPROFIT_501C2("Nonprofit501c2"),
    NONPROFIT_501A("Nonprofit501a"),
    NONPROFIT_501C21("Nonprofit501c21"),
    NONPROFIT_501E("Nonprofit501e"),
    NONPROFIT_501C14("Nonprofit501c14"),
    NONPROFIT_501C28("Nonprofit501c28"),
    NONPROFIT_501C18("Nonprofit501c18"),
    NONPROFIT_501C27("Nonprofit501c27"),
    NONPROFIT_501D("Nonprofit501d"),
    NONPROFIT_501C25("Nonprofit501c25"),
    NONPROFIT_501C15("Nonprofit501c15"),
    NONPROFIT_501C12("Nonprofit501c12"),
    NONPROFIT_501C13("Nonprofit501c13"),
    NONPROFIT_501C26("Nonprofit501c26"),
    NONPROFIT_501C8("Nonprofit501c8"),
    NONPROFIT_501C10("Nonprofit501c10"),
    NONPROFIT_501C11("Nonprofit501c11"),
    NONPROFIT_501F("Nonprofit501f"),
    NONPROFIT_501C5("Nonprofit501c5"),
    NONPROFIT_501C20("Nonprofit501c20"),
    NONPROFIT_501C6("Nonprofit501c6"),
    NONPROFIT_527("Nonprofit527"),
    NONPROFIT_501C19("Nonprofit501c19"),
    NONPROFIT_501C16("Nonprofit501c16"),
    NONPROFIT_501C24("Nonprofit501c24"),
    NONPROFIT_501Q("Nonprofit501q"),
    NONPROFIT_501C22("Nonprofit501c22"),
    NONPROFIT_501C17("Nonprofit501c17");

    private final String enumValue;

    USNonprofitTypeEnum(String enumValue) {
        this.enumValue = enumValue;
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
        throw new java.lang.IllegalAccessError("Method 'setContext' not allowed for enum USNonprofitTypeEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  void setId(java.lang.String arg0) {
        throw new java.lang.IllegalAccessError("Method 'setId' not allowed for enum USNonprofitTypeEnum");
    }


    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getSupersededBy() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSupersededBy(Object fSupersededBy) {
        throw new java.lang.IllegalAccessError("Unable to set property 'supersededBy': method not allowed for enum USNonprofitTypeEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getMainEntityOfPage() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setMainEntityOfPage(Object fMainEntityOfPage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'mainEntityOfPage': method not allowed for enum USNonprofitTypeEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getAlternateName() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setAlternateName(Text fAlternateName) {
        throw new java.lang.IllegalAccessError("Unable to set property 'alternateName': method not allowed for enum USNonprofitTypeEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getName() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setName(Text fName) {
        throw new java.lang.IllegalAccessError("Unable to set property 'name': method not allowed for enum USNonprofitTypeEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Action getPotentialAction() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setPotentialAction(Action fPotentialAction) {
        throw new java.lang.IllegalAccessError("Unable to set property 'potentialAction': method not allowed for enum USNonprofitTypeEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getImage() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setImage(Object fImage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'image': method not allowed for enum USNonprofitTypeEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getUrl() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setUrl(URL fUrl) {
        throw new java.lang.IllegalAccessError("Unable to set property 'url': method not allowed for enum USNonprofitTypeEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getDescription() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setDescription(Text fDescription) {
        throw new java.lang.IllegalAccessError("Unable to set property 'description': method not allowed for enum USNonprofitTypeEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getSubjectOf() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSubjectOf(Object fSubjectOf) {
        throw new java.lang.IllegalAccessError("Unable to set property 'subjectOf': method not allowed for enum USNonprofitTypeEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getAdditionalType() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setAdditionalType(URL fAdditionalType) {
        throw new java.lang.IllegalAccessError("Unable to set property 'additionalType': method not allowed for enum USNonprofitTypeEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getDisambiguatingDescription() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setDisambiguatingDescription(Text fDisambiguatingDescription) {
        throw new java.lang.IllegalAccessError("Unable to set property 'disambiguatingDescription': method not allowed for enum USNonprofitTypeEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getSameAs() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSameAs(URL fSameAs) {
        throw new java.lang.IllegalAccessError("Unable to set property 'sameAs': method not allowed for enum USNonprofitTypeEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getIdentifier() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setIdentifier(Object fIdentifier) {
        throw new java.lang.IllegalAccessError("Unable to set property 'identifier': method not allowed for enum USNonprofitTypeEnum");
    }

}
