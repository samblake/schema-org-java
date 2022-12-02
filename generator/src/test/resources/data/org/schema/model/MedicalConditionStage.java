/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;
import org.schema.model.datatype.Number;

/**
 * A stage of a medical condition, such as 'Stage IIIa'.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/MedicalConditionStage">https://schema.org/MedicalConditionStage</a>
 */
public interface MedicalConditionStage extends MedicalIntangible {

    /**
     * The substage, e.g. 'a' for Stage IIIa.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getSubStageSuffix();

    /**
     * The substage, e.g. 'a' for Stage IIIa.
     *
     * @param fSubStageSuffix Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setSubStageSuffix(Text fSubStageSuffix);
    /**
     * The substage, e.g. 'a' for Stage IIIa.
     *
     * @param fSubStageSuffix java.lang.String value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setSubStageSuffix(java.lang.String fSubStageSuffix);

    /**
     * The stage represented as a number, e.g. 3.
     *
     * @return {@link Number}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Number getStageAsNumber();

    /**
     * The stage represented as a number, e.g. 3.
     *
     * @param fStageAsNumber Number value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setStageAsNumber(Number fStageAsNumber);
    /**
     * The stage represented as a number, e.g. 3.
     *
     * @param fStageAsNumber java.lang.Number value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setStageAsNumber(java.lang.Number fStageAsNumber);
}
