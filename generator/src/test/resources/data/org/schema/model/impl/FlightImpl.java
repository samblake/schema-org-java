/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.Distance;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.DateTime;
import org.schema.model.Vehicle;
import org.schema.model.Organization;
import org.schema.model.Person;
import org.schema.model.Airport;
import org.schema.model.Duration;
import org.schema.model.BoardingPolicyType;
import org.schema.model.datatype.Time;
import org.schema.model.Offer;
import org.schema.model.Demand;
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
import org.schema.model.Flight;

/**
 * An airline flight.
 *
 * @see <a href="https://schema.org/Flight">https://schema.org/Flight</a>
 */
@JsonLdTypeName("Flight")
public class FlightImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements Flight {

    private Object fFlightDistance;

    /**
     * The distance of the flight.
     *
     * @return {@link Distance} or {@link Text}
     */
    @Override
    public <T> T getFlightDistance() {
        return (T) fFlightDistance;
    }

    /**
     * The distance of the flight.
     *
     * @param fFlightDistance Distance value to set.
     */
    @Override
    public void setFlightDistance(Distance fFlightDistance) {
        this.fFlightDistance = fFlightDistance;
    }
    /**
     * The distance of the flight.
     *
     * @param fFlightDistance Text value to set.
     */
    @Override
    public void setFlightDistance(Text fFlightDistance) {
        this.fFlightDistance = fFlightDistance;
    }
    /**
     * The distance of the flight.
     *
     * @param fFlightDistance java.lang.String value to set.
     */
    @Override
    public void setFlightDistance(java.lang.String fFlightDistance) {
        this.fFlightDistance = Text.of(fFlightDistance);
    }

    private DateTime fWebCheckinTime;

    /**
     * The time when a passenger can check into the flight online.
     *
     * @return {@link DateTime}
     */
    @Override
    public DateTime getWebCheckinTime() {
        return fWebCheckinTime;
    }

    /**
     * The time when a passenger can check into the flight online.
     *
     * @param fWebCheckinTime DateTime value to set.
     */
    @Override
    public void setWebCheckinTime(DateTime fWebCheckinTime) {
        this.fWebCheckinTime = fWebCheckinTime;
    }
    /**
     * The time when a passenger can check into the flight online.
     *
     * @param fWebCheckinTime java.time.LocalDateTime value to set.
     */
    @Override
    public void setWebCheckinTime(java.time.LocalDateTime fWebCheckinTime) {
        this.fWebCheckinTime = DateTime.of(fWebCheckinTime);
    }

    private Object fAircraft;

    /**
     * The kind of aircraft (e.g., "Boeing 747").
     *
     * @return {@link Vehicle} or {@link Text}
     */
    @Override
    public <T> T getAircraft() {
        return (T) fAircraft;
    }

    /**
     * The kind of aircraft (e.g., "Boeing 747").
     *
     * @param fAircraft Vehicle value to set.
     */
    @Override
    public void setAircraft(Vehicle fAircraft) {
        this.fAircraft = fAircraft;
    }
    /**
     * The kind of aircraft (e.g., "Boeing 747").
     *
     * @param fAircraft Text value to set.
     */
    @Override
    public void setAircraft(Text fAircraft) {
        this.fAircraft = fAircraft;
    }
    /**
     * The kind of aircraft (e.g., "Boeing 747").
     *
     * @param fAircraft java.lang.String value to set.
     */
    @Override
    public void setAircraft(java.lang.String fAircraft) {
        this.fAircraft = Text.of(fAircraft);
    }

    private Object fSeller;

    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     *
     * @return {@link Organization} or {@link Person}
     */
    @Override
    public <T> T getSeller() {
        return (T) fSeller;
    }

    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     *
     * @param fSeller Organization value to set.
     */
    @Override
    public void setSeller(Organization fSeller) {
        this.fSeller = fSeller;
    }
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     *
     * @param fSeller Person value to set.
     */
    @Override
    public void setSeller(Person fSeller) {
        this.fSeller = fSeller;
    }

