/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;
import org.schema.model.datatype.Integer;

/**
 * One of the sections into which a book is divided. A chapter usually has a section number or a name.
 *
 * @see <a href="https://bib.schema.org">https://bib.schema.org</a>
 * @see <a href="https://schema.org/Chapter">https://schema.org/Chapter</a>
 */
public interface Chapter extends CreativeWork {

    /**
     * The page on which the work starts; for example "135" or "xiii".
     *
     * @return {@link Text} or {@link Integer}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    <T> T getPageStart();

    /**
     * The page on which the work starts; for example "135" or "xiii".
     *
     * @param fPageStart Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setPageStart(Text fPageStart);
    /**
     * The page on which the work starts; for example "135" or "xiii".
     *
     * @param fPageStart java.lang.String value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setPageStart(java.lang.String fPageStart);
    /**
     * The page on which the work starts; for example "135" or "xiii".
     *
     * @param fPageStart Integer value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setPageStart(Integer fPageStart);
    /**
     * The page on which the work starts; for example "135" or "xiii".
     *
     * @param fPageStart java.lang.Integer value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setPageStart(java.lang.Integer fPageStart);

    /**
     * The page on which the work ends; for example "138" or "xvi".
     *
     * @return {@link Text} or {@link Integer}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    <T> T getPageEnd();

    /**
     * The page on which the work ends; for example "138" or "xvi".
     *
     * @param fPageEnd Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setPageEnd(Text fPageEnd);
    /**
     * The page on which the work ends; for example "138" or "xvi".
     *
     * @param fPageEnd java.lang.String value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setPageEnd(java.lang.String fPageEnd);
    /**
     * The page on which the work ends; for example "138" or "xvi".
     *
     * @param fPageEnd Integer value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setPageEnd(Integer fPageEnd);
    /**
     * The page on which the work ends; for example "138" or "xvi".
     *
     * @param fPageEnd java.lang.Integer value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setPageEnd(java.lang.Integer fPageEnd);

    /**
     * Any description of pages that is not separated into pageStart and pageEnd; for example, "1-6, 9, 55" or "10-12, 46-49".
     *
     * @return {@link Text}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    Text getPagination();

    /**
     * Any description of pages that is not separated into pageStart and pageEnd; for example, "1-6, 9, 55" or "10-12, 46-49".
     *
     * @param fPagination Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setPagination(Text fPagination);
    /**
     * Any description of pages that is not separated into pageStart and pageEnd; for example, "1-6, 9, 55" or "10-12, 46-49".
     *
     * @param fPagination java.lang.String value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_bibex</a>
     */
    void setPagination(java.lang.String fPagination);
}
