/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.Drug;
import org.schema.model.DrugLegalStatus;
import org.schema.model.datatype.Text;
import org.schema.model.MedicalEnumeration;
import org.schema.model.Grant;
import org.schema.model.MedicalStudy;
import org.schema.model.MedicalCode;
import org.schema.model.MedicalGuideline;
import org.schema.model.Organization;
import org.schema.model.MedicineSystem;
import org.schema.model.MedicalSpecialty;
import org.schema.model.CreativeWork;
import org.schema.model.datatype.URL;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.Thing;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.MedicalEntity;
import org.schema.model.DrugClass;

/**
 * A class of medical drugs, e.g., statins. Classes can represent general pharmacological class, common mechanisms of action, common physiological effects, etc.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/DrugClass">https://schema.org/DrugClass</a>
 */
@JsonLdTypeName("DrugClass")
public class DrugClassImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements DrugClass {

    private Drug fDrug;

    /**
     * Specifying a drug or medicine used in a medication procedure.
     *
     * @return {@link Drug}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public Drug getDrug() {
        return fDrug;
    }

    /**
     * Specifying a drug or medicine used in a medication procedure.
     *
     * @param fDrug Drug value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setDrug(Drug fDrug) {
        this.fDrug = fDrug;
    }

    private Object fLegalStatus;

    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @return {@link DrugLegalStatus} or {@link Text} or {@link MedicalEnumeration}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public <T> T getLegalStatus() {
        return (T) fLegalStatus;
    }

    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @param fLegalStatus DrugLegalStatus value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setLegalStatus(DrugLegalStatus fLegalStatus) {
        this.fLegalStatus = fLegalStatus;
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @param fLegalStatus Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setLegalStatus(Text fLegalStatus) {
        this.fLegalStatus = fLegalStatus;
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @param fLegalStatus java.lang.String value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setLegalStatus(java.lang.String fLegalStatus) {
        this.fLegalStatus = Text.of(fLegalStatus);
    }
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     *
     * @param fLegalStatus MedicalEnumeration value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setLegalStatus(MedicalEnumeration fLegalStatus) {
        this.fLegalStatus = fLegalStatus;
    }

    private Grant fFunding;

    /**
     * A [[Grant]] that directly or indirectly provide funding or sponsorship for this item. See also [[ownershipFundingInfo]].
     *
     * @return {@link Grant}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/383">https://github.com/schemaorg/schemaorg/issues/383</a>
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP</a>
     */
    @Override
    public Grant getFunding() {
        return fFunding;
    }

    /**
     * A [[Grant]] that directly or indirectly provide funding or sponsorship for this item. See also [[ownershipFundingInfo]].
     *
     * @param fFunding Grant value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/383">https://github.com/schemaorg/schemaorg/issues/383</a>
     * @see <a href="https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP">https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#TP</a>
     */
    @Override
    public void setFunding(Grant fFunding) {
        this.fFunding = fFunding;
    }

    private MedicalStudy fStudy;

