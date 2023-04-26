/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.Organization;
import org.schema.model.Person;

/**
 * The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates polled from.<br/><br/>Related actions:<br/><br/>* [[BefriendAction]]: Unlike BefriendAction, FollowAction implies that the connection is *not* necessarily reciprocal.<br/>* [[SubscribeAction]]: Unlike SubscribeAction, FollowAction implies that the follower acts as an active agent constantly/actively polling for updates.<br/>* [[RegisterAction]]: Unlike RegisterAction, FollowAction implies that the agent is interested in continuing receiving updates from the object.<br/>* [[JoinAction]]: Unlike JoinAction, FollowAction implies that the agent is interested in getting updates from the object.<br/>* [[TrackAction]]: Unlike TrackAction, FollowAction refers to the polling of updates of all aspects of animate objects rather than the location of inanimate objects (e.g. you track a package, but you don't follow it).
 *
 * @see <a href="https://schema.org/FollowAction">https://schema.org/FollowAction</a>
 */
public interface FollowAction extends InteractAction {

    /**
     * A sub property of object. The person or organization being followed.
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="https://schema.org/object">https://schema.org/object</a> <i>followee</i> is a sub property of <i>object</i>
     */
    <T> List<T> getFolloweeList();

    /**
     * A sub property of object. The person or organization being followed.
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="https://schema.org/object">https://schema.org/object</a> <i>followee</i> is a sub property of <i>object</i>
     */
    <T> T getFollowee();

    /**
     * A sub property of object. The person or organization being followed.
     *
     * @param followee Organization value to set.
     * @see <a href="https://schema.org/object">https://schema.org/object</a> <i>followee</i> is a sub property of <i>object</i>
     */
    void addFollowee(Organization followee);
    /**
     * A sub property of object. The person or organization being followed.
     *
     * @param followee Person value to set.
     * @see <a href="https://schema.org/object">https://schema.org/object</a> <i>followee</i> is a sub property of <i>object</i>
     */
    void addFollowee(Person followee);
}
