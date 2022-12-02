/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;

/**
 * A code for a medical entity.
 *
 * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
 * @see <a href="https://schema.org/MedicalCode">https://schema.org/MedicalCode</a>
 */
public interface MedicalCode extends MedicalIntangible, CategoryCode {

    /**
     * A short textual code that uniquely identifies the value.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     */
    Text getCodeValue();

    /**
     * A short textual code that uniquely identifies the value.
     *
     * @param fCodeValue Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     */
    void setCodeValue(Text fCodeValue);
    /**
     * A short textual code that uniquely identifies the value.
     *
     * @param fCodeValue java.lang.String value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/894">https://github.com/schemaorg/schemaorg/issues/894</a>
     */
    void setCodeValue(java.lang.String fCodeValue);

    /**
     * The coding system, e.g. 'ICD-10'.
     *
     * @return {@link Text}
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    Text getCodingSystem();

    /**
     * The coding system, e.g. 'ICD-10'.
     *
     * @param fCodingSystem Text value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setCodingSystem(Text fCodingSystem);
    /**
     * The coding system, e.g. 'ICD-10'.
     *
     * @param fCodingSystem java.lang.String value to set.
     * @see <a href="https://health-lifesci.schema.org">https://health-lifesci.schema.org</a>
     */
    void setCodingSystem(java.lang.String fCodingSystem);
}
