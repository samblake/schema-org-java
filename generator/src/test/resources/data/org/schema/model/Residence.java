/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.FloorPlan;

/**
 * The place where a person lives.
 *
 * @see <a href="https://schema.org/Residence">https://schema.org/Residence</a>
 */
public interface Residence extends Place {

    /**
     * A floorplan of some [[Accommodation]].
     *
     * @return {@link FloorPlan}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    FloorPlan getAccommodationFloorPlan();

    /**
     * A floorplan of some [[Accommodation]].
     *
     * @param accommodationFloorPlan FloorPlan value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2373">https://github.com/schemaorg/schemaorg/issues/2373</a>
     */
    void setAccommodationFloorPlan(FloorPlan accommodationFloorPlan);
}
