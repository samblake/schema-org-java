/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.URL;
import org.schema.model.datatype.Text;

/**
 * Financial services business.
 *
 * @see <a href="https://schema.org/FinancialService">https://schema.org/FinancialService</a>
 */
public interface FinancialService extends LocalBusiness {

    /**
     * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
     *
     * @return {@link URL} or {@link Text}
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    <T> T getFeesAndCommissionsSpecification();

    /**
     * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
     *
     * @param fFeesAndCommissionsSpecification URL value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    void setFeesAndCommissionsSpecification(URL fFeesAndCommissionsSpecification);
    /**
     * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
     *
     * @param fFeesAndCommissionsSpecification java.net.URL value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    void setFeesAndCommissionsSpecification(java.net.URL fFeesAndCommissionsSpecification);
    /**
     * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
     *
     * @param fFeesAndCommissionsSpecification Text value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    void setFeesAndCommissionsSpecification(Text fFeesAndCommissionsSpecification);
    /**
     * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
     *
     * @param fFeesAndCommissionsSpecification java.lang.String value to set.
     * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#FIBO</a>
     */
    void setFeesAndCommissionsSpecification(java.lang.String fFeesAndCommissionsSpecification);
}
