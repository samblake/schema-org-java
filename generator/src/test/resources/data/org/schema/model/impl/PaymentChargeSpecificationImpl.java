/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.PaymentMethod;
import org.schema.model.DeliveryMethod;
import org.schema.model.datatype.Number;
import org.schema.model.QuantitativeValue;
import org.schema.model.datatype.DateTime;
import org.schema.model.datatype.Date;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.Boolean;
import org.schema.model.PriceSpecification;
import org.schema.model.CreativeWork;
import org.schema.model.datatype.URL;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.Thing;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.StructuredValue;
import org.schema.model.PaymentChargeSpecification;

/**
 * The costs of settling the payment using a particular payment method.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass</a>
 * @see <a href="https://schema.org/PaymentChargeSpecification">https://schema.org/PaymentChargeSpecification</a>
 */
@JsonLdTypeName("PaymentChargeSpecification")
public class PaymentChargeSpecificationImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements PaymentChargeSpecification {

    private PaymentMethod fAppliesToPaymentMethod;

    /**
     * The payment method(s) to which the payment charge specification applies.
     *
     * @return {@link PaymentMethod}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public PaymentMethod getAppliesToPaymentMethod() {
        return fAppliesToPaymentMethod;
    }

    /**
     * The payment method(s) to which the payment charge specification applies.
     *
     * @param fAppliesToPaymentMethod PaymentMethod value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setAppliesToPaymentMethod(PaymentMethod fAppliesToPaymentMethod) {
        this.fAppliesToPaymentMethod = fAppliesToPaymentMethod;
    }

    private DeliveryMethod fAppliesToDeliveryMethod;

    /**
     * The delivery method(s) to which the delivery charge or payment charge specification applies.
     *
     * @return {@link DeliveryMethod}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public DeliveryMethod getAppliesToDeliveryMethod() {
        return fAppliesToDeliveryMethod;
    }

    /**
     * The delivery method(s) to which the delivery charge or payment charge specification applies.
     *
     * @param fAppliesToDeliveryMethod DeliveryMethod value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setAppliesToDeliveryMethod(DeliveryMethod fAppliesToDeliveryMethod) {
        this.fAppliesToDeliveryMethod = fAppliesToDeliveryMethod;
    }

    private Number fMinPrice;

    /**
     * The lowest price if the price is a range.
     *
     * @return {@link Number}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public Number getMinPrice() {
        return fMinPrice;
    }

    /**
     * The lowest price if the price is a range.
     *
     * @param fMinPrice Number value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setMinPrice(Number fMinPrice) {
        this.fMinPrice = fMinPrice;
    }
    /**
     * The lowest price if the price is a range.
     *
     * @param fMinPrice java.lang.Number value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setMinPrice(java.lang.Number fMinPrice) {
        this.fMinPrice = Number.of(fMinPrice);
    }

    private QuantitativeValue fEligibleQuantity;

    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     *
     * @return {@link QuantitativeValue}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public QuantitativeValue getEligibleQuantity() {
        return fEligibleQuantity;
    }

    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     *
     * @param fEligibleQuantity QuantitativeValue value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setEligibleQuantity(QuantitativeValue fEligibleQuantity) {
        this.fEligibleQuantity = fEligibleQuantity;
    }

    private Object fValidFrom;

    /**
     * The date when the item becomes valid.
     *
     * @return {@link DateTime} or {@link Date}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public <T> T getValidFrom() {
        return (T) fValidFrom;
    }

    /**
     * The date when the item becomes valid.
     *
     * @param fValidFrom DateTime value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setValidFrom(DateTime fValidFrom) {
        this.fValidFrom = fValidFrom;
    }
    /**
     * The date when the item becomes valid.
     *
     * @param fValidFrom java.time.LocalDateTime value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setValidFrom(java.time.LocalDateTime fValidFrom) {
        this.fValidFrom = DateTime.of(fValidFrom);
    }
    /**
     * The date when the item becomes valid.
     *
     * @param fValidFrom Date value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setValidFrom(Date fValidFrom) {
        this.fValidFrom = fValidFrom;
    }
    /**
     * The date when the item becomes valid.
     *
     * @param fValidFrom java.time.LocalDate value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setValidFrom(java.time.LocalDate fValidFrom) {
        this.fValidFrom = Date.of(fValidFrom);
    }

    private Number fMaxPrice;

    /**
     * The highest price if the price is a range.
     *
     * @return {@link Number}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public Number getMaxPrice() {
        return fMaxPrice;
    }

    /**
     * The highest price if the price is a range.
     *
     * @param fMaxPrice Number value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setMaxPrice(Number fMaxPrice) {
        this.fMaxPrice = fMaxPrice;
    }
    /**
     * The highest price if the price is a range.
     *
     * @param fMaxPrice java.lang.Number value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setMaxPrice(java.lang.Number fMaxPrice) {
        this.fMaxPrice = Number.of(fMaxPrice);
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

    private Boolean fValueAddedTaxIncluded;

    /**
     * Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.
     *
     * @return {@link Boolean}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public Boolean getValueAddedTaxIncluded() {
        return fValueAddedTaxIncluded;
    }

    /**
     * Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.
     *
     * @param fValueAddedTaxIncluded Boolean value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setValueAddedTaxIncluded(Boolean fValueAddedTaxIncluded) {
        this.fValueAddedTaxIncluded = fValueAddedTaxIncluded;
    }
    /**
     * Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.
     *
     * @param fValueAddedTaxIncluded java.lang.Boolean value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setValueAddedTaxIncluded(java.lang.Boolean fValueAddedTaxIncluded) {
        this.fValueAddedTaxIncluded = Boolean.of(fValueAddedTaxIncluded);
    }

    private PriceSpecification fEligibleTransactionVolume;

    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     *
     * @return {@link PriceSpecification}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public PriceSpecification getEligibleTransactionVolume() {
        return fEligibleTransactionVolume;
    }

    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     *
     * @param fEligibleTransactionVolume PriceSpecification value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setEligibleTransactionVolume(PriceSpecification fEligibleTransactionVolume) {
        this.fEligibleTransactionVolume = fEligibleTransactionVolume;
    }

    private Object fValidThrough;

    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     *
     * @return {@link DateTime} or {@link Date}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public <T> T getValidThrough() {
        return (T) fValidThrough;
    }

    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     *
     * @param fValidThrough DateTime value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setValidThrough(DateTime fValidThrough) {
        this.fValidThrough = fValidThrough;
    }
    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     *
     * @param fValidThrough java.time.LocalDateTime value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setValidThrough(java.time.LocalDateTime fValidThrough) {
        this.fValidThrough = DateTime.of(fValidThrough);
    }
    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     *
     * @param fValidThrough Date value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setValidThrough(Date fValidThrough) {
        this.fValidThrough = fValidThrough;
    }
    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     *
     * @param fValidThrough java.time.LocalDate value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    @Override
    public void setValidThrough(java.time.LocalDate fValidThrough) {
        this.fValidThrough = Date.of(fValidThrough);
    }

    private Object fPrice;

    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.<br/><br/>Usage guidelines:<br/><br/>* Use the [[priceCurrency]] property (with standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR") instead of including [ambiguous symbols](http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign) such as '$' in the value.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.<br/>* Note that both [RDFa](http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute) and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values alongside more human-friendly formatting.<br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
     *       
     *
     * @return {@link Number} or {@link Text}
     */
    @Override
    public <T> T getPrice() {
        return (T) fPrice;
    }

    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.<br/><br/>Usage guidelines:<br/><br/>* Use the [[priceCurrency]] property (with standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR") instead of including [ambiguous symbols](http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign) such as '$' in the value.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.<br/>* Note that both [RDFa](http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute) and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values alongside more human-friendly formatting.<br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
     *       
     *
     * @param fPrice Number value to set.
     */
    @Override
    public void setPrice(Number fPrice) {
        this.fPrice = fPrice;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.<br/><br/>Usage guidelines:<br/><br/>* Use the [[priceCurrency]] property (with standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR") instead of including [ambiguous symbols](http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign) such as '$' in the value.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.<br/>* Note that both [RDFa](http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute) and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values alongside more human-friendly formatting.<br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
     *       
     *
     * @param fPrice java.lang.Number value to set.
     */
    @Override
    public void setPrice(java.lang.Number fPrice) {
        this.fPrice = Number.of(fPrice);
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.<br/><br/>Usage guidelines:<br/><br/>* Use the [[priceCurrency]] property (with standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR") instead of including [ambiguous symbols](http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign) such as '$' in the value.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.<br/>* Note that both [RDFa](http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute) and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values alongside more human-friendly formatting.<br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
     *       
     *
     * @param fPrice Text value to set.
     */
    @Override
    public void setPrice(Text fPrice) {
        this.fPrice = fPrice;
    }
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.<br/><br/>Usage guidelines:<br/><br/>* Use the [[priceCurrency]] property (with standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR") instead of including [ambiguous symbols](http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign) such as '$' in the value.<br/>* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.<br/>* Note that both [RDFa](http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute) and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values alongside more human-friendly formatting.<br/>* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.
     *       
     *
     * @param fPrice java.lang.String value to set.
     */
    @Override
    public void setPrice(java.lang.String fPrice) {
        this.fPrice = Text.of(fPrice);
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
