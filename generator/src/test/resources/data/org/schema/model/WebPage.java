/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Date;
import org.schema.model.Specialty;
import org.schema.model.ImageObject;
import org.schema.model.datatype.URL;
import org.schema.model.Organization;
import org.schema.model.Person;
import org.schema.model.WebPageElement;
import org.schema.model.SpeakableSpecification;
import org.schema.model.BreadcrumbList;
import org.schema.model.datatype.Text;

/**
 * A web page. Every web page is implicitly assumed to be declared to be of type WebPage, so the various properties about that webpage, such as <code>breadcrumb</code> may be used. We recommend explicit declaration if these properties are specified, but if they are found outside of an itemscope, they will be assumed to be about the page.
 *
 * @see <a href="https://schema.org/WebPage">https://schema.org/WebPage</a>
 */
public interface WebPage extends CreativeWork {

    /**
     * Date on which the content on this web page was last reviewed for accuracy and/or completeness.
     *
     * @return {@link Date}
     */
    Date getLastReviewed();

    /**
     * Date on which the content on this web page was last reviewed for accuracy and/or completeness.
     *
     * @param fLastReviewed Date value to set.
     */
    void setLastReviewed(Date fLastReviewed);
    /**
     * Date on which the content on this web page was last reviewed for accuracy and/or completeness.
     *
     * @param fLastReviewed java.time.LocalDate value to set.
     */
    void setLastReviewed(java.time.LocalDate fLastReviewed);

    /**
     * One of the domain specialities to which this web page's content applies.
     *
     * @return {@link Specialty}
     */
    Specialty getSpecialty();

    /**
     * One of the domain specialities to which this web page's content applies.
     *
     * @param fSpecialty Specialty value to set.
     */
    void setSpecialty(Specialty fSpecialty);

    /**
     * Indicates the main image on the page.
     *
     * @return {@link ImageObject}
     */
    ImageObject getPrimaryImageOfPage();

    /**
     * Indicates the main image on the page.
     *
     * @param fPrimaryImageOfPage ImageObject value to set.
     */
    void setPrimaryImageOfPage(ImageObject fPrimaryImageOfPage);

    /**
     * One of the more significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.
     *
     * @return {@link URL}
     */
    URL getSignificantLink();

    /**
     * One of the more significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.
     *
     * @param fSignificantLink URL value to set.
     */
    void setSignificantLink(URL fSignificantLink);
    /**
     * One of the more significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.
     *
     * @param fSignificantLink java.net.URL value to set.
     */
    void setSignificantLink(java.net.URL fSignificantLink);

    /**
     * People or organizations that have reviewed the content on this web page for accuracy and/or completeness.
     *
     * @return {@link Organization} or {@link Person}
     */
    <T> T getReviewedBy();

    /**
     * People or organizations that have reviewed the content on this web page for accuracy and/or completeness.
     *
     * @param fReviewedBy Organization value to set.
     */
    void setReviewedBy(Organization fReviewedBy);
    /**
     * People or organizations that have reviewed the content on this web page for accuracy and/or completeness.
     *
     * @param fReviewedBy Person value to set.
     */
    void setReviewedBy(Person fReviewedBy);

    /**
     * Indicates if this web page element is the main subject of the page.
     *
     * @return {@link WebPageElement}
     */
    WebPageElement getMainContentOfPage();

    /**
     * Indicates if this web page element is the main subject of the page.
     *
     * @param fMainContentOfPage WebPageElement value to set.
     */
    void setMainContentOfPage(WebPageElement fMainContentOfPage);

    /**
     * A link related to this web page, for example to other related web pages.
     *
     * @return {@link URL}
     */
    URL getRelatedLink();

    /**
     * A link related to this web page, for example to other related web pages.
     *
     * @param fRelatedLink URL value to set.
     */
    void setRelatedLink(URL fRelatedLink);
    /**
     * A link related to this web page, for example to other related web pages.
     *
     * @param fRelatedLink java.net.URL value to set.
     */
    void setRelatedLink(java.net.URL fRelatedLink);

    /**
     * Indicates sections of a Web page that are particularly 'speakable' in the sense of being highlighted as being especially appropriate for text-to-speech conversion. Other sections of a page may also be usefully spoken in particular circumstances; the 'speakable' property serves to indicate the parts most likely to be generally useful for speech.
     * 
     * The *speakable* property can be repeated an arbitrary number of times, with three kinds of possible 'content-locator' values:
     * 
     * 1.) *id-value* URL references - uses *id-value* of an element in the page being annotated. The simplest use of *speakable* has (potentially relative) URL values, referencing identified sections of the document concerned.
     * 
     * 2.) CSS Selectors - addresses content in the annotated page, eg. via class attribute. Use the [[cssSelector]] property.
     * 
     * 3.)  XPaths - addresses content via XPaths (assuming an XML view of the content). Use the [[xpath]] property.
     * 
     * 
     * For more sophisticated markup of speakable sections beyond simple ID references, either CSS selectors or XPath expressions to pick out document section(s) as speakable. For this
     * we define a supporting type, [[SpeakableSpecification]]  which is defined to be a possible value of the *speakable* property.
     *          
     *
     * @return {@link URL} or {@link SpeakableSpecification}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1389">https://github.com/schemaorg/schemaorg/issues/1389</a>
     */
    <T> T getSpeakable();

