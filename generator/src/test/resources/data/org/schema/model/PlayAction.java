/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.Audience;
import org.schema.model.Event;

/**
 * The act of playing/exercising/training/performing for enjoyment, leisure, recreation, Competition or exercise.<br/><br/>Related actions:<br/><br/>* [[ListenAction]]: Unlike ListenAction (which is under ConsumeAction), PlayAction refers to performing for an audience or at an event, rather than consuming music.<br/>* [[WatchAction]]: Unlike WatchAction (which is under ConsumeAction), PlayAction refers to showing/displaying for an audience or at an event, rather than consuming visual content.
 *
 * @see <a href="https://schema.org/PlayAction">https://schema.org/PlayAction</a>
 */
public interface PlayAction extends Action {

    /**
     * An intended audience, i.e. a group for whom something was created.
     *
     * @return {@link Audience}
     */
    Audience getAudience();

    /**
     * An intended audience, i.e. a group for whom something was created.
     *
     */
    void setAudience(Audience fAudience);

    /**
     * Upcoming or past event associated with this place, organization, or action.
     *
     * @return {@link Event}
     */
    Event getEvent();

    /**
     * Upcoming or past event associated with this place, organization, or action.
     *
     */
    void setEvent(Event fEvent);
}
