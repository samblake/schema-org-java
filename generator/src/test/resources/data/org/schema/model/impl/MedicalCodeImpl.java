/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.datatype.Text;
import org.schema.model.Organization;
import org.schema.model.MedicalSpecialty;
import org.schema.model.MedicineSystem;
import org.schema.model.Grant;
import org.schema.model.DrugLegalStatus;
import org.schema.model.MedicalEnumeration;
import org.schema.model.MedicalStudy;
import org.schema.model.MedicalGuideline;
import org.schema.model.MedicalCode;
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
import org.schema.model.MedicalEntity;
import org.schema.model.MedicalIntangible;
import org.schema.model.CategoryCodeSet;
import org.schema.model.DefinedTermSet;
import org.schema.model.Intangible;
import org.schema.model.DefinedTerm;
import org.schema.model.CategoryCode;

/**
 * A code for a medical entity.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/MedicalCode">https://schema.org/MedicalCode</a>
 */
@JsonLdTypeName("MedicalCode")
public class MedicalCodeImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements MedicalCode {

    private List<Text> codeValue;

    /**
     * A short textual code that uniquely identifies the value.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     * @see <a href="https://schema.org/termCode">https://schema.org/termCode</a> <i>codeValue</i> is a sub property of <i>termCode</i>
     */
    @Override
    public List<Text> getCodeValueList() {
        return codeValue;
    }

    /**
     * A short textual code that uniquely identifies the value.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     * @see <a href="https://schema.org/termCode">https://schema.org/termCode</a> <i>codeValue</i> is a sub property of <i>termCode</i>
     */
    @Override
    public Text getCodeValue() {
        return getFirst(codeValue);
    }

    /**
     * A short textual code that uniquely identifies the value.
     *
     * @param codeValue Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     * @see <a href="https://schema.org/termCode">https://schema.org/termCode</a> <i>codeValue</i> is a sub property of <i>termCode</i>
     */
    @Override
    public void addCodeValue(Text codeValue) {
        this.codeValue = add(this.codeValue, codeValue);
    }

    private List<Text> codingSystem;

    /**
     * The coding system, e.g. 'ICD-10'.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<Text> getCodingSystemList() {
        return codingSystem;
    }

    /**
     * The coding system, e.g. 'ICD-10'.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public Text getCodingSystem() {
        return getFirst(codingSystem);
    }

    /**
     * The coding system, e.g. 'ICD-10'.
     *
     * @param codingSystem Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addCodingSystem(Text codingSystem) {
        this.codingSystem = add(this.codingSystem, codingSystem);
    }

    private List<Organization> recognizingAuthority;

    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     *
     * @return {@link Organization}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<Organization> getRecognizingAuthorityList() {
        return recognizingAuthority;
    }

    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     *
     * @return {@link Organization}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public Organization getRecognizingAuthority() {
        return getFirst(recognizingAuthority);
    }

    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     *
     * @param recognizingAuthority Organization value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addRecognizingAuthority(Organization recognizingAuthority) {
        this.recognizingAuthority = add(this.recognizingAuthority, recognizingAuthority);
    }

    private List<MedicalSpecialty> relevantSpecialty;

    /**
     * If applicable, a medical specialty in which this entity is relevant.
     *
     * @return {@link MedicalSpecialty}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<MedicalSpecialty> getRelevantSpecialtyList() {
        return relevantSpecialty;
    }

    /**
     * If applicable, a medical specialty in which this entity is relevant.
     *
     * @return {@link MedicalSpecialty}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicalSpecialty getRelevantSpecialty() {
        return getFirst(relevantSpecialty);
    }

    /**
     * If applicable, a medical specialty in which this entity is relevant.
     *
     * @param relevantSpecialty MedicalSpecialty value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addRelevantSpecialty(MedicalSpecialty relevantSpecialty) {
        this.relevantSpecialty = add(this.relevantSpecialty, relevantSpecialty);
    }

    private List<MedicineSystem> medicineSystem;

    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     *
     * @return {@link MedicineSystem}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<MedicineSystem> getMedicineSystemList() {
        return medicineSystem;
    }

    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     *
     * @return {@link MedicineSystem}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicineSystem getMedicineSystem() {
        return getFirst(medicineSystem);
    }

    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     *
     * @param medicineSystem MedicineSystem value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addMedicineSystem(MedicineSystem medicineSystem) {
        this.medicineSystem = add(this.medicineSystem, medicineSystem);
    }

    private List<Grant> funding;

    /**
     * A [[Grant]] that directly or indirectly provide funding or sponsorship for this item. See also [[ownershipFundingInfo]].
     *
     * @return {@link Grant}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/383">https://github.com/schemaorg/schemaorg/issues/383</a>
     */
    @Override
    public List<Grant> getFundingList() {
        return funding;
    }