    private Airport fArrivalAirport;

    /**
     * The airport where the flight terminates.
     *
     * @return {@link Airport}
     */
    @Override
    public Airport getArrivalAirport() {
        return fArrivalAirport;
    }

    /**
     * The airport where the flight terminates.
     *
     * @param fArrivalAirport Airport value to set.
     */
    @Override
    public void setArrivalAirport(Airport fArrivalAirport) {
        this.fArrivalAirport = fArrivalAirport;
    }

    private Text fArrivalTerminal;

    /**
     * Identifier of the flight's arrival terminal.
     *
     * @return {@link Text}
     */
    @Override
    public Text getArrivalTerminal() {
        return fArrivalTerminal;
    }

    /**
     * Identifier of the flight's arrival terminal.
     *
     * @param fArrivalTerminal Text value to set.
     */
    @Override
    public void setArrivalTerminal(Text fArrivalTerminal) {
        this.fArrivalTerminal = fArrivalTerminal;
    }
    /**
     * Identifier of the flight's arrival terminal.
     *
     * @param fArrivalTerminal java.lang.String value to set.
     */
    @Override
    public void setArrivalTerminal(java.lang.String fArrivalTerminal) {
        this.fArrivalTerminal = Text.of(fArrivalTerminal);
    }

    private Airport fDepartureAirport;

    /**
     * The airport where the flight originates.
     *
     * @return {@link Airport}
     */
    @Override
    public Airport getDepartureAirport() {
        return fDepartureAirport;
    }

    /**
     * The airport where the flight originates.
     *
     * @param fDepartureAirport Airport value to set.
     */
    @Override
    public void setDepartureAirport(Airport fDepartureAirport) {
        this.fDepartureAirport = fDepartureAirport;
    }

    private Text fArrivalGate;

    /**
     * Identifier of the flight's arrival gate.
     *
     * @return {@link Text}
     */
    @Override
    public Text getArrivalGate() {
        return fArrivalGate;
    }

    /**
     * Identifier of the flight's arrival gate.
     *
     * @param fArrivalGate Text value to set.
     */
    @Override
    public void setArrivalGate(Text fArrivalGate) {
        this.fArrivalGate = fArrivalGate;
    }
    /**
     * Identifier of the flight's arrival gate.
     *
     * @param fArrivalGate java.lang.String value to set.
     */
    @Override
    public void setArrivalGate(java.lang.String fArrivalGate) {
        this.fArrivalGate = Text.of(fArrivalGate);
    }

    private Text fDepartureTerminal;

    /**
     * Identifier of the flight's departure terminal.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDepartureTerminal() {
        return fDepartureTerminal;
    }

    /**
     * Identifier of the flight's departure terminal.
     *
     * @param fDepartureTerminal Text value to set.
     */
    @Override
    public void setDepartureTerminal(Text fDepartureTerminal) {
        this.fDepartureTerminal = fDepartureTerminal;
    }
    /**
     * Identifier of the flight's departure terminal.
     *
     * @param fDepartureTerminal java.lang.String value to set.
     */
    @Override
    public void setDepartureTerminal(java.lang.String fDepartureTerminal) {
        this.fDepartureTerminal = Text.of(fDepartureTerminal);
    }

    private Organization fCarrier;

    /**
     * 'carrier' is an out-dated term indicating the 'provider' for parcel delivery and flights.
     *
     * @return {@link Organization}
     */
    @Override
    public Organization getCarrier() {
        return fCarrier;
    }

    /**
     * 'carrier' is an out-dated term indicating the 'provider' for parcel delivery and flights.
     *
     * @param fCarrier Organization value to set.
     */
    @Override
    public void setCarrier(Organization fCarrier) {
        this.fCarrier = fCarrier;
    }

    private Object fEstimatedFlightDuration;

    /**
     * The estimated time the flight will take.
     *
     * @return {@link Text} or {@link Duration}
     */
    @Override
    public <T> T getEstimatedFlightDuration() {
        return (T) fEstimatedFlightDuration;
    }

