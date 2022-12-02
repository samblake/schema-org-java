/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;
import org.schema.model.AnatomicalStructure;
import org.schema.model.AnatomicalSystem;
import org.schema.model.MedicalTherapy;
import org.schema.model.ImageObject;
import org.schema.model.MedicalCondition;

/**
 * Any part of the human body, typically a component of an anatomical system. Organs, tissues, and cells are all anatomical structures.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/AnatomicalStructure">https://schema.org/AnatomicalStructure</a>
 */
public interface AnatomicalStructure extends MedicalEntity {

    /**
     * Location in the body of the anatomical structure.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getBodyLocation();

    /**
     * Location in the body of the anatomical structure.
     *
     * @param fBodyLocation Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setBodyLocation(Text fBodyLocation);
    /**
     * Location in the body of the anatomical structure.
     *
     * @param fBodyLocation java.lang.String value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setBodyLocation(java.lang.String fBodyLocation);

    /**
     * Other anatomical structures to which this structure is connected.
     *
     * @return {@link AnatomicalStructure}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    AnatomicalStructure getConnectedTo();

    /**
     * Other anatomical structures to which this structure is connected.
     *
     * @param fConnectedTo AnatomicalStructure value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setConnectedTo(AnatomicalStructure fConnectedTo);

    /**
     * The anatomical or organ system that this structure is part of.
     *
     * @return {@link AnatomicalSystem}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    AnatomicalSystem getPartOfSystem();

    /**
     * The anatomical or organ system that this structure is part of.
     *
     * @param fPartOfSystem AnatomicalSystem value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setPartOfSystem(AnatomicalSystem fPartOfSystem);

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
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     *
     * @return {@link ImageObject}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    ImageObject getDiagram();

    /**
     * An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures.
     *
     * @param fDiagram ImageObject value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setDiagram(ImageObject fDiagram);

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
     * Component (sub-)structure(s) that comprise this anatomical structure.
     *
     * @return {@link AnatomicalStructure}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    AnatomicalStructure getSubStructure();

    /**
     * Component (sub-)structure(s) that comprise this anatomical structure.
     *
     * @param fSubStructure AnatomicalStructure value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setSubStructure(AnatomicalStructure fSubStructure);

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
}
