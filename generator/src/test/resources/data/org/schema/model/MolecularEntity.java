/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import java.util.List;
import org.schema.model.DefinedTerm;
import org.schema.model.datatype.Text;
import org.schema.model.QuantitativeValue;

/**
 * Any constitutionally or isotopically distinct atom, molecule, ion, ion pair, radical, radical ion, complex, conformer etc., identifiable as a separately distinguishable entity.
 *
 * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
 * @see <a href="https://schema.org/MolecularEntity">https://schema.org/MolecularEntity</a>
 */
public interface MolecularEntity extends BioChemEntity {

    /**
     * A role played by the BioChemEntity within a chemical context.
     *
     * @return {@link DefinedTerm}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    List<DefinedTerm> getChemicalRoleList();

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
     * @param chemicalRole DefinedTerm value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addChemicalRole(DefinedTerm chemicalRole);

    /**
     * A specification in form of a line notation for describing the structure of chemical species using short ASCII strings.  Double bond stereochemistry \ indicators may need to be escaped in the string in formats where the backslash is an escape character.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://schema.org/hasRepresentation">https://schema.org/hasRepresentation</a> <i>smiles</i> is a sub property of <i>hasRepresentation</i>
     */
    List<Text> getSmilesList();

    /**
     * A specification in form of a line notation for describing the structure of chemical species using short ASCII strings.  Double bond stereochemistry \ indicators may need to be escaped in the string in formats where the backslash is an escape character.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://schema.org/hasRepresentation">https://schema.org/hasRepresentation</a> <i>smiles</i> is a sub property of <i>hasRepresentation</i>
     */
    Text getSmiles();

    /**
     * A specification in form of a line notation for describing the structure of chemical species using short ASCII strings.  Double bond stereochemistry \ indicators may need to be escaped in the string in formats where the backslash is an escape character.
     *
     * @param smiles Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://schema.org/hasRepresentation">https://schema.org/hasRepresentation</a> <i>smiles</i> is a sub property of <i>hasRepresentation</i>
     */
    void addSmiles(Text smiles);

    /**
     * Intended use of the BioChemEntity by humans.
     *
     * @return {@link DefinedTerm}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    List<DefinedTerm> getPotentialUseList();

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
     * @param potentialUse DefinedTerm value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addPotentialUse(DefinedTerm potentialUse);

    /**
     * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units in the form '&lt;Number&gt; &lt;unit&gt;', for example '770.230488 g/mol' or as '&lt;QuantitativeValue&gt;.
     *
     * @return {@link Text} or {@link QuantitativeValue}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    <T> List<T> getMonoisotopicMolecularWeightList();

    /**
     * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units in the form '&lt;Number&gt; &lt;unit&gt;', for example '770.230488 g/mol' or as '&lt;QuantitativeValue&gt;.
     *
     * @return {@link Text} or {@link QuantitativeValue}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    <T> T getMonoisotopicMolecularWeight();

    /**
     * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units in the form '&lt;Number&gt; &lt;unit&gt;', for example '770.230488 g/mol' or as '&lt;QuantitativeValue&gt;.
     *
     * @param monoisotopicMolecularWeight Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addMonoisotopicMolecularWeight(Text monoisotopicMolecularWeight);
    /**
     * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units in the form '&lt;Number&gt; &lt;unit&gt;', for example '770.230488 g/mol' or as '&lt;QuantitativeValue&gt;.
     *
     * @param monoisotopicMolecularWeight QuantitativeValue value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addMonoisotopicMolecularWeight(QuantitativeValue monoisotopicMolecularWeight);

    /**
     * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&lt;Number&gt; &lt;unit&gt;', for example '12 amu' or as '&lt;QuantitativeValue&gt;.
     *
     * @return {@link QuantitativeValue} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    <T> List<T> getMolecularWeightList();

    /**
     * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&lt;Number&gt; &lt;unit&gt;', for example '12 amu' or as '&lt;QuantitativeValue&gt;.
     *
     * @return {@link QuantitativeValue} or {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    <T> T getMolecularWeight();

    /**
     * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&lt;Number&gt; &lt;unit&gt;', for example '12 amu' or as '&lt;QuantitativeValue&gt;.
     *
     * @param molecularWeight QuantitativeValue value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addMolecularWeight(QuantitativeValue molecularWeight);
    /**
     * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&lt;Number&gt; &lt;unit&gt;', for example '12 amu' or as '&lt;QuantitativeValue&gt;.
     *
     * @param molecularWeight Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addMolecularWeight(Text molecularWeight);

    /**
     * InChIKey is a hashed version of the full InChI (using the SHA-256 algorithm).
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://schema.org/hasRepresentation">https://schema.org/hasRepresentation</a> <i>inChIKey</i> is a sub property of <i>hasRepresentation</i>
     */
    List<Text> getInChIKeyList();

    /**
     * InChIKey is a hashed version of the full InChI (using the SHA-256 algorithm).
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://schema.org/hasRepresentation">https://schema.org/hasRepresentation</a> <i>inChIKey</i> is a sub property of <i>hasRepresentation</i>
     */
    Text getInChIKey();

    /**
     * InChIKey is a hashed version of the full InChI (using the SHA-256 algorithm).
     *
     * @param inChIKey Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://schema.org/hasRepresentation">https://schema.org/hasRepresentation</a> <i>inChIKey</i> is a sub property of <i>hasRepresentation</i>
     */
    void addInChIKey(Text inChIKey);

    /**
     * Systematic method of naming chemical compounds as recommended by the International Union of Pure and Applied Chemistry (IUPAC).
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    List<Text> getIupacNameList();

    /**
     * Systematic method of naming chemical compounds as recommended by the International Union of Pure and Applied Chemistry (IUPAC).
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    Text getIupacName();

    /**
     * Systematic method of naming chemical compounds as recommended by the International Union of Pure and Applied Chemistry (IUPAC).
     *
     * @param iupacName Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addIupacName(Text iupacName);

    /**
     * The empirical formula is the simplest whole number ratio of all the atoms in a molecule.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    List<Text> getMolecularFormulaList();

    /**
     * The empirical formula is the simplest whole number ratio of all the atoms in a molecule.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    Text getMolecularFormula();

    /**
     * The empirical formula is the simplest whole number ratio of all the atoms in a molecule.
     *
     * @param molecularFormula Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     */
    void addMolecularFormula(Text molecularFormula);

    /**
     * Non-proprietary identifier for molecular entity that can be used in printed and electronic data sources thus enabling easier linking of diverse data compilations.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://schema.org/hasRepresentation">https://schema.org/hasRepresentation</a> <i>inChI</i> is a sub property of <i>hasRepresentation</i>
     */
    List<Text> getInChIList();

    /**
     * Non-proprietary identifier for molecular entity that can be used in printed and electronic data sources thus enabling easier linking of diverse data compilations.
     *
     * @return {@link Text}
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://schema.org/hasRepresentation">https://schema.org/hasRepresentation</a> <i>inChI</i> is a sub property of <i>hasRepresentation</i>
     */
    Text getInChI();

    /**
     * Non-proprietary identifier for molecular entity that can be used in printed and electronic data sources thus enabling easier linking of diverse data compilations.
     *
     * @param inChI Text value to set.
     * @see <a href="https://pending.schema.org">https://pending.schema.org</a>
     * @see <a href="https://schema.org/hasRepresentation">https://schema.org/hasRepresentation</a> <i>inChI</i> is a sub property of <i>hasRepresentation</i>
     */
    void addInChI(Text inChI);
}
