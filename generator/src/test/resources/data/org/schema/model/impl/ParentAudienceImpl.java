/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.datatype.Number;
import org.schema.model.MedicalCondition;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.Integer;
import org.schema.model.QuantitativeValue;
import org.schema.model.GenderType;
import org.schema.model.AdministrativeArea;
import org.schema.model.Action;
import org.schema.model.datatype.URL;
import org.schema.model.CreativeWork;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.ImageObject;
import org.schema.model.Thing;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import com.weedow.schemaorg.commons.model.JsonLdFieldTypes;
import java.util.List;
import org.schema.model.Intangible;
import org.schema.model.Audience;
import org.schema.model.PeopleAudience;
import org.schema.model.ParentAudience;

/**
 * A set of characteristics describing parents, who can be interested in viewing some content.
 *
 * @see <a href="https://schema.org/ParentAudience">https://schema.org/ParentAudience</a>
 */
@JsonLdTypeName("ParentAudience")
public class ParentAudienceImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements ParentAudience {

    private List<Number> childMinAge;

    /**
     * Minimal age of the child.
     *
     * @return {@link Number}
     */
    @Override
    public List<Number> getChildMinAgeList() {
        return childMinAge;
    }

    /**
     * Minimal age of the child.
     *
     * @return {@link Number}
     */
    @Override
    public Number getChildMinAge() {
        return getFirst(childMinAge);
    }

    /**
     * Minimal age of the child.
     *
     * @param childMinAge Number value to set.
     */
    @Override
    public void addChildMinAge(Number childMinAge) {
        this.childMinAge = add(this.childMinAge, childMinAge);
    }

    private List<Number> childMaxAge;

    /**
     * Maximal age of the child.
     *
     * @return {@link Number}
     */
    @Override
    public List<Number> getChildMaxAgeList() {
        return childMaxAge;
    }

    /**
     * Maximal age of the child.
     *
     * @return {@link Number}
     */
    @Override
    public Number getChildMaxAge() {
        return getFirst(childMaxAge);
    }

    /**
     * Maximal age of the child.
     *
     * @param childMaxAge Number value to set.
     */
    @Override
    public void addChildMaxAge(Number childMaxAge) {
        this.childMaxAge = add(this.childMaxAge, childMaxAge);
    }

    private List<MedicalCondition> healthCondition;

    /**
     * Specifying the health condition(s) of a patient, medical study, or other target audience.
     *
     * @return {@link MedicalCondition}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<MedicalCondition> getHealthConditionList() {
        return healthCondition;
    }

    /**
     * Specifying the health condition(s) of a patient, medical study, or other target audience.
     *
     * @return {@link MedicalCondition}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicalCondition getHealthCondition() {
        return getFirst(healthCondition);
    }

    /**
     * Specifying the health condition(s) of a patient, medical study, or other target audience.
     *
     * @param healthCondition MedicalCondition value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addHealthCondition(MedicalCondition healthCondition) {
        this.healthCondition = add(this.healthCondition, healthCondition);
    }

    private List<Text> requiredGender;

    /**
     * Audiences defined by a person's gender.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getRequiredGenderList() {
        return requiredGender;
    }

    /**
     * Audiences defined by a person's gender.
     *
     * @return {@link Text}
     */
    @Override
    public Text getRequiredGender() {
        return getFirst(requiredGender);
    }

    /**
     * Audiences defined by a person's gender.
     *
     * @param requiredGender Text value to set.
     */
    @Override
    public void addRequiredGender(Text requiredGender) {
        this.requiredGender = add(this.requiredGender, requiredGender);
    }

    private List<Number> suggestedMinAge;

    /**
     * Minimum recommended age in years for the audience or user.
     *
     * @return {@link Number}
     */
    @Override
    public List<Number> getSuggestedMinAgeList() {
        return suggestedMinAge;
    }

    /**
     * Minimum recommended age in years for the audience or user.
     *
     * @return {@link Number}
     */
    @Override
    public Number getSuggestedMinAge() {
        return getFirst(suggestedMinAge);
    }

    /**
     * Minimum recommended age in years for the audience or user.
     *
     * @param suggestedMinAge Number value to set.
     */
    @Override
    public void addSuggestedMinAge(Number suggestedMinAge) {
        this.suggestedMinAge = add(this.suggestedMinAge, suggestedMinAge);
    }

    private List<Integer> requiredMinAge;

    /**
     * Audiences defined by a person's minimum age.
     *
     * @return {@link Integer}
     */
    @Override
    public List<Integer> getRequiredMinAgeList() {
        return requiredMinAge;
    }

