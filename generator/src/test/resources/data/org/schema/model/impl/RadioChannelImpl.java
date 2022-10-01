/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.datatype.URL;
import org.schema.model.datatype.Text;
import org.schema.model.BroadcastFrequencySpecification;
import org.schema.model.BroadcastService;
import org.schema.model.CableOrSatelliteService;
import org.schema.model.CreativeWork;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.Thing;
import org.schema.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.BroadcastChannel;
import org.schema.model.RadioChannel;

/**
 * A unique instance of a radio BroadcastService on a CableOrSatelliteService lineup.
 *
 * @see <a href="https://schema.org/RadioChannel">https://schema.org/RadioChannel</a>
 */
@JsonLdTypeName("schema:RadioChannel")
public class RadioChannelImpl implements RadioChannel {

    private BroadcastService fProvidesBroadcastService;

    /**
     * The BroadcastService offered on this channel.
     *
     * @return {@link BroadcastService}
     */
    @Override
    public BroadcastService getProvidesBroadcastService() {
        return fProvidesBroadcastService;
    }

    /**
     * The BroadcastService offered on this channel.
     *
     */
    @Override
    public void setProvidesBroadcastService(BroadcastService fProvidesBroadcastService) {
        this.fProvidesBroadcastService = fProvidesBroadcastService;
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

    private Object fBroadcastFrequency;

    /**
     * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. "87 FM".
     *
     * @return {@link BroadcastFrequencySpecification} or {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1004">https://github.com/schemaorg/schemaorg/issues/1004</a>
     */
    @Override
    public <T> T getBroadcastFrequency() {
        return (T) fBroadcastFrequency;
    }

    /**
     * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. "87 FM".
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1004">https://github.com/schemaorg/schemaorg/issues/1004</a>
     */
    @Override
    public void setBroadcastFrequency(Object fBroadcastFrequency) {
        if(!(fBroadcastFrequency instanceof BroadcastFrequencySpecification) && !(fBroadcastFrequency instanceof Text)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'broadcastFrequency': " + fBroadcastFrequency);
        }
        this.fBroadcastFrequency = fBroadcastFrequency;
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

    private Object fGenre;

    /**
     * Genre of the creative work, broadcast channel or group.
     *
     * @return {@link URL} or {@link Text}
     */
    @Override
    public <T> T getGenre() {
        return (T) fGenre;
    }

    /**
     * Genre of the creative work, broadcast channel or group.
     *
     */
    @Override
    public void setGenre(Object fGenre) {
        if(!(fGenre instanceof URL) && !(fGenre instanceof Text)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'genre': " + fGenre);
        }
        this.fGenre = fGenre;
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

    private Text fBroadcastChannelId;

    /**
     * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
     *
     * @return {@link Text}
     */
    @Override
    public Text getBroadcastChannelId() {
        return fBroadcastChannelId;
    }

    /**
     * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
     *
     */
    @Override
    public void setBroadcastChannelId(Text fBroadcastChannelId) {
        this.fBroadcastChannelId = fBroadcastChannelId;
    }

    private CableOrSatelliteService fInBroadcastLineup;

    /**
     * The CableOrSatelliteService offering the channel.
     *
     * @return {@link CableOrSatelliteService}
     */
    @Override
    public CableOrSatelliteService getInBroadcastLineup() {
        return fInBroadcastLineup;
    }

    /**
     * The CableOrSatelliteService offering the channel.
     *
     */
    @Override
    public void setInBroadcastLineup(CableOrSatelliteService fInBroadcastLineup) {
        this.fInBroadcastLineup = fInBroadcastLineup;
    }

    private Text fBroadcastServiceTier;

    /**
     * The type of service required to have access to the channel (e.g. Standard or Premium).
     *
     * @return {@link Text}
     */
    @Override
    public Text getBroadcastServiceTier() {
        return fBroadcastServiceTier;
    }

    /**
     * The type of service required to have access to the channel (e.g. Standard or Premium).
     *
     */
    @Override
    public void setBroadcastServiceTier(Text fBroadcastServiceTier) {
        this.fBroadcastServiceTier = fBroadcastServiceTier;
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
