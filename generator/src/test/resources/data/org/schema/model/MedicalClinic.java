/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.MedicalTest;
import org.schema.model.MedicalProcedure;
import org.schema.model.MedicalTherapy;
import org.schema.model.MedicalSpecialty;

/**
 * A facility, often associated with a hospital or medical school, that is devoted to the specific diagnosis and/or healthcare. Previously limited to outpatients but with evolution it may be open to inpatients as well.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/MedicalClinic">https://schema.org/MedicalClinic</a>
 */
public interface MedicalClinic extends MedicalOrganization, MedicalBusiness {

    /**
     * A medical service available from this provider.
     *
     * @return {@link MedicalTest} or {@link MedicalProcedure} or {@link MedicalTherapy}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    <T> T getAvailableService();

    /**
     * A medical service available from this provider.
     *
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setAvailableService(Object fAvailableService);

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