    /**
     * Audiences defined by a person's minimum age.
     *
     * @return {@link Integer}
     */
    @Override
    public Integer getRequiredMinAge() {
        return getFirst(requiredMinAge);
    }

    /**
     * Audiences defined by a person's minimum age.
     *
     * @param requiredMinAge Integer value to set.
     */
    @Override
    public void addRequiredMinAge(Integer requiredMinAge) {
        this.requiredMinAge = add(this.requiredMinAge, requiredMinAge);
    }

    private List<QuantitativeValue> suggestedMeasurement;

    /**
     * A suggested range of body measurements for the intended audience or person, for example inseam between 32 and 34 inches or height between 170 and 190 cm. Typically found on a size chart for wearable products.
     *
     * @return {@link QuantitativeValue}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    @Override
    public List<QuantitativeValue> getSuggestedMeasurementList() {
        return suggestedMeasurement;
    }

    /**
     * A suggested range of body measurements for the intended audience or person, for example inseam between 32 and 34 inches or height between 170 and 190 cm. Typically found on a size chart for wearable products.
     *
     * @return {@link QuantitativeValue}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    @Override
    public QuantitativeValue getSuggestedMeasurement() {
        return getFirst(suggestedMeasurement);
    }

    /**
     * A suggested range of body measurements for the intended audience or person, for example inseam between 32 and 34 inches or height between 170 and 190 cm. Typically found on a size chart for wearable products.
     *
     * @param suggestedMeasurement QuantitativeValue value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    @Override
    public void addSuggestedMeasurement(QuantitativeValue suggestedMeasurement) {
        this.suggestedMeasurement = add(this.suggestedMeasurement, suggestedMeasurement);
    }

    @JsonLdFieldTypes({ GenderType.class, Text.class })
    private List<Object> suggestedGender;

    /**
     * The suggested gender of the intended person or audience, for example "male", "female", or "unisex".
     *
     * @return {@link GenderType} or {@link Text}
     */
    @Override
    public <T> List<T> getSuggestedGenderList() {
        return (List<T>) suggestedGender;
    }

    /**
     * The suggested gender of the intended person or audience, for example "male", "female", or "unisex".
     *
     * @return {@link GenderType} or {@link Text}
     */
    @Override
    public <T> T getSuggestedGender() {
        return (T) getFirst(suggestedGender);
    }

    /**
     * The suggested gender of the intended person or audience, for example "male", "female", or "unisex".
     *
     * @param suggestedGender GenderType value to set.
     */
    @Override
    public void addSuggestedGender(GenderType suggestedGender) {
        this.suggestedGender = add(this.suggestedGender, suggestedGender);
    }
    /**
     * The suggested gender of the intended person or audience, for example "male", "female", or "unisex".
     *
     * @param suggestedGender Text value to set.
     */
    @Override
    public void addSuggestedGender(Text suggestedGender) {
        this.suggestedGender = add(this.suggestedGender, suggestedGender);
    }

    private List<Integer> requiredMaxAge;

    /**
     * Audiences defined by a person's maximum age.
     *
     * @return {@link Integer}
     */
    @Override
    public List<Integer> getRequiredMaxAgeList() {
        return requiredMaxAge;
    }

    /**
     * Audiences defined by a person's maximum age.
     *
     * @return {@link Integer}
     */
    @Override
    public Integer getRequiredMaxAge() {
        return getFirst(requiredMaxAge);
    }

    /**
     * Audiences defined by a person's maximum age.
     *
     * @param requiredMaxAge Integer value to set.
     */
    @Override
    public void addRequiredMaxAge(Integer requiredMaxAge) {
        this.requiredMaxAge = add(this.requiredMaxAge, requiredMaxAge);
    }

    private List<QuantitativeValue> suggestedAge;

    /**
     * The age or age range for the intended audience or person, for example 3-12 months for infants, 1-5 years for toddlers.
     *
     * @return {@link QuantitativeValue}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    @Override
    public List<QuantitativeValue> getSuggestedAgeList() {
        return suggestedAge;
    }

    /**
     * The age or age range for the intended audience or person, for example 3-12 months for infants, 1-5 years for toddlers.
     *
     * @return {@link QuantitativeValue}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    @Override
    public QuantitativeValue getSuggestedAge() {
        return getFirst(suggestedAge);
    }

    /**
     * The age or age range for the intended audience or person, for example 3-12 months for infants, 1-5 years for toddlers.
     *
     * @param suggestedAge QuantitativeValue value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    @Override
    public void addSuggestedAge(QuantitativeValue suggestedAge) {
        this.suggestedAge = add(this.suggestedAge, suggestedAge);
    }

    private List<Number> suggestedMaxAge;

    /**
     * Maximum recommended age in years for the audience or user.
     *
     * @return {@link Number}
     */
    @Override
    public List<Number> getSuggestedMaxAgeList() {
        return suggestedMaxAge;
    }

