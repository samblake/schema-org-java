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
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.BroadcastChannel;
import org.schema.model.RadioChannel;
import org.schema.model.FMRadioChannel;

/**
 * A radio channel that uses FM.
 *
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1004">https://github.com/schemaorg/schemaorg/issues/1004</a>
 * @see <a href="https://schema.org/FMRadioChannel">https://schema.org/FMRadioChannel</a>
 */
@JsonLdTypeName("FMRadioChannel")
public class FMRadioChannelImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements FMRadioChannel {

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
     * @param fGenre URL value to set.
     */
    @Override
    public void setGenre(URL fGenre) {
        this.fGenre = fGenre;
    }
    /**
     * Genre of the creative work, broadcast channel or group.
     *
     * @param fGenre java.net.URL value to set.
     */
    @Override
    public void setGenre(java.net.URL fGenre) {
        this.fGenre = URL.of(fGenre);
    }
    /**
     * Genre of the creative work, broadcast channel or group.
     *
     * @param fGenre Text value to set.
     */
    @Override
    public void setGenre(Text fGenre) {
        this.fGenre = fGenre;
    }
    /**
     * Genre of the creative work, broadcast channel or group.
     *
     * @param fGenre java.lang.String value to set.
     */
    @Override
    public void setGenre(java.lang.String fGenre) {
        this.fGenre = Text.of(fGenre);
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
     * @param fBroadcastFrequency BroadcastFrequencySpecification value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1004">https://github.com/schemaorg/schemaorg/issues/1004</a>
     */
    @Override
    public void setBroadcastFrequency(BroadcastFrequencySpecification fBroadcastFrequency) {
        this.fBroadcastFrequency = fBroadcastFrequency;
    }
    /**
     * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. "87 FM".
     *
     * @param fBroadcastFrequency Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1004">https://github.com/schemaorg/schemaorg/issues/1004</a>
     */
    @Override
    public void setBroadcastFrequency(Text fBroadcastFrequency) {
        this.fBroadcastFrequency = fBroadcastFrequency;
    }
    /**
     * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. "87 FM".
     *
     * @param fBroadcastFrequency java.lang.String value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1004">https://github.com/schemaorg/schemaorg/issues/1004</a>
     */
    @Override
    public void setBroadcastFrequency(java.lang.String fBroadcastFrequency) {
        this.fBroadcastFrequency = Text.of(fBroadcastFrequency);
    }

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
     * @param fProvidesBroadcastService BroadcastService value to set.
     */
    @Override
    public void setProvidesBroadcastService(BroadcastService fProvidesBroadcastService) {
        this.fProvidesBroadcastService = fProvidesBroadcastService;
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
     * @param fBroadcastChannelId Text value to set.
     */
    @Override
    public void setBroadcastChannelId(Text fBroadcastChannelId) {
        this.fBroadcastChannelId = fBroadcastChannelId;
    }
    /**
     * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
     *
     * @param fBroadcastChannelId java.lang.String value to set.
     */
    @Override
    public void setBroadcastChannelId(java.lang.String fBroadcastChannelId) {
        this.fBroadcastChannelId = Text.of(fBroadcastChannelId);
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
     * @param fInBroadcastLineup CableOrSatelliteService value to set.
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
     * @param fBroadcastServiceTier Text value to set.
     */
    @Override
    public void setBroadcastServiceTier(Text fBroadcastServiceTier) {
        this.fBroadcastServiceTier = fBroadcastServiceTier;
    }
    /**
     * The type of service required to have access to the channel (e.g. Standard or Premium).
     *
     * @param fBroadcastServiceTier java.lang.String value to set.
     */
    @Override
    public void setBroadcastServiceTier(java.lang.String fBroadcastServiceTier) {
        this.fBroadcastServiceTier = Text.of(fBroadcastServiceTier);
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
     * @param fMainEntityOfPage CreativeWork value to set.
     */
    @Override
    public void setMainEntityOfPage(CreativeWork fMainEntityOfPage) {
        this.fMainEntityOfPage = fMainEntityOfPage;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param fMainEntityOfPage URL value to set.
     */
    @Override
    public void setMainEntityOfPage(URL fMainEntityOfPage) {
        this.fMainEntityOfPage = fMainEntityOfPage;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param fMainEntityOfPage java.net.URL value to set.
     */
    @Override
    public void setMainEntityOfPage(java.net.URL fMainEntityOfPage) {
        this.fMainEntityOfPage = URL.of(fMainEntityOfPage);
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
     * @param fAlternateName Text value to set.
     */
    @Override
    public void setAlternateName(Text fAlternateName) {
        this.fAlternateName = fAlternateName;
    }
    /**
     * An alias for the item.
     *
     * @param fAlternateName java.lang.String value to set.
     */
    @Override
    public void setAlternateName(java.lang.String fAlternateName) {
        this.fAlternateName = Text.of(fAlternateName);
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
     * @param fName Text value to set.
     */
    @Override
    public void setName(Text fName) {
        this.fName = fName;
    }
    /**
     * The name of the item.
     *
     * @param fName java.lang.String value to set.
     */
    @Override
    public void setName(java.lang.String fName) {
        this.fName = Text.of(fName);
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
     * @param fPotentialAction Action value to set.
     */
    @Override
    public void setPotentialAction(Action fPotentialAction) {
        this.fPotentialAction = fPotentialAction;
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
     * @param fImage URL value to set.
     */
    @Override
    public void setImage(URL fImage) {
        this.fImage = fImage;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param fImage java.net.URL value to set.
     */
    @Override
    public void setImage(java.net.URL fImage) {
        this.fImage = URL.of(fImage);
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param fImage ImageObject value to set.
     */
    @Override
    public void setImage(ImageObject fImage) {
        this.fImage = fImage;
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
     * @param fUrl URL value to set.
     */
    @Override
    public void setUrl(URL fUrl) {
        this.fUrl = fUrl;
    }
    /**
     * URL of the item.
     *
     * @param fUrl java.net.URL value to set.
     */
    @Override
    public void setUrl(java.net.URL fUrl) {
        this.fUrl = URL.of(fUrl);
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
     * @param fDescription Text value to set.
     */
    @Override
    public void setDescription(Text fDescription) {
        this.fDescription = fDescription;
    }
    /**
     * A description of the item.
     *
     * @param fDescription java.lang.String value to set.
     */
    @Override
    public void setDescription(java.lang.String fDescription) {
        this.fDescription = Text.of(fDescription);
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
     * @param fSubjectOf Event value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(Event fSubjectOf) {
        this.fSubjectOf = fSubjectOf;
    }
    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param fSubjectOf CreativeWork value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(CreativeWork fSubjectOf) {
        this.fSubjectOf = fSubjectOf;
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
     * @param fAdditionalType URL value to set.
     */
    @Override
    public void setAdditionalType(URL fAdditionalType) {
        this.fAdditionalType = fAdditionalType;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @param fAdditionalType java.net.URL value to set.
     */
    @Override
    public void setAdditionalType(java.net.URL fAdditionalType) {
        this.fAdditionalType = URL.of(fAdditionalType);
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
     * @param fDisambiguatingDescription Text value to set.
     */
    @Override
    public void setDisambiguatingDescription(Text fDisambiguatingDescription) {
        this.fDisambiguatingDescription = fDisambiguatingDescription;
    }
    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @param fDisambiguatingDescription java.lang.String value to set.
     */
    @Override
    public void setDisambiguatingDescription(java.lang.String fDisambiguatingDescription) {
        this.fDisambiguatingDescription = Text.of(fDisambiguatingDescription);
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
     * @param fSameAs URL value to set.
     */
    @Override
    public void setSameAs(URL fSameAs) {
        this.fSameAs = fSameAs;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @param fSameAs java.net.URL value to set.
     */
    @Override
    public void setSameAs(java.net.URL fSameAs) {
        this.fSameAs = URL.of(fSameAs);
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
     * @param fIdentifier URL value to set.
     */
    @Override
    public void setIdentifier(URL fIdentifier) {
        this.fIdentifier = fIdentifier;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param fIdentifier java.net.URL value to set.
     */
    @Override
    public void setIdentifier(java.net.URL fIdentifier) {
        this.fIdentifier = URL.of(fIdentifier);
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param fIdentifier Text value to set.
     */
    @Override
    public void setIdentifier(Text fIdentifier) {
        this.fIdentifier = fIdentifier;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param fIdentifier java.lang.String value to set.
     */
    @Override
    public void setIdentifier(java.lang.String fIdentifier) {
        this.fIdentifier = Text.of(fIdentifier);
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param fIdentifier PropertyValue value to set.
     */
    @Override
    public void setIdentifier(PropertyValue fIdentifier) {
        this.fIdentifier = fIdentifier;
    }
}
