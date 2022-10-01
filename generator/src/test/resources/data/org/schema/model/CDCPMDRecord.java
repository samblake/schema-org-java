/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Number;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.DateTime;
import org.schema.model.datatype.Date;

/**
 * A CDCPMDRecord is a data structure representing a record in a CDC tabular data format
 *       used for hospital data reporting. See [documentation](/docs/cdc-covid.html) for details, and the linked CDC materials for authoritative
 *       definitions used as the source here.
 *       
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
 * @see <a href="https://schema.org/CDCPMDRecord">https://schema.org/CDCPMDRecord</a>
 */
public interface CDCPMDRecord extends StructuredValue {

    /**
     * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    Number getCvdNumBedsOcc();

    /**
     * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdNumBedsOcc(Number fCvdNumBedsOcc);

    /**
     * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    Number getCvdNumICUBedsOcc();

    /**
     * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdNumICUBedsOcc(Number fCvdNumICUBedsOcc);

    /**
     * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    Number getCvdNumVent();

    /**
     * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdNumVent(Number fCvdNumVent);

    /**
     * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    Number getCvdNumC19Died();

    /**
     * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdNumC19Died(Number fCvdNumC19Died);

    /**
     * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    Number getCvdNumTotBeds();

    /**
     * numtotbeds - ALL HOSPITAL BEDS: Total number of all Inpatient and outpatient beds, including all staffed,ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdNumTotBeds(Number fCvdNumTotBeds);

    /**
     * Name of the County of the NHSN facility that this data record applies to. Use [[cvdFacilityId]] to identify the facility. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    Text getCvdFacilityCounty();

    /**
     * Name of the County of the NHSN facility that this data record applies to. Use [[cvdFacilityId]] to identify the facility. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdFacilityCounty(Text fCvdFacilityCounty);

    /**
     * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    Number getCvdNumICUBeds();

    /**
     * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdNumICUBeds(Number fCvdNumICUBeds);

    /**
     * collectiondate - Date for which patient counts are reported.
     *
     * @return {@link DateTime} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    <T> T getCvdCollectionDate();

    /**
     * collectiondate - Date for which patient counts are reported.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdCollectionDate(Object fCvdCollectionDate);

    /**
     * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    Number getCvdNumC19HOPats();

    /**
     * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdNumC19HOPats(Number fCvdNumC19HOPats);

    /**
     * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    Number getCvdNumC19OFMechVentPats();

    /**
     * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdNumC19OFMechVentPats(Number fCvdNumC19OFMechVentPats);

    /**
     * Identifier of the NHSN facility that this data record applies to. Use [[cvdFacilityCounty]] to indicate the county. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    Text getCvdFacilityId();

    /**
     * Identifier of the NHSN facility that this data record applies to. Use [[cvdFacilityCounty]] to indicate the county. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdFacilityId(Text fCvdFacilityId);

    /**
     * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    Number getCvdNumVentUse();

    /**
     * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdNumVentUse(Number fCvdNumVentUse);

    /**
     * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    Number getCvdNumBeds();

    /**
     * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdNumBeds(Number fCvdNumBeds);

    /**
     * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    Number getCvdNumC19MechVentPats();

    /**
     * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdNumC19MechVentPats(Number fCvdNumC19MechVentPats);

    /**
     * Publication date of an online listing.
     *
     * @return {@link Date} or {@link DateTime}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    <T> T getDatePosted();

    /**
     * Publication date of an online listing.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2490">https://github.com/schemaorg/schemaorg/issues/2490</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setDatePosted(Object fDatePosted);

    /**
     * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    Number getCvdNumC19OverflowPats();

    /**
     * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdNumC19OverflowPats(Number fCvdNumC19OverflowPats);

    /**
     * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
     *
     * @return {@link Number}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    Number getCvdNumC19HospPats();

    /**
     * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/2521">https://github.com/schemaorg/schemaorg/issues/2521</a>
     */
    void setCvdNumC19HospPats(Number fCvdNumC19HospPats);
}
