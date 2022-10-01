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
 * The act of granting permission to an object.
 *
 * @see <a href="https://schema.org/AuthorizeAction">https://schema.org/AuthorizeAction</a>
 */
public interface AuthorizeAction extends AllocateAction {

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     *
     * @return {@link Person} or {@link Audience} or {@link ContactPoint} or {@link Organization}
     */
    <T> T getRecipient();

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     *
     */
    void setRecipient(Object fRecipient);
}
