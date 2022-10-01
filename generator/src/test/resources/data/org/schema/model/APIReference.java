/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;

/**
 * Reference documentation for application programming interfaces (APIs).
 *
 * @see <a href="https://schema.org/APIReference">https://schema.org/APIReference</a>
 */
public interface APIReference extends TechArticle {

    /**
     * Library file name e.g., mscorlib.dll, system.web.dll.
     *
     * @return {@link Text}
     */
    Text getAssembly();

    /**
     * Library file name e.g., mscorlib.dll, system.web.dll.
     *
     */
    void setAssembly(Text fAssembly);

    /**
     * Type of app development: phone, Metro style, desktop, XBox, etc.
     *
     * @return {@link Text}
     */
    Text getTargetPlatform();

    /**
     * Type of app development: phone, Metro style, desktop, XBox, etc.
     *
     */
    void setTargetPlatform(Text fTargetPlatform);

    /**
     * Library file name e.g., mscorlib.dll, system.web.dll.
     *
     * @return {@link Text}
     */
    Text getExecutableLibraryName();

    /**
     * Library file name e.g., mscorlib.dll, system.web.dll.
     *
     */
    void setExecutableLibraryName(Text fExecutableLibraryName);

    /**
     * Indicates whether API is managed or unmanaged.
     *
     * @return {@link Text}
     */
    Text getProgrammingModel();

    /**
     * Indicates whether API is managed or unmanaged.
     *
     */
    void setProgrammingModel(Text fProgrammingModel);

    /**
     * Associated product/technology version. e.g., .NET Framework 4.5.
     *
     * @return {@link Text}
     */
    Text getAssemblyVersion();

    /**
     * Associated product/technology version. e.g., .NET Framework 4.5.
     *
     */
    void setAssemblyVersion(Text fAssemblyVersion);
}
