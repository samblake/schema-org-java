/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import com.weedow.schemaorg.commons.model.JsonLdFieldTypes;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.Action;
import org.schema.model.CreativeWork;
import org.schema.model.Demand;
import org.schema.model.Event;
import org.schema.model.ImageObject;
import org.schema.model.ItemList;
import org.schema.model.Offer;
import org.schema.model.Organization;
import org.schema.model.Person;
import org.schema.model.Place;
import org.schema.model.PropertyValue;
import org.schema.model.Trip;
import org.schema.model.datatype.DateTime;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.Time;
import org.schema.model.datatype.URL;

import java.util.List;

/**
 * A trip or journey. An itinerary of visits to one or more places.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
 * @see <a href="https://schema.org/Trip">https://schema.org/Trip</a>
 */
@JsonLdTypeName("Trip")
public class TripImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements Trip {

    @JsonLdFieldTypes({ Time.class, DateTime.class })
    private List<Object> departureTime;

    /**
     * The expected departure time.
     *
     * @return {@link Time} or {@link DateTime}
     */
    @Override
    public <T> List<T> getDepartureTimeList() {
        return (List<T>) departureTime;
    }

    /**
     * The expected departure time.
     *
     * @return {@link Time} or {@link DateTime}
     */
    @Override
    public <T> T getDepartureTime() {
        return (T) getFirst(departureTime);
    }

    /**
     * The expected departure time.
     *
     * @param departureTime Time value to set.
     */
    @Override
    public void addDepartureTime(Time departureTime) {
        this.departureTime = add(this.departureTime, departureTime);
    }
    /**
     * The expected departure time.
     *
     * @param departureTime DateTime value to set.
     */
    @Override
    public void addDepartureTime(DateTime departureTime) {
        this.departureTime = add(this.departureTime, departureTime);
    }

    @JsonLdFieldTypes({ ItemList.class, Place.class })
    private List<Object> itinerary;

    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     *
     * @return {@link ItemList} or {@link Place}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     */
    @Override
    public <T> List<T> getItineraryList() {
        return (List<T>) itinerary;
    }

    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     *
     * @return {@link ItemList} or {@link Place}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     */
    @Override
    public <T> T getItinerary() {
        return (T) getFirst(itinerary);
    }

    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     *
     * @param itinerary ItemList value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     */
    @Override
    public void addItinerary(ItemList itinerary) {
        this.itinerary = add(this.itinerary, itinerary);
    }
    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     *
     * @param itinerary Place value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     */
    @Override
    public void addItinerary(Place itinerary) {
        this.itinerary = add(this.itinerary, itinerary);
    }

