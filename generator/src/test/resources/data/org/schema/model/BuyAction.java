/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.WarrantyPromise;
import org.schema.model.Organization;
import org.schema.model.Person;

/**
 * The act of giving money to a seller in exchange for goods or services rendered. An agent buys an object, product, or service from a seller for a price. Reciprocal of SellAction.
 *
 * @see <a href="https://schema.org/BuyAction">https://schema.org/BuyAction</a>
 */
public interface BuyAction extends TradeAction {

    /**
     * The warranty promise(s) included in the offer.
     *
     * @return {@link WarrantyPromise}
     */
    WarrantyPromise getWarrantyPromise();

    /**
     * The warranty promise(s) included in the offer.
     *
     * @param fWarrantyPromise WarrantyPromise value to set.
     */
    void setWarrantyPromise(WarrantyPromise fWarrantyPromise);

    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     *
     * @return {@link Organization} or {@link Person}
     */
    <T> T getSeller();

    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     *
     * @param fSeller Organization value to set.
     */
    void setSeller(Organization fSeller);
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     *
     * @param fSeller Person value to set.
     */
    void setSeller(Person fSeller);

    /**
     * 'vendor' is an earlier term for 'seller'.
     *
     * @return {@link Person} or {@link Organization}
     */
    <T> T getVendor();

    /**
     * 'vendor' is an earlier term for 'seller'.
     *
     * @param fVendor Person value to set.
     */
    void setVendor(Person fVendor);
    /**
     * 'vendor' is an earlier term for 'seller'.
     *
     * @param fVendor Organization value to set.
     */
    void setVendor(Organization fVendor);
}
