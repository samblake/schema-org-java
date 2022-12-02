/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

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
import org.schema.model.CreativeWork;
import org.schema.model.datatype.URL;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.Reservation;
import org.schema.model.BoatReservation;

/**
 * A reservation for boat travel.
 * 
 * Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use [[Offer]].
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1755">https://github.com/schemaorg/schemaorg/issues/1755</a>
 * @see <a href="https://schema.org/BoatReservation">https://schema.org/BoatReservation</a>
 */
@JsonLdTypeName("BoatReservation")
public class BoatReservationImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements BoatReservation {

    private DateTime fModifiedTime;

    /**
     * The date and time the reservation was modified.
     *
     * @return {@link DateTime}
     */
    @Override
    public DateTime getModifiedTime() {
        return fModifiedTime;
    }

    /**
     * The date and time the reservation was modified.
     *
     * @param fModifiedTime DateTime value to set.
     */
    @Override
    public void setModifiedTime(DateTime fModifiedTime) {
        this.fModifiedTime = fModifiedTime;
    }
    /**
     * The date and time the reservation was modified.
     *
     * @param fModifiedTime java.time.LocalDateTime value to set.
     */
    @Override
    public void setModifiedTime(java.time.LocalDateTime fModifiedTime) {
        this.fModifiedTime = DateTime.of(fModifiedTime);
    }

