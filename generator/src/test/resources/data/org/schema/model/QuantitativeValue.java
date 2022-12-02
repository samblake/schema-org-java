/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.Enumeration;
import org.schema.model.DefinedTerm;
import org.schema.model.datatype.Text;
import org.schema.model.MeasurementTypeEnumeration;
import org.schema.model.QualitativeValue;
import org.schema.model.StructuredValue;
import org.schema.model.PropertyValue;
import org.schema.model.QuantitativeValue;
import org.schema.model.datatype.Number;
import org.schema.model.datatype.Boolean;
import org.schema.model.datatype.URL;

/**
 *  A point value or interval for product characteristics and other purposes.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass</a>
 * @see <a href="https://schema.org/QuantitativeValue">https://schema.org/QuantitativeValue</a>
 */
public interface QuantitativeValue extends StructuredValue {

    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @return {@link Enumeration} or {@link DefinedTerm} or {@link Text} or {@link MeasurementTypeEnumeration} or {@link QualitativeValue} or {@link StructuredValue} or {@link PropertyValue} or {@link QuantitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> T getValueReference();

    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param fValueReference Enumeration value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValueReference(Enumeration fValueReference);
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param fValueReference DefinedTerm value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValueReference(DefinedTerm fValueReference);
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param fValueReference Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValueReference(Text fValueReference);
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param fValueReference java.lang.String value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValueReference(java.lang.String fValueReference);
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param fValueReference MeasurementTypeEnumeration value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValueReference(MeasurementTypeEnumeration fValueReference);
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param fValueReference QualitativeValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValueReference(QualitativeValue fValueReference);
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param fValueReference StructuredValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValueReference(StructuredValue fValueReference);
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param fValueReference PropertyValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValueReference(PropertyValue fValueReference);
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     *
     * @param fValueReference QuantitativeValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValueReference(QuantitativeValue fValueReference);

    /**
     * The upper value of some characteristic or property.
     *
     * @return {@link Number}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    Number getMaxValue();

    /**
     * The upper value of some characteristic or property.
     *
     * @param fMaxValue Number value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setMaxValue(Number fMaxValue);
    /**
     * The upper value of some characteristic or property.
     *
     * @param fMaxValue java.lang.Number value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setMaxValue(java.lang.Number fMaxValue);

    /**
     * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
     * <a href='unitCode'>unitCode</a>.
     *
     * @return {@link Text}
     */
    Text getUnitText();

    /**
     * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
     * <a href='unitCode'>unitCode</a>.
     *
     * @param fUnitText Text value to set.
     */
    void setUnitText(Text fUnitText);
    /**
     * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
     * <a href='unitCode'>unitCode</a>.
     *
     * @param fUnitText java.lang.String value to set.
     */
    void setUnitText(java.lang.String fUnitText);

    /**
     * The lower value of some characteristic or property.
     *
     * @return {@link Number}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    Number getMinValue();

    /**
     * The lower value of some characteristic or property.
     *
     * @param fMinValue Number value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setMinValue(Number fMinValue);
    /**
     * The lower value of some characteristic or property.
     *
     * @param fMinValue java.lang.Number value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setMinValue(java.lang.Number fMinValue);

    /**
     * The value of the quantitative value or property value node.<br/><br/>* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.<br/>* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.<br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @return {@link Text} or {@link Number} or {@link StructuredValue} or {@link Boolean}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> T getValue();

    /**
     * The value of the quantitative value or property value node.<br/><br/>* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.<br/>* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.<br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fValue Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValue(Text fValue);
    /**
     * The value of the quantitative value or property value node.<br/><br/>* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.<br/>* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.<br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fValue java.lang.String value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValue(java.lang.String fValue);
    /**
     * The value of the quantitative value or property value node.<br/><br/>* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.<br/>* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.<br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fValue Number value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValue(Number fValue);
    /**
     * The value of the quantitative value or property value node.<br/><br/>* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.<br/>* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.<br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fValue java.lang.Number value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValue(java.lang.Number fValue);
    /**
     * The value of the quantitative value or property value node.<br/><br/>* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.<br/>* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.<br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fValue StructuredValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValue(StructuredValue fValue);
    /**
     * The value of the quantitative value or property value node.<br/><br/>* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.<br/>* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.<br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fValue Boolean value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValue(Boolean fValue);
    /**
     * The value of the quantitative value or property value node.<br/><br/>* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.<br/>* For [[PropertyValue]], it can be 'Text;', 'Number', 'Boolean', or 'StructuredValue'.<br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fValue java.lang.Boolean value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setValue(java.lang.Boolean fValue);

    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     *
     * @return {@link Text} or {@link URL}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> T getUnitCode();

    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     *
     * @param fUnitCode Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setUnitCode(Text fUnitCode);
    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     *
     * @param fUnitCode java.lang.String value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setUnitCode(java.lang.String fUnitCode);
    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     *
     * @param fUnitCode URL value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setUnitCode(URL fUnitCode);
    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     *
     * @param fUnitCode java.net.URL value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setUnitCode(java.net.URL fUnitCode);

    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.<br/><br/>Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. https://schema.org/width, https://schema.org/color, https://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     *
     * @return {@link PropertyValue}
     */
    PropertyValue getAdditionalProperty();

    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.<br/><br/>Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. https://schema.org/width, https://schema.org/color, https://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     *
     * @param fAdditionalProperty PropertyValue value to set.
     */
    void setAdditionalProperty(PropertyValue fAdditionalProperty);
}
