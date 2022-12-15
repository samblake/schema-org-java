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
     * @param addressCountry Country value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    void setAddressCountry(Country addressCountry);
    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     *
     * @param addressCountry Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    void setAddressCountry(Text addressCountry);

    /**
     * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     *
     * @return {@link Text} or {@link Number}
     */
    <T> T getLatitude();

    /**
     * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     *
     * @param latitude Text value to set.
     */
    void setLatitude(Text latitude);
    /**
     * The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     *
     * @param latitude Number value to set.
     */
    void setLatitude(Number latitude);

    /**
     * Physical address of the item.
     *
     * @return {@link Text} or {@link PostalAddress}
     */
    <T> T getAddress();

    /**
     * Physical address of the item.
     *
     * @param address Text value to set.
     */
    void setAddress(Text address);
    /**
     * Physical address of the item.
     *
     * @param address PostalAddress value to set.
     */
    void setAddress(PostalAddress address);

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
     * @param postalCode Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    void setPostalCode(Text postalCode);

    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     *
     * @return {@link Text} or {@link Number}
     */
    <T> T getElevation();

    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     *
     * @param elevation Text value to set.
     */
    void setElevation(Text elevation);
    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     *
     * @param elevation Number value to set.
     */
    void setElevation(Number elevation);

    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     *
     * @return {@link Number} or {@link Text}
     */
    <T> T getLongitude();

    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     *
     * @param longitude Number value to set.
     */
    void setLongitude(Number longitude);
    /**
     * The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)).
     *
     * @param longitude Text value to set.
     */
    void setLongitude(Text longitude);
}
