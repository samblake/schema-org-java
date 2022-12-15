/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.datatype;

import com.weedow.schemaorg.commons.model.JsonLdTypeName;

/**
 * Boolean: True or False.
 *
 * @see <a href="https://schema.org/Boolean">https://schema.org/Boolean</a>
 */
@JsonLdTypeName("Boolean")
public class Boolean extends DataType<java.lang.Boolean> {

    Boolean(java.lang.Boolean value) {
        super(value);
    }

    public static Boolean of(java.lang.Boolean value) {
        return new Boolean(value);
    }

}
