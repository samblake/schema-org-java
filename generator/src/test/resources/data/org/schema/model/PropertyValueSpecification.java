/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Number;
import org.schema.model.datatype.Boolean;
import org.schema.model.datatype.Text;
import org.schema.model.Thing;

/**
 * A Property value specification.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_ActionCollabClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_ActionCollabClass</a>
 * @see <a href="https://schema.org/PropertyValueSpecification">https://schema.org/PropertyValueSpecification</a>
 */
public interface PropertyValueSpecification extends Intangible {

    /**
     * Specifies the allowed range for number of characters in a literal value.
     *
     * @return {@link Number}
     */
    Number getValueMaxLength();

    /**
     * Specifies the allowed range for number of characters in a literal value.
     *
     */
    void setValueMaxLength(Number fValueMaxLength);

    /**
     * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a "hidden" input in an HTML form.
     *
     * @return {@link Boolean}
     */
    Boolean getReadonlyValue();

    /**
     * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a "hidden" input in an HTML form.
     *
     */
    void setReadonlyValue(Boolean fReadonlyValue);

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
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setMaxValue(Number fMaxValue);

    /**
     * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
     *
     * @return {@link Text}
     */
    Text getValueName();

    /**
     * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
     *
     */
    void setValueName(Text fValueName);

    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     *
     * @return {@link Text} or {@link Thing}
     */
    <T> T getDefaultValue();

    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     *
     */
    void setDefaultValue(Object fDefaultValue);

    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     *
     * @return {@link Number}
     */
    Number getValueMinLength();

    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     *
     */
    void setValueMinLength(Number fValueMinLength);

    /**
     * Whether the property must be filled in to complete the action.  Default is false.
     *
     * @return {@link Boolean}
     */
    Boolean getValueRequired();

    /**
     * Whether the property must be filled in to complete the action.  Default is false.
     *
     */
    void setValueRequired(Boolean fValueRequired);

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
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setMinValue(Number fMinValue);

    /**
     * Specifies a regular expression for testing literal values according to the HTML spec.
     *
     * @return {@link Text}
     */
    Text getValuePattern();

    /**
     * Specifies a regular expression for testing literal values according to the HTML spec.
     *
     */
    void setValuePattern(Text fValuePattern);

    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     *
     * @return {@link Number}
     */
    Number getStepValue();

    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     *
     */
    void setStepValue(Number fStepValue);

    /**
     * Whether multiple values are allowed for the property.  Default is false.
     *
     * @return {@link Boolean}
     */
    Boolean getMultipleValues();

    /**
     * Whether multiple values are allowed for the property.  Default is false.
     *
     */
    void setMultipleValues(Boolean fMultipleValues);
}
