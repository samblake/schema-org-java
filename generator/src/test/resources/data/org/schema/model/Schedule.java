/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;
import org.schema.model.datatype.DateTime;
import org.schema.model.datatype.Date;
import org.schema.model.datatype.Time;
import org.schema.model.datatype.Integer;
import org.schema.model.Duration;
import org.schema.model.DayOfWeek;

/**
 * A schedule defines a repeating time period used to describe a regularly occurring [[Event]]. At a minimum a schedule will specify [[repeatFrequency]] which describes the interval between occurences of the event. Additional information can be provided to specify the schedule more precisely.
 *       This includes identifying the day(s) of the week or month when the recurring event will take place, in addition to its start and end time. Schedules may also
 *       have start and end dates to indicate when they are active, e.g. to define a limited calendar of events.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
 * @see <a href="https://schema.org/Schedule">https://schema.org/Schedule</a>
 */
public interface Schedule extends Intangible {

    /**
     * Indicates the timezone for which the time(s) indicated in the [[Schedule]] are given. The value provided should be among those listed in the IANA Time Zone Database.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    Text getScheduleTimezone();

    /**
     * Indicates the timezone for which the time(s) indicated in the [[Schedule]] are given. The value provided should be among those listed in the IANA Time Zone Database.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    void setScheduleTimezone(Text fScheduleTimezone);

    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @return {@link DateTime} or {@link Date}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    <T> T getStartDate();

    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void setStartDate(Object fStartDate);

    /**
     * Defines a [[Date]] or [[DateTime]] during which a scheduled [[Event]] will not take place. The property allows exceptions to
     *       a [[Schedule]] to be specified. If an exception is specified as a [[DateTime]] then only the event that would have started at that specific date and time
     *       should be excluded from the schedule. If an exception is specified as a [[Date]] then any event that is scheduled for that 24 hour period should be
     *       excluded from the schedule. This allows a whole day to be excluded from the schedule without having to itemise every scheduled event.
     *
     * @return {@link DateTime} or {@link Date}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    <T> T getExceptDate();

    /**
     * Defines a [[Date]] or [[DateTime]] during which a scheduled [[Event]] will not take place. The property allows exceptions to
     *       a [[Schedule]] to be specified. If an exception is specified as a [[DateTime]] then only the event that would have started at that specific date and time
     *       should be excluded from the schedule. If an exception is specified as a [[Date]] then any event that is scheduled for that 24 hour period should be
     *       excluded from the schedule. This allows a whole day to be excluded from the schedule without having to itemise every scheduled event.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    void setExceptDate(Object fExceptDate);

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
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    void setStartTime(Object fStartTime);

    /**
     * Defines the number of times a recurring [[Event]] will take place
     *
     * @return {@link Integer}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    Integer getRepeatCount();

    /**
     * Defines the number of times a recurring [[Event]] will take place
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    void setRepeatCount(Integer fRepeatCount);

    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @return {@link Date} or {@link DateTime}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    <T> T getEndDate();

    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void setEndDate(Object fEndDate);

    /**
     * Defines the frequency at which [[Event]]s will occur according to a schedule [[Schedule]]. The intervals between
     *       events should be defined as a [[Duration]] of time.
     *
     * @return {@link Text} or {@link Duration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    <T> T getRepeatFrequency();

    /**
     * Defines the frequency at which [[Event]]s will occur according to a schedule [[Schedule]]. The intervals between
     *       events should be defined as a [[Duration]] of time.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    void setRepeatFrequency(Object fRepeatFrequency);

    /**
     * The duration of the item (movie, audio recording, event, etc.) in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @return {@link Duration}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    Duration getDuration();

    /**
     * The duration of the item (movie, audio recording, event, etc.) in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    void setDuration(Duration fDuration);

    /**
     * Defines the day(s) of the month on which a recurring [[Event]] takes place. Specified as an [[Integer]] between 1-31.
     *
     * @return {@link Integer}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    Integer getByMonthDay();

    /**
     * Defines the day(s) of the month on which a recurring [[Event]] takes place. Specified as an [[Integer]] between 1-31.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    void setByMonthDay(Integer fByMonthDay);

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
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2493">https://github.com/schemaorg/schemaorg/issues/2493</a>
     */
    void setEndTime(Object fEndTime);

    /**
     * Defines the month(s) of the year on which a recurring [[Event]] takes place. Specified as an [[Integer]] between 1-12. January is 1.
     *
     * @return {@link Integer}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    Integer getByMonth();

    /**
     * Defines the month(s) of the year on which a recurring [[Event]] takes place. Specified as an [[Integer]] between 1-12. January is 1.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    void setByMonth(Integer fByMonth);

    /**
     * Defines the day(s) of the week on which a recurring [[Event]] takes place. May be specified using either [[DayOfWeek]], or alternatively [[Text]] conforming to iCal's syntax for byDay recurrence rules.
     *
     * @return {@link DayOfWeek} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    <T> T getByDay();

    /**
     * Defines the day(s) of the week on which a recurring [[Event]] takes place. May be specified using either [[DayOfWeek]], or alternatively [[Text]] conforming to iCal's syntax for byDay recurrence rules.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1457">https://github.com/schemaorg/schemaorg/issues/1457</a>
     */
    void setByDay(Object fByDay);

    /**
     * Defines the week(s) of the month on which a recurring Event takes place. Specified as an Integer between 1-5. For clarity, byMonthWeek is best used in conjunction with byDay to indicate concepts like the first and third Mondays of a month.
     *
     * @return {@link Integer}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2599">https://github.com/schemaorg/schemaorg/issues/2599</a>
     */
    Integer getByMonthWeek();

    /**
     * Defines the week(s) of the month on which a recurring Event takes place. Specified as an Integer between 1-5. For clarity, byMonthWeek is best used in conjunction with byDay to indicate concepts like the first and third Mondays of a month.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2599">https://github.com/schemaorg/schemaorg/issues/2599</a>
     */
    void setByMonthWeek(Integer fByMonthWeek);
}
