/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.QualitativeValue;
import org.schema.model.datatype.Text;

/**
 * Used to describe a seat, such as a reserved seat in an event reservation.
 *
 * @see <a href="https://schema.org/Seat">https://schema.org/Seat</a>
 */
public interface Seat extends Intangible {

    /**
     * The type/class of the seat.
     *
     * @return {@link QualitativeValue} or {@link Text}
     */
    <T> T getSeatingType();

    /**
     * The type/class of the seat.
     *
     * @param fSeatingType QualitativeValue value to set.
     */
    void setSeatingType(QualitativeValue fSeatingType);
    /**
     * The type/class of the seat.
     *
     * @param fSeatingType Text value to set.
     */
    void setSeatingType(Text fSeatingType);
    /**
     * The type/class of the seat.
     *
     * @param fSeatingType java.lang.String value to set.
     */
    void setSeatingType(java.lang.String fSeatingType);

    /**
     * The section location of the reserved seat (e.g. Orchestra).
     *
     * @return {@link Text}
     */
    Text getSeatSection();

    /**
     * The section location of the reserved seat (e.g. Orchestra).
     *
     * @param fSeatSection Text value to set.
     */
    void setSeatSection(Text fSeatSection);
    /**
     * The section location of the reserved seat (e.g. Orchestra).
     *
     * @param fSeatSection java.lang.String value to set.
     */
    void setSeatSection(java.lang.String fSeatSection);

    /**
     * The row location of the reserved seat (e.g., B).
     *
     * @return {@link Text}
     */
    Text getSeatRow();

    /**
     * The row location of the reserved seat (e.g., B).
     *
     * @param fSeatRow Text value to set.
     */
    void setSeatRow(Text fSeatRow);
    /**
     * The row location of the reserved seat (e.g., B).
     *
     * @param fSeatRow java.lang.String value to set.
     */
    void setSeatRow(java.lang.String fSeatRow);

    /**
     * The location of the reserved seat (e.g., 27).
     *
     * @return {@link Text}
     */
    Text getSeatNumber();

    /**
     * The location of the reserved seat (e.g., 27).
     *
     * @param fSeatNumber Text value to set.
     */
    void setSeatNumber(Text fSeatNumber);
    /**
     * The location of the reserved seat (e.g., 27).
     *
     * @param fSeatNumber java.lang.String value to set.
     */
    void setSeatNumber(java.lang.String fSeatNumber);
}
