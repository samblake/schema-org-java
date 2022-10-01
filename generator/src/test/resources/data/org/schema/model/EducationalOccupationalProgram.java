/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.AlignmentObject;
import org.schema.model.Course;
import org.schema.model.EducationalOccupationalCredential;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.DateTime;
import org.schema.model.datatype.Date;
import org.schema.model.MonetaryAmountDistribution;
import org.schema.model.datatype.Number;
import org.schema.model.DayOfWeek;
import org.schema.model.Offer;
import org.schema.model.Demand;
import org.schema.model.datatype.Integer;
import org.schema.model.StructuredValue;
import org.schema.model.Organization;
import org.schema.model.Person;
import org.schema.model.datatype.URL;
import org.schema.model.Duration;
import org.schema.model.DefinedTerm;
import org.schema.model.CategoryCode;

/**
 * A program offered by an institution which determines the learning progress to achieve an outcome, usually a credential like a degree or certificate. This would define a discrete set of opportunities (e.g., job, courses) that together constitute a program with a clear start, end, set of requirements, and transition to a new occupational opportunity (e.g., a job), or sometimes a higher educational opportunity (e.g., an advanced degree).
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
 * @see <a href="https://schema.org/EducationalOccupationalProgram">https://schema.org/EducationalOccupationalProgram</a>
 */
public interface EducationalOccupationalProgram extends Intangible {

    /**
     * Prerequisites for enrolling in the program.
     *
     * @return {@link AlignmentObject} or {@link Course} or {@link EducationalOccupationalCredential} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    <T> T getProgramPrerequisites();

    /**
     * Prerequisites for enrolling in the program.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setProgramPrerequisites(Object fProgramPrerequisites);

    /**
     * A course or class that is one of the learning opportunities that constitute an educational / occupational program. No information is implied about whether the course is mandatory or optional; no guarantee is implied about whether the course will be available to everyone on the program.
     *
     * @return {@link Course}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2483">https://github.com/schemaorg/schemaorg/issues/2483</a>
     */
    Course getHasCourse();

    /**
     * A course or class that is one of the learning opportunities that constitute an educational / occupational program. No information is implied about whether the course is mandatory or optional; no guarantee is implied about whether the course will be available to everyone on the program.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2483">https://github.com/schemaorg/schemaorg/issues/2483</a>
     */
    void setHasCourse(Course fHasCourse);

    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @return {@link DateTime} or {@link Date}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    <T> T getStartDate();

    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void setStartDate(Object fStartDate);

    /**
     * The expected salary upon completing the training.
     *
     * @return {@link MonetaryAmountDistribution}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    MonetaryAmountDistribution getSalaryUponCompletion();

    /**
     * The expected salary upon completing the training.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setSalaryUponCompletion(MonetaryAmountDistribution fSalaryUponCompletion);

    /**
     * The number of times terms of study are offered per year. Semesters and quarters are common units for term. For example, if the student can only take 2 semesters for the program in one year, then termsPerYear should be 2.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    Number getTermsPerYear();

    /**
     * The number of times terms of study are offered per year. Semesters and quarters are common units for term. For example, if the student can only take 2 semesters for the program in one year, then termsPerYear should be 2.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    void setTermsPerYear(Number fTermsPerYear);

    /**
     * The day of the week for which these opening hours are valid.
     *
     * @return {@link DayOfWeek}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    DayOfWeek getDayOfWeek();

    /**
     * The day of the week for which these opening hours are valid.
     *
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsTerms</a>
     */
    void setDayOfWeek(DayOfWeek fDayOfWeek);

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @return {@link Offer} or {@link Demand}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    <T> T getOffers();

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     *       
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setOffers(Object fOffers);

    /**
     * The number of credits or units a full-time student would be expected to take in 1 term however 'term' is defined by the institution.
     *
     * @return {@link Integer} or {@link StructuredValue}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    <T> T getTypicalCreditsPerTerm();

    /**
     * The number of credits or units a full-time student would be expected to take in 1 term however 'term' is defined by the institution.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    void setTypicalCreditsPerTerm(Object fTypicalCreditsPerTerm);

    /**
     * The date at which the program begins collecting applications for the next enrollment cycle.
     *
     * @return {@link Date}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    Date getApplicationStartDate();

    /**
     * The date at which the program begins collecting applications for the next enrollment cycle.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    void setApplicationStartDate(Date fApplicationStartDate);

    /**
     * The time of day the program normally runs. For example, "evenings".
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    Text getTimeOfDay();

    /**
     * The time of day the program normally runs. For example, "evenings".
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    void setTimeOfDay(Text fTimeOfDay);

    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @return {@link Date} or {@link DateTime}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    <T> T getEndDate();

    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2486">https://github.com/schemaorg/schemaorg/issues/2486</a>
     */
    void setEndDate(Object fEndDate);

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @return {@link Organization} or {@link Person}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    <T> T getProvider();

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2927">https://github.com/schemaorg/schemaorg/issues/2927</a>
     */
    void setProvider(Object fProvider);

