/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.UnitPriceSpecification;
import org.schema.model.datatype.Number;
import org.schema.model.MonetaryAmount;
import org.schema.model.datatype.Text;

/**
 * A structured value representing exchange rate.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
 * @see <a href="https://schema.org/ExchangeRateSpecification">https://schema.org/ExchangeRateSpecification</a>
 */
public interface ExchangeRateSpecification extends StructuredValue {

    /**
     * The current price of a currency.
     *
     * @return {@link UnitPriceSpecification}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    UnitPriceSpecification getCurrentExchangeRate();

    /**
     * The current price of a currency.
     *
     * @param fCurrentExchangeRate UnitPriceSpecification value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void setCurrentExchangeRate(UnitPriceSpecification fCurrentExchangeRate);

    /**
     * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
     *
     * @return {@link Number} or {@link MonetaryAmount}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    <T> T getExchangeRateSpread();

    /**
     * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
     *
     * @param fExchangeRateSpread Number value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void setExchangeRateSpread(Number fExchangeRateSpread);
    /**
     * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
     *
     * @param fExchangeRateSpread java.lang.Number value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void setExchangeRateSpread(java.lang.Number fExchangeRateSpread);
    /**
     * The difference between the price at which a broker or other intermediary buys and sells foreign currency.
     *
     * @param fExchangeRateSpread MonetaryAmount value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void setExchangeRateSpread(MonetaryAmount fExchangeRateSpread);

    /**
     * The currency in which the monetary amount is expressed.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR".
     *
     * @return {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    Text getCurrency();

    /**
     * The currency in which the monetary amount is expressed.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR".
     *
     * @param fCurrency Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void setCurrency(Text fCurrency);
    /**
     * The currency in which the monetary amount is expressed.<br/><br/>Use standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217) e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies e.g. "BTC"; well known names for [Local Exchange Tradings Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types e.g. "Ithaca HOUR".
     *
     * @param fCurrency java.lang.String value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void setCurrency(java.lang.String fCurrency);
}
