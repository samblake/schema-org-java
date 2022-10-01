/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.Country;
import org.schema.model.datatype.Text;
import org.schema.model.PostalAddress;
import org.schema.model.datatype.Number;
import org.schema.model.CreativeWork;
import org.schema.model.datatype.URL;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.Thing;
import org.schema.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.StructuredValue;
import org.schema.model.GeoShape;

/**
 * The geographic shape of a place. A GeoShape can be described using several properties whose values are based on latitude/longitude pairs. Either whitespace or commas can be used to separate latitude and longitude; whitespace should be used when writing a list of several such points.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNews">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_rNews</a>
 * @see <a href="https://schema.org/GeoShape">https://schema.org/GeoShape</a>
 */
@JsonLdTypeName("schema:GeoShape")
public class GeoShapeImpl implements GeoShape {

    private Object fAddress;

    /**
     * Physical address of the item.
     *
     * @return {@link Text} or {@link PostalAddress}
     */
    @Override
    public <T> T getAddress() {
        return (T) fAddress;
    }

    /**
     * Physical address of the item.
     *
     */
    @Override
    public void setAddress(Object fAddress) {
        if(!(fAddress instanceof Text) && !(fAddress instanceof PostalAddress)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'address': " + fAddress);
        }
        this.fAddress = fAddress;
    }

    private Object fElevation;

    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     *
     * @return {@link Text} or {@link Number}
     */
    @Override
    public <T> T getElevation() {
        return (T) fElevation;
    }

    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT_OF_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     *
     */
    @Override
    public void setElevation(Object fElevation) {
        if(!(fElevation instanceof Text) && !(fElevation instanceof Number)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'elevation': " + fElevation);
        }
        this.fElevation = fElevation;
    }

    private Text fPolygon;

    /**
     * A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
     *
     * @return {@link Text}
     */
    @Override
    public Text getPolygon() {
        return fPolygon;
    }

    /**
     * A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
     *
     */
    @Override
    public void setPolygon(Text fPolygon) {
        this.fPolygon = fPolygon;
    }

    private Object fSubjectOf;

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> T getSubjectOf() {
        return (T) fSubjectOf;
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(Object fSubjectOf) {
        if(!(fSubjectOf instanceof Event) && !(fSubjectOf instanceof CreativeWork)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'subjectOf': " + fSubjectOf);
        }
        this.fSubjectOf = fSubjectOf;
    }

    private Text fBox;

    /**
     * A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
     *
     * @return {@link Text}
     */
    @Override
    public Text getBox() {
        return fBox;
    }

    /**
     * A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
     *
     */
    @Override
    public void setBox(Text fBox) {
        this.fBox = fBox;
    }

    private Text fName;

    /**
     * The name of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getName() {
        return fName;
    }

    /**
     * The name of the item.
     *
     */
    @Override
    public void setName(Text fName) {
        this.fName = fName;
    }

    private Text fDisambiguatingDescription;

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDisambiguatingDescription() {
        return fDisambiguatingDescription;
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     */
    @Override
    public void setDisambiguatingDescription(Text fDisambiguatingDescription) {
        this.fDisambiguatingDescription = fDisambiguatingDescription;
    }

    private Object fImage;

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> T getImage() {
        return (T) fImage;
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     */
    @Override
    public void setImage(Object fImage) {
        if(!(fImage instanceof URL) && !(fImage instanceof ImageObject)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'image': " + fImage);
        }
        this.fImage = fImage;
    }

    private URL fSameAs;

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public URL getSameAs() {
        return fSameAs;
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     */
    @Override
    public void setSameAs(URL fSameAs) {
        this.fSameAs = fSameAs;
    }

    private Object fIdentifier;

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link URL} or {@link Text} or {@link PropertyValue}
     */
    @Override
    public <T> T getIdentifier() {
        return (T) fIdentifier;
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     */
    @Override
    public void setIdentifier(Object fIdentifier) {
        if(!(fIdentifier instanceof URL) && !(fIdentifier instanceof Text) && !(fIdentifier instanceof PropertyValue)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'identifier': " + fIdentifier);
        }
        this.fIdentifier = fIdentifier;
    }

    private Text fPostalCode;

    /**
     * The postal code. For example, 94043.
     *
     * @return {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    @Override
    public Text getPostalCode() {
        return fPostalCode;
    }

    /**
     * The postal code. For example, 94043.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    @Override
    public void setPostalCode(Text fPostalCode) {
        this.fPostalCode = fPostalCode;
    }

    private Text fAlternateName;

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAlternateName() {
        return fAlternateName;
    }

    /**
     * An alias for the item.
     *
     */
    @Override
    public void setAlternateName(Text fAlternateName) {
        this.fAlternateName = fAlternateName;
    }

    private Object fMainEntityOfPage;

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link CreativeWork} or {@link URL}
     */
    @Override
    public <T> T getMainEntityOfPage() {
        return (T) fMainEntityOfPage;
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     */
    @Override
    public void setMainEntityOfPage(Object fMainEntityOfPage) {
        if(!(fMainEntityOfPage instanceof CreativeWork) && !(fMainEntityOfPage instanceof URL)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'mainEntityOfPage': " + fMainEntityOfPage);
        }
        this.fMainEntityOfPage = fMainEntityOfPage;
    }

    private URL fUrl;

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public URL getUrl() {
        return fUrl;
    }

    /**
     * URL of the item.
     *
     */
    @Override
    public void setUrl(URL fUrl) {
        this.fUrl = fUrl;
    }

    private Text fCircle;

    /**
     * A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
     *
     * @return {@link Text}
     */
    @Override
    public Text getCircle() {
        return fCircle;
    }

    /**
     * A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
     *
     */
    @Override
    public void setCircle(Text fCircle) {
        this.fCircle = fCircle;
    }

    private Text fLine;

    /**
     * A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
     *
     * @return {@link Text}
     */
    @Override
    public Text getLine() {
        return fLine;
    }

    /**
     * A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
     *
     */
    @Override
    public void setLine(Text fLine) {
        this.fLine = fLine;
    }

    private URL fAdditionalType;

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     */
    @Override
    public URL getAdditionalType() {
        return fAdditionalType;
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     */
    @Override
    public void setAdditionalType(URL fAdditionalType) {
        this.fAdditionalType = fAdditionalType;
    }

    private Text fDescription;

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDescription() {
        return fDescription;
    }

    /**
     * A description of the item.
     *
     */
    @Override
    public void setDescription(Text fDescription) {
        this.fDescription = fDescription;
    }

    private Object fAddressCountry;

    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     *
     * @return {@link Country} or {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    @Override
    public <T> T getAddressCountry() {
        return (T) fAddressCountry;
    }

    /**
     * The country. For example, USA. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1).
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2506">https://github.com/schemaorg/schemaorg/issues/2506</a>
     */
    @Override
    public void setAddressCountry(Object fAddressCountry) {
        if(!(fAddressCountry instanceof Country) && !(fAddressCountry instanceof Text)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'addressCountry': " + fAddressCountry);
        }
        this.fAddressCountry = fAddressCountry;
    }

    private Action fPotentialAction;

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public Action getPotentialAction() {
        return fPotentialAction;
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     */
    @Override
    public void setPotentialAction(Action fPotentialAction) {
        this.fPotentialAction = fPotentialAction;
    }
}
