/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.Country;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.Number;
import org.schema.model.PostalAddress;

/**
 * The geographic coordinates of a place or event.
 *
 * @see <a href="https://schema.org/GeoCoordinates">https://schema.org/GeoCoordinates</a>
 */
public interface GeoCoordinates extends StructuredValue {

    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     *
     * @return {@link Country} or {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    <T> T getAddressCountry();

    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    void setAddressCountry(Object fAddressCountry);

    /**
     * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     *
     * @return {@link Text} or {@link Number}
     */
    <T> T getLatitude();

    /**
     * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     *
     */
    void setLatitude(Object fLatitude);

    /**
     * Physical address of the item.
     *
     * @return {@link Text} or {@link PostalAddress}
     */
    <T> T getAddress();

    /**
     * Physical address of the item.
     *
     */
    void setAddress(Object fAddress);

    /**
     * The postal code. For example, 94043.
     *
     * @return {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    Text getPostalCode();

    /**
     * The postal code. For example, 94043.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    void setPostalCode(Text fPostalCode);

    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     *
     * @return {@link Text} or {@link Number}
     */
    <T> T getElevation();

    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     *
     */
    void setElevation(Object fElevation);

    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     *
     * @return {@link Number} or {@link Text}
     */
    <T> T getLongitude();

    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     *
     */
    void setLongitude(Object fLongitude);
}
