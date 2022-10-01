/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Number;

/**
 * Indicates employment-related experience requirements, e.g. [[monthsOfExperience]].
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/2681">https://github.com/schemaorg/schemaorg/issues/2681</a>
 * @see <a href="https://schema.org/OccupationalExperienceRequirements">https://schema.org/OccupationalExperienceRequirements</a>
 */
public interface OccupationalExperienceRequirements extends Intangible {

    /**
     * Indicates the minimal number of months of experience required for a position.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2681">https://github.com/schemaorg/schemaorg/issues/2681</a>
     */
    Number getMonthsOfExperience();

    /**
     * Indicates the minimal number of months of experience required for a position.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2681">https://github.com/schemaorg/schemaorg/issues/2681</a>
     */
    void setMonthsOfExperience(Number fMonthsOfExperience);
}
