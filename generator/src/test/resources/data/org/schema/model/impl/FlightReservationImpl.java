/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.datatype.Text;
import org.schema.model.QualitativeValue;
import org.schema.model.Person;
import org.schema.model.Organization;
import org.schema.model.datatype.DateTime;
import org.schema.model.ProgramMembership;
import org.schema.model.datatype.Number;
import org.schema.model.PriceSpecification;
import org.schema.model.Ticket;
import org.schema.model.Thing;
import org.schema.model.ReservationStatusType;
import org.schema.model.Action;
import org.schema.model.datatype.URL;
import org.schema.model.CreativeWork;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.ImageObject;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import com.weedow.schemaorg.commons.model.JsonLdFieldTypes;
import java.util.List;
import org.schema.model.Intangible;
import org.schema.model.Reservation;
import org.schema.model.FlightReservation;

/**
 * A reservation for air travel.<br/><br/>Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use [[Offer]].
 *
 * @see <a href="https://schema.org/FlightReservation">https://schema.org/FlightReservation</a>
 */
@JsonLdTypeName("FlightReservation")
public class FlightReservationImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements FlightReservation {

    private List<Text> securityScreening;

    /**
     * The type of security screening the passenger is subject to.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getSecurityScreeningList() {
        return securityScreening;
    }

    /**
     * The type of security screening the passenger is subject to.
     *
     * @return {@link Text}
     */
    @Override
    public Text getSecurityScreening() {
        return getFirst(securityScreening);
    }

    /**
     * The type of security screening the passenger is subject to.
     *
     * @param securityScreening Text value to set.
     */
    @Override
    public void addSecurityScreening(Text securityScreening) {
        this.securityScreening = add(this.securityScreening, securityScreening);
    }

    private List<Text> passengerSequenceNumber;

    /**
     * The passenger's sequence number as assigned by the airline.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getPassengerSequenceNumberList() {
        return passengerSequenceNumber;
    }

    /**
     * The passenger's sequence number as assigned by the airline.
     *
     * @return {@link Text}
     */
    @Override
    public Text getPassengerSequenceNumber() {
        return getFirst(passengerSequenceNumber);
    }

    /**
     * The passenger's sequence number as assigned by the airline.
     *
     * @param passengerSequenceNumber Text value to set.
     */
    @Override
    public void addPassengerSequenceNumber(Text passengerSequenceNumber) {
        this.passengerSequenceNumber = add(this.passengerSequenceNumber, passengerSequenceNumber);
    }

    @JsonLdFieldTypes({ Text.class, QualitativeValue.class })
    private List<Object> passengerPriorityStatus;

    /**
     * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
     *
     * @return {@link Text} or {@link QualitativeValue}
     */
    @Override
    public <T> List<T> getPassengerPriorityStatusList() {
        return (List<T>) passengerPriorityStatus;
    }

    /**
     * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
     *
     * @return {@link Text} or {@link QualitativeValue}
     */
    @Override
    public <T> T getPassengerPriorityStatus() {
        return (T) getFirst(passengerPriorityStatus);
    }

    /**
     * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
     *
     * @param passengerPriorityStatus Text value to set.
     */
    @Override
    public void addPassengerPriorityStatus(Text passengerPriorityStatus) {
        this.passengerPriorityStatus = add(this.passengerPriorityStatus, passengerPriorityStatus);
    }
    /**
     * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
     *
     * @param passengerPriorityStatus QualitativeValue value to set.
     */
    @Override
    public void addPassengerPriorityStatus(QualitativeValue passengerPriorityStatus) {
        this.passengerPriorityStatus = add(this.passengerPriorityStatus, passengerPriorityStatus);
    }

    private List<Text> boardingGroup;

    /**
     * The airline-specific indicator of boarding order / preference.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getBoardingGroupList() {
        return boardingGroup;
    }

    /**
     * The airline-specific indicator of boarding order / preference.
     *
     * @return {@link Text}
     */
    @Override
    public Text getBoardingGroup() {
        return getFirst(boardingGroup);
    }

