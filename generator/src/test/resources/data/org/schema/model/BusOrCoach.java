/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.QuantitativeValue;
import org.schema.model.datatype.Text;

/**
 * A bus (also omnibus or autobus) is a road vehicle designed to carry passengers. Coaches are luxury busses, usually in service for long distance travel.
 *
 * @see <a href="https://auto.schema.org">https://auto.schema.org</a>
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group</a>
 * @see <a href="https://schema.org/BusOrCoach">https://schema.org/BusOrCoach</a>
 */
public interface BusOrCoach extends Vehicle {

    /**
     * The permitted total weight of cargo and installations (e.g. a roof rack) on top of the vehicle.<br/><br/>Typical unit code(s): KGM for kilogram, LBR for pound<br/><br/>* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.<br/>* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]]<br/>* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
     *
     * @return {@link QuantitativeValue}
     * @see <a href="https://auto.schema.org">https://auto.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group</a>
     */
    QuantitativeValue getRoofLoad();

    /**
     * The permitted total weight of cargo and installations (e.g. a roof rack) on top of the vehicle.<br/><br/>Typical unit code(s): KGM for kilogram, LBR for pound<br/><br/>* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.<br/>* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]]<br/>* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
     *
     * @param fRoofLoad QuantitativeValue value to set.
     * @see <a href="https://auto.schema.org">https://auto.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group</a>
     */
    void setRoofLoad(QuantitativeValue fRoofLoad);

    /**
     * The ACRISS Car Classification Code is a code used by many car rental companies, for classifying vehicles. ACRISS stands for Association of Car Rental Industry Systems and Standards.
     *
     * @return {@link Text}
     * @see <a href="https://auto.schema.org">https://auto.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group</a>
     */
    Text getAcrissCode();

    /**
     * The ACRISS Car Classification Code is a code used by many car rental companies, for classifying vehicles. ACRISS stands for Association of Car Rental Industry Systems and Standards.
     *
     * @param fAcrissCode Text value to set.
     * @see <a href="https://auto.schema.org">https://auto.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group</a>
     */
    void setAcrissCode(Text fAcrissCode);
    /**
     * The ACRISS Car Classification Code is a code used by many car rental companies, for classifying vehicles. ACRISS stands for Association of Car Rental Industry Systems and Standards.
     *
     * @param fAcrissCode java.lang.String value to set.
     * @see <a href="https://auto.schema.org">https://auto.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group</a>
     */
    void setAcrissCode(java.lang.String fAcrissCode);
}
