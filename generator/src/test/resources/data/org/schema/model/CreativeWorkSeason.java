/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.DateTime;
import org.schema.model.datatype.Date;
import org.schema.model.Person;
import org.schema.model.VideoObject;
import org.schema.model.Episode;
import org.schema.model.datatype.Integer;
import org.schema.model.CreativeWorkSeries;
import org.schema.model.Organization;
import org.schema.model.datatype.Text;

/**
 * A media season e.g. tv, radio, video game etc.
 *
 * @see <a href="https://schema.org/CreativeWorkSeason">https://schema.org/CreativeWorkSeason</a>
 */
public interface CreativeWorkSeason extends CreativeWork {

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
     * @param fStartDate DateTime value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void setStartDate(DateTime fStartDate);
    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @param fStartDate java.time.LocalDateTime value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void setStartDate(java.time.LocalDateTime fStartDate);
    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @param fStartDate Date value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void setStartDate(Date fStartDate);
    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @param fStartDate java.time.LocalDate value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void setStartDate(java.time.LocalDate fStartDate);

    /**
     * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    Person getDirector();

    /**
     * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @param fDirector Person value to set.
     */
    void setDirector(Person fDirector);

    /**
     * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    Person getActor();

    /**
     * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     *
     * @param fActor Person value to set.
     */
    void setActor(Person fActor);

    /**
     * The trailer of a movie or tv/radio series, season, episode, etc.
     *
     * @return {@link VideoObject}
     */
    VideoObject getTrailer();

    /**
     * The trailer of a movie or tv/radio series, season, episode, etc.
     *
     * @param fTrailer VideoObject value to set.
     */
    void setTrailer(VideoObject fTrailer);

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
     * @param fEndDate Date value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void setEndDate(Date fEndDate);
    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @param fEndDate java.time.LocalDate value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void setEndDate(java.time.LocalDate fEndDate);
    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @param fEndDate DateTime value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void setEndDate(DateTime fEndDate);
    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @param fEndDate java.time.LocalDateTime value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void setEndDate(java.time.LocalDateTime fEndDate);

    /**
     * An episode of a TV/radio series or season.
     *
     * @return {@link Episode}
     */
    Episode getEpisodes();

    /**
     * An episode of a TV/radio series or season.
     *
     * @param fEpisodes Episode value to set.
     */
    void setEpisodes(Episode fEpisodes);

    /**
     * The number of episodes in this season or series.
     *
     * @return {@link Integer}
     */
    Integer getNumberOfEpisodes();

    /**
     * The number of episodes in this season or series.
     *
     * @param fNumberOfEpisodes Integer value to set.
     */
    void setNumberOfEpisodes(Integer fNumberOfEpisodes);
    /**
     * The number of episodes in this season or series.
     *
     * @param fNumberOfEpisodes java.lang.Integer value to set.
     */
    void setNumberOfEpisodes(java.lang.Integer fNumberOfEpisodes);

    /**
     * The series to which this episode or season belongs.
     *
     * @return {@link CreativeWorkSeries}
     */
    CreativeWorkSeries getPartOfSeries();

    /**
     * The series to which this episode or season belongs.
     *
     * @param fPartOfSeries CreativeWorkSeries value to set.
     */
    void setPartOfSeries(CreativeWorkSeries fPartOfSeries);

    /**
     * The production company or studio responsible for the item e.g. series, video game, episode etc.
     *
     * @return {@link Organization}
     */
    Organization getProductionCompany();

    /**
     * The production company or studio responsible for the item e.g. series, video game, episode etc.
     *
     * @param fProductionCompany Organization value to set.
     */
    void setProductionCompany(Organization fProductionCompany);

    /**
     * Position of the season within an ordered group of seasons.
     *
     * @return {@link Text} or {@link Integer}
     */
    <T> T getSeasonNumber();

    /**
     * Position of the season within an ordered group of seasons.
     *
     * @param fSeasonNumber Text value to set.
     */
    void setSeasonNumber(Text fSeasonNumber);
    /**
     * Position of the season within an ordered group of seasons.
     *
     * @param fSeasonNumber java.lang.String value to set.
     */
    void setSeasonNumber(java.lang.String fSeasonNumber);
    /**
     * Position of the season within an ordered group of seasons.
     *
     * @param fSeasonNumber Integer value to set.
     */
    void setSeasonNumber(Integer fSeasonNumber);
    /**
     * Position of the season within an ordered group of seasons.
     *
     * @param fSeasonNumber java.lang.Integer value to set.
     */
    void setSeasonNumber(java.lang.Integer fSeasonNumber);

    /**
     * An episode of a tv, radio or game media within a series or season.
     *
     * @return {@link Episode}
     */
    Episode getEpisode();

    /**
     * An episode of a tv, radio or game media within a series or season.
     *
     * @param fEpisode Episode value to set.
     */
    void setEpisode(Episode fEpisode);
}
