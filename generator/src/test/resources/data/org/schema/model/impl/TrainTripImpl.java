/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.datatype.Text;
import org.schema.model.TrainStation;
import org.schema.model.datatype.Time;
import org.schema.model.datatype.DateTime;
import org.schema.model.Offer;
import org.schema.model.Demand;
import org.schema.model.Organization;
import org.schema.model.Person;
import org.schema.model.Trip;
import org.schema.model.ItemList;
import org.schema.model.Place;
import org.schema.model.CreativeWork;
import org.schema.model.datatype.URL;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.Thing;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.TrainTrip;

/**
 * A trip on a commercial train line.
 *
 * @see <a href="https://schema.org/TrainTrip">https://schema.org/TrainTrip</a>
 */
@JsonLdTypeName("TrainTrip")
public class TrainTripImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements TrainTrip {

    private Text trainName;

    /**
     * The name of the train (e.g. The Orient Express).
     *
     * @return {@link Text}
     */
    @Override
    public Text getTrainName() {
        return trainName;
    }

    /**
     * The name of the train (e.g. The Orient Express).
     *
     * @param trainName Text value to set.
     */
    @Override
    public void setTrainName(Text trainName) {
        this.trainName = trainName;
    }

    private TrainStation departureStation;

    /**
     * The station from which the train departs.
     *
     * @return {@link TrainStation}
     */
    @Override
    public TrainStation getDepartureStation() {
        return departureStation;
    }

    /**
     * The station from which the train departs.
     *
     * @param departureStation TrainStation value to set.
     */
    @Override
    public void setDepartureStation(TrainStation departureStation) {
        this.departureStation = departureStation;
    }

    private Text departurePlatform;

    /**
     * The platform from which the train departs.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDeparturePlatform() {
        return departurePlatform;
    }

    /**
     * The platform from which the train departs.
     *
     * @param departurePlatform Text value to set.
     */
    @Override
    public void setDeparturePlatform(Text departurePlatform) {
        this.departurePlatform = departurePlatform;
    }

    private Text trainNumber;

    /**
     * The unique identifier for the train.
     *
     * @return {@link Text}
     */
    @Override
    public Text getTrainNumber() {
        return trainNumber;
    }

    /**
     * The unique identifier for the train.
     *
     * @param trainNumber Text value to set.
     */
    @Override
    public void setTrainNumber(Text trainNumber) {
        this.trainNumber = trainNumber;
    }

    private Text arrivalPlatform;

    /**
     * The platform where the train arrives.
     *
     * @return {@link Text}
     */
    @Override
    public Text getArrivalPlatform() {
        return arrivalPlatform;
    }

    /**
     * The platform where the train arrives.
     *
     * @param arrivalPlatform Text value to set.
     */
    @Override
    public void setArrivalPlatform(Text arrivalPlatform) {
        this.arrivalPlatform = arrivalPlatform;
    }

    private TrainStation arrivalStation;

    /**
     * The station where the train trip ends.
     *
     * @return {@link TrainStation}
     */
    @Override
    public TrainStation getArrivalStation() {
        return arrivalStation;
    }