    /**
     * The estimated salary earned while in the program.
     *
     * @return {@link MonetaryAmountDistribution}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     */
    MonetaryAmountDistribution getTrainingSalary();

    /**
     * The estimated salary earned while in the program.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     */
    void setTrainingSalary(MonetaryAmountDistribution fTrainingSalary);

    /**
     * A description of the qualification, award, certificate, diploma or other educational credential awarded as a consequence of successful completion of this course or program.
     *
     * @return {@link URL} or {@link EducationalOccupationalCredential} or {@link Text}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    <T> T getEducationalCredentialAwarded();

    /**
     * A description of the qualification, award, certificate, diploma or other educational credential awarded as a consequence of successful completion of this course or program.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setEducationalCredentialAwarded(Object fEducationalCredentialAwarded);

    /**
     * The number of credits or units awarded by a Course or required to complete an EducationalOccupationalProgram.
     *
     * @return {@link Integer} or {@link StructuredValue}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    <T> T getNumberOfCredits();

    /**
     * The number of credits or units awarded by a Course or required to complete an EducationalOccupationalProgram.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    void setNumberOfCredits(Object fNumberOfCredits);

    /**
     * The expected length of time to complete the program if attending full-time.
     *
     * @return {@link Duration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    Duration getTimeToComplete();

    /**
     * The expected length of time to complete the program if attending full-time.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setTimeToComplete(Duration fTimeToComplete);

    /**
     * A description of the qualification, award, certificate, diploma or other occupational credential awarded as a consequence of successful completion of this course or program.
     *
     * @return {@link EducationalOccupationalCredential} or {@link Text} or {@link URL}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    <T> T getOccupationalCredentialAwarded();

    /**
     * A description of the qualification, award, certificate, diploma or other occupational credential awarded as a consequence of successful completion of this course or program.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setOccupationalCredentialAwarded(Object fOccupationalCredentialAwarded);

    /**
     * The amount of time in a term as defined by the institution. A term is a length of time where students take one or more classes. Semesters and quarters are common units for term.
     *
     * @return {@link Duration}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    Duration getTermDuration();

    /**
     * The amount of time in a term as defined by the institution. A term is a length of time where students take one or more classes. Semesters and quarters are common units for term.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    void setTermDuration(Duration fTermDuration);

    /**
     * Similar to courseMode, The medium or means of delivery of the program as a whole. The value may either be a text label (e.g. "online", "onsite" or "blended"; "synchronous" or "asynchronous"; "full-time" or "part-time") or a URL reference to a term from a controlled vocabulary (e.g. https://ceds.ed.gov/element/001311#Asynchronous ).
     *
     * @return {@link URL} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    <T> T getEducationalProgramMode();

    /**
     * Similar to courseMode, The medium or means of delivery of the program as a whole. The value may either be a text label (e.g. "online", "onsite" or "blended"; "synchronous" or "asynchronous"; "full-time" or "part-time") or a URL reference to a term from a controlled vocabulary (e.g. https://ceds.ed.gov/element/001311#Asynchronous ).
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    void setEducationalProgramMode(Object fEducationalProgramMode);

    /**
     * The type of educational or occupational program. For example, classroom, internship, alternance, etc..
     *
     * @return {@link Text} or {@link DefinedTerm}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     */
    <T> T getProgramType();

    /**
     * The type of educational or occupational program. For example, classroom, internship, alternance, etc..
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     */
    void setProgramType(Object fProgramType);

    /**
     * The maximum number of students who may be enrolled in the program.
     *
     * @return {@link Integer}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    Integer getMaximumEnrollment();

    /**
     * The maximum number of students who may be enrolled in the program.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    void setMaximumEnrollment(Integer fMaximumEnrollment);

    /**
     * A financial aid type or program which students may use to pay for tuition or fees associated with the program.
     *
     * @return {@link Text} or {@link DefinedTerm}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2418">https://github.com/schemaorg/schemaorg/issues/2418</a>
     */
    <T> T getFinancialAidEligible();

    /**
     * A financial aid type or program which students may use to pay for tuition or fees associated with the program.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2418">https://github.com/schemaorg/schemaorg/issues/2418</a>
     */
    void setFinancialAidEligible(Object fFinancialAidEligible);

    /**
     * The date at which the program stops collecting applications for the next enrollment cycle.
     *
     * @return {@link Date}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    Date getApplicationDeadline();

    /**
     * The date at which the program stops collecting applications for the next enrollment cycle.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    void setApplicationDeadline(Date fApplicationDeadline);

    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.<br/>
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     *
     * @return {@link CategoryCode} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2192">https://github.com/schemaorg/schemaorg/issues/2192</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    <T> T getOccupationalCategory();

    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.<br/>
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2460">https://github.com/schemaorg/schemaorg/issues/2460</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2192">https://github.com/schemaorg/schemaorg/issues/2192</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1698">https://github.com/schemaorg/schemaorg/issues/1698</a>
     */
    void setOccupationalCategory(Object fOccupationalCategory);
}
