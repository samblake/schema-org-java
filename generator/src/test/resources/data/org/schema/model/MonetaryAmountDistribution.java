/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;

/**
 * A statistical distribution of monetary amounts.
 *
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
 * @see <a href="https://schema.org/MonetaryAmountDistribution">https://schema.org/MonetaryAmountDistribution</a>
 */
public interface MonetaryAmountDistribution extends QuantitativeValueDistribution {

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
     * @param currency Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1253">https://github.com/schemaorg/schemaorg/issues/1253</a>
     */
    void setCurrency(Text currency);
}
