/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.Thing;

/**
 * The act of managing by changing/editing the state of the object.
 *
 * @see <a href="https://schema.org/UpdateAction">https://schema.org/UpdateAction</a>
 */
public interface UpdateAction extends Action {

    /**
     * A sub property of object. The collection target of the action.
     *
     * @return {@link Thing}
     */
    Thing getTargetCollection();

    /**
     * A sub property of object. The collection target of the action.
     *
     * @param targetCollection Thing value to set.
     */
    void setTargetCollection(Thing targetCollection);

    /**
     * A sub property of object. The collection target of the action.
     *
     * @return {@link Thing}
     */
    Thing getCollection();

    /**
     * A sub property of object. The collection target of the action.
     *
     * @param collection Thing value to set.
     */
    void setCollection(Thing collection);
}