    /**
     * Indicates sections of a Web page that are particularly 'speakable' in the sense of being highlighted as being especially appropriate for text-to-speech conversion. Other sections of a page may also be usefully spoken in particular circumstances; the 'speakable' property serves to indicate the parts most likely to be generally useful for speech.
     * 
     * The *speakable* property can be repeated an arbitrary number of times, with three kinds of possible 'content-locator' values:
     * 
     * 1.) *id-value* URL references - uses *id-value* of an element in the page being annotated. The simplest use of *speakable* has (potentially relative) URL values, referencing identified sections of the document concerned.
     * 
     * 2.) CSS Selectors - addresses content in the annotated page, eg. via class attribute. Use the [[cssSelector]] property.
     * 
     * 3.)  XPaths - addresses content via XPaths (assuming an XML view of the content). Use the [[xpath]] property.
     * 
     * 
     * For more sophisticated markup of speakable sections beyond simple ID references, either CSS selectors or XPath expressions to pick out document section(s) as speakable. For this
     * we define a supporting type, [[SpeakableSpecification]]  which is defined to be a possible value of the *speakable* property.
     *          
     *
     * @param fSpeakable URL value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1389">https://github.com/schemaorg/schemaorg/issues/1389</a>
     */
    void setSpeakable(URL fSpeakable);
    /**
     * Indicates sections of a Web page that are particularly 'speakable' in the sense of being highlighted as being especially appropriate for text-to-speech conversion. Other sections of a page may also be usefully spoken in particular circumstances; the 'speakable' property serves to indicate the parts most likely to be generally useful for speech.
     * 
     * The *speakable* property can be repeated an arbitrary number of times, with three kinds of possible 'content-locator' values:
     * 
     * 1.) *id-value* URL references - uses *id-value* of an element in the page being annotated. The simplest use of *speakable* has (potentially relative) URL values, referencing identified sections of the document concerned.
     * 
     * 2.) CSS Selectors - addresses content in the annotated page, eg. via class attribute. Use the [[cssSelector]] property.
     * 
     * 3.)  XPaths - addresses content via XPaths (assuming an XML view of the content). Use the [[xpath]] property.
     * 
     * 
     * For more sophisticated markup of speakable sections beyond simple ID references, either CSS selectors or XPath expressions to pick out document section(s) as speakable. For this
     * we define a supporting type, [[SpeakableSpecification]]  which is defined to be a possible value of the *speakable* property.
     *          
     *
     * @param fSpeakable java.net.URL value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1389">https://github.com/schemaorg/schemaorg/issues/1389</a>
     */
    void setSpeakable(java.net.URL fSpeakable);
    /**
     * Indicates sections of a Web page that are particularly 'speakable' in the sense of being highlighted as being especially appropriate for text-to-speech conversion. Other sections of a page may also be usefully spoken in particular circumstances; the 'speakable' property serves to indicate the parts most likely to be generally useful for speech.
     * 
     * The *speakable* property can be repeated an arbitrary number of times, with three kinds of possible 'content-locator' values:
     * 
     * 1.) *id-value* URL references - uses *id-value* of an element in the page being annotated. The simplest use of *speakable* has (potentially relative) URL values, referencing identified sections of the document concerned.
     * 
     * 2.) CSS Selectors - addresses content in the annotated page, eg. via class attribute. Use the [[cssSelector]] property.
     * 
     * 3.)  XPaths - addresses content via XPaths (assuming an XML view of the content). Use the [[xpath]] property.
     * 
     * 
     * For more sophisticated markup of speakable sections beyond simple ID references, either CSS selectors or XPath expressions to pick out document section(s) as speakable. For this
     * we define a supporting type, [[SpeakableSpecification]]  which is defined to be a possible value of the *speakable* property.
     *          
     *
     * @param fSpeakable SpeakableSpecification value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1389">https://github.com/schemaorg/schemaorg/issues/1389</a>
     */
    void setSpeakable(SpeakableSpecification fSpeakable);

    /**
     * A set of links that can help a user understand and navigate a website hierarchy.
     *
     * @return {@link BreadcrumbList} or {@link Text}
     */
    <T> T getBreadcrumb();

    /**
     * A set of links that can help a user understand and navigate a website hierarchy.
     *
     * @param fBreadcrumb BreadcrumbList value to set.
     */
    void setBreadcrumb(BreadcrumbList fBreadcrumb);
    /**
     * A set of links that can help a user understand and navigate a website hierarchy.
     *
     * @param fBreadcrumb Text value to set.
     */
    void setBreadcrumb(Text fBreadcrumb);
    /**
     * A set of links that can help a user understand and navigate a website hierarchy.
     *
     * @param fBreadcrumb java.lang.String value to set.
     */
    void setBreadcrumb(java.lang.String fBreadcrumb);

    /**
     * The most significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.
     *
     * @return {@link URL}
     */
    URL getSignificantLinks();

    /**
     * The most significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.
     *
     * @param fSignificantLinks URL value to set.
     */
    void setSignificantLinks(URL fSignificantLinks);
    /**
     * The most significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.
     *
     * @param fSignificantLinks java.net.URL value to set.
     */
    void setSignificantLinks(java.net.URL fSignificantLinks);
}