    private Object fTotalPrice;

    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @return {@link PriceSpecification} or {@link Number} or {@link Text}
     */
    @Override
    public <T> T getTotalPrice() {
        return (T) fTotalPrice;
    }

    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fTotalPrice PriceSpecification value to set.
     */
    @Override
    public void setTotalPrice(PriceSpecification fTotalPrice) {
        this.fTotalPrice = fTotalPrice;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fTotalPrice Number value to set.
     */
    @Override
    public void setTotalPrice(Number fTotalPrice) {
        this.fTotalPrice = fTotalPrice;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fTotalPrice java.lang.Number value to set.
     */
    @Override
    public void setTotalPrice(java.lang.Number fTotalPrice) {
        this.fTotalPrice = Number.of(fTotalPrice);
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fTotalPrice Text value to set.
     */
    @Override
    public void setTotalPrice(Text fTotalPrice) {
        this.fTotalPrice = fTotalPrice;
    }
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fTotalPrice java.lang.String value to set.
     */
    @Override
    public void setTotalPrice(java.lang.String fTotalPrice) {
        this.fTotalPrice = Text.of(fTotalPrice);
    }

    private Ticket fReservedTicket;

    /**
     * A ticket associated with the reservation.
     *
     * @return {@link Ticket}
     */
    @Override
    public Ticket getReservedTicket() {
        return fReservedTicket;
    }

    /**
     * A ticket associated with the reservation.
     *
     * @param fReservedTicket Ticket value to set.
     */
    @Override
    public void setReservedTicket(Ticket fReservedTicket) {
        this.fReservedTicket = fReservedTicket;
    }

    private ReservationStatusType fReservationStatus;

    /**
     * The current status of the reservation.
     *
     * @return {@link ReservationStatusType}
     */
    @Override
    public ReservationStatusType getReservationStatus() {
        return fReservationStatus;
    }

    /**
     * The current status of the reservation.
     *
     * @param fReservationStatus ReservationStatusType value to set.
     */
    @Override
    public void setReservationStatus(ReservationStatusType fReservationStatus) {
        this.fReservationStatus = fReservationStatus;
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

    private Object fBroker;

    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @return {@link Person} or {@link Organization}
     */
    @Override
    public <T> T getBroker() {
        return (T) fBroker;
    }

    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @param fBroker Person value to set.
     */
    @Override
    public void setBroker(Person fBroker) {
        this.fBroker = fBroker;
    }
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     *
     * @param fBroker Organization value to set.
     */
    @Override
    public void setBroker(Organization fBroker) {
        this.fBroker = fBroker;
    }

    private DateTime fBookingTime;

    /**
     * The date and time the reservation was booked.
     *
     * @return {@link DateTime}
     */
    @Override
    public DateTime getBookingTime() {
        return fBookingTime;
    }

    /**
     * The date and time the reservation was booked.
     *
     * @param fBookingTime DateTime value to set.
     */
    @Override
    public void setBookingTime(DateTime fBookingTime) {
        this.fBookingTime = fBookingTime;
    }
    /**
     * The date and time the reservation was booked.
     *
     * @param fBookingTime java.time.LocalDateTime value to set.
     */
    @Override
    public void setBookingTime(java.time.LocalDateTime fBookingTime) {
        this.fBookingTime = DateTime.of(fBookingTime);
    }

    private ProgramMembership fProgramMembershipUsed;

    /**
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     *
     * @return {@link ProgramMembership}
     */
    @Override
    public ProgramMembership getProgramMembershipUsed() {
        return fProgramMembershipUsed;
    }

    /**
     * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation.
     *
     * @param fProgramMembershipUsed ProgramMembership value to set.
     */
    @Override
    public void setProgramMembershipUsed(ProgramMembership fProgramMembershipUsed) {
        this.fProgramMembershipUsed = fProgramMembershipUsed;
    }

    private Object fBookingAgent;

    /**
     * 'bookingAgent' is an out-dated term indicating a 'broker' that serves as a booking agent.
     *
     * @return {@link Person} or {@link Organization}
     */
    @Override
    public <T> T getBookingAgent() {
        return (T) fBookingAgent;
    }

    /**
     * 'bookingAgent' is an out-dated term indicating a 'broker' that serves as a booking agent.
     *
     * @param fBookingAgent Person value to set.
     */
    @Override
    public void setBookingAgent(Person fBookingAgent) {
        this.fBookingAgent = fBookingAgent;
    }
    /**
     * 'bookingAgent' is an out-dated term indicating a 'broker' that serves as a booking agent.
     *
     * @param fBookingAgent Organization value to set.
     */
    @Override
    public void setBookingAgent(Organization fBookingAgent) {
        this.fBookingAgent = fBookingAgent;
    }

    private Text fPriceCurrency;

    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR".
     *
     * @return {@link Text}
     */
    @Override
    public Text getPriceCurrency() {
        return fPriceCurrency;
    }

    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR".
     *
     * @param fPriceCurrency Text value to set.
     */
    @Override
    public void setPriceCurrency(Text fPriceCurrency) {
        this.fPriceCurrency = fPriceCurrency;
    }
    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR".
     *
     * @param fPriceCurrency java.lang.String value to set.
     */
    @Override
    public void setPriceCurrency(java.lang.String fPriceCurrency) {
        this.fPriceCurrency = Text.of(fPriceCurrency);
    }

    private Text fReservationId;

    /**
     * A unique identifier for the reservation.
     *
     * @return {@link Text}
     */
    @Override
    public Text getReservationId() {
        return fReservationId;
    }

    /**
     * A unique identifier for the reservation.
     *
     * @param fReservationId Text value to set.
     */
    @Override
    public void setReservationId(Text fReservationId) {
        this.fReservationId = fReservationId;
    }
    /**
     * A unique identifier for the reservation.
     *
     * @param fReservationId java.lang.String value to set.
     */
    @Override
    public void setReservationId(java.lang.String fReservationId) {
        this.fReservationId = Text.of(fReservationId);
    }

    private Object fUnderName;

    /**
     * The person or organization the reservation or ticket is for.
     *
     * @return {@link Organization} or {@link Person}
     */
    @Override
    public <T> T getUnderName() {
        return (T) fUnderName;
    }

    /**
     * The person or organization the reservation or ticket is for.
     *
     * @param fUnderName Organization value to set.
     */
    @Override
    public void setUnderName(Organization fUnderName) {
        this.fUnderName = fUnderName;
    }
    /**
     * The person or organization the reservation or ticket is for.
     *
     * @param fUnderName Person value to set.
     */
    @Override
    public void setUnderName(Person fUnderName) {
        this.fUnderName = fUnderName;
    }

    private Thing fReservationFor;

    /**
     * The thing -- flight, event, restaurant,etc. being reserved.
     *
     * @return {@link Thing}
     */
    @Override
    public Thing getReservationFor() {
        return fReservationFor;
    }

    /**
     * The thing -- flight, event, restaurant,etc. being reserved.
     *
     * @param fReservationFor Thing value to set.
     */
    @Override
    public void setReservationFor(Thing fReservationFor) {
        this.fReservationFor = fReservationFor;
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
