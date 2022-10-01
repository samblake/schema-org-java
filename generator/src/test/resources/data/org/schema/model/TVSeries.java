/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.URL;
import org.schema.model.CreativeWorkSeason;
import org.schema.model.Country;
import org.schema.model.Person;
import org.schema.model.VideoObject;
import org.schema.model.Episode;
import org.schema.model.datatype.Integer;
import org.schema.model.Organization;
import org.schema.model.MusicGroup;

/**
 * CreativeWorkSeries dedicated to TV broadcast and associated online delivery.
 *
 * @see <a href="https://schema.org/TVSeries">https://schema.org/TVSeries</a>
 */
public interface TVSeries extends CreativeWorkSeries, CreativeWork {

    /**
     * A season in a media series.
     *
     * @return {@link URL} or {@link CreativeWorkSeason}
     */
    <T> T getSeason();

    /**
     * A season in a media series.
     *
     */
    void setSeason(Object fSeason);

    /**
     * A season that is part of the media series.
     *
     * @return {@link CreativeWorkSeason}
     */
    CreativeWorkSeason getContainsSeason();

    /**
     * A season that is part of the media series.
     *
     */
    void setContainsSeason(CreativeWorkSeason fContainsSeason);

    /**
     * The country of origin of something, including products as well as creative  works such as movie and TV content.
     * 
     * In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.
     * 
     * In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here.
     *
     * @return {@link Country}
     */
    Country getCountryOfOrigin();

    /**
     * The country of origin of something, including products as well as creative  works such as movie and TV content.
     * 
     * In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.
     * 
     * In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here.
     *
     */
    void setCountryOfOrigin(Country fCountryOfOrigin);

    /**
     * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    Person getDirector();

    /**
     * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     *
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
     */
    void setTrailer(VideoObject fTrailer);

    /**
     * An episode of a TV/radio series or season.
     *
     * @return {@link Episode}
     */
    Episode getEpisodes();

    /**
     * An episode of a TV/radio series or season.
     *
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
     */
    void setNumberOfEpisodes(Integer fNumberOfEpisodes);

    /**
     * A season in a media series.
     *
     * @return {@link CreativeWorkSeason}
     */
    CreativeWorkSeason getSeasons();

    /**
     * A season in a media series.
     *
     */
    void setSeasons(CreativeWorkSeason fSeasons);

    /**
     * The production company or studio responsible for the item e.g. series, video game, episode etc.
     *
     * @return {@link Organization}
     */
    Organization getProductionCompany();

    /**
     * The production company or studio responsible for the item e.g. series, video game, episode etc.
     *
     */
    void setProductionCompany(Organization fProductionCompany);

    /**
     * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    Person getActors();

    /**
     * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
     *
     */
    void setActors(Person fActors);

    /**
     * The number of seasons in this series.
     *
     * @return {@link Integer}
     */
    Integer getNumberOfSeasons();

    /**
     * The number of seasons in this series.
     *
     */
    void setNumberOfSeasons(Integer fNumberOfSeasons);

    /**
     * The composer of the soundtrack.
     *
     * @return {@link Person} or {@link MusicGroup}
     */
    <T> T getMusicBy();

    /**
     * The composer of the soundtrack.
     *
     */
    void setMusicBy(Object fMusicBy);

    /**
     * An episode of a tv, radio or game media within a series or season.
     *
     * @return {@link Episode}
     */
    Episode getEpisode();

    /**
     * An episode of a tv, radio or game media within a series or season.
     *
     */
    void setEpisode(Episode fEpisode);

    /**
     * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    Person getDirectors();

    /**
     * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
     *
     */
    void setDirectors(Person fDirectors);
}