    /**
     * The estimated time the flight will take.
     *
     * @param fEstimatedFlightDuration Text value to set.
     */
    @Override
    public void setEstimatedFlightDuration(Text fEstimatedFlightDuration) {
        this.fEstimatedFlightDuration = fEstimatedFlightDuration;
    }
    /**
     * The estimated time the flight will take.
     *
     * @param fEstimatedFlightDuration java.lang.String value to set.
     */
    @Override
    public void setEstimatedFlightDuration(java.lang.String fEstimatedFlightDuration) {
        this.fEstimatedFlightDuration = Text.of(fEstimatedFlightDuration);
    }
    /**
     * The estimated time the flight will take.
     *
     * @param fEstimatedFlightDuration Duration value to set.
     */
    @Override
    public void setEstimatedFlightDuration(Duration fEstimatedFlightDuration) {
        this.fEstimatedFlightDuration = fEstimatedFlightDuration;
    }

    private Text fDepartureGate;

    /**
     * Identifier of the flight's departure gate.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDepartureGate() {
        return fDepartureGate;
    }

    /**
     * Identifier of the flight's departure gate.
     *
     * @param fDepartureGate Text value to set.
     */
    @Override
    public void setDepartureGate(Text fDepartureGate) {
        this.fDepartureGate = fDepartureGate;
    }
    /**
     * Identifier of the flight's departure gate.
     *
     * @param fDepartureGate java.lang.String value to set.
     */
    @Override
    public void setDepartureGate(java.lang.String fDepartureGate) {
        this.fDepartureGate = Text.of(fDepartureGate);
    }

    private Text fFlightNumber;

    /**
     * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
     *
     * @return {@link Text}
     */
    @Override
    public Text getFlightNumber() {
        return fFlightNumber;
    }

    /**
     * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
     *
     * @param fFlightNumber Text value to set.
     */
    @Override
    public void setFlightNumber(Text fFlightNumber) {
        this.fFlightNumber = fFlightNumber;
    }
    /**
     * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
     *
     * @param fFlightNumber java.lang.String value to set.
     */
    @Override
    public void setFlightNumber(java.lang.String fFlightNumber) {
        this.fFlightNumber = Text.of(fFlightNumber);
    }

    private Text fMealService;

    /**
     * Description of the meals that will be provided or available for purchase.
     *
     * @return {@link Text}
     */
    @Override
    public Text getMealService() {
        return fMealService;
    }

    /**
     * Description of the meals that will be provided or available for purchase.
     *
     * @param fMealService Text value to set.
     */
    @Override
    public void setMealService(Text fMealService) {
        this.fMealService = fMealService;
    }
    /**
     * Description of the meals that will be provided or available for purchase.
     *
     * @param fMealService java.lang.String value to set.
     */
    @Override
    public void setMealService(java.lang.String fMealService) {
        this.fMealService = Text.of(fMealService);
    }

    private BoardingPolicyType fBoardingPolicy;

    /**
     * The type of boarding policy used by the airline (e.g. zone-based or group-based).
     *
     * @return {@link BoardingPolicyType}
     */
    @Override
    public BoardingPolicyType getBoardingPolicy() {
        return fBoardingPolicy;
    }

    /**
     * The type of boarding policy used by the airline (e.g. zone-based or group-based).
     *
     * @param fBoardingPolicy BoardingPolicyType value to set.
     */
    @Override
    public void setBoardingPolicy(BoardingPolicyType fBoardingPolicy) {
        this.fBoardingPolicy = fBoardingPolicy;
    }

    private Object fArrivalTime;

    /**
     * The expected arrival time.
     *
     * @return {@link Time} or {@link DateTime}
     */
    @Override
    public <T> T getArrivalTime() {
        return (T) fArrivalTime;
    }

