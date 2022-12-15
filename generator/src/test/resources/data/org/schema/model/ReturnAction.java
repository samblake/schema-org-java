/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.Person;
import org.schema.model.Audience;
import org.schema.model.ContactPoint;
import org.schema.model.Organization;

/**
 * The act of returning to the origin that which was previously received (concrete objects) or taken (ownership).
 *
 * @see <a href="https://schema.org/ReturnAction">https://schema.org/ReturnAction</a>
 */
public interface ReturnAction extends TransferAction {

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     *
     * @return {@link Person} or {@link Audience} or {@link ContactPoint} or {@link Organization}
     */
    <T> T getRecipient();

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     *
     * @param recipient Person value to set.
     */
    void setRecipient(Person recipient);
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     *
     * @param recipient Audience value to set.
     */
    void setRecipient(Audience recipient);
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     *
     * @param recipient ContactPoint value to set.
     */
    void setRecipient(ContactPoint recipient);
    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     *
     * @param recipient Organization value to set.
     */
    void setRecipient(Organization recipient);
}
