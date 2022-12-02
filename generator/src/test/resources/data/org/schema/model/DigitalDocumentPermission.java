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
import org.schema.model.DigitalDocumentPermissionType;

/**
 * A permission for a particular person or group to access a particular file.
 *
 * @see <a href="https://schema.org/DigitalDocumentPermission">https://schema.org/DigitalDocumentPermission</a>
 */
public interface DigitalDocumentPermission extends Intangible {

    /**
     * The person, organization, contact point, or audience that has been granted this permission.
     *
     * @return {@link Person} or {@link Audience} or {@link ContactPoint} or {@link Organization}
     */
    <T> T getGrantee();

    /**
     * The person, organization, contact point, or audience that has been granted this permission.
     *
     * @param fGrantee Person value to set.
     */
    void setGrantee(Person fGrantee);
    /**
     * The person, organization, contact point, or audience that has been granted this permission.
     *
     * @param fGrantee Audience value to set.
     */
    void setGrantee(Audience fGrantee);
    /**
     * The person, organization, contact point, or audience that has been granted this permission.
     *
     * @param fGrantee ContactPoint value to set.
     */
    void setGrantee(ContactPoint fGrantee);
    /**
     * The person, organization, contact point, or audience that has been granted this permission.
     *
     * @param fGrantee Organization value to set.
     */
    void setGrantee(Organization fGrantee);

    /**
     * The type of permission granted the person, organization, or audience.
     *
     * @return {@link DigitalDocumentPermissionType}
     */
    DigitalDocumentPermissionType getPermissionType();

    /**
     * The type of permission granted the person, organization, or audience.
     *
     * @param fPermissionType DigitalDocumentPermissionType value to set.
     */
    void setPermissionType(DigitalDocumentPermissionType fPermissionType);
}
