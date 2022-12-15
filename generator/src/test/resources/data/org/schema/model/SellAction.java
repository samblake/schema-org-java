/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.WarrantyPromise;
import org.schema.model.Person;
import org.schema.model.Organization;

/**
 * The act of taking money from a buyer in exchange for goods or services rendered. An agent sells an object, product, or service to a buyer for a price. Reciprocal of BuyAction.
 *
 * @see <a href="https://schema.org/SellAction">https://schema.org/SellAction</a>
 */
public interface SellAction extends TradeAction {

    /**
     * The warranty promise(s) included in the offer.
     *
     * @return {@link WarrantyPromise}
     */
    WarrantyPromise getWarrantyPromise();

    /**
     * The warranty promise(s) included in the offer.
     *
     * @param warrantyPromise WarrantyPromise value to set.
     */
    void setWarrantyPromise(WarrantyPromise warrantyPromise);

    /**
     * A sub property of participant. The participant/person/organization that bought the object.
     *
     * @return {@link Person} or {@link Organization}
     */
    <T> T getBuyer();

    /**
     * A sub property of participant. The participant/person/organization that bought the object.
     *
     * @param buyer Person value to set.
     */
    void setBuyer(Person buyer);
    /**
     * A sub property of participant. The participant/person/organization that bought the object.
     *
     * @param buyer Organization value to set.
     */
    void setBuyer(Organization buyer);
}
