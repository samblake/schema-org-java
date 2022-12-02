/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.MedicalEvidenceLevel;
import org.schema.model.datatype.Text;
import org.schema.model.MedicalEntity;
import org.schema.model.datatype.Date;

/**
 * Any recommendation made by a standard society (e.g. ACC/AHA) or consensus statement that denotes how to diagnose and treat a particular condition. Note: this type should be used to tag the actual guideline recommendation; if the guideline recommendation occurs in a larger scholarly article, use MedicalScholarlyArticle to tag the overall article, not this type. Note also: the organization making the recommendation should be captured in the recognizingAuthority base property of MedicalEntity.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/MedicalGuideline">https://schema.org/MedicalGuideline</a>
 */
public interface MedicalGuideline extends MedicalEntity {

    /**
     * Strength of evidence of the data used to formulate the guideline (enumerated).
     *
     * @return {@link MedicalEvidenceLevel}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    MedicalEvidenceLevel getEvidenceLevel();

    /**
     * Strength of evidence of the data used to formulate the guideline (enumerated).
     *
     * @param fEvidenceLevel MedicalEvidenceLevel value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setEvidenceLevel(MedicalEvidenceLevel fEvidenceLevel);

    /**
     * Source of the data used to formulate the guidance, e.g. RCT, consensus opinion, etc.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getEvidenceOrigin();

    /**
     * Source of the data used to formulate the guidance, e.g. RCT, consensus opinion, etc.
     *
     * @param fEvidenceOrigin Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setEvidenceOrigin(Text fEvidenceOrigin);
    /**
     * Source of the data used to formulate the guidance, e.g. RCT, consensus opinion, etc.
     *
     * @param fEvidenceOrigin java.lang.String value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setEvidenceOrigin(java.lang.String fEvidenceOrigin);

    /**
     * The medical conditions, treatments, etc. that are the subject of the guideline.
     *
     * @return {@link MedicalEntity}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    MedicalEntity getGuidelineSubject();

    /**
     * The medical conditions, treatments, etc. that are the subject of the guideline.
     *
     * @param fGuidelineSubject MedicalEntity value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setGuidelineSubject(MedicalEntity fGuidelineSubject);

    /**
     * Date on which this guideline's recommendation was made.
     *
     * @return {@link Date}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Date getGuidelineDate();

    /**
     * Date on which this guideline's recommendation was made.
     *
     * @param fGuidelineDate Date value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setGuidelineDate(Date fGuidelineDate);
    /**
     * Date on which this guideline's recommendation was made.
     *
     * @param fGuidelineDate java.time.LocalDate value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setGuidelineDate(java.time.LocalDate fGuidelineDate);
}