    /**
     * The airline-specific indicator of boarding order / preference.
     *
     * @param boardingGroup Text value to set.
     */
    @Override
    public void addBoardingGroup(Text boardingGroup) {
        this.boardingGroup = add(this.boardingGroup, boardingGroup);
    }

    @JsonLdFieldTypes({ Person.class, Organization.class })
    private List<Object> broker;

    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @return {@link Person} or {@link Organization}
     */
    @Override
    public <T> List<T> getBrokerList() {
        return (List<T>) broker;
    }

    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @return {@link Person} or {@link Organization}
     */
    @Override
    public <T> T getBroker() {
        return (T) getFirst(broker);
    }

    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @param broker Person value to set.
     */
    @Override
    public void addBroker(Person broker) {
        this.broker = add(this.broker, broker);
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @param broker Organization value to set.
     */
    @Override
    public void addBroker(Organization broker) {
        this.broker = add(this.broker, broker);
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

    private List<DateTime> modifiedTime;

    /**
     * The date and time the reservation was modified.
     *
     * @return {@link DateTime}
     */
    @Override
    public List<DateTime> getModifiedTimeList() {
        return modifiedTime;
    }

    /**
     * The date and time the reservation was modified.
     *
     * @return {@link DateTime}
     */
    @Override
    public DateTime getModifiedTime() {
        return getFirst(modifiedTime);
    }

    /**
     * The date and time the reservation was modified.
     *
     * @param modifiedTime DateTime value to set.
     */
    @Override
    public void addModifiedTime(DateTime modifiedTime) {
        this.modifiedTime = add(this.modifiedTime, modifiedTime);
    }

    private List<ProgramMembership> programMembershipUsed;

    /**
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     *
     * @return {@link ProgramMembership}
     */
    @Override
    public List<ProgramMembership> getProgramMembershipUsedList() {
        return programMembershipUsed;
    }

    /**
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     *
     * @return {@link ProgramMembership}
     */
    @Override
    public ProgramMembership getProgramMembershipUsed() {
        return getFirst(programMembershipUsed);
    }

    /**
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     *
     * @param programMembershipUsed ProgramMembership value to set.
     */
    @Override
    public void addProgramMembershipUsed(ProgramMembership programMembershipUsed) {
        this.programMembershipUsed = add(this.programMembershipUsed, programMembershipUsed);
    }

    @JsonLdFieldTypes({ Organization.class, Person.class })
    private List<Object> bookingAgent;

    /**
     * 'bookingAgent' is an out-dated term indicating a 'broker' that serves as a booking agent.
     *
     * @return {@link Organization} or {@link Person}
     */
    @Override
    public <T> List<T> getBookingAgentList() {
        return (List<T>) bookingAgent;
    }

    /**
     * 'bookingAgent' is an out-dated term indicating a 'broker' that serves as a booking agent.
     *
     * @return {@link Organization} or {@link Person}
     */
    @Override
    public <T> T getBookingAgent() {
        return (T) getFirst(bookingAgent);
    }

    /**
     * 'bookingAgent' is an out-dated term indicating a 'broker' that serves as a booking agent.
     *
     * @param bookingAgent Organization value to set.
     */
    @Override
    public void addBookingAgent(Organization bookingAgent) {
        this.bookingAgent = add(this.bookingAgent, bookingAgent);
    }
    /**
     * 'bookingAgent' is an out-dated term indicating a 'broker' that serves as a booking agent.
     *
     * @param bookingAgent Person value to set.
     */
    @Override
    public void addBookingAgent(Person bookingAgent) {
        this.bookingAgent = add(this.bookingAgent, bookingAgent);
    }

    @JsonLdFieldTypes({ Number.class, PriceSpecification.class, Text.class })
    private List<Object> totalPrice;

    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @return {@link Number} or {@link PriceSpecification} or {@link Text}
     */
    @Override
    public <T> List<T> getTotalPriceList() {
        return (List<T>) totalPrice;
    }

    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @return {@link Number} or {@link PriceSpecification} or {@link Text}
     */
    @Override
    public <T> T getTotalPrice() {
        return (T) getFirst(totalPrice);
    }

    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param totalPrice Number value to set.
     */
    @Override
    public void addTotalPrice(Number totalPrice) {
        this.totalPrice = add(this.totalPrice, totalPrice);
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param totalPrice PriceSpecification value to set.
     */
    @Override
    public void addTotalPrice(PriceSpecification totalPrice) {
        this.totalPrice = add(this.totalPrice, totalPrice);
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param totalPrice Text value to set.
     */
    @Override
    public void addTotalPrice(Text totalPrice) {
        this.totalPrice = add(this.totalPrice, totalPrice);
    }

    private List<Ticket> reservedTicket;

    /**
     * A ticket associated with the reservation.
     *
     * @return {@link Ticket}
     */
    @Override
    public List<Ticket> getReservedTicketList() {
        return reservedTicket;
    }

    /**
     * A ticket associated with the reservation.
     *
     * @return {@link Ticket}
     */
    @Override
    public Ticket getReservedTicket() {
        return getFirst(reservedTicket);
    }

    /**
     * A ticket associated with the reservation.
     *
     * @param reservedTicket Ticket value to set.
     */
    @Override
    public void addReservedTicket(Ticket reservedTicket) {
        this.reservedTicket = add(this.reservedTicket, reservedTicket);
    }

    private List<Text> reservationId;

    /**
     * A unique identifier for the reservation.
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getReservationIdList() {
        return reservationId;
    }

    /**
     * A unique identifier for the reservation.
     *
     * @return {@link Text}
     */
    @Override
    public Text getReservationId() {
        return getFirst(reservationId);
    }

    /**
     * A unique identifier for the reservation.
     *
     * @param reservationId Text value to set.
     */
    @Override
    public void addReservationId(Text reservationId) {
        this.reservationId = add(this.reservationId, reservationId);
    }

    private List<Thing> reservationFor;

    /**
     * The thing -- flight, event, restaurant, etc. being reserved.
     *
     * @return {@link Thing}
     */
    @Override
    public List<Thing> getReservationForList() {
        return reservationFor;
    }

    /**
     * The thing -- flight, event, restaurant, etc. being reserved.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getReservationFor() {
        return getFirst(reservationFor);
    }

    /**
     * The thing -- flight, event, restaurant, etc. being reserved.
     *
     * @param reservationFor Thing value to set.
     */
    @Override
    public void addReservationFor(Thing reservationFor) {
        this.reservationFor = add(this.reservationFor, reservationFor);
    }

    @JsonLdFieldTypes({ Organization.class, Person.class })
    private List<Object> underName;

    /**
     * The person or organization the reservation or ticket is for.
     *
     * @return {@link Organization} or {@link Person}
     */
    @Override
    public <T> List<T> getUnderNameList() {
        return (List<T>) underName;
    }

    /**
     * The person or organization the reservation or ticket is for.
     *
     * @return {@link Organization} or {@link Person}
     */
    @Override
    public <T> T getUnderName() {
        return (T) getFirst(underName);
    }

    /**
     * The person or organization the reservation or ticket is for.
     *
     * @param underName Organization value to set.
     */
    @Override
    public void addUnderName(Organization underName) {
        this.underName = add(this.underName, underName);
    }
    /**
     * The person or organization the reservation or ticket is for.
     *
     * @param underName Person value to set.
     */
    @Override
    public void addUnderName(Person underName) {
        this.underName = add(this.underName, underName);
    }

    private List<DateTime> bookingTime;

    /**
     * The date and time the reservation was booked.
     *
     * @return {@link DateTime}
     */
    @Override
    public List<DateTime> getBookingTimeList() {
        return bookingTime;
    }

    /**
     * The date and time the reservation was booked.
     *
     * @return {@link DateTime}
     */
    @Override
    public DateTime getBookingTime() {
        return getFirst(bookingTime);
    }

    /**
     * The date and time the reservation was booked.
     *
     * @param bookingTime DateTime value to set.
     */
    @Override
    public void addBookingTime(DateTime bookingTime) {
        this.bookingTime = add(this.bookingTime, bookingTime);
    }

    private List<ReservationStatusType> reservationStatus;

    /**
     * The current status of the reservation.
     *
     * @return {@link ReservationStatusType}
     */
    @Override
    public List<ReservationStatusType> getReservationStatusList() {
        return reservationStatus;
    }

    /**
     * The current status of the reservation.
     *
     * @return {@link ReservationStatusType}
     */
    @Override
    public ReservationStatusType getReservationStatus() {
        return getFirst(reservationStatus);
    }

    /**
     * The current status of the reservation.
     *
     * @param reservationStatus ReservationStatusType value to set.
     */
    @Override
    public void addReservationStatus(ReservationStatusType reservationStatus) {
        this.reservationStatus = add(this.reservationStatus, reservationStatus);
    }

    private List<Text> priceCurrency;

    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR".
     *
     * @return {@link Text}
     */
    @Override
    public List<Text> getPriceCurrencyList() {
        return priceCurrency;
    }

    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR".
     *
     * @return {@link Text}
     */
    @Override
    public Text getPriceCurrency() {
        return getFirst(priceCurrency);
    }

    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR".
     *
     * @param priceCurrency Text value to set.
     */
    @Override
    public void addPriceCurrency(Text priceCurrency) {
        this.priceCurrency = add(this.priceCurrency, priceCurrency);
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
     * @see <a href="https://schema.org/description">https://schema.org/description</a> <i>disambiguatingDescription</i> is a sub property of <i>description</i>
     */
    @Override
    public List<Text> getDisambiguatingDescriptionList() {
        return disambiguatingDescription;
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     * @see <a href="https://schema.org/description">https://schema.org/description</a> <i>disambiguatingDescription</i> is a sub property of <i>description</i>
     */
    @Override
    public Text getDisambiguatingDescription() {
        return getFirst(disambiguatingDescription);
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @param disambiguatingDescription Text value to set.
     * @see <a href="https://schema.org/description">https://schema.org/description</a> <i>disambiguatingDescription</i> is a sub property of <i>description</i>
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
     * @see <a href="https://schema.org/rdfs:label">https://schema.org/rdfs:label</a> <i>name</i> is a sub property of <i>rdfs:label</i>
     */
    @Override
    public List<Text> getNameList() {
        return name;
    }

    /**
     * The name of the item.
     *
     * @return {@link Text}
     * @see <a href="https://schema.org/rdfs:label">https://schema.org/rdfs:label</a> <i>name</i> is a sub property of <i>rdfs:label</i>
     */
    @Override
    public Text getName() {
        return getFirst(name);
    }

    /**
     * The name of the item.
     *
     * @param name Text value to set.
     * @see <a href="https://schema.org/rdfs:label">https://schema.org/rdfs:label</a> <i>name</i> is a sub property of <i>rdfs:label</i>
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
     * @see <a href="https://schema.org/rdf:type">https://schema.org/rdf:type</a> <i>additionalType</i> is a sub property of <i>rdf:type</i>
     */
    @Override
    public List<URL> getAdditionalTypeList() {
        return additionalType;
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     * @see <a href="https://schema.org/rdf:type">https://schema.org/rdf:type</a> <i>additionalType</i> is a sub property of <i>rdf:type</i>
     */
    @Override
    public URL getAdditionalType() {
        return getFirst(additionalType);
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @param additionalType URL value to set.
     * @see <a href="https://schema.org/rdf:type">https://schema.org/rdf:type</a> <i>additionalType</i> is a sub property of <i>rdf:type</i>
     */
    @Override
    public void addAdditionalType(URL additionalType) {
        this.additionalType = add(this.additionalType, additionalType);
    }
}
