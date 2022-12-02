/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.Event;

/**
 * An agent joins an event/group with participants/friends at a location.<br/><br/>Related actions:<br/><br/>* [[RegisterAction]]: Unlike RegisterAction, JoinAction refers to joining a group/team of people.<br/>* [[SubscribeAction]]: Unlike SubscribeAction, JoinAction does not imply that you'll be receiving updates.<br/>* [[FollowAction]]: Unlike FollowAction, JoinAction does not imply that you'll be polling for updates.
 *
 * @see <a href="https://schema.org/JoinAction">https://schema.org/JoinAction</a>
 */
public interface JoinAction extends InteractAction {

    /**
     * Upcoming or past event associated with this place, organization, or action.
     *
     * @return {@link Event}
     */
    Event getEvent();

    /**
     * Upcoming or past event associated with this place, organization, or action.
     *
     * @param fEvent Event value to set.
     */
    void setEvent(Event fEvent);
}
