/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.MedicalObservationalStudyDesign;

/**
 * An observational study is a type of medical study that attempts to infer the possible effect of a treatment through observation of a cohort of subjects over a period of time. In an observational study, the assignment of subjects into treatment groups versus control groups is outside the control of the investigator. This is in contrast with controlled studies, such as the randomized controlled trials represented by MedicalTrial, where each subject is randomly assigned to a treatment group or a control group before the start of the treatment.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/MedicalObservationalStudy">https://schema.org/MedicalObservationalStudy</a>
 */
public interface MedicalObservationalStudy extends MedicalStudy {

    /**
     * Specifics about the observational study design (enumerated).
     *
     * @return {@link MedicalObservationalStudyDesign}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    MedicalObservationalStudyDesign getStudyDesign();

    /**
     * Specifics about the observational study design (enumerated).
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setStudyDesign(MedicalObservationalStudyDesign fStudyDesign);
}