    @JsonLdFieldTypes({ Organization.class, Person.class })
    private List<Object> provider;

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public <T> List<T> getProviderList() {
        return (List<T>) provider;
    }

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public <T> T getProvider() {
        return (T) getFirst(provider);
    }

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @param provider Organization value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public void addProvider(Organization provider) {
        this.provider = add(this.provider, provider);
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @param provider Person value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public void addProvider(Person provider) {
        this.provider = add(this.provider, provider);
    }

    private List<Trip> partOfTrip;

    /**
     * Identifies that this [[Trip]] is a subTrip of another Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     *
     * @return {@link Trip}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    @Override
    public List<Trip> getPartOfTripList() {
        return partOfTrip;
    }

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
        return getFirst(partOfTrip);
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
    public void addPartOfTrip(Trip partOfTrip) {
        this.partOfTrip = add(this.partOfTrip, partOfTrip);
    }

    @JsonLdFieldTypes({ DateTime.class, Time.class })
    private List<Object> arrivalTime;

    /**
     * The expected arrival time.
     *
     * @return {@link DateTime} or {@link Time}
     */
    @Override
    public <T> List<T> getArrivalTimeList() {
        return (List<T>) arrivalTime;
    }

    /**
     * The expected arrival time.
     *
     * @return {@link DateTime} or {@link Time}
     */
    @Override
    public <T> T getArrivalTime() {
        return (T) getFirst(arrivalTime);
    }

    /**
     * The expected arrival time.
     *
     * @param arrivalTime DateTime value to set.
     */
    @Override
    public void addArrivalTime(DateTime arrivalTime) {
        this.arrivalTime = add(this.arrivalTime, arrivalTime);
    }
    /**
     * The expected arrival time.
     *
     * @param arrivalTime Time value to set.
     */
    @Override
    public void addArrivalTime(Time arrivalTime) {
        this.arrivalTime = add(this.arrivalTime, arrivalTime);
    }

    private List<Trip> subTrip;

    /**
     * Identifies a [[Trip]] that is a subTrip of this Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     *
     * @return {@link Trip}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    @Override
    public List<Trip> getSubTripList() {
        return subTrip;
    }

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
        return getFirst(subTrip);
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
    public void addSubTrip(Trip subTrip) {
        this.subTrip = add(this.subTrip, subTrip);
    }

    @JsonLdFieldTypes({ Demand.class, Offer.class })
    private List<Object> offers;

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @return {@link Demand} or {@link Offer}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public <T> List<T> getOffersList() {
        return (List<T>) offers;
    }

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @return {@link Demand} or {@link Offer}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public <T> T getOffers() {
        return (T) getFirst(offers);
    }

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @param offers Demand value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public void addOffers(Demand offers) {
        this.offers = add(this.offers, offers);
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @param offers Offer value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public void addOffers(Offer offers) {
        this.offers = add(this.offers, offers);
    }

    private List<Action> potentialAction;

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public List<Action> getPotentialActionList() {
        return potentialAction;
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public Action getPotentialAction() {
        return getFirst(potentialAction);
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @param potentialAction Action value to set.
     */
    @Override
    public void addPotentialAction(Action potentialAction) {
        this.potentialAction = add(this.potentialAction, potentialAction);
    }

    @JsonLdFieldTypes({ URL.class, CreativeWork.class })
    private List<Object> mainEntityOfPage;

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link URL} or {@link CreativeWork}
     */
    @Override
    public <T> List<T> getMainEntityOfPageList() {
        return (List<T>) mainEntityOfPage;
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link URL} or {@link CreativeWork}
     */
    @Override
    public <T> T getMainEntityOfPage() {
        return (T) getFirst(mainEntityOfPage);
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage URL value to set.
     */
    @Override
    public void addMainEntityOfPage(URL mainEntityOfPage) {
        this.mainEntityOfPage = add(this.mainEntityOfPage, mainEntityOfPage);
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @param mainEntityOfPage CreativeWork value to set.
     */
    @Override
    public void addMainEntityOfPage(CreativeWork mainEntityOfPage) {
        this.mainEntityOfPage = add(this.mainEntityOfPage, mainEntityOfPage);
    }

    @JsonLdFieldTypes({ Event.class, CreativeWork.class })
    private List<Object> subjectOf;

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> List<T> getSubjectOfList() {
        return (List<T>) subjectOf;
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> T getSubjectOf() {
        return (T) getFirst(subjectOf);
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf Event value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void addSubjectOf(Event subjectOf) {
        this.subjectOf = add(this.subjectOf, subjectOf);
    }
    /**
     * A CreativeWork or Event about this Thing.
     *
     * @param subjectOf CreativeWork value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void addSubjectOf(CreativeWork subjectOf) {
        this.subjectOf = add(this.subjectOf, subjectOf);
    }

    private List<URL> url;

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public List<URL> getUrlList() {
        return url;
    }

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public URL getUrl() {
        return getFirst(url);
    }

    /**
     * URL of the item.
     *
     * @param url URL value to set.
     */
    @Override
    public void addUrl(URL url) {
        this.url = add(this.url, url);
    }

    private List<Text> alternateName;

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getAlternateNameList() {
        return alternateName;
    }

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAlternateName() {
        return getFirst(alternateName);
    }

    /**
     * An alias for the item.
     *
     * @param alternateName Text value to set.
     */
    @Override
    public void addAlternateName(Text alternateName) {
        this.alternateName = add(this.alternateName, alternateName);
    }

    private List<URL> sameAs;

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public List<URL> getSameAsList() {
        return sameAs;
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public URL getSameAs() {
        return getFirst(sameAs);
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @param sameAs URL value to set.
     */
    @Override
    public void addSameAs(URL sameAs) {
        this.sameAs = add(this.sameAs, sameAs);
    }

    private List<Text> description;

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getDescriptionList() {
        return description;
    }

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDescription() {
        return getFirst(description);
    }

    /**
     * A description of the item.
     *
     * @param description Text value to set.
     */
    @Override
    public void addDescription(Text description) {
        this.description = add(this.description, description);
    }

    private List<Text> disambiguatingDescription;

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getDisambiguatingDescriptionList() {
        return disambiguatingDescription;
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDisambiguatingDescription() {
        return getFirst(disambiguatingDescription);
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @param disambiguatingDescription Text value to set.
     */
    @Override
    public void addDisambiguatingDescription(Text disambiguatingDescription) {
        this.disambiguatingDescription = add(this.disambiguatingDescription, disambiguatingDescription);
    }

    @JsonLdFieldTypes({ PropertyValue.class, URL.class, Text.class })
    private List<Object> identifier;

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link PropertyValue} or {@link URL} or {@link Text}
     */
    @Override
    public <T> List<T> getIdentifierList() {
        return (List<T>) identifier;
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link PropertyValue} or {@link URL} or {@link Text}
     */
    @Override
    public <T> T getIdentifier() {
        return (T) getFirst(identifier);
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier PropertyValue value to set.
     */
    @Override
    public void addIdentifier(PropertyValue identifier) {
        this.identifier = add(this.identifier, identifier);
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier URL value to set.
     */
    @Override
    public void addIdentifier(URL identifier) {
        this.identifier = add(this.identifier, identifier);
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @param identifier Text value to set.
     */
    @Override
    public void addIdentifier(Text identifier) {
        this.identifier = add(this.identifier, identifier);
    }

    @JsonLdFieldTypes({ URL.class, ImageObject.class })
    private List<Object> image;

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> List<T> getImageList() {
        return (List<T>) image;
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> T getImage() {
        return (T) getFirst(image);
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image URL value to set.
     */
    @Override
    public void addImage(URL image) {
        this.image = add(this.image, image);
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @param image ImageObject value to set.
     */
    @Override
    public void addImage(ImageObject image) {
        this.image = add(this.image, image);
    }

    private List<Text> name;

    /**
     * The name of the item.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getNameList() {
        return name;
    }

    /**
     * The name of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getName() {
        return getFirst(name);
    }

    /**
     * The name of the item.
     *
     * @param name Text value to set.
     */
    @Override
    public void addName(Text name) {
        this.name = add(this.name, name);
    }

    private List<URL> additionalType;

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     */
    @Override
    public List<URL> getAdditionalTypeList() {
        return additionalType;
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     */
    @Override
    public URL getAdditionalType() {
        return getFirst(additionalType);
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @param additionalType URL value to set.
     */
    @Override
    public void addAdditionalType(URL additionalType) {
        this.additionalType = add(this.additionalType, additionalType);
    }
}
