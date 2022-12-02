/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.SoftwareApplication;
import org.schema.model.datatype.Text;
import org.schema.model.datatype.URL;
import org.schema.model.DigitalPlatformEnumeration;

/**
 * An entry point, within some Web-based protocol.
 *
 * @see <a href="http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_ActionCollabClass">http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_ActionCollabClass</a>
 * @see <a href="https://schema.org/EntryPoint">https://schema.org/EntryPoint</a>
 */
public interface EntryPoint extends Intangible {

    /**
     * An application that can complete the request.
     *
     * @return {@link SoftwareApplication}
     */
    SoftwareApplication getActionApplication();

    /**
     * An application that can complete the request.
     *
     * @param fActionApplication SoftwareApplication value to set.
     */
    void setActionApplication(SoftwareApplication fActionApplication);

    /**
     * An application that can complete the request.
     *
     * @return {@link SoftwareApplication}
     */
    SoftwareApplication getApplication();

    /**
     * An application that can complete the request.
     *
     * @param fApplication SoftwareApplication value to set.
     */
    void setApplication(SoftwareApplication fApplication);

    /**
     * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
     *
     * @return {@link Text} or {@link URL} or {@link DigitalPlatformEnumeration}
     */
    <T> T getActionPlatform();

    /**
     * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
     *
     * @param fActionPlatform Text value to set.
     */
    void setActionPlatform(Text fActionPlatform);
    /**
     * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
     *
     * @param fActionPlatform java.lang.String value to set.
     */
    void setActionPlatform(java.lang.String fActionPlatform);
    /**
     * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
     *
     * @param fActionPlatform URL value to set.
     */
    void setActionPlatform(URL fActionPlatform);
    /**
     * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
     *
     * @param fActionPlatform java.net.URL value to set.
     */
    void setActionPlatform(java.net.URL fActionPlatform);
    /**
     * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
     *
     * @param fActionPlatform DigitalPlatformEnumeration value to set.
     */
    void setActionPlatform(DigitalPlatformEnumeration fActionPlatform);

    /**
     * An HTTP method that specifies the appropriate HTTP method for a request to an HTTP EntryPoint. Values are capitalized strings as used in HTTP.
     *
     * @return {@link Text}
     */
    Text getHttpMethod();

    /**
     * An HTTP method that specifies the appropriate HTTP method for a request to an HTTP EntryPoint. Values are capitalized strings as used in HTTP.
     *
     * @param fHttpMethod Text value to set.
     */
    void setHttpMethod(Text fHttpMethod);
    /**
     * An HTTP method that specifies the appropriate HTTP method for a request to an HTTP EntryPoint. Values are capitalized strings as used in HTTP.
     *
     * @param fHttpMethod java.lang.String value to set.
     */
    void setHttpMethod(java.lang.String fHttpMethod);

    /**
     * An url template (RFC6570) that will be used to construct the target of the execution of the action.
     *
     * @return {@link Text}
     */
    Text getUrlTemplate();

    /**
     * An url template (RFC6570) that will be used to construct the target of the execution of the action.
     *
     * @param fUrlTemplate Text value to set.
     */
    void setUrlTemplate(Text fUrlTemplate);
    /**
     * An url template (RFC6570) that will be used to construct the target of the execution of the action.
     *
     * @param fUrlTemplate java.lang.String value to set.
     */
    void setUrlTemplate(java.lang.String fUrlTemplate);

    /**
     * The supported encoding type(s) for an EntryPoint request.
     *
     * @return {@link Text}
     */
    Text getEncodingType();

    /**
     * The supported encoding type(s) for an EntryPoint request.
     *
     * @param fEncodingType Text value to set.
     */
    void setEncodingType(Text fEncodingType);
    /**
     * The supported encoding type(s) for an EntryPoint request.
     *
     * @param fEncodingType java.lang.String value to set.
     */
    void setEncodingType(java.lang.String fEncodingType);

    /**
     * The supported content type(s) for an EntryPoint response.
     *
     * @return {@link Text}
     */
    Text getContentType();

    /**
     * The supported content type(s) for an EntryPoint response.
     *
     * @param fContentType Text value to set.
     */
    void setContentType(Text fContentType);
    /**
     * The supported content type(s) for an EntryPoint response.
     *
     * @param fContentType java.lang.String value to set.
     */
    void setContentType(java.lang.String fContentType);
}
