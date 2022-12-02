/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.MusicRecording;
import org.schema.model.datatype.URL;
import org.schema.model.datatype.Text;
import org.schema.model.Person;
import org.schema.model.MusicAlbum;
import org.schema.model.ItemList;

/**
 * A musical group, such as a band, an orchestra, or a choir. Can also be a solo musician.
 *
 * @see <a href="https://schema.org/MusicGroup">https://schema.org/MusicGroup</a>
 */
public interface MusicGroup extends PerformingGroup {

    /**
     * A music recording (track)&#x2014;usually a single song.
     *
     * @return {@link MusicRecording}
     */
    MusicRecording getTracks();

    /**
     * A music recording (track)&#x2014;usually a single song.
     *
     * @param fTracks MusicRecording value to set.
     */
    void setTracks(MusicRecording fTracks);

    /**
     * Genre of the creative work, broadcast channel or group.
     *
     * @return {@link URL} or {@link Text}
     */
    <T> T getGenre();

    /**
     * Genre of the creative work, broadcast channel or group.
     *
     * @param fGenre URL value to set.
     */
    void setGenre(URL fGenre);
    /**
     * Genre of the creative work, broadcast channel or group.
     *
     * @param fGenre java.net.URL value to set.
     */
    void setGenre(java.net.URL fGenre);
    /**
     * Genre of the creative work, broadcast channel or group.
     *
     * @param fGenre Text value to set.
     */
    void setGenre(Text fGenre);
    /**
     * Genre of the creative work, broadcast channel or group.
     *
     * @param fGenre java.lang.String value to set.
     */
    void setGenre(java.lang.String fGenre);

    /**
     * A member of a music group&#x2014;for example, John, Paul, George, or Ringo.
     *
     * @return {@link Person}
     */
    Person getMusicGroupMember();

    /**
     * A member of a music group&#x2014;for example, John, Paul, George, or Ringo.
     *
     * @param fMusicGroupMember Person value to set.
     */
    void setMusicGroupMember(Person fMusicGroupMember);

    /**
     * A collection of music albums.
     *
     * @return {@link MusicAlbum}
     */
    MusicAlbum getAlbums();

    /**
     * A collection of music albums.
     *
     * @param fAlbums MusicAlbum value to set.
     */
    void setAlbums(MusicAlbum fAlbums);

    /**
     * A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording.
     *
     * @return {@link ItemList} or {@link MusicRecording}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    <T> T getTrack();

    /**
     * A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording.
     *
     * @param fTrack ItemList value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    void setTrack(ItemList fTrack);
    /**
     * A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording.
     *
     * @param fTrack MusicRecording value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#MBZ</a>
     */
    void setTrack(MusicRecording fTrack);

    /**
     * A music album.
     *
     * @return {@link MusicAlbum}
     */
    MusicAlbum getAlbum();

    /**
     * A music album.
     *
     * @param fAlbum MusicAlbum value to set.
     */
    void setAlbum(MusicAlbum fAlbum);
}
