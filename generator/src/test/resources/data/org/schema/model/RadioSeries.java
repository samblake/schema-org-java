/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.URL;
import org.schema.model.CreativeWorkSeason;
import org.schema.model.Person;
import org.schema.model.VideoObject;
import org.schema.model.Episode;
import org.schema.model.datatype.Integer;
import org.schema.model.Organization;
import org.schema.model.MusicGroup;

/**
 * CreativeWorkSeries dedicated to radio broadcast and associated online delivery.
 *
 * @see <a href="https://schema.org/RadioSeries">https://schema.org/RadioSeries</a>
 */
public interface RadioSeries extends CreativeWorkSeries {

    /**
     * A season in a media series.
     *
     * @return {@link URL} or {@link CreativeWorkSeason}
     */
    <T> T getSeason();

    /**
     * A season in a media series.
     *
     * @param season URL value to set.
     */
    void setSeason(URL season);
    /**
     * A season in a media series.
     *
     * @param season CreativeWorkSeason value to set.
     */
    void setSeason(CreativeWorkSeason season);

    /**
     * A season that is part of the media series.
     *
     * @return {@link CreativeWorkSeason}
     */
    CreativeWorkSeason getContainsSeason();

    /**
     * A season that is part of the media series.
     *
     * @param containsSeason CreativeWorkSeason value to set.
     */
    void setContainsSeason(CreativeWorkSeason containsSeason);

    /**
     * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    Person getDirector();

    /**
     * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @param director Person value to set.
     */
    void setDirector(Person director);

    /**
     * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    Person getActor();

    /**
     * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     *
     * @param actor Person value to set.
     */
    void setActor(Person actor);

    /**
     * The trailer of a movie or tv/radio series, season, episode, etc.
     *
     * @return {@link VideoObject}
     */
    VideoObject getTrailer();

    /**
     * The trailer of a movie or tv/radio series, season, episode, etc.
     *
     * @param trailer VideoObject value to set.
     */
    void setTrailer(VideoObject trailer);

    /**
     * An episode of a TV/radio series or season.
     *
     * @return {@link Episode}
     */
    Episode getEpisodes();

    /**
     * An episode of a TV/radio series or season.
     *
     * @param episodes Episode value to set.
     */
    void setEpisodes(Episode episodes);

    /**
     * The number of episodes in this season or series.
     *
     * @return {@link Integer}
     */
    Integer getNumberOfEpisodes();

    /**
     * The number of episodes in this season or series.
     *
     * @param numberOfEpisodes Integer value to set.
     */
    void setNumberOfEpisodes(Integer numberOfEpisodes);

    /**
     * A season in a media series.
     *
     * @return {@link CreativeWorkSeason}
     */
    CreativeWorkSeason getSeasons();

    /**
     * A season in a media series.
     *
     * @param seasons CreativeWorkSeason value to set.
     */
    void setSeasons(CreativeWorkSeason seasons);

    /**
     * The production company or studio responsible for the item e.g. series, video game, episode etc.
     *
     * @return {@link Organization}
     */
    Organization getProductionCompany();

    /**
     * The production company or studio responsible for the item e.g. series, video game, episode etc.
     *
     * @param productionCompany Organization value to set.
     */
    void setProductionCompany(Organization productionCompany);

    /**
     * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    Person getActors();

    /**
     * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
     *
     * @param actors Person value to set.
     */
    void setActors(Person actors);

    /**
     * The number of seasons in this series.
     *
     * @return {@link Integer}
     */
    Integer getNumberOfSeasons();

    /**
     * The number of seasons in this series.
     *
     * @param numberOfSeasons Integer value to set.
     */
    void setNumberOfSeasons(Integer numberOfSeasons);

    /**
     * The composer of the soundtrack.
     *
     * @return {@link Person} or {@link MusicGroup}
     */
    <T> T getMusicBy();

    /**
     * The composer of the soundtrack.
     *
     * @param musicBy Person value to set.
     */
    void setMusicBy(Person musicBy);
    /**
     * The composer of the soundtrack.
     *
     * @param musicBy MusicGroup value to set.
     */
    void setMusicBy(MusicGroup musicBy);

    /**
     * An episode of a tv, radio or game media within a series or season.
     *
     * @return {@link Episode}
     */
    Episode getEpisode();

    /**
     * An episode of a tv, radio or game media within a series or season.
     *
     * @param episode Episode value to set.
     */
    void setEpisode(Episode episode);

    /**
     * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    Person getDirectors();

    /**
     * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @param directors Person value to set.
     */
    void setDirectors(Person directors);
}
