/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.Person;
import org.schema.model.VideoObject;
import org.schema.model.datatype.Text;
import org.schema.model.CreativeWork;
import org.schema.model.GameServer;
import org.schema.model.GamePlayMode;
import org.schema.model.datatype.URL;
import org.schema.model.Thing;
import org.schema.model.MusicGroup;

/**
 * A video game is an electronic game that involves human interaction with a user interface to generate visual feedback on a video device.
 *
 * @see <a href="https://schema.org/VideoGame">https://schema.org/VideoGame</a>
 */
public interface VideoGame extends SoftwareApplication, Game {

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
     * The edition of a video game.
     *
     * @return {@link Text}
     */
    Text getGameEdition();

    /**
     * The edition of a video game.
     *
     * @param fGameEdition Text value to set.
     */
    void setGameEdition(Text fGameEdition);
    /**
     * The edition of a video game.
     *
     * @param fGameEdition java.lang.String value to set.
     */
    void setGameEdition(java.lang.String fGameEdition);

    /**
     * Cheat codes to the game.
     *
     * @return {@link CreativeWork}
     */
    CreativeWork getCheatCode();

    /**
     * Cheat codes to the game.
     *
     * @param fCheatCode CreativeWork value to set.
     */
    void setCheatCode(CreativeWork fCheatCode);

    /**
     * The server on which  it is possible to play the game.
     *
     * @return {@link GameServer}
     */
    GameServer getGameServer();

    /**
     * The server on which  it is possible to play the game.
     *
     * @param fGameServer GameServer value to set.
     */
    void setGameServer(GameServer fGameServer);

    /**
     * Links to tips, tactics, etc.
     *
     * @return {@link CreativeWork}
     */
    CreativeWork getGameTip();

    /**
     * Links to tips, tactics, etc.
     *
     * @param fGameTip CreativeWork value to set.
     */
    void setGameTip(CreativeWork fGameTip);

    /**
     * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    Person getActors();

    /**
     * An actor, e.g. in tv, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
     *
     * @param fActors Person value to set.
     */
    void setActors(Person fActors);

    /**
     * Indicates whether this game is multi-player, co-op or single-player.  The game can be marked as multi-player, co-op and single-player at the same time.
     *
     * @return {@link GamePlayMode}
     */
    GamePlayMode getPlayMode();

    /**
     * Indicates whether this game is multi-player, co-op or single-player.  The game can be marked as multi-player, co-op and single-player at the same time.
     *
     * @param fPlayMode GamePlayMode value to set.
     */
    void setPlayMode(GamePlayMode fPlayMode);

    /**
     * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
     *
     * @return {@link Text} or {@link URL} or {@link Thing}
     */
    <T> T getGamePlatform();

    /**
     * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
     *
     * @param fGamePlatform Text value to set.
     */
    void setGamePlatform(Text fGamePlatform);
    /**
     * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
     *
     * @param fGamePlatform java.lang.String value to set.
     */
    void setGamePlatform(java.lang.String fGamePlatform);
    /**
     * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
     *
     * @param fGamePlatform URL value to set.
     */
    void setGamePlatform(URL fGamePlatform);
    /**
     * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
     *
     * @param fGamePlatform java.net.URL value to set.
     */
    void setGamePlatform(java.net.URL fGamePlatform);
    /**
     * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
     *
     * @param fGamePlatform Thing value to set.
     */
    void setGamePlatform(Thing fGamePlatform);

    /**
     * The composer of the soundtrack.
     *
     * @return {@link Person} or {@link MusicGroup}
     */
    <T> T getMusicBy();

    /**
     * The composer of the soundtrack.
     *
     * @param fMusicBy Person value to set.
     */
    void setMusicBy(Person fMusicBy);
    /**
     * The composer of the soundtrack.
     *
     * @param fMusicBy MusicGroup value to set.
     */
    void setMusicBy(MusicGroup fMusicBy);

    /**
     * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @return {@link Person}
     */
    Person getDirectors();

    /**
     * A director of e.g. tv, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
     *
     * @param fDirectors Person value to set.
     */
    void setDirectors(Person fDirectors);
}
