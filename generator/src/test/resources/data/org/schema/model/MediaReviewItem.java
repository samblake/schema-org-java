/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.MediaObject;

/**
 * Represents an item or group of closely related items treated as a unit for the sake of evaluation in a [[MediaReview]]. Authorship etc. apply to the items rather than to the curation/grouping or reviewing party.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
 * @see <a href="https://schema.org/MediaReviewItem">https://schema.org/MediaReviewItem</a>
 */
public interface MediaReviewItem extends CreativeWork {

    /**
     * In the context of a [[MediaReview]], indicates specific media item(s) that are grouped using a [[MediaReviewItem]].
     *
     * @return {@link MediaObject}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    MediaObject getMediaItemAppearance();

    /**
     * In the context of a [[MediaReview]], indicates specific media item(s) that are grouped using a [[MediaReviewItem]].
     *
     * @param fMediaItemAppearance MediaObject value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    void setMediaItemAppearance(MediaObject fMediaItemAppearance);
}
