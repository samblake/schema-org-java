/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.Organization;
import org.schema.model.Person;
import org.schema.model.datatype.DateTime;
import org.schema.model.datatype.Time;
import org.schema.model.ActionStatusType;
import org.schema.model.Thing;
import org.schema.model.PostalAddress;
import org.schema.model.datatype.Text;
import org.schema.model.Place;
import org.schema.model.VirtualLocation;
import org.schema.model.EntryPoint;

/**
 * An action performed by a direct agent and indirect participants upon a direct object. Optionally happens at a location with the help of an inanimate instrument. The execution of the action may produce a result. Specific action sub-type documentation specifies the exact expectation of each argument/role.<br/><br/>See also [blog post](http://blog.schema.org/2014/04/announcing-schemaorg-actions.html) and [Actions overview document](https://schema.org/docs/actions.html).
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_ActionCollabClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_ActionCollabClass</a>
 * @see <a href="https://schema.org/Action">https://schema.org/Action</a>
 */
public interface Action extends Thing {

    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     *
     * @return {@link Organization} or {@link Person}
     */
    <T> T getAgent();

    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     *
     * @param agent Organization value to set.
     */
    void setAgent(Organization agent);
    /**
     * The direct performer or driver of the action (animate or inanimate). e.g. *John* wrote a book.
     *
     * @param agent Person value to set.
     */
    void setAgent(Person agent);

    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @return {@link DateTime} or {@link Time}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    <T> T getStartTime();

    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @param startTime DateTime value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    void setStartTime(DateTime startTime);
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @param startTime Time value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    void setStartTime(Time startTime);

    /**
     * Indicates the current disposition of the Action.
     *
     * @return {@link ActionStatusType}
     */
    ActionStatusType getActionStatus();

    /**
     * Indicates the current disposition of the Action.
     *
     * @param actionStatus ActionStatusType value to set.
     */
    void setActionStatus(ActionStatusType actionStatus);

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    <T> T getProvider();

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @param provider Organization value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    void setProvider(Organization provider);
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @param provider Person value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    void setProvider(Person provider);

    /**
     * The result produced in the action. e.g. John wrote *a book*.
     *
     * @return {@link Thing}
     */
    Thing getResult();

    /**
     * The result produced in the action. e.g. John wrote *a book*.
     *
     * @param result Thing value to set.
     */
    void setResult(Thing result);

    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     *
     * @return {@link PostalAddress} or {@link Text} or {@link Place} or {@link VirtualLocation}
     */
    <T> T getLocation();

    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     *
     * @param location PostalAddress value to set.
     */
    void setLocation(PostalAddress location);
    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     *
     * @param location Text value to set.
     */
    void setLocation(Text location);
    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     *
     * @param location Place value to set.
     */
    void setLocation(Place location);
    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     *
     * @param location VirtualLocation value to set.
     */
    void setLocation(VirtualLocation location);

    /**
     * The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). e.g. John read *a book*.
     *
     * @return {@link Thing}
     */
    Thing getObject();

    /**
     * The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). e.g. John read *a book*.
     *
     * @param object Thing value to set.
     */
    void setObject(Thing object);

    /**
     * Indicates a target EntryPoint for an Action.
     *
     * @return {@link EntryPoint}
     */
    EntryPoint getTarget();

    /**
     * Indicates a target EntryPoint for an Action.
     *
     * @param target EntryPoint value to set.
     */
    void setTarget(EntryPoint target);

    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @return {@link DateTime} or {@link Time}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    <T> T getEndTime();

    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @param endTime DateTime value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    void setEndTime(DateTime endTime);
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.<br/><br/>Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     *
     * @param endTime Time value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    void setEndTime(Time endTime);

    /**
     * Other co-agents that participated in the action indirectly. e.g. John wrote a book with *Steve*.
     *
     * @return {@link Organization} or {@link Person}
     */
    <T> T getParticipant();

    /**
     * Other co-agents that participated in the action indirectly. e.g. John wrote a book with *Steve*.
     *
     * @param participant Organization value to set.
     */
    void setParticipant(Organization participant);
    /**
     * Other co-agents that participated in the action indirectly. e.g. John wrote a book with *Steve*.
     *
     * @param participant Person value to set.
     */
    void setParticipant(Person participant);

    /**
     * The object that helped the agent perform the action. e.g. John wrote a book with *a pen*.
     *
     * @return {@link Thing}
     */
    Thing getInstrument();

    /**
     * The object that helped the agent perform the action. e.g. John wrote a book with *a pen*.
     *
     * @param instrument Thing value to set.
     */
    void setInstrument(Thing instrument);

    /**
     * For failed actions, more information on the cause of the failure.
     *
     * @return {@link Thing}
     */
    Thing getError();

    /**
     * For failed actions, more information on the cause of the failure.
     *
     * @param error Thing value to set.
     */
    void setError(Thing error);
}
