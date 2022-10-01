/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Boolean;
import org.schema.model.datatype.Text;

/**
 * For a given health insurance plan, the specification for costs and coverage of prescription drugs. 
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
 * @see <a href="https://schema.org/HealthPlanFormulary">https://schema.org/HealthPlanFormulary</a>
 */
public interface HealthPlanFormulary extends Intangible {

    /**
     * Whether prescriptions can be delivered by mail.
     *
     * @return {@link Boolean}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    Boolean getOffersPrescriptionByMail();

    /**
     * Whether prescriptions can be delivered by mail.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void setOffersPrescriptionByMail(Boolean fOffersPrescriptionByMail);

    /**
     * The tier(s) of drugs offered by this formulary or insurance plan.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    Text getHealthPlanDrugTier();

    /**
     * The tier(s) of drugs offered by this formulary or insurance plan.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void setHealthPlanDrugTier(Text fHealthPlanDrugTier);

    /**
     * Whether The costs to the patient for services under this network or formulary.
     *
     * @return {@link Boolean}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    Boolean getHealthPlanCostSharing();

    /**
     * Whether The costs to the patient for services under this network or formulary.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void setHealthPlanCostSharing(Boolean fHealthPlanCostSharing);
}
