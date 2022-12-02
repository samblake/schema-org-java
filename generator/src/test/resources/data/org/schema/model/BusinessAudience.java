/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.QuantitativeValue;

/**
 * A set of characteristics belonging to businesses, e.g. who compose an item's target audience.
 *
 * @see <a href="https://schema.org/BusinessAudience">https://schema.org/BusinessAudience</a>
 */
public interface BusinessAudience extends Audience {

    /**
     * The size of the business in annual revenue.
     *
     * @return {@link QuantitativeValue}
     */
    QuantitativeValue getYearlyRevenue();

    /**
     * The size of the business in annual revenue.
     *
     * @param fYearlyRevenue QuantitativeValue value to set.
     */
    void setYearlyRevenue(QuantitativeValue fYearlyRevenue);

    /**
     * The number of employees in an organization e.g. business.
     *
     * @return {@link QuantitativeValue}
     */
    QuantitativeValue getNumberOfEmployees();

    /**
     * The number of employees in an organization e.g. business.
     *
     * @param fNumberOfEmployees QuantitativeValue value to set.
     */
    void setNumberOfEmployees(QuantitativeValue fNumberOfEmployees);

    /**
     * The age of the business.
     *
     * @return {@link QuantitativeValue}
     */
    QuantitativeValue getYearsInOperation();

    /**
     * The age of the business.
     *
     * @param fYearsInOperation QuantitativeValue value to set.
     */
    void setYearsInOperation(QuantitativeValue fYearsInOperation);
}
