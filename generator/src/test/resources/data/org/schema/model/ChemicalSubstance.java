/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;
import org.schema.model.DefinedTerm;

/**
 * A chemical substance is 'a portion of matter of constant composition, composed of molecular entities of the same type or of different types' (source: [ChEBI:59999](https://www.ebi.ac.uk/chebi/searchId.do?chebiId=59999)).
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://schema.org/ChemicalSubstance">https://schema.org/ChemicalSubstance</a>
 */
public interface ChemicalSubstance extends BioChemEntity {

    /**
     * The chemical composition describes the identity and relative ratio of the chemical elements that make up the substance.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    Text getChemicalComposition();

    /**
     * The chemical composition describes the identity and relative ratio of the chemical elements that make up the substance.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void setChemicalComposition(Text fChemicalComposition);

    /**
     * Intended use of the BioChemEntity by humans.
     *
     * @return {@link DefinedTerm}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    DefinedTerm getPotentialUse();

    /**
     * Intended use of the BioChemEntity by humans.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void setPotentialUse(DefinedTerm fPotentialUse);

    /**
     * A role played by the BioChemEntity within a chemical context.
     *
     * @return {@link DefinedTerm}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    DefinedTerm getChemicalRole();

    /**
     * A role played by the BioChemEntity within a chemical context.
     *
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void setChemicalRole(DefinedTerm fChemicalRole);
}
