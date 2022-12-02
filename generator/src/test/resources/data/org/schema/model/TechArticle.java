/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;

/**
 * A technical article - Example: How-to (task) topics, step-by-step, procedural troubleshooting, specifications, etc.
 *
 * @see <a href="https://schema.org/TechArticle">https://schema.org/TechArticle</a>
 */
public interface TechArticle extends Article {

    /**
     * Prerequisites needed to fulfill steps in article.
     *
     * @return {@link Text}
     */
    Text getDependencies();

    /**
     * Prerequisites needed to fulfill steps in article.
     *
     * @param fDependencies Text value to set.
     */
    void setDependencies(Text fDependencies);
    /**
     * Prerequisites needed to fulfill steps in article.
     *
     * @param fDependencies java.lang.String value to set.
     */
    void setDependencies(java.lang.String fDependencies);

    /**
     * Proficiency needed for this content; expected values: 'Beginner', 'Expert'.
     *
     * @return {@link Text}
     */
    Text getProficiencyLevel();

    /**
     * Proficiency needed for this content; expected values: 'Beginner', 'Expert'.
     *
     * @param fProficiencyLevel Text value to set.
     */
    void setProficiencyLevel(Text fProficiencyLevel);
    /**
     * Proficiency needed for this content; expected values: 'Beginner', 'Expert'.
     *
     * @param fProficiencyLevel java.lang.String value to set.
     */
    void setProficiencyLevel(java.lang.String fProficiencyLevel);
}
