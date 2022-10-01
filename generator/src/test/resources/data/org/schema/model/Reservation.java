/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.DateTime;
import org.schema.model.PriceSpecification;
import org.schema.model.datatype.Number;
import org.schema.model.datatype.Text;
import org.schema.model.Ticket;
import org.schema.model.ReservationStatusType;
import org.schema.model.Organization;
import org.schema.model.Person;
import org.schema.model.ProgramMembership;
import org.schema.model.Thing;

/**
 * Describes a reservation for travel, dining or an event. Some reservations require tickets. <br/><br/>Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, restaurant reservations, flights, or rental cars, use [[Offer]].
 *
 * @see <a href="https://schema.org/Reservation">https://schema.org/Reservation</a>
 */
public interface Reservation extends Intangible {

    /**
     * The date and time the reservation was modified.
     *
     * @return {@link DateTime}
     */
    DateTime getModifiedTime();

    /**
     * The date and time the reservation was modified.
     *
     */
    void setModifiedTime(DateTime fModifiedTime);

    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @return {@link PriceSpecification} or {@link Number} or {@link Text}
     */
    <T> T getTotalPrice();

    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     */
    void setTotalPrice(Object fTotalPrice);

    /**
     * A ticket associated with the reservation.
     *
     * @return {@link Ticket}
     */
    Ticket getReservedTicket();

    /**
     * A ticket associated with the reservation.
     *
     */
    void setReservedTicket(Ticket fReservedTicket);

    /**
     * The current status of the reservation.
     *
     * @return {@link ReservationStatusType}
     */
    ReservationStatusType getReservationStatus();

    /**
     * The current status of the reservation.
     *
     */
    void setReservationStatus(ReservationStatusType fReservationStatus);

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    <T> T getProvider();

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    void setProvider(Object fProvider);

    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @return {@link Person} or {@link Organization}
     */
    <T> T getBroker();

    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     */
    void setBroker(Object fBroker);

    /**
     * The date and time the reservation was booked.
     *
     * @return {@link DateTime}
     */
    DateTime getBookingTime();

    /**
     * The date and time the reservation was booked.
     *
     */
    void setBookingTime(DateTime fBookingTime);

    /**
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     *
     * @return {@link ProgramMembership}
     */
    ProgramMembership getProgramMembershipUsed();

    /**
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     *
     */
    void setProgramMembershipUsed(ProgramMembership fProgramMembershipUsed);

    /**
     * 'bookingAgent' is an out-dated term indicating a 'broker' that serves as a booking agent.
     *
     * @return {@link Person} or {@link Organization}
     */
    <T> T getBookingAgent();

    /**
     * 'bookingAgent' is an out-dated term indicating a 'broker' that serves as a booking agent.
     *
     */
    void setBookingAgent(Object fBookingAgent);

    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR".
     *
     * @return {@link Text}
     */
    Text getPriceCurrency();

    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR".
     *
     */
    void setPriceCurrency(Text fPriceCurrency);

    /**
     * A unique identifier for the reservation.
     *
     * @return {@link Text}
     */
    Text getReservationId();

    /**
     * A unique identifier for the reservation.
     *
     */
    void setReservationId(Text fReservationId);

    /**
     * The person or organization the reservation or ticket is for.
     *
     * @return {@link Organization} or {@link Person}
     */
    <T> T getUnderName();

    /**
     * The person or organization the reservation or ticket is for.
     *
     */
    void setUnderName(Object fUnderName);

    /**
     * The thing -- flight, event, restaurant,etc. being reserved.
     *
     * @return {@link Thing}
     */
    Thing getReservationFor();

    /**
     * The thing -- flight, event, restaurant,etc. being reserved.
     *
     */
    void setReservationFor(Thing fReservationFor);
}
