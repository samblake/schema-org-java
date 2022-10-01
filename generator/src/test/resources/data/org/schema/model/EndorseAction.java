/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.Person;
import org.schema.model.Organization;

/**
 * An agent approves/certifies/likes/supports/sanction an object.
 *
 * @see <a href="https://schema.org/EndorseAction">https://schema.org/EndorseAction</a>
 */
public interface EndorseAction extends ReactAction {

    /**
     * A sub property of participant. The person/organization being supported.
     *
     * @return {@link Person} or {@link Organization}
     */
    <T> T getEndorsee();

    /**
     * A sub property of participant. The person/organization being supported.
     *
     */
    void setEndorsee(Object fEndorsee);
}
