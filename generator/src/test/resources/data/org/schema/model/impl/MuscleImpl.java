/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.AnatomicalStructure;
import org.schema.model.Muscle;
import org.schema.model.Nerve;
import org.schema.model.Vessel;
import org.schema.model.datatype.Text;
import org.schema.model.AnatomicalSystem;
import org.schema.model.MedicalTherapy;
import org.schema.model.ImageObject;
import org.schema.model.MedicalCondition;
import org.schema.model.DrugLegalStatus;
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
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.Thing;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.MedicalEntity;

/**
 * A muscle is an anatomical structure consisting of a contractile form of tissue that animals use to effect movement.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/Muscle">https://schema.org/Muscle</a>
 */
@JsonLdTypeName("Muscle")
public class MuscleImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements Muscle {

    private AnatomicalStructure fInsertion;

    /**
     * The place of attachment of a muscle, or what the muscle moves.
     *
     * @return {@link AnatomicalStructure}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public AnatomicalStructure getInsertion() {
        return fInsertion;
    }

    /**
     * The place of attachment of a muscle, or what the muscle moves.
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setInsertion(AnatomicalStructure fInsertion) {
        this.fInsertion = fInsertion;
    }

    private Muscle fAntagonist;

    /**
     * The muscle whose action counteracts the specified muscle.
     *
     * @return {@link Muscle}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public Muscle getAntagonist() {
        return fAntagonist;
    }

    /**
     * The muscle whose action counteracts the specified muscle.
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setAntagonist(Muscle fAntagonist) {
        this.fAntagonist = fAntagonist;
    }

    private Nerve fNerve;

    /**
     * The underlying innervation associated with the muscle.
     *
     * @return {@link Nerve}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public Nerve getNerve() {
        return fNerve;
    }

    /**
     * The underlying innervation associated with the muscle.
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setNerve(Nerve fNerve) {
        this.fNerve = fNerve;
    }

    private Vessel fBloodSupply;

    /**
     * The blood vessel that carries blood from the heart to the muscle.
     *
     * @return {@link Vessel}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public Vessel getBloodSupply() {
        return fBloodSupply;
    }

    /**
     * The blood vessel that carries blood from the heart to the muscle.
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setBloodSupply(Vessel fBloodSupply) {
        this.fBloodSupply = fBloodSupply;
    }

    private Text fMuscleAction;

    /**
     * The movement the muscle generates.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public Text getMuscleAction() {
        return fMuscleAction;
    }

    /**
     * The movement the muscle generates.
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setMuscleAction(Text fMuscleAction) {
        this.fMuscleAction = fMuscleAction;
    }

    private Text fBodyLocation;

    /**
     * Location in the body of the anatomical structure.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public Text getBodyLocation() {
        return fBodyLocation;
    }

    /**
     * Location in the body of the anatomical structure.
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setBodyLocation(Text fBodyLocation) {
        this.fBodyLocation = fBodyLocation;
    }

    private AnatomicalStructure fConnectedTo;

    /**
     * Other anatomical structures to which this structure is connected.
     *
     * @return {@link AnatomicalStructure}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public AnatomicalStructure getConnectedTo() {
        return fConnectedTo;
    }

    /**
     * Other anatomical structures to which this structure is connected.
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setConnectedTo(AnatomicalStructure fConnectedTo) {
        this.fConnectedTo = fConnectedTo;
    }

    private AnatomicalSystem fPartOfSystem;

    /**
     * The anatomical or organ system that this structure is part of.
     *
     * @return {@link AnatomicalSystem}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public AnatomicalSystem getPartOfSystem() {
        return fPartOfSystem;
    }

    /**
     * The anatomical or organ system that this structure is part of.
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setPartOfSystem(AnatomicalSystem fPartOfSystem) {
        this.fPartOfSystem = fPartOfSystem;
    }

    private MedicalTherapy fRelatedTherapy;

    /**
     * A medical therapy related to this anatomy.
     *
     * @return {@link MedicalTherapy}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicalTherapy getRelatedTherapy() {
        return fRelatedTherapy;
    }

    /**
     * A medical therapy related to this anatomy.
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setRelatedTherapy(MedicalTherapy fRelatedTherapy) {
        this.fRelatedTherapy = fRelatedTherapy;
    }

    private ImageObject fDiagram;

    /**
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     *
     * @return {@link ImageObject}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public ImageObject getDiagram() {
        return fDiagram;
    }

    /**
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setDiagram(ImageObject fDiagram) {
        this.fDiagram = fDiagram;
    }

    private MedicalCondition fRelatedCondition;

    /**
     * A medical condition associated with this anatomy.
     *
     * @return {@link MedicalCondition}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public MedicalCondition getRelatedCondition() {
        return fRelatedCondition;
    }

    /**
     * A medical condition associated with this anatomy.
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setRelatedCondition(MedicalCondition fRelatedCondition) {
        this.fRelatedCondition = fRelatedCondition;
    }

    private AnatomicalStructure fSubStructure;

    /**
     * Component (sub-)structure(s) that comprise this anatomical structure.
     *
     * @return {@link AnatomicalStructure}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public AnatomicalStructure getSubStructure() {
        return fSubStructure;
    }

    /**
     * Component (sub-)structure(s) that comprise this anatomical structure.
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setSubStructure(AnatomicalStructure fSubStructure) {
        this.fSubStructure = fSubStructure;
    }

    private Text fAssociatedPathophysiology;

    /**
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public Text getAssociatedPathophysiology() {
        return fAssociatedPathophysiology;
    }

    /**
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setAssociatedPathophysiology(Text fAssociatedPathophysiology) {
        this.fAssociatedPathophysiology = fAssociatedPathophysiology;
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
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    @Override
    public void setLegalStatus(Object fLegalStatus) {
        if(!(fLegalStatus instanceof DrugLegalStatus) && !(fLegalStatus instanceof Text) && !(fLegalStatus instanceof MedicalEnumeration)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'legalStatus': " + fLegalStatus);
        }
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