    /**
     * Maximum recommended age in years for the audience or user.
     *
     * @return {@link Number}
     */
    @Override
    public Number getSuggestedMaxAge() {
        return getFirst(suggestedMaxAge);
    }

    /**
     * Maximum recommended age in years for the audience or user.
     *
     * @param suggestedMaxAge Number value to set.
     */
    @Override
    public void addSuggestedMaxAge(Number suggestedMaxAge) {
        this.suggestedMaxAge = add(this.suggestedMaxAge, suggestedMaxAge);
    }

    private List<Text> audienceType;

    /**
     * The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getAudienceTypeList() {
        return audienceType;
    }

    /**
     * The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).
     *
     * @return {@link Text}
     */
    @Override
    public Text getAudienceType() {
        return getFirst(audienceType);
    }

    /**
     * The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).
     *
     * @param audienceType Text value to set.
     */
    @Override
    public void addAudienceType(Text audienceType) {
        this.audienceType = add(this.audienceType, audienceType);
    }

    private List<AdministrativeArea> geographicArea;

    /**
     * The geographic area associated with the audience.
     *
     * @return {@link AdministrativeArea}
     */
    @Override
    public List<AdministrativeArea> getGeographicAreaList() {
        return geographicArea;
    }

    /**
     * The geographic area associated with the audience.
     *
     * @return {@link AdministrativeArea}
     */
    @Override
    public AdministrativeArea getGeographicArea() {
        return getFirst(geographicArea);
    }

    /**
     * The geographic area associated with the audience.
     *
     * @param geographicArea AdministrativeArea value to set.
     */
    @Override
    public void addGeographicArea(AdministrativeArea geographicArea) {
        this.geographicArea = add(this.geographicArea, geographicArea);
    }