    /**
     * The expected arrival time.
     *
     * @param fArrivalTime Time value to set.
     */
    @Override
    public void setArrivalTime(Time fArrivalTime) {
        this.fArrivalTime = fArrivalTime;
    }
    /**
     * The expected arrival time.
     *
     * @param fArrivalTime java.time.LocalTime value to set.
     */
    @Override
    public void setArrivalTime(java.time.LocalTime fArrivalTime) {
        this.fArrivalTime = Time.of(fArrivalTime);
    }
    /**
     * The expected arrival time.
     *
     * @param fArrivalTime DateTime value to set.
     */
    @Override
    public void setArrivalTime(DateTime fArrivalTime) {
        this.fArrivalTime = fArrivalTime;
    }
    /**
     * The expected arrival time.
     *
     * @param fArrivalTime java.time.LocalDateTime value to set.
     */
    @Override
    public void setArrivalTime(java.time.LocalDateTime fArrivalTime) {
        this.fArrivalTime = DateTime.of(fArrivalTime);
    }

    private Object fOffers;

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @return {@link Offer} or {@link Demand}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public <T> T getOffers() {
        return (T) fOffers;
    }

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @param fOffers Offer value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public void setOffers(Offer fOffers) {
        this.fOffers = fOffers;
    }
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @param fOffers Demand value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    @Override
    public void setOffers(Demand fOffers) {
        this.fOffers = fOffers;
    }

    private Object fDepartureTime;

    /**
     * The expected departure time.
     *
     * @return {@link Time} or {@link DateTime}
     */
    @Override
    public <T> T getDepartureTime() {
        return (T) fDepartureTime;
    }

    /**
     * The expected departure time.
     *
     * @param fDepartureTime Time value to set.
     */
    @Override
    public void setDepartureTime(Time fDepartureTime) {
        this.fDepartureTime = fDepartureTime;
    }
    /**
     * The expected departure time.
     *
     * @param fDepartureTime java.time.LocalTime value to set.
     */
    @Override
    public void setDepartureTime(java.time.LocalTime fDepartureTime) {
        this.fDepartureTime = Time.of(fDepartureTime);
    }
    /**
     * The expected departure time.
     *
     * @param fDepartureTime DateTime value to set.
     */
    @Override
    public void setDepartureTime(DateTime fDepartureTime) {
        this.fDepartureTime = fDepartureTime;
    }
    /**
     * The expected departure time.
     *
     * @param fDepartureTime java.time.LocalDateTime value to set.
     */
    @Override
    public void setDepartureTime(java.time.LocalDateTime fDepartureTime) {
        this.fDepartureTime = DateTime.of(fDepartureTime);
    }

    private Object fProvider;

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
        return (T) fProvider;
    }

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @param fProvider Organization value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    @Override
    public void setProvider(Organization fProvider) {
        this.fProvider = fProvider;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @param fProvider Person value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    @Override
    public void setProvider(Person fProvider) {
        this.fProvider = fProvider;
    }

    private Trip fSubTrip;

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
        return fSubTrip;
    }

    /**
     * Identifies a [[Trip]] that is a subTrip of this Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     *
     * @param fSubTrip Trip value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    @Override
    public void setSubTrip(Trip fSubTrip) {
        this.fSubTrip = fSubTrip;
    }

    private Object fItinerary;

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
        return (T) fItinerary;
    }

    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     *
     * @param fItinerary ItemList value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    @Override
    public void setItinerary(ItemList fItinerary) {
        this.fItinerary = fItinerary;
    }
    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     *
     * @param fItinerary Place value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    @Override
    public void setItinerary(Place fItinerary) {
        this.fItinerary = fItinerary;
    }

    private Trip fPartOfTrip;

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
        return fPartOfTrip;
    }

    /**
     * Identifies that this [[Trip]] is a subTrip of another Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     *
     * @param fPartOfTrip Trip value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1810">https://github.com/schemaorg/schemaorg/issues/1810</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    @Override
    public void setPartOfTrip(Trip fPartOfTrip) {
        this.fPartOfTrip = fPartOfTrip;
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
