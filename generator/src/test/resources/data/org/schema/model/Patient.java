/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.MedicalCondition;
import org.schema.model.Drug;

/**
 * A patient is any person recipient of health care services.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/Patient">https://schema.org/Patient</a>
 */
public interface Patient extends MedicalAudience, Person {

    /**
     * Specifying the health condition(s) of a patient, medical study, or other target audience.
     *
     * @return {@link MedicalCondition}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    MedicalCondition getHealthCondition();

    /**
     * Specifying the health condition(s) of a patient, medical study, or other target audience.
     *
     * @param healthCondition MedicalCondition value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setHealthCondition(MedicalCondition healthCondition);

    /**
     * Specifying a drug or medicine used in a medication procedure.
     *
     * @return {@link Drug}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Drug getDrug();

    /**
     * Specifying a drug or medicine used in a medication procedure.
     *
     * @param drug Drug value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setDrug(Drug drug);

    /**
     * One or more alternative conditions considered in the differential diagnosis process as output of a diagnosis process.
     *
     * @return {@link MedicalCondition}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    MedicalCondition getDiagnosis();

    /**
     * One or more alternative conditions considered in the differential diagnosis process as output of a diagnosis process.
     *
     * @param diagnosis MedicalCondition value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setDiagnosis(MedicalCondition diagnosis);
}
