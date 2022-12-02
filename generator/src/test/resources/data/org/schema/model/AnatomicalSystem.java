/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.MedicalTherapy;
import org.schema.model.MedicalCondition;
import org.schema.model.AnatomicalStructure;
import org.schema.model.datatype.Text;
import org.schema.model.AnatomicalSystem;

/**
 * An anatomical system is a group of anatomical structures that work together to perform a certain task. Anatomical systems, such as organ systems, are one organizing principle of anatomy, and can includes circulatory, digestive, endocrine, integumentary, immune, lymphatic, muscular, nervous, reproductive, respiratory, skeletal, urinary, vestibular, and other systems.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/AnatomicalSystem">https://schema.org/AnatomicalSystem</a>
 */
public interface AnatomicalSystem extends MedicalEntity {

    /**
     * A medical therapy related to this anatomy.
     *
     * @return {@link MedicalTherapy}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    MedicalTherapy getRelatedTherapy();

    /**
     * A medical therapy related to this anatomy.
     *
     * @param fRelatedTherapy MedicalTherapy value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setRelatedTherapy(MedicalTherapy fRelatedTherapy);

    /**
     * A medical condition associated with this anatomy.
     *
     * @return {@link MedicalCondition}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    MedicalCondition getRelatedCondition();

    /**
     * A medical condition associated with this anatomy.
     *
     * @param fRelatedCondition MedicalCondition value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setRelatedCondition(MedicalCondition fRelatedCondition);

    /**
     * Related anatomical structure(s) that are not part of the system but relate or connect to it, such as vascular bundles associated with an organ system.
     *
     * @return {@link AnatomicalStructure}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    AnatomicalStructure getRelatedStructure();

    /**
     * Related anatomical structure(s) that are not part of the system but relate or connect to it, such as vascular bundles associated with an organ system.
     *
     * @param fRelatedStructure AnatomicalStructure value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setRelatedStructure(AnatomicalStructure fRelatedStructure);

    /**
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getAssociatedPathophysiology();

    /**
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     *
     * @param fAssociatedPathophysiology Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setAssociatedPathophysiology(Text fAssociatedPathophysiology);
    /**
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     *
     * @param fAssociatedPathophysiology java.lang.String value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setAssociatedPathophysiology(java.lang.String fAssociatedPathophysiology);

    /**
     * Specifying something physically contained by something else. Typically used here for the underlying anatomical structures, such as organs, that comprise the anatomical system.
     *
     * @return {@link AnatomicalStructure} or {@link AnatomicalSystem}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    <T> T getComprisedOf();

    /**
     * Specifying something physically contained by something else. Typically used here for the underlying anatomical structures, such as organs, that comprise the anatomical system.
     *
     * @param fComprisedOf AnatomicalStructure value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setComprisedOf(AnatomicalStructure fComprisedOf);
    /**
     * Specifying something physically contained by something else. Typically used here for the underlying anatomical structures, such as organs, that comprise the anatomical system.
     *
     * @param fComprisedOf AnatomicalSystem value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setComprisedOf(AnatomicalSystem fComprisedOf);
}