    private List<Action> potentialAction;

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public List<Action> getPotentialActionList() {
        return potentialAction;
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public Action getPotentialAction() {
        return getFirst(potentialAction);
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @param potentialAction Action value to set.
     */
    @Override
    public void addPotentialAction(Action potentialAction) {
        this.potentialAction = add(this.potentialAction, potentialAction);
    }

    @JsonLdFieldTypes({ URL.class, CreativeWork.class })
    private List<Object> mainEntityOfPage;

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link URL} or {@link CreativeWork}
     */
    @Override
    public <T> List<T> getMainEntityOfPageList() {
        return (List<T>) mainEntityOfPage;
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link URL} or {@link CreativeWork}
     */
    @Override
    public <T> T getMainEntityOfPage() {
        return (T) getFirst(mainEntityOfPage);
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage URL value to set.
     */
    @Override
    public void addMainEntityOfPage(URL mainEntityOfPage) {
        this.mainEntityOfPage = add(this.mainEntityOfPage, mainEntityOfPage);
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage CreativeWork value to set.
     */
    @Override
    public void addMainEntityOfPage(CreativeWork mainEntityOfPage) {
        this.mainEntityOfPage = add(this.mainEntityOfPage, mainEntityOfPage);
    }

    @JsonLdFieldTypes({ Event.class, CreativeWork.class })
    private List<Object> subjectOf;

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> List<T> getSubjectOfList() {
        return (List<T>) subjectOf;
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> T getSubjectOf() {
        return (T) getFirst(subjectOf);
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf Event value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void addSubjectOf(Event subjectOf) {
        this.subjectOf = add(this.subjectOf, subjectOf);
    }
    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf CreativeWork value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void addSubjectOf(CreativeWork subjectOf) {
        this.subjectOf = add(this.subjectOf, subjectOf);
    }

    private List<URL> url;

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public List<URL> getUrlList() {
        return url;
    }

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public URL getUrl() {
        return getFirst(url);
    }

    /**
     * URL of the item.
     *
     * @param url URL value to set.
     */
    @Override
    public void addUrl(URL url) {
        this.url = add(this.url, url);
    }

    private List<Text> alternateName;

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getAlternateNameList() {
        return alternateName;
    }

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAlternateName() {
        return getFirst(alternateName);
    }

    /**
     * An alias for the item.
     *
     * @param alternateName Text value to set.
     */
    @Override
    public void addAlternateName(Text alternateName) {
        this.alternateName = add(this.alternateName, alternateName);
    }

    private List<URL> sameAs;

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public List<URL> getSameAsList() {
        return sameAs;
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public URL getSameAs() {
        return getFirst(sameAs);
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @param sameAs URL value to set.
     */
    @Override
    public void addSameAs(URL sameAs) {
        this.sameAs = add(this.sameAs, sameAs);
    }

    private List<Text> description;

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getDescriptionList() {
        return description;
    }

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDescription() {
        return getFirst(description);
    }

    /**
     * A description of the item.
     *
     * @param description Text value to set.
     */
    @Override
    public void addDescription(Text description) {
        this.description = add(this.description, description);
    }

    private List<Text> disambiguatingDescription;

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     * @see <a href="https://schema.org/description">https://schema.org/description</a> <i>disambiguatingDescription</i> is a sub property of <i>description</i>
     */
    @Override
    public List<Text> getDisambiguatingDescriptionList() {
        return disambiguatingDescription;
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     * @see <a href="https://schema.org/description">https://schema.org/description</a> <i>disambiguatingDescription</i> is a sub property of <i>description</i>
     */
    @Override
    public Text getDisambiguatingDescription() {
        return getFirst(disambiguatingDescription);
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @param disambiguatingDescription Text value to set.
     * @see <a href="https://schema.org/description">https://schema.org/description</a> <i>disambiguatingDescription</i> is a sub property of <i>description</i>
     */
    @Override
    public void addDisambiguatingDescription(Text disambiguatingDescription) {
        this.disambiguatingDescription = add(this.disambiguatingDescription, disambiguatingDescription);
    }

    @JsonLdFieldTypes({ PropertyValue.class, URL.class, Text.class })
    private List<Object> identifier;

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link PropertyValue} or {@link URL} or {@link Text}
     */
    @Override
    public <T> List<T> getIdentifierList() {
        return (List<T>) identifier;
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link PropertyValue} or {@link URL} or {@link Text}
     */
    @Override
    public <T> T getIdentifier() {
        return (T) getFirst(identifier);
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier PropertyValue value to set.
     */
    @Override
    public void addIdentifier(PropertyValue identifier) {
        this.identifier = add(this.identifier, identifier);
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier URL value to set.
     */
    @Override
    public void addIdentifier(URL identifier) {
        this.identifier = add(this.identifier, identifier);
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier Text value to set.
     */
    @Override
    public void addIdentifier(Text identifier) {
        this.identifier = add(this.identifier, identifier);
    }

    @JsonLdFieldTypes({ URL.class, ImageObject.class })
    private List<Object> image;

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> List<T> getImageList() {
        return (List<T>) image;
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> T getImage() {
        return (T) getFirst(image);
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image URL value to set.
     */
    @Override
    public void addImage(URL image) {
        this.image = add(this.image, image);
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image ImageObject value to set.
     */
    @Override
    public void addImage(ImageObject image) {
        this.image = add(this.image, image);
    }

    private List<Text> name;

    /**
     * The name of the item.
     *
     * @return {@link Text}
     * @see <a href="https://schema.org/rdfs:label">https://schema.org/rdfs:label</a> <i>name</i> is a sub property of <i>rdfs:label</i>
     */
    @Override
    public List<Text> getNameList() {
        return name;
    }

    /**
     * The name of the item.
     *
     * @return {@link Text}
     * @see <a href="https://schema.org/rdfs:label">https://schema.org/rdfs:label</a> <i>name</i> is a sub property of <i>rdfs:label</i>
     */
    @Override
    public Text getName() {
        return getFirst(name);
    }

    /**
     * The name of the item.
     *
     * @param name Text value to set.
     * @see <a href="https://schema.org/rdfs:label">https://schema.org/rdfs:label</a> <i>name</i> is a sub property of <i>rdfs:label</i>
     */
    @Override
    public void addName(Text name) {
        this.name = add(this.name, name);
    }

    private List<URL> additionalType;

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     * @see <a href="https://schema.org/rdf:type">https://schema.org/rdf:type</a> <i>additionalType</i> is a sub property of <i>rdf:type</i>
     */
    @Override
    public List<URL> getAdditionalTypeList() {
        return additionalType;
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     * @see <a href="https://schema.org/rdf:type">https://schema.org/rdf:type</a> <i>additionalType</i> is a sub property of <i>rdf:type</i>
     */
    @Override
    public URL getAdditionalType() {
        return getFirst(additionalType);
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @param additionalType URL value to set.
     * @see <a href="https://schema.org/rdf:type">https://schema.org/rdf:type</a> <i>additionalType</i> is a sub property of <i>rdf:type</i>
     */
    @Override
    public void addAdditionalType(URL additionalType) {
        this.additionalType = add(this.additionalType, additionalType);
    }
}
