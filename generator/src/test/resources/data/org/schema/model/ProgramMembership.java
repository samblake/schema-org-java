/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Number;
import org.schema.model.QuantitativeValue;
import org.schema.model.Organization;
import org.schema.model.Person;
import org.schema.model.datatype.Text;

/**
 * Used to describe membership in a loyalty programs (e.g. "StarAliance"), traveler clubs (e.g. "AAA"), purchase clubs ("Safeway Club"), etc.
 *
 * @see <a href="https://schema.org/ProgramMembership">https://schema.org/ProgramMembership</a>
 */
public interface ProgramMembership extends Intangible {

    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
     *
     * @return {@link Number} or {@link QuantitativeValue}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2085">https://github.com/schemaorg/schemaorg/issues/2085</a>
     */
    <T> T getMembershipPointsEarned();

    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
     *
     * @param fMembershipPointsEarned Number value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2085">https://github.com/schemaorg/schemaorg/issues/2085</a>
     */
    void setMembershipPointsEarned(Number fMembershipPointsEarned);
    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
     *
     * @param fMembershipPointsEarned java.lang.Number value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2085">https://github.com/schemaorg/schemaorg/issues/2085</a>
     */
    void setMembershipPointsEarned(java.lang.Number fMembershipPointsEarned);
    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (e.g. stars, miles, etc.)
     *
     * @param fMembershipPointsEarned QuantitativeValue value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2085">https://github.com/schemaorg/schemaorg/issues/2085</a>
     */
    void setMembershipPointsEarned(QuantitativeValue fMembershipPointsEarned);

    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     *
     * @return {@link Organization} or {@link Person}
     */
    <T> T getMember();

    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     *
     * @param fMember Organization value to set.
     */
    void setMember(Organization fMember);
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     *
     * @param fMember Person value to set.
     */
    void setMember(Person fMember);

    /**
     * A unique identifier for the membership.
     *
     * @return {@link Text}
     */
    Text getMembershipNumber();

    /**
     * A unique identifier for the membership.
     *
     * @param fMembershipNumber Text value to set.
     */
    void setMembershipNumber(Text fMembershipNumber);
    /**
     * A unique identifier for the membership.
     *
     * @param fMembershipNumber java.lang.String value to set.
     */
    void setMembershipNumber(java.lang.String fMembershipNumber);

    /**
     * The organization (airline, travelers' club, etc.) the membership is made with.
     *
     * @return {@link Organization}
     */
    Organization getHostingOrganization();

    /**
     * The organization (airline, travelers' club, etc.) the membership is made with.
     *
     * @param fHostingOrganization Organization value to set.
     */
    void setHostingOrganization(Organization fHostingOrganization);

    /**
     * The program providing the membership.
     *
     * @return {@link Text}
     */
    Text getProgramName();

    /**
     * The program providing the membership.
     *
     * @param fProgramName Text value to set.
     */
    void setProgramName(Text fProgramName);
    /**
     * The program providing the membership.
     *
     * @param fProgramName java.lang.String value to set.
     */
    void setProgramName(java.lang.String fProgramName);

    /**
     * A member of this organization.
     *
     * @return {@link Person} or {@link Organization}
     */
    <T> T getMembers();

    /**
     * A member of this organization.
     *
     * @param fMembers Person value to set.
     */
    void setMembers(Person fMembers);
    /**
     * A member of this organization.
     *
     * @param fMembers Organization value to set.
     */
    void setMembers(Organization fMembers);
}
