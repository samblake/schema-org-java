/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.HealthPlanFormulary;
import org.schema.model.datatype.URL;
import org.schema.model.datatype.Text;
import org.schema.model.ContactPoint;
import org.schema.model.HealthPlanNetwork;
import org.schema.model.CreativeWork;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.Thing;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.HealthInsurancePlan;

/**
 * A US-style health insurance plan, including PPOs, EPOs, and HMOs. 
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
 * @see <a href="https://schema.org/HealthInsurancePlan">https://schema.org/HealthInsurancePlan</a>
 */
@JsonLdTypeName("HealthInsurancePlan")
public class HealthInsurancePlanImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements HealthInsurancePlan {

    private HealthPlanFormulary fIncludesHealthPlanFormulary;

    /**
     * Formularies covered by this plan.
     *
     * @return {@link HealthPlanFormulary}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public HealthPlanFormulary getIncludesHealthPlanFormulary() {
        return fIncludesHealthPlanFormulary;
    }

    /**
     * Formularies covered by this plan.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public void setIncludesHealthPlanFormulary(HealthPlanFormulary fIncludesHealthPlanFormulary) {
        this.fIncludesHealthPlanFormulary = fIncludesHealthPlanFormulary;
    }

    private URL fBenefitsSummaryUrl;

    /**
     * The URL that goes directly to the summary of benefits and coverage for the specific standard plan or plan variation.
     *
     * @return {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public URL getBenefitsSummaryUrl() {
        return fBenefitsSummaryUrl;
    }

    /**
     * The URL that goes directly to the summary of benefits and coverage for the specific standard plan or plan variation.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public void setBenefitsSummaryUrl(URL fBenefitsSummaryUrl) {
        this.fBenefitsSummaryUrl = fBenefitsSummaryUrl;
    }

    private Text fHealthPlanDrugOption;

    /**
     * TODO.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public Text getHealthPlanDrugOption() {
        return fHealthPlanDrugOption;
    }

    /**
     * TODO.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public void setHealthPlanDrugOption(Text fHealthPlanDrugOption) {
        this.fHealthPlanDrugOption = fHealthPlanDrugOption;
    }

    private Text fHealthPlanDrugTier;

    /**
     * The tier(s) of drugs offered by this formulary or insurance plan.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public Text getHealthPlanDrugTier() {
        return fHealthPlanDrugTier;
    }

    /**
     * The tier(s) of drugs offered by this formulary or insurance plan.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public void setHealthPlanDrugTier(Text fHealthPlanDrugTier) {
        this.fHealthPlanDrugTier = fHealthPlanDrugTier;
    }

    private Text fHealthPlanId;

    /**
     * The 14-character, HIOS-generated Plan ID number. (Plan IDs must be unique, even across different markets.)
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public Text getHealthPlanId() {
        return fHealthPlanId;
    }

    /**
     * The 14-character, HIOS-generated Plan ID number. (Plan IDs must be unique, even across different markets.)
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public void setHealthPlanId(Text fHealthPlanId) {
        this.fHealthPlanId = fHealthPlanId;
    }

    private ContactPoint fContactPoint;

    /**
     * A contact point for a person or organization.
     *
     * @return {@link ContactPoint}
     */
    @Override
    public ContactPoint getContactPoint() {
        return fContactPoint;
    }

    /**
     * A contact point for a person or organization.
     *
     */
    @Override
    public void setContactPoint(ContactPoint fContactPoint) {
        this.fContactPoint = fContactPoint;
    }

    private Object fUsesHealthPlanIdStandard;

