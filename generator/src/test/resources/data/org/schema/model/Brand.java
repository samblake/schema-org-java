/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.Review;
import org.schema.model.AggregateRating;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.URL;
import org.schema.model.ImageObject;

/**
 * A brand is a name used by an organization or business person for labeling a product, product group, or similar.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass</a>
 * @see <a href="https://schema.org/Brand">https://schema.org/Brand</a>
 */
public interface Brand extends Intangible {

    /**
     * A review of the item.
     *
     * @return {@link Review}
     */
    Review getReview();

    /**
     * A review of the item.
     *
     */
    void setReview(Review fReview);

    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     *
     * @return {@link AggregateRating}
     */
    AggregateRating getAggregateRating();

    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     *
     */
    void setAggregateRating(AggregateRating fAggregateRating);

    /**
     * A slogan or motto associated with the item.
     *
     * @return {@link Text}
     */
    Text getSlogan();

    /**
     * A slogan or motto associated with the item.
     *
     */
    void setSlogan(Text fSlogan);

    /**
     * An associated logo.
     *
     * @return {@link URL} or {@link ImageObject}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> T getLogo();

    /**
     * An associated logo.
     *
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setLogo(Object fLogo);
}
