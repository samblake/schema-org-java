/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.MonetaryAmountDistribution;
import org.schema.model.MonetaryAmount;
import org.schema.model.datatype.Number;
import org.schema.model.datatype.Text;
import org.schema.model.AdministrativeArea;
import org.schema.model.OccupationalExperienceRequirements;
import org.schema.model.EducationalOccupationalCredential;
import org.schema.model.DefinedTerm;
import org.schema.model.CategoryCode;
import org.schema.model.CreativeWork;
import org.schema.model.datatype.URL;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.Thing;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import com.weedow.schemaorg.commons.model.JsonLdFieldTypes;
import org.schema.model.Intangible;
import org.schema.model.Occupation;

/**
 * A profession, may involve prolonged training and/or a formal qualification.
 *
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
 * @see <a href="https://schema.org/Occupation">https://schema.org/Occupation</a>
 */
@JsonLdTypeName("Occupation")
public class OccupationImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements Occupation {

    @JsonLdFieldTypes({ MonetaryAmountDistribution.class, MonetaryAmount.class, Number.class })
    private Object estimatedSalary;

    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     *
     * @return {@link MonetaryAmountDistribution} or {@link MonetaryAmount} or {@link Number}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public <T> T getEstimatedSalary() {
        return (T) estimatedSalary;
    }

    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     *
     * @param estimatedSalary MonetaryAmountDistribution value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public void setEstimatedSalary(MonetaryAmountDistribution estimatedSalary) {
        this.estimatedSalary = estimatedSalary;
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     *
     * @param estimatedSalary MonetaryAmount value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public void setEstimatedSalary(MonetaryAmount estimatedSalary) {
        this.estimatedSalary = estimatedSalary;
    }
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     *
     * @param estimatedSalary Number value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public void setEstimatedSalary(Number estimatedSalary) {
        this.estimatedSalary = estimatedSalary;
    }

    private Text responsibilities;

    /**
     * Responsibilities associated with this role or Occupation.
     *
     * @return {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public Text getResponsibilities() {
        return responsibilities;
    }

    /**
     * Responsibilities associated with this role or Occupation.
     *
     * @param responsibilities Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public void setResponsibilities(Text responsibilities) {
        this.responsibilities = responsibilities;
    }

    private AdministrativeArea occupationLocation;

    /**
     *  The region/country for which this occupational description is appropriate. Note that educational requirements and qualifications can vary between jurisdictions.
     *
     * @return {@link AdministrativeArea}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public AdministrativeArea getOccupationLocation() {
        return occupationLocation;
    }

    /**
     *  The region/country for which this occupational description is appropriate. Note that educational requirements and qualifications can vary between jurisdictions.
     *
     * @param occupationLocation AdministrativeArea value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public void setOccupationLocation(AdministrativeArea occupationLocation) {
        this.occupationLocation = occupationLocation;
    }

    @JsonLdFieldTypes({ Text.class, OccupationalExperienceRequirements.class })
    private Object experienceRequirements;

    /**
     * Description of skills and experience needed for the position or Occupation.
     *
     * @return {@link Text} or {@link OccupationalExperienceRequirements}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public <T> T getExperienceRequirements() {
        return (T) experienceRequirements;
    }

    /**
     * Description of skills and experience needed for the position or Occupation.
     *
     * @param experienceRequirements Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public void setExperienceRequirements(Text experienceRequirements) {
        this.experienceRequirements = experienceRequirements;
    }
    /**
     * Description of skills and experience needed for the position or Occupation.
     *
     * @param experienceRequirements OccupationalExperienceRequirements value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public void setExperienceRequirements(OccupationalExperienceRequirements experienceRequirements) {
        this.experienceRequirements = experienceRequirements;
    }

    @JsonLdFieldTypes({ EducationalOccupationalCredential.class, Text.class })
    private Object educationRequirements;

    /**
     * Educational background needed for the position or Occupation.
     *
     * @return {@link EducationalOccupationalCredential} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    @Override
    public <T> T getEducationRequirements() {
        return (T) educationRequirements;
    }

    /**
     * Educational background needed for the position or Occupation.
     *
     * @param educationRequirements EducationalOccupationalCredential value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    @Override
    public void setEducationRequirements(EducationalOccupationalCredential educationRequirements) {
        this.educationRequirements = educationRequirements;
    }
    /**
     * Educational background needed for the position or Occupation.
     *
     * @param educationRequirements Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    @Override
    public void setEducationRequirements(Text educationRequirements) {
        this.educationRequirements = educationRequirements;
    }

    @JsonLdFieldTypes({ Text.class, DefinedTerm.class })
    private Object skills;

    /**
     * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
     *
     * @return {@link Text} or {@link DefinedTerm}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2322">https://github.com/schemaorg/schemaorg/issues/2322</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public <T> T getSkills() {
        return (T) skills;
    }

    /**
     * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
     *
     * @param skills Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2322">https://github.com/schemaorg/schemaorg/issues/2322</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public void setSkills(Text skills) {
        this.skills = skills;
    }
    /**
     * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is desired or required to fulfill this role or to work in this occupation.
     *
     * @param skills DefinedTerm value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2322">https://github.com/schemaorg/schemaorg/issues/2322</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public void setSkills(DefinedTerm skills) {
        this.skills = skills;
    }

    @JsonLdFieldTypes({ Text.class, EducationalOccupationalCredential.class })
    private Object qualifications;

    /**
     * Specific qualifications required for this role or Occupation.
     *
     * @return {@link Text} or {@link EducationalOccupationalCredential}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    @Override
    public <T> T getQualifications() {
        return (T) qualifications;
    }

    /**
     * Specific qualifications required for this role or Occupation.
     *
     * @param qualifications Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    @Override
    public void setQualifications(Text qualifications) {
        this.qualifications = qualifications;
    }
    /**
     * Specific qualifications required for this role or Occupation.
     *
     * @param qualifications EducationalOccupationalCredential value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1779">https://github.com/schemaorg/schemaorg/issues/1779</a>
     */
    @Override
    public void setQualifications(EducationalOccupationalCredential qualifications) {
        this.qualifications = qualifications;
    }

    @JsonLdFieldTypes({ CategoryCode.class, Text.class })
    private Object occupationalCategory;

    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.<br/>
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     *
     * @return {@link CategoryCode} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2192">https://github.com/schemaorg/schemaorg/issues/2192</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public <T> T getOccupationalCategory() {
        return (T) occupationalCategory;
    }

    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.<br/>
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     *
     * @param occupationalCategory CategoryCode value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2192">https://github.com/schemaorg/schemaorg/issues/2192</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public void setOccupationalCategory(CategoryCode occupationalCategory) {
        this.occupationalCategory = occupationalCategory;
    }
    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.<br/>
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     *
     * @param occupationalCategory Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2192">https://github.com/schemaorg/schemaorg/issues/2192</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    @Override
    public void setOccupationalCategory(Text occupationalCategory) {
        this.occupationalCategory = occupationalCategory;
    }

    @JsonLdFieldTypes({ CreativeWork.class, URL.class })
    private Object mainEntityOfPage;

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link CreativeWork} or {@link URL}
     */
    @Override
    public <T> T getMainEntityOfPage() {
        return (T) mainEntityOfPage;
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage CreativeWork value to set.
     */
    @Override
    public void setMainEntityOfPage(CreativeWork mainEntityOfPage) {
        this.mainEntityOfPage = mainEntityOfPage;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage URL value to set.
     */
    @Override
    public void setMainEntityOfPage(URL mainEntityOfPage) {
        this.mainEntityOfPage = mainEntityOfPage;
    }

    private Text alternateName;

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAlternateName() {
        return alternateName;
    }

    /**
     * An alias for the item.
     *
     * @param alternateName Text value to set.
     */
    @Override
    public void setAlternateName(Text alternateName) {
        this.alternateName = alternateName;
    }

    private Text name;

    /**
     * The name of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getName() {
        return name;
    }

    /**
     * The name of the item.
     *
     * @param name Text value to set.
     */
    @Override
    public void setName(Text name) {
        this.name = name;
    }

    private Action potentialAction;

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public Action getPotentialAction() {
        return potentialAction;
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @param potentialAction Action value to set.
     */
    @Override
    public void setPotentialAction(Action potentialAction) {
        this.potentialAction = potentialAction;
    }

    @JsonLdFieldTypes({ URL.class, ImageObject.class })
    private Object image;

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> T getImage() {
        return (T) image;
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image URL value to set.
     */
    @Override
    public void setImage(URL image) {
        this.image = image;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image ImageObject value to set.
     */
    @Override
    public void setImage(ImageObject image) {
        this.image = image;
    }

    private URL url;

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public URL getUrl() {
        return url;
    }

    /**
     * URL of the item.
     *
     * @param url URL value to set.
     */
    @Override
    public void setUrl(URL url) {
        this.url = url;
    }

    private Text description;

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDescription() {
        return description;
    }

    /**
     * A description of the item.
     *
     * @param description Text value to set.
     */
    @Override
    public void setDescription(Text description) {
        this.description = description;
    }

    @JsonLdFieldTypes({ Event.class, CreativeWork.class })
    private Object subjectOf;

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> T getSubjectOf() {
        return (T) subjectOf;
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf Event value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(Event subjectOf) {
        this.subjectOf = subjectOf;
    }
    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf CreativeWork value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(CreativeWork subjectOf) {
        this.subjectOf = subjectOf;
    }

    private URL additionalType;

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     */
    @Override
    public URL getAdditionalType() {
        return additionalType;
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @param additionalType URL value to set.
     */
    @Override
    public void setAdditionalType(URL additionalType) {
        this.additionalType = additionalType;
    }

    private Text disambiguatingDescription;

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDisambiguatingDescription() {
        return disambiguatingDescription;
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @param disambiguatingDescription Text value to set.
     */
    @Override
    public void setDisambiguatingDescription(Text disambiguatingDescription) {
        this.disambiguatingDescription = disambiguatingDescription;
    }

    private URL sameAs;

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public URL getSameAs() {
        return sameAs;
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @param sameAs URL value to set.
     */
    @Override
    public void setSameAs(URL sameAs) {
        this.sameAs = sameAs;
    }

    @JsonLdFieldTypes({ URL.class, Text.class, PropertyValue.class })
    private Object identifier;

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link URL} or {@link Text} or {@link PropertyValue}
     */
    @Override
    public <T> T getIdentifier() {
        return (T) identifier;
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier URL value to set.
     */
    @Override
    public void setIdentifier(URL identifier) {
        this.identifier = identifier;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier Text value to set.
     */
    @Override
    public void setIdentifier(Text identifier) {
        this.identifier = identifier;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier PropertyValue value to set.
     */
    @Override
    public void setIdentifier(PropertyValue identifier) {
        this.identifier = identifier;
    }
}
