/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;
import org.schema.model.SizeGroupEnumeration;
import org.schema.model.QuantitativeValue;
import org.schema.model.SizeSystemEnumeration;
import org.schema.model.GenderType;

/**
 * Size related properties of a product, typically a size code ([[name]]) and optionally a [[sizeSystem]], [[sizeGroup]], and product measurements ([[hasMeasurement]]). In addition, the intended audience can be defined through [[suggestedAge]], [[suggestedGender]], and suggested body measurements ([[suggestedMeasurement]]).
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
 * @see <a href="https://schema.org/SizeSpecification">https://schema.org/SizeSpecification</a>
 */
public interface SizeSpecification extends QualitativeValue {

    /**
     * The size group (also known as "size type") for a product's size. Size groups are common in the fashion industry to define size segments and suggested audiences for wearable products. Multiple values can be combined, for example "men's big and tall", "petite maternity" or "regular"
     *
     * @return {@link Text} or {@link SizeGroupEnumeration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    <T> T getSizeGroup();

    /**
     * The size group (also known as "size type") for a product's size. Size groups are common in the fashion industry to define size segments and suggested audiences for wearable products. Multiple values can be combined, for example "men's big and tall", "petite maternity" or "regular"
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    void setSizeGroup(Object fSizeGroup);

    /**
     * A suggested range of body measurements for the intended audience or person, for example inseam between 32 and 34 inches or height between 170 and 190 cm. Typically found on a size chart for wearable products.
     *
     * @return {@link QuantitativeValue}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    QuantitativeValue getSuggestedMeasurement();

    /**
     * A suggested range of body measurements for the intended audience or person, for example inseam between 32 and 34 inches or height between 170 and 190 cm. Typically found on a size chart for wearable products.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    void setSuggestedMeasurement(QuantitativeValue fSuggestedMeasurement);

    /**
     * The age or age range for the intended audience or person, for example 3-12 months for infants, 1-5 years for toddlers.
     *
     * @return {@link QuantitativeValue}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    QuantitativeValue getSuggestedAge();

    /**
     * The age or age range for the intended audience or person, for example 3-12 months for infants, 1-5 years for toddlers.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    void setSuggestedAge(QuantitativeValue fSuggestedAge);

    /**
     * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     *
     * @return {@link QuantitativeValue}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    QuantitativeValue getHasMeasurement();

    /**
     * A product measurement, for example the inseam of pants, the wheel size of a bicycle, or the gauge of a screw. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    void setHasMeasurement(QuantitativeValue fHasMeasurement);

    /**
     * The size system used to identify a product's size. Typically either a standard (for example, "GS1" or "ISO-EN13402"), country code (for example "US" or "JP"), or a measuring system (for example "Metric" or "Imperial").
     *
     * @return {@link Text} or {@link SizeSystemEnumeration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    <T> T getSizeSystem();

    /**
     * The size system used to identify a product's size. Typically either a standard (for example, "GS1" or "ISO-EN13402"), country code (for example "US" or "JP"), or a measuring system (for example "Metric" or "Imperial").
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2811">https://github.com/schemaorg/schemaorg/issues/2811</a>
     */
    void setSizeSystem(Object fSizeSystem);

    /**
     * The suggested gender of the intended person or audience, for example "male", "female", or "unisex".
     *
     * @return {@link GenderType} or {@link Text}
     */
    <T> T getSuggestedGender();

    /**
     * The suggested gender of the intended person or audience, for example "male", "female", or "unisex".
     *
     */
    void setSuggestedGender(Object fSuggestedGender);
}
