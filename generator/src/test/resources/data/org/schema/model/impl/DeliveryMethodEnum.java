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
import org.schema.model.DeliveryMethod;

/**
 * A delivery method is a standardized procedure for transferring the product or service to the destination of fulfillment chosen by the customer. Delivery methods are characterized by the means of transportation used, and by the organization or group that is the contracting party for the sending organization or person.<br/><br/>Commonly used values:<br/><br/>* http://purl.org/goodrelations/v1#DeliveryModeDirectDownload<br/>* http://purl.org/goodrelations/v1#DeliveryModeFreight<br/>* http://purl.org/goodrelations/v1#DeliveryModeMail<br/>* http://purl.org/goodrelations/v1#DeliveryModeOwnFleet<br/>* http://purl.org/goodrelations/v1#DeliveryModePickUp<br/>* http://purl.org/goodrelations/v1#DHL<br/>* http://purl.org/goodrelations/v1#FederalExpress<br/>* http://purl.org/goodrelations/v1#UPS
 *         
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass</a>
 * @see <a href="https://schema.org/DeliveryMethod">https://schema.org/DeliveryMethod</a>
 */
@JsonLdTypeName("DeliveryMethod")
public enum DeliveryMethodEnum implements DeliveryMethod {
    PARCEL_SERVICE("ParcelService"),
    ON_SITE_PICKUP("OnSitePickup"),
    LOCKER_DELIVERY("LockerDelivery");

    private final String enumValue;

    DeliveryMethodEnum(String enumValue) {
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
        throw new java.lang.IllegalAccessError("Method 'setContext' not allowed for enum DeliveryMethodEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public  void setId(java.lang.String arg0) {
        throw new java.lang.IllegalAccessError("Method 'setId' not allowed for enum DeliveryMethodEnum");
    }


    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getSupersededBy() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSupersededBy(Object fSupersededBy) {
        throw new java.lang.IllegalAccessError("Unable to set property 'supersededBy': method not allowed for enum DeliveryMethodEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getMainEntityOfPage() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setMainEntityOfPage(Object fMainEntityOfPage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'mainEntityOfPage': method not allowed for enum DeliveryMethodEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getAlternateName() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setAlternateName(Text fAlternateName) {
        throw new java.lang.IllegalAccessError("Unable to set property 'alternateName': method not allowed for enum DeliveryMethodEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getName() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setName(Text fName) {
        throw new java.lang.IllegalAccessError("Unable to set property 'name': method not allowed for enum DeliveryMethodEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Action getPotentialAction() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setPotentialAction(Action fPotentialAction) {
        throw new java.lang.IllegalAccessError("Unable to set property 'potentialAction': method not allowed for enum DeliveryMethodEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getImage() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setImage(Object fImage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'image': method not allowed for enum DeliveryMethodEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getUrl() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setUrl(URL fUrl) {
        throw new java.lang.IllegalAccessError("Unable to set property 'url': method not allowed for enum DeliveryMethodEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getDescription() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setDescription(Text fDescription) {
        throw new java.lang.IllegalAccessError("Unable to set property 'description': method not allowed for enum DeliveryMethodEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getSubjectOf() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSubjectOf(Object fSubjectOf) {
        throw new java.lang.IllegalAccessError("Unable to set property 'subjectOf': method not allowed for enum DeliveryMethodEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getAdditionalType() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setAdditionalType(URL fAdditionalType) {
        throw new java.lang.IllegalAccessError("Unable to set property 'additionalType': method not allowed for enum DeliveryMethodEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public Text getDisambiguatingDescription() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setDisambiguatingDescription(Text fDisambiguatingDescription) {
        throw new java.lang.IllegalAccessError("Unable to set property 'disambiguatingDescription': method not allowed for enum DeliveryMethodEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public URL getSameAs() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setSameAs(URL fSameAs) {
        throw new java.lang.IllegalAccessError("Unable to set property 'sameAs': method not allowed for enum DeliveryMethodEnum");
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public <T> T getIdentifier() {
        return null;
    }

    /** {@inheritDoc} <br/><b>DO NOT USE THIS METHOD</b> */
    @Override
    public void setIdentifier(Object fIdentifier) {
        throw new java.lang.IllegalAccessError("Unable to set property 'identifier': method not allowed for enum DeliveryMethodEnum");
    }

}
