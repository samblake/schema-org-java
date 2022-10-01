/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Boolean;
import org.schema.model.datatype.Text;
import org.schema.model.MedicalSpecialty;

/**
 * A medical organization (physical or not), such as hospital, institution or clinic.
 *
 * @see <a href="https://schema.org/MedicalOrganization">https://schema.org/MedicalOrganization</a>
 */
public interface MedicalOrganization extends Organization {

    /**
     * Whether the provider is accepting new patients.
     *
     * @return {@link Boolean}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    Boolean getIsAcceptingNewPatients();

    /**
     * Whether the provider is accepting new patients.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void setIsAcceptingNewPatients(Boolean fIsAcceptingNewPatients);

    /**
     * Name or unique ID of network. (Networks are often reused across different insurance plans).
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    Text getHealthPlanNetworkId();

    /**
     * Name or unique ID of network. (Networks are often reused across different insurance plans).
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1062">https://github.com/schemaorg/schemaorg/issues/1062</a>
     */
    void setHealthPlanNetworkId(Text fHealthPlanNetworkId);

    /**
     * A medical specialty of the provider.
     *
     * @return {@link MedicalSpecialty}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    MedicalSpecialty getMedicalSpecialty();

    /**
     * A medical specialty of the provider.
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setMedicalSpecialty(MedicalSpecialty fMedicalSpecialty);
}
