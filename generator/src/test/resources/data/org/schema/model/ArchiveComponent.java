/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.ArchiveOrganization;
import org.schema.model.Place;
import org.schema.model.datatype.Text;
import org.schema.model.PostalAddress;

/**
 * An intangible type to be applied to any archive content, carrying with it a set of properties required to describe archival items and collections.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1758">https://github.com/schemaorg/schemaorg/issues/1758</a>
 * @see <a href="https://schema.org/ArchiveComponent">https://schema.org/ArchiveComponent</a>
 */
public interface ArchiveComponent extends CreativeWork {

    /**
     * [[ArchiveOrganization]] that holds, keeps or maintains the [[ArchiveComponent]].
     *
     * @return {@link ArchiveOrganization}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1758">https://github.com/schemaorg/schemaorg/issues/1758</a>
     */
    List<ArchiveOrganization> getHoldingArchiveList();

    /**
     * [[ArchiveOrganization]] that holds, keeps or maintains the [[ArchiveComponent]].
     *
     * @return {@link ArchiveOrganization}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1758">https://github.com/schemaorg/schemaorg/issues/1758</a>
     */
    ArchiveOrganization getHoldingArchive();

    /**
     * [[ArchiveOrganization]] that holds, keeps or maintains the [[ArchiveComponent]].
     *
     * @param holdingArchive ArchiveOrganization value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1758">https://github.com/schemaorg/schemaorg/issues/1758</a>
     */
    void addHoldingArchive(ArchiveOrganization holdingArchive);

    /**
     * Current location of the item.
     *
     * @return {@link Place} or {@link Text} or {@link PostalAddress}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1758">https://github.com/schemaorg/schemaorg/issues/1758</a>
     * @see <a href="https://schema.org/location">https://schema.org/location</a> <i>itemLocation</i> is a sub property of <i>location</i>
     */
    <T> List<T> getItemLocationList();

    /**
     * Current location of the item.
     *
     * @return {@link Place} or {@link Text} or {@link PostalAddress}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1758">https://github.com/schemaorg/schemaorg/issues/1758</a>
     * @see <a href="https://schema.org/location">https://schema.org/location</a> <i>itemLocation</i> is a sub property of <i>location</i>
     */
    <T> T getItemLocation();

    /**
     * Current location of the item.
     *
     * @param itemLocation Place value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1758">https://github.com/schemaorg/schemaorg/issues/1758</a>
     * @see <a href="https://schema.org/location">https://schema.org/location</a> <i>itemLocation</i> is a sub property of <i>location</i>
     */
    void addItemLocation(Place itemLocation);
    /**
     * Current location of the item.
     *
     * @param itemLocation Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1758">https://github.com/schemaorg/schemaorg/issues/1758</a>
     * @see <a href="https://schema.org/location">https://schema.org/location</a> <i>itemLocation</i> is a sub property of <i>location</i>
     */
    void addItemLocation(Text itemLocation);
    /**
     * Current location of the item.
     *
     * @param itemLocation PostalAddress value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1758">https://github.com/schemaorg/schemaorg/issues/1758</a>
     * @see <a href="https://schema.org/location">https://schema.org/location</a> <i>itemLocation</i> is a sub property of <i>location</i>
     */
    void addItemLocation(PostalAddress itemLocation);
}