    /**
     * The standard for interpreting thePlan ID. The preferred is "HIOS". See the Centers for Medicare & Medicaid Services for more details.
     *
     * @return {@link URL} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public <T> T getUsesHealthPlanIdStandard() {
        return (T) fUsesHealthPlanIdStandard;
    }

    /**
     * The standard for interpreting thePlan ID. The preferred is "HIOS". See the Centers for Medicare & Medicaid Services for more details.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public void setUsesHealthPlanIdStandard(Object fUsesHealthPlanIdStandard) {
        if(!(fUsesHealthPlanIdStandard instanceof URL) && !(fUsesHealthPlanIdStandard instanceof Text)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'usesHealthPlanIdStandard': " + fUsesHealthPlanIdStandard);
        }
        this.fUsesHealthPlanIdStandard = fUsesHealthPlanIdStandard;
    }

    private HealthPlanNetwork fIncludesHealthPlanNetwork;

    /**
     * Networks covered by this plan.
     *
     * @return {@link HealthPlanNetwork}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public HealthPlanNetwork getIncludesHealthPlanNetwork() {
        return fIncludesHealthPlanNetwork;
    }

    /**
     * Networks covered by this plan.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public void setIncludesHealthPlanNetwork(HealthPlanNetwork fIncludesHealthPlanNetwork) {
        this.fIncludesHealthPlanNetwork = fIncludesHealthPlanNetwork;
    }

    private URL fHealthPlanMarketingUrl;

    /**
     * The URL that goes directly to the plan brochure for the specific standard plan or plan variation.
     *
     * @return {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public URL getHealthPlanMarketingUrl() {
        return fHealthPlanMarketingUrl;
    }

    /**
     * The URL that goes directly to the plan brochure for the specific standard plan or plan variation.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    @Override
    public void setHealthPlanMarketingUrl(URL fHealthPlanMarketingUrl) {
        this.fHealthPlanMarketingUrl = fHealthPlanMarketingUrl;
    }

    private Object fMainEntityOfPage;

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link CreativeWork} or {@link URL}
     */
    @Override
    public <T> T getMainEntityOfPage() {
        return (T) fMainEntityOfPage;
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     */
    @Override
    public void setMainEntityOfPage(Object fMainEntityOfPage) {
        if(!(fMainEntityOfPage instanceof CreativeWork) && !(fMainEntityOfPage instanceof URL)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'mainEntityOfPage': " + fMainEntityOfPage);
        }
        this.fMainEntityOfPage = fMainEntityOfPage;
    }

    private Text fAlternateName;

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAlternateName() {
        return fAlternateName;
    }

    /**
     * An alias for the item.
     *
     */
    @Override
    public void setAlternateName(Text fAlternateName) {
        this.fAlternateName = fAlternateName;
    }

    private Text fName;

    /**
     * The name of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getName() {
        return fName;
    }

    /**
     * The name of the item.
     *
     */
    @Override
    public void setName(Text fName) {
        this.fName = fName;
    }

    private Action fPotentialAction;

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public Action getPotentialAction() {
        return fPotentialAction;
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     */
    @Override
    public void setPotentialAction(Action fPotentialAction) {
        this.fPotentialAction = fPotentialAction;
    }

    private Object fImage;

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> T getImage() {
        return (T) fImage;
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     */
    @Override
    public void setImage(Object fImage) {
        if(!(fImage instanceof URL) && !(fImage instanceof ImageObject)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'image': " + fImage);
        }
        this.fImage = fImage;
    }

    private URL fUrl;

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public URL getUrl() {
        return fUrl;
    }

    /**
     * URL of the item.
     *
     */
    @Override
    public void setUrl(URL fUrl) {
        this.fUrl = fUrl;
    }

    private Text fDescription;

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDescription() {
        return fDescription;
    }

    /**
     * A description of the item.
     *
     */
    @Override
    public void setDescription(Text fDescription) {
        this.fDescription = fDescription;
    }

    private Object fSubjectOf;

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> T getSubjectOf() {
        return (T) fSubjectOf;
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(Object fSubjectOf) {
        if(!(fSubjectOf instanceof Event) && !(fSubjectOf instanceof CreativeWork)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'subjectOf': " + fSubjectOf);
        }
        this.fSubjectOf = fSubjectOf;
    }

    private URL fAdditionalType;

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     */
    @Override
    public URL getAdditionalType() {
        return fAdditionalType;
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     */
    @Override
    public void setAdditionalType(URL fAdditionalType) {
        this.fAdditionalType = fAdditionalType;
    }

    private Text fDisambiguatingDescription;

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDisambiguatingDescription() {
        return fDisambiguatingDescription;
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     */
    @Override
    public void setDisambiguatingDescription(Text fDisambiguatingDescription) {
        this.fDisambiguatingDescription = fDisambiguatingDescription;
    }

    private URL fSameAs;

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public URL getSameAs() {
        return fSameAs;
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     */
    @Override
    public void setSameAs(URL fSameAs) {
        this.fSameAs = fSameAs;
    }

    private Object fIdentifier;

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link URL} or {@link Text} or {@link PropertyValue}
     */
    @Override
    public <T> T getIdentifier() {
        return (T) fIdentifier;
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     */
    @Override
    public void setIdentifier(Object fIdentifier) {
        if(!(fIdentifier instanceof URL) && !(fIdentifier instanceof Text) && !(fIdentifier instanceof PropertyValue)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'identifier': " + fIdentifier);
        }
        this.fIdentifier = fIdentifier;
    }
}
