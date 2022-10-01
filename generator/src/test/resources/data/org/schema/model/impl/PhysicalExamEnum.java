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
import org.schema.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.MedicalEnumeration;
import org.schema.model.MedicalProcedureType;
import org.schema.model.MedicalEntity;
import org.schema.model.EventStatusType;
import org.schema.model.MedicalStudyStatus;
import org.schema.model.DrugLegalStatus;
import org.schema.model.Grant;
import org.schema.model.MedicalStudy;
import org.schema.model.MedicalCode;
import org.schema.model.MedicalGuideline;
import org.schema.model.Organization;
import org.schema.model.MedicineSystem;
import org.schema.model.MedicalSpecialty;
import org.schema.model.MedicalProcedure;
import org.schema.model.PhysicalExam;

/**
 * A type of physical examination of a patient performed by a physician. 
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/PhysicalExam">https://schema.org/PhysicalExam</a>
 */
@JsonLdTypeName("schema:PhysicalExam")
public enum PhysicalExamEnum implements PhysicalExam {
    GENITOURINARY("Genitourinary"),
    ABDOMEN("Abdomen"),
    APPEARANCE("Appearance"),
    CARDIOVASCULAR_EXAM("CardiovascularExam"),
    SKIN("Skin"),
    LUNG("Lung"),
    NECK("Neck"),
    EAR("Ear"),
    MUSCULOSKELETAL_EXAM("MusculoskeletalExam"),
    HEAD("Head"),
    EYE("Eye"),
    THROAT("Throat"),
    NEURO("Neuro"),
    NOSE("Nose");

    private final String enumValue;

    PhysicalExamEnum(String enumValue) {
        this.enumValue = enumValue;
    }

    @Override
    public String toString() {
        return enumValue;
    }

    @Override
    public MedicalCode getCode() {
        return null;
    }

    @Override
    public void setCode(MedicalCode fCode) {
        throw new java.lang.IllegalAccessError("Unable to set property 'code': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public <T> T getSupersededBy() {
        return null;
    }

    @Override
    public void setSupersededBy(Object fSupersededBy) {
        throw new java.lang.IllegalAccessError("Unable to set property 'supersededBy': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public MedicalProcedureType getProcedureType() {
        return null;
    }

    @Override
    public void setProcedureType(MedicalProcedureType fProcedureType) {
        throw new java.lang.IllegalAccessError("Unable to set property 'procedureType': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public MedicalGuideline getGuideline() {
        return null;
    }

    @Override
    public void setGuideline(MedicalGuideline fGuideline) {
        throw new java.lang.IllegalAccessError("Unable to set property 'guideline': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public Text getAlternateName() {
        return null;
    }

    @Override
    public void setAlternateName(Text fAlternateName) {
        throw new java.lang.IllegalAccessError("Unable to set property 'alternateName': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public <T> T getLegalStatus() {
        return null;
    }

    @Override
    public void setLegalStatus(Object fLegalStatus) {
        throw new java.lang.IllegalAccessError("Unable to set property 'legalStatus': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public <T> T getMainEntityOfPage() {
        return null;
    }

    @Override
    public void setMainEntityOfPage(Object fMainEntityOfPage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'mainEntityOfPage': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public Text getFollowup() {
        return null;
    }

    @Override
    public void setFollowup(Text fFollowup) {
        throw new java.lang.IllegalAccessError("Unable to set property 'followup': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public Organization getRecognizingAuthority() {
        return null;
    }

    @Override
    public void setRecognizingAuthority(Organization fRecognizingAuthority) {
        throw new java.lang.IllegalAccessError("Unable to set property 'recognizingAuthority': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public Action getPotentialAction() {
        return null;
    }

    @Override
    public void setPotentialAction(Action fPotentialAction) {
        throw new java.lang.IllegalAccessError("Unable to set property 'potentialAction': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public MedicalSpecialty getRelevantSpecialty() {
        return null;
    }

    @Override
    public void setRelevantSpecialty(MedicalSpecialty fRelevantSpecialty) {
        throw new java.lang.IllegalAccessError("Unable to set property 'relevantSpecialty': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public <T> T getPreparation() {
        return null;
    }

    @Override
    public void setPreparation(Object fPreparation) {
        throw new java.lang.IllegalAccessError("Unable to set property 'preparation': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public <T> T getSubjectOf() {
        return null;
    }

    @Override
    public void setSubjectOf(Object fSubjectOf) {
        throw new java.lang.IllegalAccessError("Unable to set property 'subjectOf': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public Text getName() {
        return null;
    }

    @Override
    public void setName(Text fName) {
        throw new java.lang.IllegalAccessError("Unable to set property 'name': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public Text getDisambiguatingDescription() {
        return null;
    }

    @Override
    public void setDisambiguatingDescription(Text fDisambiguatingDescription) {
        throw new java.lang.IllegalAccessError("Unable to set property 'disambiguatingDescription': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public <T> T getImage() {
        return null;
    }

    @Override
    public void setImage(Object fImage) {
        throw new java.lang.IllegalAccessError("Unable to set property 'image': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public URL getSameAs() {
        return null;
    }

    @Override
    public void setSameAs(URL fSameAs) {
        throw new java.lang.IllegalAccessError("Unable to set property 'sameAs': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public <T> T getIdentifier() {
        return null;
    }

    @Override
    public void setIdentifier(Object fIdentifier) {
        throw new java.lang.IllegalAccessError("Unable to set property 'identifier': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public Text getBodyLocation() {
        return null;
    }

    @Override
    public void setBodyLocation(Text fBodyLocation) {
        throw new java.lang.IllegalAccessError("Unable to set property 'bodyLocation': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public MedicineSystem getMedicineSystem() {
        return null;
    }

    @Override
    public void setMedicineSystem(MedicineSystem fMedicineSystem) {
        throw new java.lang.IllegalAccessError("Unable to set property 'medicineSystem': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public <T> T getStatus() {
        return null;
    }

    @Override
    public void setStatus(Object fStatus) {
        throw new java.lang.IllegalAccessError("Unable to set property 'status': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public Grant getFunding() {
        return null;
    }

    @Override
    public void setFunding(Grant fFunding) {
        throw new java.lang.IllegalAccessError("Unable to set property 'funding': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public URL getUrl() {
        return null;
    }

    @Override
    public void setUrl(URL fUrl) {
        throw new java.lang.IllegalAccessError("Unable to set property 'url': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public Text getHowPerformed() {
        return null;
    }

    @Override
    public void setHowPerformed(Text fHowPerformed) {
        throw new java.lang.IllegalAccessError("Unable to set property 'howPerformed': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public URL getAdditionalType() {
        return null;
    }

    @Override
    public void setAdditionalType(URL fAdditionalType) {
        throw new java.lang.IllegalAccessError("Unable to set property 'additionalType': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public Text getDescription() {
        return null;
    }

    @Override
    public void setDescription(Text fDescription) {
        throw new java.lang.IllegalAccessError("Unable to set property 'description': method not allowed for enum PhysicalExamEnum");
    }
    @Override
    public MedicalStudy getStudy() {
        return null;
    }

    @Override
    public void setStudy(MedicalStudy fStudy) {
        throw new java.lang.IllegalAccessError("Unable to set property 'study': method not allowed for enum PhysicalExamEnum");
    }
}
