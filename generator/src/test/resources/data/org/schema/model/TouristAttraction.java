/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.Audience;
import org.schema.model.datatype.Text;
import org.schema.model.Language;

/**
 * A tourist attraction.  In principle any Thing can be a [[TouristAttraction]], from a [[Mountain]] and [[LandmarksOrHistoricalBuildings]] to a [[LocalBusiness]].  This Type can be used on its own to describe a general [[TouristAttraction]], or be used as an [[additionalType]] to add tourist attraction properties to any other type.  (See examples below)
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it</a>
 * @see <a href="https://schema.org/TouristAttraction">https://schema.org/TouristAttraction</a>
 */
public interface TouristAttraction extends Place {

    /**
     * Attraction suitable for type(s) of tourist. eg. Children, visitors from a particular country, etc. 
     *
     * @return {@link Audience} or {@link Text}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    <T> T getTouristType();

    /**
     * Attraction suitable for type(s) of tourist. eg. Children, visitors from a particular country, etc. 
     *
     * @param fTouristType Audience value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    void setTouristType(Audience fTouristType);
    /**
     * Attraction suitable for type(s) of tourist. eg. Children, visitors from a particular country, etc. 
     *
     * @param fTouristType Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    void setTouristType(Text fTouristType);
    /**
     * Attraction suitable for type(s) of tourist. eg. Children, visitors from a particular country, etc. 
     *
     * @param fTouristType java.lang.String value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#IIT-CNR.it</a>
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Tourism</a>
     */
    void setTouristType(java.lang.String fTouristType);

    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]]
     *
     * @return {@link Text} or {@link Language}
     */
    <T> T getAvailableLanguage();

    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]]
     *
     * @param fAvailableLanguage Text value to set.
     */
    void setAvailableLanguage(Text fAvailableLanguage);
    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]]
     *
     * @param fAvailableLanguage java.lang.String value to set.
     */
    void setAvailableLanguage(java.lang.String fAvailableLanguage);
    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]]
     *
     * @param fAvailableLanguage Language value to set.
     */
    void setAvailableLanguage(Language fAvailableLanguage);
}
