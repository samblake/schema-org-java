/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.DateTime;
import org.schema.model.datatype.Date;
import org.schema.model.Thing;

/**
 * A single item within a larger data feed.
 *
 * @see <a href="https://schema.org/DataFeedItem">https://schema.org/DataFeedItem</a>
 */
public interface DataFeedItem extends Intangible {

    /**
     * The datetime the item was removed from the DataFeed.
     *
     * @return {@link DateTime} or {@link Date}
     */
    <T> T getDateDeleted();

    /**
     * The datetime the item was removed from the DataFeed.
     *
     */
    void setDateDeleted(Object fDateDeleted);

    /**
     * The date on which the CreativeWork was created or the item was added to a DataFeed.
     *
     * @return {@link Date} or {@link DateTime}
     */
    <T> T getDateCreated();

    /**
     * The date on which the CreativeWork was created or the item was added to a DataFeed.
     *
     */
    void setDateCreated(Object fDateCreated);

    /**
     * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
     *
     * @return {@link DateTime} or {@link Date}
     */
    <T> T getDateModified();

    /**
     * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
     *
     */
    void setDateModified(Object fDateModified);

    /**
     * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')’.
     *
     * @return {@link Thing}
     */
    Thing getItem();

    /**
     * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')’.
     *
     */
    void setItem(Thing fItem);
}
