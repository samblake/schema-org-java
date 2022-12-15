/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Number;
import org.schema.model.datatype.Text;
import org.schema.model.PriceSpecification;

/**
 * A description of costs to the patient under a given network or formulary.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
 * @see <a href="https://schema.org/HealthPlanCostSharingSpecification">https://schema.org/HealthPlanCostSharingSpecification</a>
 */
public interface HealthPlanCostSharingSpecification extends Intangible {

    /**
     * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    Number getHealthPlanCoinsuranceRate();

    /**
     * Whether The rate of coinsurance expressed as a number between 0.0 and 1.0.
     *
     * @param healthPlanCoinsuranceRate Number value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void setHealthPlanCoinsuranceRate(Number healthPlanCoinsuranceRate);

    /**
     * Whether the coinsurance applies before or after deductible, etc. TODO: Is this a closed set?
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    Text getHealthPlanCoinsuranceOption();

    /**
     * Whether the coinsurance applies before or after deductible, etc. TODO: Is this a closed set?
     *
     * @param healthPlanCoinsuranceOption Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void setHealthPlanCoinsuranceOption(Text healthPlanCoinsuranceOption);

    /**
     * The category or type of pharmacy associated with this cost sharing.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    Text getHealthPlanPharmacyCategory();

    /**
     * The category or type of pharmacy associated with this cost sharing.
     *
     * @param healthPlanPharmacyCategory Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void setHealthPlanPharmacyCategory(Text healthPlanPharmacyCategory);

    /**
     * Whether The copay amount.
     *
     * @return {@link PriceSpecification}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    PriceSpecification getHealthPlanCopay();

    /**
     * Whether The copay amount.
     *
     * @param healthPlanCopay PriceSpecification value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void setHealthPlanCopay(PriceSpecification healthPlanCopay);

    /**
     * Whether the copay is before or after deductible, etc. TODO: Is this a closed set?
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    Text getHealthPlanCopayOption();

    /**
     * Whether the copay is before or after deductible, etc. TODO: Is this a closed set?
     *
     * @param healthPlanCopayOption Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void setHealthPlanCopayOption(Text healthPlanCopayOption);
}
