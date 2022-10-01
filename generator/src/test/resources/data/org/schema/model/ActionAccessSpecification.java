/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.Offer;
import org.schema.model.datatype.URL;
import org.schema.model.datatype.Text;
import org.schema.model.PhysicalActivityCategory;
import org.schema.model.Thing;
import org.schema.model.CategoryCode;
import org.schema.model.Place;
import org.schema.model.GeoShape;
import org.schema.model.MediaSubscription;
import org.schema.model.datatype.Boolean;
import org.schema.model.datatype.Date;
import org.schema.model.datatype.DateTime;
import org.schema.model.datatype.Time;

/**
 * A set of requirements that a must be fulfilled in order to perform an Action.
 *
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
 * @see <a href="https://schema.org/ActionAccessSpecification">https://schema.org/ActionAccessSpecification</a>
 */
public interface ActionAccessSpecification extends Intangible {

    /**
     * An Offer which must be accepted before the user can perform the Action. For example, the user may need to buy a movie before being able to watch it.
     *
     * @return {@link Offer}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    Offer getExpectsAcceptanceOf();

    /**
     * An Offer which must be accepted before the user can perform the Action. For example, the user may need to buy a movie before being able to watch it.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void setExpectsAcceptanceOf(Offer fExpectsAcceptanceOf);

    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @return {@link URL} or {@link Text} or {@link PhysicalActivityCategory} or {@link Thing} or {@link CategoryCode}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    <T> T getCategory();

    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void setCategory(Object fCategory);

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.<br/><br/>See also [[eligibleRegion]].
     *       
     *
     * @return {@link Place} or {@link Text} or {@link GeoShape}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2242">https://github.com/schemaorg/schemaorg/issues/2242</a>
     */
    <T> T getIneligibleRegion();

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.<br/><br/>See also [[eligibleRegion]].
     *       
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2242">https://github.com/schemaorg/schemaorg/issues/2242</a>
     */
    void setIneligibleRegion(Object fIneligibleRegion);

    /**
     * Indicates if use of the media require a subscription  (either paid or free). Allowed values are ```true``` or ```false``` (note that an earlier version had 'yes', 'no').
     *
     * @return {@link MediaSubscription} or {@link Boolean}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    <T> T getRequiresSubscription();

    /**
     * Indicates if use of the media require a subscription  (either paid or free). Allowed values are ```true``` or ```false``` (note that an earlier version had 'yes', 'no').
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void setRequiresSubscription(Object fRequiresSubscription);

    /**
     * The end of the availability of the product or service included in the offer.
     *
     * @return {@link Date} or {@link DateTime} or {@link Time}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> T getAvailabilityEnds();

    /**
     * The end of the availability of the product or service included in the offer.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setAvailabilityEnds(Object fAvailabilityEnds);

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.<br/><br/>See also [[ineligibleRegion]].
     *     
     *
     * @return {@link GeoShape} or {@link Text} or {@link Place}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    <T> T getEligibleRegion();

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.<br/><br/>See also [[ineligibleRegion]].
     *     
     *
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void setEligibleRegion(Object fEligibleRegion);

    /**
     * The beginning of the availability of the product or service included in the offer.
     *
     * @return {@link Time} or {@link DateTime} or {@link Date}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> T getAvailabilityStarts();

    /**
     * The beginning of the availability of the product or service included in the offer.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setAvailabilityStarts(Object fAvailabilityStarts);
}