    /**
     * A medical study or trial related to this entity.
     *
     * @return {@link MedicalStudy}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicalStudy getStudy() {
        return fStudy;
    }

    /**
     * A medical study or trial related to this entity.
     *
     * @param fStudy MedicalStudy value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setStudy(MedicalStudy fStudy) {
        this.fStudy = fStudy;
    }

    private MedicalCode fCode;

    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     *
     * @return {@link MedicalCode}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicalCode getCode() {
        return fCode;
    }

    /**
     * A medical code for the entity, taken from a controlled vocabulary or ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
     *
     * @param fCode MedicalCode value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setCode(MedicalCode fCode) {
        this.fCode = fCode;
    }

    private MedicalGuideline fGuideline;

    /**
     * A medical guideline related to this entity.
     *
     * @return {@link MedicalGuideline}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicalGuideline getGuideline() {
        return fGuideline;
    }

    /**
     * A medical guideline related to this entity.
     *
     * @param fGuideline MedicalGuideline value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setGuideline(MedicalGuideline fGuideline) {
        this.fGuideline = fGuideline;
    }

    private Organization fRecognizingAuthority;

    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     *
     * @return {@link Organization}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public Organization getRecognizingAuthority() {
        return fRecognizingAuthority;
    }

    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     *
     * @param fRecognizingAuthority Organization value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setRecognizingAuthority(Organization fRecognizingAuthority) {
        this.fRecognizingAuthority = fRecognizingAuthority;
    }

    private MedicineSystem fMedicineSystem;

    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     *
     * @return {@link MedicineSystem}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicineSystem getMedicineSystem() {
        return fMedicineSystem;
    }

    /**
     * The system of medicine that includes this MedicalEntity, for example 'evidence-based', 'homeopathic', 'chiropractic', etc.
     *
     * @param fMedicineSystem MedicineSystem value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setMedicineSystem(MedicineSystem fMedicineSystem) {
        this.fMedicineSystem = fMedicineSystem;
    }

    private MedicalSpecialty fRelevantSpecialty;

    /**
     * If applicable, a medical specialty in which this entity is relevant.
     *
     * @return {@link MedicalSpecialty}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicalSpecialty getRelevantSpecialty() {
        return fRelevantSpecialty;
    }

    /**
     * If applicable, a medical specialty in which this entity is relevant.
     *
     * @param fRelevantSpecialty MedicalSpecialty value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setRelevantSpecialty(MedicalSpecialty fRelevantSpecialty) {
        this.fRelevantSpecialty = fRelevantSpecialty;
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
     * @param fMainEntityOfPage CreativeWork value to set.
     */
    @Override
    public void setMainEntityOfPage(CreativeWork fMainEntityOfPage) {
        this.fMainEntityOfPage = fMainEntityOfPage;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param fMainEntityOfPage URL value to set.
     */
    @Override
    public void setMainEntityOfPage(URL fMainEntityOfPage) {
        this.fMainEntityOfPage = fMainEntityOfPage;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param fMainEntityOfPage java.net.URL value to set.
     */
    @Override
    public void setMainEntityOfPage(java.net.URL fMainEntityOfPage) {
        this.fMainEntityOfPage = URL.of(fMainEntityOfPage);
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
     * @param fAlternateName Text value to set.
     */
    @Override
    public void setAlternateName(Text fAlternateName) {
        this.fAlternateName = fAlternateName;
    }
    /**
     * An alias for the item.
     *
     * @param fAlternateName java.lang.String value to set.
     */
    @Override
    public void setAlternateName(java.lang.String fAlternateName) {
        this.fAlternateName = Text.of(fAlternateName);
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
     * @param fName Text value to set.
     */
    @Override
    public void setName(Text fName) {
        this.fName = fName;
    }
    /**
     * The name of the item.
     *
     * @param fName java.lang.String value to set.
     */
    @Override
    public void setName(java.lang.String fName) {
        this.fName = Text.of(fName);
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
     * @param fPotentialAction Action value to set.
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
     * @param fImage URL value to set.
     */
    @Override
    public void setImage(URL fImage) {
        this.fImage = fImage;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param fImage java.net.URL value to set.
     */
    @Override
    public void setImage(java.net.URL fImage) {
        this.fImage = URL.of(fImage);
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param fImage ImageObject value to set.
     */
    @Override
    public void setImage(ImageObject fImage) {
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
     * @param fUrl URL value to set.
     */
    @Override
    public void setUrl(URL fUrl) {
        this.fUrl = fUrl;
    }
    /**
     * URL of the item.
     *
     * @param fUrl java.net.URL value to set.
     */
    @Override
    public void setUrl(java.net.URL fUrl) {
        this.fUrl = URL.of(fUrl);
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
     * @param fDescription Text value to set.
     */
    @Override
    public void setDescription(Text fDescription) {
        this.fDescription = fDescription;
    }
    /**
     * A description of the item.
     *
     * @param fDescription java.lang.String value to set.
     */
    @Override
    public void setDescription(java.lang.String fDescription) {
        this.fDescription = Text.of(fDescription);
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
     * @param fSubjectOf Event value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(Event fSubjectOf) {
        this.fSubjectOf = fSubjectOf;
    }
    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param fSubjectOf CreativeWork value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(CreativeWork fSubjectOf) {
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
     * @param fAdditionalType URL value to set.
     */
    @Override
    public void setAdditionalType(URL fAdditionalType) {
        this.fAdditionalType = fAdditionalType;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @param fAdditionalType java.net.URL value to set.
     */
    @Override
    public void setAdditionalType(java.net.URL fAdditionalType) {
        this.fAdditionalType = URL.of(fAdditionalType);
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
     * @param fDisambiguatingDescription Text value to set.
     */
    @Override
    public void setDisambiguatingDescription(Text fDisambiguatingDescription) {
        this.fDisambiguatingDescription = fDisambiguatingDescription;
    }
    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @param fDisambiguatingDescription java.lang.String value to set.
     */
    @Override
    public void setDisambiguatingDescription(java.lang.String fDisambiguatingDescription) {
        this.fDisambiguatingDescription = Text.of(fDisambiguatingDescription);
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
     * @param fSameAs URL value to set.
     */
    @Override
    public void setSameAs(URL fSameAs) {
        this.fSameAs = fSameAs;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @param fSameAs java.net.URL value to set.
     */
    @Override
    public void setSameAs(java.net.URL fSameAs) {
        this.fSameAs = URL.of(fSameAs);
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
     * @param fIdentifier URL value to set.
     */
    @Override
    public void setIdentifier(URL fIdentifier) {
        this.fIdentifier = fIdentifier;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param fIdentifier java.net.URL value to set.
     */
    @Override
    public void setIdentifier(java.net.URL fIdentifier) {
        this.fIdentifier = URL.of(fIdentifier);
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param fIdentifier Text value to set.
     */
    @Override
    public void setIdentifier(Text fIdentifier) {
        this.fIdentifier = fIdentifier;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param fIdentifier java.lang.String value to set.
     */
    @Override
    public void setIdentifier(java.lang.String fIdentifier) {
        this.fIdentifier = Text.of(fIdentifier);
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param fIdentifier PropertyValue value to set.
     */
    @Override
    public void setIdentifier(PropertyValue fIdentifier) {
        this.fIdentifier = fIdentifier;
    }
}