    /**
     * The station where the train trip ends.
     *
     * @param arrivalStation TrainStation value to set.
     */
    @Override
    public void setArrivalStation(TrainStation arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    private Object arrivalTime;

    /**
     * The expected arrival time.
     *
     * @return {@link Time} or {@link DateTime}
     */
    @Override
    public <T> T getArrivalTime() {
        return (T) arrivalTime;
    }

    /**
     * The expected arrival time.
     *
     * @param arrivalTime Time value to set.
     */
    @Override
    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    /**
     * The expected arrival time.
     *
     * @param arrivalTime DateTime value to set.
     */
    @Override
    public void setArrivalTime(DateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    private Object offers;

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @return {@link Offer} or {@link Demand}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public <T> T getOffers() {
        return (T) offers;
    }

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @param offers Offer value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public void setOffers(Offer offers) {
        this.offers = offers;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @param offers Demand value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public void setOffers(Demand offers) {
        this.offers = offers;
    }

    private Object departureTime;

    /**
     * The expected departure time.
     *
     * @return {@link Time} or {@link DateTime}
     */
    @Override
    public <T> T getDepartureTime() {
        return (T) departureTime;
    }

    /**
     * The expected departure time.
     *
     * @param departureTime Time value to set.
     */
    @Override
    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }
    /**
     * The expected departure time.
     *
     * @param departureTime DateTime value to set.
     */
    @Override
    public void setDepartureTime(DateTime departureTime) {
        this.departureTime = departureTime;
    }

    private Object provider;

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    @Override
    public <T> T getProvider() {
        return (T) provider;
    }

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @param provider Organization value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    @Override
    public void setProvider(Organization provider) {
        this.provider = provider;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @param provider Person value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    @Override
    public void setProvider(Person provider) {
        this.provider = provider;
    }

    private Trip subTrip;

    /**
     * Identifies a [[Trip]] that is a subTrip of this Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     *
     * @return {@link Trip}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    @Override
    public Trip getSubTrip() {
        return subTrip;
    }

    /**
     * Identifies a [[Trip]] that is a subTrip of this Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     *
     * @param subTrip Trip value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    @Override
    public void setSubTrip(Trip subTrip) {
        this.subTrip = subTrip;
    }

    private Object itinerary;

    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     *
     * @return {@link ItemList} or {@link Place}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    @Override
    public <T> T getItinerary() {
        return (T) itinerary;
    }

    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     *
     * @param itinerary ItemList value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    @Override
    public void setItinerary(ItemList itinerary) {
        this.itinerary = itinerary;
    }
    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     *
     * @param itinerary Place value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    @Override
    public void setItinerary(Place itinerary) {
        this.itinerary = itinerary;
    }

    private Trip partOfTrip;

    /**
     * Identifies that this [[Trip]] is a subTrip of another Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     *
     * @return {@link Trip}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    @Override
    public Trip getPartOfTrip() {
        return partOfTrip;
    }

    /**
     * Identifies that this [[Trip]] is a subTrip of another Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     *
     * @param partOfTrip Trip value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    @Override
    public void setPartOfTrip(Trip partOfTrip) {
        this.partOfTrip = partOfTrip;
    }

    private Object mainEntityOfPage;

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link CreativeWork} or {@link URL}
     */
    @Override
    public <T> T getMainEntityOfPage() {
        return (T) mainEntityOfPage;
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage CreativeWork value to set.
     */
    @Override
    public void setMainEntityOfPage(CreativeWork mainEntityOfPage) {
        this.mainEntityOfPage = mainEntityOfPage;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage URL value to set.
     */
    @Override
    public void setMainEntityOfPage(URL mainEntityOfPage) {
        this.mainEntityOfPage = mainEntityOfPage;
    }

    private Text alternateName;

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAlternateName() {
        return alternateName;
    }

    /**
     * An alias for the item.
     *
     * @param alternateName Text value to set.
     */
    @Override
    public void setAlternateName(Text alternateName) {
        this.alternateName = alternateName;
    }

    private Text name;

    /**
     * The name of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getName() {
        return name;
    }

    /**
     * The name of the item.
     *
     * @param name Text value to set.
     */
    @Override
    public void setName(Text name) {
        this.name = name;
    }

    private Action potentialAction;

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public Action getPotentialAction() {
        return potentialAction;
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @param potentialAction Action value to set.
     */
    @Override
    public void setPotentialAction(Action potentialAction) {
        this.potentialAction = potentialAction;
    }

    private Object image;

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> T getImage() {
        return (T) image;
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image URL value to set.
     */
    @Override
    public void setImage(URL image) {
        this.image = image;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image ImageObject value to set.
     */
    @Override
    public void setImage(ImageObject image) {
        this.image = image;
    }

    private URL url;

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public URL getUrl() {
        return url;
    }

    /**
     * URL of the item.
     *
     * @param url URL value to set.
     */
    @Override
    public void setUrl(URL url) {
        this.url = url;
    }

    private Text description;

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDescription() {
        return description;
    }

    /**
     * A description of the item.
     *
     * @param description Text value to set.
     */
    @Override
    public void setDescription(Text description) {
        this.description = description;
    }

    private Object subjectOf;

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> T getSubjectOf() {
        return (T) subjectOf;
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf Event value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(Event subjectOf) {
        this.subjectOf = subjectOf;
    }
    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf CreativeWork value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(CreativeWork subjectOf) {
        this.subjectOf = subjectOf;
    }

    private URL additionalType;

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     */
    @Override
    public URL getAdditionalType() {
        return additionalType;
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @param additionalType URL value to set.
     */
    @Override
    public void setAdditionalType(URL additionalType) {
        this.additionalType = additionalType;
    }

    private Text disambiguatingDescription;

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDisambiguatingDescription() {
        return disambiguatingDescription;
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @param disambiguatingDescription Text value to set.
     */
    @Override
    public void setDisambiguatingDescription(Text disambiguatingDescription) {
        this.disambiguatingDescription = disambiguatingDescription;
    }

    private URL sameAs;

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public URL getSameAs() {
        return sameAs;
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @param sameAs URL value to set.
     */
    @Override
    public void setSameAs(URL sameAs) {
        this.sameAs = sameAs;
    }

    private Object identifier;

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link URL} or {@link Text} or {@link PropertyValue}
     */
    @Override
    public <T> T getIdentifier() {
        return (T) identifier;
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier URL value to set.
     */
    @Override
    public void setIdentifier(URL identifier) {
        this.identifier = identifier;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier Text value to set.
     */
    @Override
    public void setIdentifier(Text identifier) {
        this.identifier = identifier;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier PropertyValue value to set.
     */
    @Override
    public void setIdentifier(PropertyValue identifier) {
        this.identifier = identifier;
    }
}
