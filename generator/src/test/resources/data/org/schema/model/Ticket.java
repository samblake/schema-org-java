/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.URL;
import org.schema.model.datatype.Text;
import org.schema.model.Seat;
import org.schema.model.PriceSpecification;
import org.schema.model.datatype.Number;
import org.schema.model.Organization;
import org.schema.model.datatype.Date;
import org.schema.model.datatype.DateTime;
import org.schema.model.Person;

/**
 * Used to describe a ticket to an event, a flight, a bus ride, etc.
 *
 * @see <a href="https://schema.org/Ticket">https://schema.org/Ticket</a>
 */
public interface Ticket extends Intangible {

    /**
     * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
     *
     * @return {@link URL} or {@link Text}
     */
    <T> T getTicketToken();

    /**
     * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
     *
     * @param fTicketToken URL value to set.
     */
    void setTicketToken(URL fTicketToken);
    /**
     * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
     *
     * @param fTicketToken java.net.URL value to set.
     */
    void setTicketToken(java.net.URL fTicketToken);
    /**
     * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
     *
     * @param fTicketToken Text value to set.
     */
    void setTicketToken(Text fTicketToken);
    /**
     * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
     *
     * @param fTicketToken java.lang.String value to set.
     */
    void setTicketToken(java.lang.String fTicketToken);

    /**
     * The seat associated with the ticket.
     *
     * @return {@link Seat}
     */
    Seat getTicketedSeat();

    /**
     * The seat associated with the ticket.
     *
     * @param fTicketedSeat Seat value to set.
     */
    void setTicketedSeat(Seat fTicketedSeat);

    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @return {@link PriceSpecification} or {@link Number} or {@link Text}
     */
    <T> T getTotalPrice();

    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fTotalPrice PriceSpecification value to set.
     */
    void setTotalPrice(PriceSpecification fTotalPrice);
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fTotalPrice Number value to set.
     */
    void setTotalPrice(Number fTotalPrice);
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fTotalPrice java.lang.Number value to set.
     */
    void setTotalPrice(java.lang.Number fTotalPrice);
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fTotalPrice Text value to set.
     */
    void setTotalPrice(Text fTotalPrice);
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.<br/><br/>Usage guidelines:<br/><br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     *
     * @param fTotalPrice java.lang.String value to set.
     */
    void setTotalPrice(java.lang.String fTotalPrice);

    /**
     * The organization issuing the ticket or permit.
     *
     * @return {@link Organization}
     */
    Organization getIssuedBy();

    /**
     * The organization issuing the ticket or permit.
     *
     * @param fIssuedBy Organization value to set.
     */
    void setIssuedBy(Organization fIssuedBy);

    /**
     * The unique identifier for the ticket.
     *
     * @return {@link Text}
     */
    Text getTicketNumber();

    /**
     * The unique identifier for the ticket.
     *
     * @param fTicketNumber Text value to set.
     */
    void setTicketNumber(Text fTicketNumber);
    /**
     * The unique identifier for the ticket.
     *
     * @param fTicketNumber java.lang.String value to set.
     */
    void setTicketNumber(java.lang.String fTicketNumber);

    /**
     * The date the ticket was issued.
     *
     * @return {@link Date} or {@link DateTime}
     */
    <T> T getDateIssued();

    /**
     * The date the ticket was issued.
     *
     * @param fDateIssued Date value to set.
     */
    void setDateIssued(Date fDateIssued);
    /**
     * The date the ticket was issued.
     *
     * @param fDateIssued java.time.LocalDate value to set.
     */
    void setDateIssued(java.time.LocalDate fDateIssued);
    /**
     * The date the ticket was issued.
     *
     * @param fDateIssued DateTime value to set.
     */
    void setDateIssued(DateTime fDateIssued);
    /**
     * The date the ticket was issued.
     *
     * @param fDateIssued java.time.LocalDateTime value to set.
     */
    void setDateIssued(java.time.LocalDateTime fDateIssued);

    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR".
     *
     * @return {@link Text}
     */
    Text getPriceCurrency();

    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR".
     *
     * @param fPriceCurrency Text value to set.
     */
    void setPriceCurrency(Text fPriceCurrency);
    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR".
     *
     * @param fPriceCurrency java.lang.String value to set.
     */
    void setPriceCurrency(java.lang.String fPriceCurrency);

    /**
     * The person or organization the reservation or ticket is for.
     *
     * @return {@link Organization} or {@link Person}
     */
    <T> T getUnderName();

    /**
     * The person or organization the reservation or ticket is for.
     *
     * @param fUnderName Organization value to set.
     */
    void setUnderName(Organization fUnderName);
    /**
     * The person or organization the reservation or ticket is for.
     *
     * @param fUnderName Person value to set.
     */
    void setUnderName(Person fUnderName);
}
