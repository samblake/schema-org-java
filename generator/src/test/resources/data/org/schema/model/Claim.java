/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.Organization;
import org.schema.model.Person;
import org.schema.model.CreativeWork;

/**
 * A [[Claim]] in Schema.org represents a specific, factually-oriented claim that could be the [[itemReviewed]] in a [[ClaimReview]]. The content of a claim can be summarized with the [[text]] property. Variations on well known claims can have their common identity indicated via [[sameAs]] links, and summarized with a [[name]]. Ideally, a [[Claim]] description includes enough contextual information to minimize the risk of ambiguity or inclarity. In practice, many claims are better understood in the context in which they appear or the interpretations provided by claim reviews.
 * 
 *   Beyond [[ClaimReview]], the Claim type can be associated with related creative works - for example a [[ScholarlyArticle]] or [[Question]] might be [[about]] some [[Claim]].
 * 
 *   At this time, Schema.org does not define any types of relationship between claims. This is a natural area for future exploration.
 *   
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/1828">https://github.com/schemaorg/schemaorg/issues/1828</a>
 * @see <a href="https://schema.org/Claim">https://schema.org/Claim</a>
 */
public interface Claim extends CreativeWork {

    /**
     * For a [[Claim]] interpreted from [[MediaObject]] content
     *     sed to indicate a claim contained, implied or refined from the content of a [[MediaObject]].
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    <T> List<T> getClaimInterpreterList();

    /**
     * For a [[Claim]] interpreted from [[MediaObject]] content
     *     sed to indicate a claim contained, implied or refined from the content of a [[MediaObject]].
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    <T> T getClaimInterpreter();

    /**
     * For a [[Claim]] interpreted from [[MediaObject]] content
     *     sed to indicate a claim contained, implied or refined from the content of a [[MediaObject]].
     *
     * @param claimInterpreter Organization value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    void addClaimInterpreter(Organization claimInterpreter);
    /**
     * For a [[Claim]] interpreted from [[MediaObject]] content
     *     sed to indicate a claim contained, implied or refined from the content of a [[MediaObject]].
     *
     * @param claimInterpreter Person value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2450">https://github.com/schemaorg/schemaorg/issues/2450</a>
     */
    void addClaimInterpreter(Person claimInterpreter);

    /**
     * Indicates an occurrence of a [[Claim]] in some [[CreativeWork]].
     *
     * @return {@link CreativeWork}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1828">https://github.com/schemaorg/schemaorg/issues/1828</a>
     * @see <a href="https://schema.org/workExample">https://schema.org/workExample</a> <i>appearance</i> is a sub property of <i>workExample</i>
     */
    List<CreativeWork> getAppearanceList();

    /**
     * Indicates an occurrence of a [[Claim]] in some [[CreativeWork]].
     *
     * @return {@link CreativeWork}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1828">https://github.com/schemaorg/schemaorg/issues/1828</a>
     * @see <a href="https://schema.org/workExample">https://schema.org/workExample</a> <i>appearance</i> is a sub property of <i>workExample</i>
     */
    CreativeWork getAppearance();

    /**
     * Indicates an occurrence of a [[Claim]] in some [[CreativeWork]].
     *
     * @param appearance CreativeWork value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1828">https://github.com/schemaorg/schemaorg/issues/1828</a>
     * @see <a href="https://schema.org/workExample">https://schema.org/workExample</a> <i>appearance</i> is a sub property of <i>workExample</i>
     */
    void addAppearance(CreativeWork appearance);

    /**
     * Indicates the first known occurrence of a [[Claim]] in some [[CreativeWork]].
     *
     * @return {@link CreativeWork}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1828">https://github.com/schemaorg/schemaorg/issues/1828</a>
     * @see <a href="https://schema.org/workExample">https://schema.org/workExample</a> <i>firstAppearance</i> is a sub property of <i>workExample</i>
     */
    List<CreativeWork> getFirstAppearanceList();

    /**
     * Indicates the first known occurrence of a [[Claim]] in some [[CreativeWork]].
     *
     * @return {@link CreativeWork}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1828">https://github.com/schemaorg/schemaorg/issues/1828</a>
     * @see <a href="https://schema.org/workExample">https://schema.org/workExample</a> <i>firstAppearance</i> is a sub property of <i>workExample</i>
     */
    CreativeWork getFirstAppearance();

    /**
     * Indicates the first known occurrence of a [[Claim]] in some [[CreativeWork]].
     *
     * @param firstAppearance CreativeWork value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1828">https://github.com/schemaorg/schemaorg/issues/1828</a>
     * @see <a href="https://schema.org/workExample">https://schema.org/workExample</a> <i>firstAppearance</i> is a sub property of <i>workExample</i>
     */
    void addFirstAppearance(CreativeWork firstAppearance);
}
