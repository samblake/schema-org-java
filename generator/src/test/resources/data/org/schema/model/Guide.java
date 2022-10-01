/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;

/**
 * [[Guide]] is a page or article that recommend specific products or services, or aspects of a thing for a user to consider. A [[Guide]] may represent a Buying Guide and detail aspects of products or services for a user to consider. A [[Guide]] may represent a Product Guide and recommend specific products or services. A [[Guide]] may represent a Ranked List and recommend specific products or services with ranking.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/2405">https://github.com/schemaorg/schemaorg/issues/2405</a>
 * @see <a href="https://schema.org/Guide">https://schema.org/Guide</a>
 */
public interface Guide extends CreativeWork {

    /**
     * This Review or Rating is relevant to this part or facet of the itemReviewed.
     *
     * @return {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1689">https://github.com/schemaorg/schemaorg/issues/1689</a>
     */
    Text getReviewAspect();

    /**
     * This Review or Rating is relevant to this part or facet of the itemReviewed.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1689">https://github.com/schemaorg/schemaorg/issues/1689</a>
     */
    void setReviewAspect(Text fReviewAspect);
}
