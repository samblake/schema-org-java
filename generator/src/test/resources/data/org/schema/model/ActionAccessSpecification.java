/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.datatype.DateTime;
import org.schema.model.datatype.Time;
import org.schema.model.datatype.Date;
import org.schema.model.Offer;
import org.schema.model.MediaSubscription;
import org.schema.model.datatype.Boolean;
import org.schema.model.Place;
import org.schema.model.datatype.Text;
import org.schema.model.GeoShape;
import org.schema.model.datatype.URL;
import org.schema.model.CategoryCode;
import org.schema.model.Thing;
import org.schema.model.PhysicalActivityCategory;

/**
 * A set of requirements that must be fulfilled in order to perform an Action.
 *
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
 * @see <a href="https://schema.org/ActionAccessSpecification">https://schema.org/ActionAccessSpecification</a>
 */
public interface ActionAccessSpecification extends Intangible {

    /**
     * The end of the availability of the product or service included in the offer.
     *
     * @return {@link DateTime} or {@link Time} or {@link Date}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    <T> List<T> getAvailabilityEndsList();

    /**
     * The end of the availability of the product or service included in the offer.
     *
     * @return {@link DateTime} or {@link Time} or {@link Date}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    <T> T getAvailabilityEnds();

    /**
     * The end of the availability of the product or service included in the offer.
     *
     * @param availabilityEnds DateTime value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void addAvailabilityEnds(DateTime availabilityEnds);
    /**
     * The end of the availability of the product or service included in the offer.
     *
     * @param availabilityEnds Time value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void addAvailabilityEnds(Time availabilityEnds);
    /**
     * The end of the availability of the product or service included in the offer.
     *
     * @param availabilityEnds Date value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void addAvailabilityEnds(Date availabilityEnds);

    /**
     * An Offer which must be accepted before the user can perform the Action. For example, the user may need to buy a movie before being able to watch it.
     *
     * @return {@link Offer}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    List<Offer> getExpectsAcceptanceOfList();

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
     * @param expectsAcceptanceOf Offer value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void addExpectsAcceptanceOf(Offer expectsAcceptanceOf);

    /**
     * The beginning of the availability of the product or service included in the offer.
     *
     * @return {@link Date} or {@link Time} or {@link DateTime}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> List<T> getAvailabilityStartsList();

    /**
     * The beginning of the availability of the product or service included in the offer.
     *
     * @return {@link Date} or {@link Time} or {@link DateTime}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    <T> T getAvailabilityStarts();

    /**
     * The beginning of the availability of the product or service included in the offer.
     *
     * @param availabilityStarts Date value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addAvailabilityStarts(Date availabilityStarts);
    /**
     * The beginning of the availability of the product or service included in the offer.
     *
     * @param availabilityStarts Time value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addAvailabilityStarts(Time availabilityStarts);
    /**
     * The beginning of the availability of the product or service included in the offer.
     *
     * @param availabilityStarts DateTime value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void addAvailabilityStarts(DateTime availabilityStarts);

    /**
     * Indicates if use of the media require a subscription  (either paid or free). Allowed values are ```true``` or ```false``` (note that an earlier version had 'yes', 'no').
     *
     * @return {@link MediaSubscription} or {@link Boolean}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    <T> List<T> getRequiresSubscriptionList();

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
     * @param requiresSubscription MediaSubscription value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void addRequiresSubscription(MediaSubscription requiresSubscription);
    /**
     * Indicates if use of the media require a subscription  (either paid or free). Allowed values are ```true``` or ```false``` (note that an earlier version had 'yes', 'no').
     *
     * @param requiresSubscription Boolean value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     */
    void addRequiresSubscription(Boolean requiresSubscription);

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.<br/><br/>See also [[ineligibleRegion]].
     *     
     *
     * @return {@link Place} or {@link Text} or {@link GeoShape}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="https://schema.org/areaServed">https://schema.org/areaServed</a> <i>eligibleRegion</i> is a sub property of <i>areaServed</i>
     */
    <T> List<T> getEligibleRegionList();

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.<br/><br/>See also [[ineligibleRegion]].
     *     
     *
     * @return {@link Place} or {@link Text} or {@link GeoShape}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="https://schema.org/areaServed">https://schema.org/areaServed</a> <i>eligibleRegion</i> is a sub property of <i>areaServed</i>
     */
    <T> T getEligibleRegion();

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.<br/><br/>See also [[ineligibleRegion]].
     *     
     *
     * @param eligibleRegion Place value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="https://schema.org/areaServed">https://schema.org/areaServed</a> <i>eligibleRegion</i> is a sub property of <i>areaServed</i>
     */
    void addEligibleRegion(Place eligibleRegion);
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.<br/><br/>See also [[ineligibleRegion]].
     *     
     *
     * @param eligibleRegion Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="https://schema.org/areaServed">https://schema.org/areaServed</a> <i>eligibleRegion</i> is a sub property of <i>areaServed</i>
     */
    void addEligibleRegion(Text eligibleRegion);
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.<br/><br/>See also [[ineligibleRegion]].
     *     
     *
     * @param eligibleRegion GeoShape value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="https://schema.org/areaServed">https://schema.org/areaServed</a> <i>eligibleRegion</i> is a sub property of <i>areaServed</i>
     */
    void addEligibleRegion(GeoShape eligibleRegion);

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.<br/><br/>See also [[eligibleRegion]].
     *       
     *
     * @return {@link Place} or {@link GeoShape} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2242">https://github.com/schemaorg/schemaorg/issues/2242</a>
     */
    <T> List<T> getIneligibleRegionList();

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.<br/><br/>See also [[eligibleRegion]].
     *       
     *
     * @return {@link Place} or {@link GeoShape} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2242">https://github.com/schemaorg/schemaorg/issues/2242</a>
     */
    <T> T getIneligibleRegion();

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.<br/><br/>See also [[eligibleRegion]].
     *       
     *
     * @param ineligibleRegion Place value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2242">https://github.com/schemaorg/schemaorg/issues/2242</a>
     */
    void addIneligibleRegion(Place ineligibleRegion);
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.<br/><br/>See also [[eligibleRegion]].
     *       
     *
     * @param ineligibleRegion GeoShape value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2242">https://github.com/schemaorg/schemaorg/issues/2242</a>
     */
    void addIneligibleRegion(GeoShape ineligibleRegion);
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.<br/><br/>See also [[eligibleRegion]].
     *       
     *
     * @param ineligibleRegion Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2242">https://github.com/schemaorg/schemaorg/issues/2242</a>
     */
    void addIneligibleRegion(Text ineligibleRegion);

    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @return {@link URL} or {@link CategoryCode} or {@link Text} or {@link Thing} or {@link PhysicalActivityCategory}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     */
    <T> List<T> getCategoryList();

    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @return {@link URL} or {@link CategoryCode} or {@link Text} or {@link Thing} or {@link PhysicalActivityCategory}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     */
    <T> T getCategory();

    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @param category URL value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     */
    void addCategory(URL category);
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @param category CategoryCode value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     */
    void addCategory(CategoryCode category);
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @param category Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     */
    void addCategory(Text category);
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @param category Thing value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     */
    void addCategory(Thing category);
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     *
     * @param category PhysicalActivityCategory value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1741">https://github.com/schemaorg/schemaorg/issues/1741</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     */
    void addCategory(PhysicalActivityCategory category);
}