    /**
     * A [[Grant]] that directly or indirectly provide funding or sponsorship for this item. See also [[ownershipFundingInfo]].
     *
     * @return {@link Grant}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/383">https://github.com/schemaorg/schemaorg/issues/383</a>
     */
    @Override
    public Grant getFunding() {
        return getFirst(funding);
    }

    /**
     * A [[Grant]] that directly or indirectly provide funding or sponsorship for this item. See also [[ownershipFundingInfo]].
     *
     * @param funding Grant value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/383">https://github.com/schemaorg/schemaorg/issues/383</a>
     */
    @Override
    public void addFunding(Grant funding) {
        this.funding = add(this.funding, funding);
    }

    @JsonLdFieldTypes({ Text.class, DrugLegalStatus.class, MedicalEnumeration.class })
    private List<Object> legalStatus;

    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @return {@link Text} or {@link DrugLegalStatus} or {@link MedicalEnumeration}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public <T> List<T> getLegalStatusList() {
        return (List<T>) legalStatus;
    }

    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @return {@link Text} or {@link DrugLegalStatus} or {@link MedicalEnumeration}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public <T> T getLegalStatus() {
        return (T) getFirst(legalStatus);
    }

    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @param legalStatus Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addLegalStatus(Text legalStatus) {
        this.legalStatus = add(this.legalStatus, legalStatus);
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @param legalStatus DrugLegalStatus value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addLegalStatus(DrugLegalStatus legalStatus) {
        this.legalStatus = add(this.legalStatus, legalStatus);
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @param legalStatus MedicalEnumeration value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addLegalStatus(MedicalEnumeration legalStatus) {
        this.legalStatus = add(this.legalStatus, legalStatus);
    }

    private List<MedicalStudy> study;

    /**
     * A medical study or trial related to this entity.
     *
     * @return {@link MedicalStudy}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<MedicalStudy> getStudyList() {
        return study;
    }

    /**
     * A medical study or trial related to this entity.
     *
     * @return {@link MedicalStudy}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicalStudy getStudy() {
        return getFirst(study);
    }

    /**
     * A medical study or trial related to this entity.
     *
     * @param study MedicalStudy value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addStudy(MedicalStudy study) {
        this.study = add(this.study, study);
    }

    private List<MedicalGuideline> guideline;

    /**
     * A medical guideline related to this entity.
     *
     * @return {@link MedicalGuideline}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<MedicalGuideline> getGuidelineList() {
        return guideline;
    }

    /**
     * A medical guideline related to this entity.
     *
     * @return {@link MedicalGuideline}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicalGuideline getGuideline() {
        return getFirst(guideline);
    }

    /**
     * A medical guideline related to this entity.
     *
     * @param guideline MedicalGuideline value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addGuideline(MedicalGuideline guideline) {
        this.guideline = add(this.guideline, guideline);
    }

    private List<MedicalCode> code;

    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     *
     * @return {@link MedicalCode}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public List<MedicalCode> getCodeList() {
        return code;
    }

    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     *
     * @return {@link MedicalCode}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicalCode getCode() {
        return getFirst(code);
    }

    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     *
     * @param code MedicalCode value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void addCode(MedicalCode code) {
        this.code = add(this.code, code);
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

    @JsonLdFieldTypes({ URL.class, CategoryCodeSet.class })
    private List<Object> inCodeSet;

    /**
     * A [[CategoryCodeSet]] that contains this category code.
     *
     * @return {@link URL} or {@link CategoryCodeSet}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     * @see <a href="https://schema.org/inDefinedTermSet">https://schema.org/inDefinedTermSet</a> <i>inCodeSet</i> is a sub property of <i>inDefinedTermSet</i>
     */
    @Override
    public <T> List<T> getInCodeSetList() {
        return (List<T>) inCodeSet;
    }

    /**
     * A [[CategoryCodeSet]] that contains this category code.
     *
     * @return {@link URL} or {@link CategoryCodeSet}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     * @see <a href="https://schema.org/inDefinedTermSet">https://schema.org/inDefinedTermSet</a> <i>inCodeSet</i> is a sub property of <i>inDefinedTermSet</i>
     */
    @Override
    public <T> T getInCodeSet() {
        return (T) getFirst(inCodeSet);
    }

    /**
     * A [[CategoryCodeSet]] that contains this category code.
     *
     * @param inCodeSet URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     * @see <a href="https://schema.org/inDefinedTermSet">https://schema.org/inDefinedTermSet</a> <i>inCodeSet</i> is a sub property of <i>inDefinedTermSet</i>
     */
    @Override
    public void addInCodeSet(URL inCodeSet) {
        this.inCodeSet = add(this.inCodeSet, inCodeSet);
    }
    /**
     * A [[CategoryCodeSet]] that contains this category code.
     *
     * @param inCodeSet CategoryCodeSet value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     * @see <a href="https://schema.org/inDefinedTermSet">https://schema.org/inDefinedTermSet</a> <i>inCodeSet</i> is a sub property of <i>inDefinedTermSet</i>
     */
    @Override
    public void addInCodeSet(CategoryCodeSet inCodeSet) {
        this.inCodeSet = add(this.inCodeSet, inCodeSet);
    }

    @JsonLdFieldTypes({ DefinedTermSet.class, URL.class })
    private List<Object> inDefinedTermSet;

    /**
     * A [[DefinedTermSet]] that contains this term.
     *
     * @return {@link DefinedTermSet} or {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     * @see <a href="https://schema.org/isPartOf">https://schema.org/isPartOf</a> <i>inDefinedTermSet</i> is a sub property of <i>isPartOf</i>
     */
    @Override
    public <T> List<T> getInDefinedTermSetList() {
        return (List<T>) inDefinedTermSet;
    }

    /**
     * A [[DefinedTermSet]] that contains this term.
     *
     * @return {@link DefinedTermSet} or {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     * @see <a href="https://schema.org/isPartOf">https://schema.org/isPartOf</a> <i>inDefinedTermSet</i> is a sub property of <i>isPartOf</i>
     */
    @Override
    public <T> T getInDefinedTermSet() {
        return (T) getFirst(inDefinedTermSet);
    }

    /**
     * A [[DefinedTermSet]] that contains this term.
     *
     * @param inDefinedTermSet DefinedTermSet value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     * @see <a href="https://schema.org/isPartOf">https://schema.org/isPartOf</a> <i>inDefinedTermSet</i> is a sub property of <i>isPartOf</i>
     */
    @Override
    public void addInDefinedTermSet(DefinedTermSet inDefinedTermSet) {
        this.inDefinedTermSet = add(this.inDefinedTermSet, inDefinedTermSet);
    }
    /**
     * A [[DefinedTermSet]] that contains this term.
     *
     * @param inDefinedTermSet URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     * @see <a href="https://schema.org/isPartOf">https://schema.org/isPartOf</a> <i>inDefinedTermSet</i> is a sub property of <i>isPartOf</i>
     */
    @Override
    public void addInDefinedTermSet(URL inDefinedTermSet) {
        this.inDefinedTermSet = add(this.inDefinedTermSet, inDefinedTermSet);
    }

    private List<Text> termCode;

    /**
     * A code that identifies this [[DefinedTerm]] within a [[DefinedTermSet]]
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     */
    @Override
    public List<Text> getTermCodeList() {
        return termCode;
    }

    /**
     * A code that identifies this [[DefinedTerm]] within a [[DefinedTermSet]]
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     */
    @Override
    public Text getTermCode() {
        return getFirst(termCode);
    }

    /**
     * A code that identifies this [[DefinedTerm]] within a [[DefinedTermSet]]
     *
     * @param termCode Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     */
    @Override
    public void addTermCode(Text termCode) {
        this.termCode = add(this.termCode, termCode);
    }
}
