/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.Place;
import org.schema.model.GeospatialGeometry;

/**
 * (Eventually to be defined as) a supertype of GeoShape designed to accommodate definitions from Geo-Spatial best practices.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1375">https://github.com/schemaorg/schemaorg/issues/1375</a>
 * @see <a href="https://schema.org/GeospatialGeometry">https://schema.org/GeospatialGeometry</a>
 */
public interface GeospatialGeometry extends Intangible {

    /**
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. "a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a". As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @return {@link Place} or {@link GeospatialGeometry}
     */
    <T> T getGeoContains();

    /**
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. "a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a". As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @param fGeoContains Place value to set.
     */
    void setGeoContains(Place fGeoContains);
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. "a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a". As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @param fGeoContains GeospatialGeometry value to set.
     */
    void setGeoContains(GeospatialGeometry fGeoContains);

    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @return {@link GeospatialGeometry} or {@link Place}
     */
    <T> T getGeoIntersects();

    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @param fGeoIntersects GeospatialGeometry value to set.
     */
    void setGeoIntersects(GeospatialGeometry fGeoIntersects);
    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @param fGeoIntersects Place value to set.
     */
    void setGeoIntersects(Place fGeoIntersects);

    /**
     * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points." (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
     *
     * @return {@link Place} or {@link GeospatialGeometry}
     */
    <T> T getGeoTouches();

    /**
     * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points." (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
     *
     * @param fGeoTouches Place value to set.
     */
    void setGeoTouches(Place fGeoTouches);
    /**
     * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points." (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM) )
     *
     * @param fGeoTouches GeospatialGeometry value to set.
     */
    void setGeoTouches(GeospatialGeometry fGeoTouches);

    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @return {@link Place} or {@link GeospatialGeometry}
     */
    <T> T getGeoCoveredBy();

    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @param fGeoCoveredBy Place value to set.
     */
    void setGeoCoveredBy(Place fGeoCoveredBy);
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @param fGeoCoveredBy GeospatialGeometry value to set.
     */
    void setGeoCoveredBy(GeospatialGeometry fGeoCoveredBy);

    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). "Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other" (a symmetric relationship)
     *
     * @return {@link Place} or {@link GeospatialGeometry}
     */
    <T> T getGeoEquals();

    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). "Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other" (a symmetric relationship)
     *
     * @param fGeoEquals Place value to set.
     */
    void setGeoEquals(Place fGeoEquals);
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). "Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other" (a symmetric relationship)
     *
     * @param fGeoEquals GeospatialGeometry value to set.
     */
    void setGeoEquals(GeospatialGeometry fGeoEquals);

    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: "a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them". As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @return {@link GeospatialGeometry} or {@link Place}
     */
    <T> T getGeoCrosses();

    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: "a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them". As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @param fGeoCrosses GeospatialGeometry value to set.
     */
    void setGeoCrosses(GeospatialGeometry fGeoCrosses);
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: "a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them". As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @param fGeoCrosses Place value to set.
     */
    void setGeoCrosses(Place fGeoCrosses);

    /**
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. "Every point of b is a point of (the interior or boundary of) a". As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @return {@link GeospatialGeometry} or {@link Place}
     */
    <T> T getGeoCovers();

    /**
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. "Every point of b is a point of (the interior or boundary of) a". As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @param fGeoCovers GeospatialGeometry value to set.
     */
    void setGeoCovers(GeospatialGeometry fGeoCovers);
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. "Every point of b is a point of (the interior or boundary of) a". As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @param fGeoCovers Place value to set.
     */
    void setGeoCovers(Place fGeoCovers);

    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @return {@link Place} or {@link GeospatialGeometry}
     */
    <T> T getGeoWithin();

    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @param fGeoWithin Place value to set.
     */
    void setGeoWithin(Place fGeoWithin);
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @param fGeoWithin GeospatialGeometry value to set.
     */
    void setGeoWithin(GeospatialGeometry fGeoWithin);

    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries." (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
     *
     * @return {@link GeospatialGeometry} or {@link Place}
     */
    <T> T getGeoDisjoint();

    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries." (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
     *
     * @param fGeoDisjoint GeospatialGeometry value to set.
     */
    void setGeoDisjoint(GeospatialGeometry fGeoDisjoint);
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries." (a symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM))
     *
     * @param fGeoDisjoint Place value to set.
     */
    void setGeoDisjoint(Place fGeoDisjoint);

    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @return {@link GeospatialGeometry} or {@link Place}
     */
    <T> T getGeoOverlaps();

    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @param fGeoOverlaps GeospatialGeometry value to set.
     */
    void setGeoOverlaps(GeospatialGeometry fGeoOverlaps);
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     *
     * @param fGeoOverlaps Place value to set.
     */
    void setGeoOverlaps(Place fGeoOverlaps);
}
