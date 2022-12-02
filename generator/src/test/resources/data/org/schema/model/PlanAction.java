/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.DateTime;

/**
 * The act of planning the execution of an event/task/action/reservation/plan to a future date.
 *
 * @see <a href="https://schema.org/PlanAction">https://schema.org/PlanAction</a>
 */
public interface PlanAction extends OrganizeAction {

    /**
     * The time the object is scheduled to.
     *
     * @return {@link DateTime}
     */
    DateTime getScheduledTime();

    /**
     * The time the object is scheduled to.
     *
     * @param fScheduledTime DateTime value to set.
     */
    void setScheduledTime(DateTime fScheduledTime);
    /**
     * The time the object is scheduled to.
     *
     * @param fScheduledTime java.time.LocalDateTime value to set.
     */
    void setScheduledTime(java.time.LocalDateTime fScheduledTime);
}
