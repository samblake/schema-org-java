/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;
import org.schema.model.AlignmentObject;
import org.schema.model.Course;
import org.schema.model.datatype.URL;
import org.schema.model.EducationalOccupationalCredential;
import org.schema.model.datatype.Integer;
import org.schema.model.StructuredValue;
import org.schema.model.CourseInstance;

/**
 * A description of an educational course which may be offered as distinct instances at which take place at different times or take place at different locations, or be offered through different media or modes of study. An educational course is a sequence of one or more educational events and/or creative works which aims to build knowledge, competence or ability of learners.
 *
 * @see <a href="https://schema.org/Course">https://schema.org/Course</a>
 */
public interface Course extends LearningResource, CreativeWork {

    /**
     * Requirements for taking the Course. May be completion of another [[Course]] or a textual description like "permission of instructor". Requirements may be a pre-requisite competency, referenced using [[AlignmentObject]].
     *
     * @return {@link Text} or {@link AlignmentObject} or {@link Course}
     */
    <T> T getCoursePrerequisites();

    /**
     * Requirements for taking the Course. May be completion of another [[Course]] or a textual description like "permission of instructor". Requirements may be a pre-requisite competency, referenced using [[AlignmentObject]].
     *
     * @param fCoursePrerequisites Text value to set.
     */
    void setCoursePrerequisites(Text fCoursePrerequisites);
    /**
     * Requirements for taking the Course. May be completion of another [[Course]] or a textual description like "permission of instructor". Requirements may be a pre-requisite competency, referenced using [[AlignmentObject]].
     *
     * @param fCoursePrerequisites java.lang.String value to set.
     */
    void setCoursePrerequisites(java.lang.String fCoursePrerequisites);
    /**
     * Requirements for taking the Course. May be completion of another [[Course]] or a textual description like "permission of instructor". Requirements may be a pre-requisite competency, referenced using [[AlignmentObject]].
     *
     * @param fCoursePrerequisites AlignmentObject value to set.
     */
    void setCoursePrerequisites(AlignmentObject fCoursePrerequisites);
    /**
     * Requirements for taking the Course. May be completion of another [[Course]] or a textual description like "permission of instructor". Requirements may be a pre-requisite competency, referenced using [[AlignmentObject]].
     *
     * @param fCoursePrerequisites Course value to set.
     */
    void setCoursePrerequisites(Course fCoursePrerequisites);

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
     * @param fEducationalCredentialAwarded URL value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setEducationalCredentialAwarded(URL fEducationalCredentialAwarded);
    /**
     * A description of the qualification, award, certificate, diploma or other educational credential awarded as a consequence of successful completion of this course or program.
     *
     * @param fEducationalCredentialAwarded java.net.URL value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setEducationalCredentialAwarded(java.net.URL fEducationalCredentialAwarded);
    /**
     * A description of the qualification, award, certificate, diploma or other educational credential awarded as a consequence of successful completion of this course or program.
     *
     * @param fEducationalCredentialAwarded EducationalOccupationalCredential value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setEducationalCredentialAwarded(EducationalOccupationalCredential fEducationalCredentialAwarded);
    /**
     * A description of the qualification, award, certificate, diploma or other educational credential awarded as a consequence of successful completion of this course or program.
     *
     * @param fEducationalCredentialAwarded Text value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setEducationalCredentialAwarded(Text fEducationalCredentialAwarded);
    /**
     * A description of the qualification, award, certificate, diploma or other educational credential awarded as a consequence of successful completion of this course or program.
     *
     * @param fEducationalCredentialAwarded java.lang.String value to set.
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setEducationalCredentialAwarded(java.lang.String fEducationalCredentialAwarded);

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
     * @param fNumberOfCredits Integer value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    void setNumberOfCredits(Integer fNumberOfCredits);
    /**
     * The number of credits or units awarded by a Course or required to complete an EducationalOccupationalProgram.
     *
     * @param fNumberOfCredits java.lang.Integer value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    void setNumberOfCredits(java.lang.Integer fNumberOfCredits);
    /**
     * The number of credits or units awarded by a Course or required to complete an EducationalOccupationalProgram.
     *
     * @param fNumberOfCredits StructuredValue value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2419">https://github.com/schemaorg/schemaorg/issues/2419</a>
     */
    void setNumberOfCredits(StructuredValue fNumberOfCredits);

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
     * @param fOccupationalCredentialAwarded EducationalOccupationalCredential value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setOccupationalCredentialAwarded(EducationalOccupationalCredential fOccupationalCredentialAwarded);
    /**
     * A description of the qualification, award, certificate, diploma or other occupational credential awarded as a consequence of successful completion of this course or program.
     *
     * @param fOccupationalCredentialAwarded Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setOccupationalCredentialAwarded(Text fOccupationalCredentialAwarded);
    /**
     * A description of the qualification, award, certificate, diploma or other occupational credential awarded as a consequence of successful completion of this course or program.
     *
     * @param fOccupationalCredentialAwarded java.lang.String value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setOccupationalCredentialAwarded(java.lang.String fOccupationalCredentialAwarded);
    /**
     * A description of the qualification, award, certificate, diploma or other occupational credential awarded as a consequence of successful completion of this course or program.
     *
     * @param fOccupationalCredentialAwarded URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setOccupationalCredentialAwarded(URL fOccupationalCredentialAwarded);
    /**
     * A description of the qualification, award, certificate, diploma or other occupational credential awarded as a consequence of successful completion of this course or program.
     *
     * @param fOccupationalCredentialAwarded java.net.URL value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2289">https://github.com/schemaorg/schemaorg/issues/2289</a>
     */
    void setOccupationalCredentialAwarded(java.net.URL fOccupationalCredentialAwarded);

    /**
     * The identifier for the [[Course]] used by the course [[provider]] (e.g. CS101 or 6.001).
     *
     * @return {@link Text}
     */
    Text getCourseCode();

    /**
     * The identifier for the [[Course]] used by the course [[provider]] (e.g. CS101 or 6.001).
     *
     * @param fCourseCode Text value to set.
     */
    void setCourseCode(Text fCourseCode);
    /**
     * The identifier for the [[Course]] used by the course [[provider]] (e.g. CS101 or 6.001).
     *
     * @param fCourseCode java.lang.String value to set.
     */
    void setCourseCode(java.lang.String fCourseCode);

    /**
     * An offering of the course at a specific time and place or through specific media or mode of study or to a specific section of students.
     *
     * @return {@link CourseInstance}
     */
    CourseInstance getHasCourseInstance();

    /**
     * An offering of the course at a specific time and place or through specific media or mode of study or to a specific section of students.
     *
     * @param fHasCourseInstance CourseInstance value to set.
     */
    void setHasCourseInstance(CourseInstance fHasCourseInstance);
}
