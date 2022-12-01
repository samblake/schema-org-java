/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model.impl;

import org.schema.model.Mass;
import org.schema.model.datatype.Text;
import org.schema.model.Energy;
import org.schema.model.CreativeWork;
import org.schema.model.datatype.URL;
import org.schema.model.Action;
import org.schema.model.ImageObject;
import org.schema.model.Event;
import org.schema.model.PropertyValue;
import org.schema.model.Thing;
import com.weedow.schemaorg.commons.model.JsonLdTypeName;
import org.schema.model.Intangible;
import org.schema.model.StructuredValue;
import org.schema.model.NutritionInformation;

/**
 * Nutritional information about the recipe.
 *
 * @see <a href="https://schema.org/NutritionInformation">https://schema.org/NutritionInformation</a>
 */
@JsonLdTypeName("NutritionInformation")
public class NutritionInformationImpl extends com.weedow.schemaorg.commons.model.JsonLdNodeImpl implements NutritionInformation {

    private Mass fFatContent;

    /**
     * The number of grams of fat.
     *
     * @return {@link Mass}
     */
    @Override
    public Mass getFatContent() {
        return fFatContent;
    }

    /**
     * The number of grams of fat.
     *
     */
    @Override
    public void setFatContent(Mass fFatContent) {
        this.fFatContent = fFatContent;
    }

    private Text fServingSize;

    /**
     * The serving size, in terms of the number of volume or mass.
     *
     * @return {@link Text}
     */
    @Override
    public Text getServingSize() {
        return fServingSize;
    }

    /**
     * The serving size, in terms of the number of volume or mass.
     *
     */
    @Override
    public void setServingSize(Text fServingSize) {
        this.fServingSize = fServingSize;
    }

    private Mass fProteinContent;

    /**
     * The number of grams of protein.
     *
     * @return {@link Mass}
     */
    @Override
    public Mass getProteinContent() {
        return fProteinContent;
    }

    /**
     * The number of grams of protein.
     *
     */
    @Override
    public void setProteinContent(Mass fProteinContent) {
        this.fProteinContent = fProteinContent;
    }

    private Energy fCalories;

    /**
     * The number of calories.
     *
     * @return {@link Energy}
     */
    @Override
    public Energy getCalories() {
        return fCalories;
    }

    /**
     * The number of calories.
     *
     */
    @Override
    public void setCalories(Energy fCalories) {
        this.fCalories = fCalories;
    }

    private Mass fSodiumContent;

    /**
     * The number of milligrams of sodium.
     *
     * @return {@link Mass}
     */
    @Override
    public Mass getSodiumContent() {
        return fSodiumContent;
    }

    /**
     * The number of milligrams of sodium.
     *
     */
    @Override
    public void setSodiumContent(Mass fSodiumContent) {
        this.fSodiumContent = fSodiumContent;
    }

    private Mass fCholesterolContent;

    /**
     * The number of milligrams of cholesterol.
     *
     * @return {@link Mass}
     */
    @Override
    public Mass getCholesterolContent() {
        return fCholesterolContent;
    }

    /**
     * The number of milligrams of cholesterol.
     *
     */
    @Override
    public void setCholesterolContent(Mass fCholesterolContent) {
        this.fCholesterolContent = fCholesterolContent;
    }

    private Mass fSugarContent;

    /**
     * The number of grams of sugar.
     *
     * @return {@link Mass}
     */
    @Override
    public Mass getSugarContent() {
        return fSugarContent;
    }

    /**
     * The number of grams of sugar.
     *
     */
    @Override
    public void setSugarContent(Mass fSugarContent) {
        this.fSugarContent = fSugarContent;
    }

    private Mass fCarbohydrateContent;

    /**
     * The number of grams of carbohydrates.
     *
     * @return {@link Mass}
     */
    @Override
    public Mass getCarbohydrateContent() {
        return fCarbohydrateContent;
    }

    /**
     * The number of grams of carbohydrates.
     *
     */
    @Override
    public void setCarbohydrateContent(Mass fCarbohydrateContent) {
        this.fCarbohydrateContent = fCarbohydrateContent;
    }

    private Mass fTransFatContent;

    /**
     * The number of grams of trans fat.
     *
     * @return {@link Mass}
     */
    @Override
    public Mass getTransFatContent() {
        return fTransFatContent;
    }

    /**
     * The number of grams of trans fat.
     *
     */
    @Override
    public void setTransFatContent(Mass fTransFatContent) {
        this.fTransFatContent = fTransFatContent;
    }

    private Mass fFiberContent;

    /**
     * The number of grams of fiber.
     *
     * @return {@link Mass}
     */
    @Override
    public Mass getFiberContent() {
        return fFiberContent;
    }

    /**
     * The number of grams of fiber.
     *
     */
    @Override
    public void setFiberContent(Mass fFiberContent) {
        this.fFiberContent = fFiberContent;
    }

    private Mass fUnsaturatedFatContent;

    /**
     * The number of grams of unsaturated fat.
     *
     * @return {@link Mass}
     */
    @Override
    public Mass getUnsaturatedFatContent() {
        return fUnsaturatedFatContent;
    }

    /**
     * The number of grams of unsaturated fat.
     *
     */
    @Override
    public void setUnsaturatedFatContent(Mass fUnsaturatedFatContent) {
        this.fUnsaturatedFatContent = fUnsaturatedFatContent;
    }

    private Mass fSaturatedFatContent;

    /**
     * The number of grams of saturated fat.
     *
     * @return {@link Mass}
     */
    @Override
    public Mass getSaturatedFatContent() {
        return fSaturatedFatContent;
    }

    /**
     * The number of grams of saturated fat.
     *
     */
    @Override
    public void setSaturatedFatContent(Mass fSaturatedFatContent) {
        this.fSaturatedFatContent = fSaturatedFatContent;
    }

    private Object fMainEntityOfPage;

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     * @return {@link CreativeWork} or {@link URL}
     */
    @Override
    public <T> T getMainEntityOfPage() {
        return (T) fMainEntityOfPage;
    }

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     *
     */
    @Override
    public void setMainEntityOfPage(Object fMainEntityOfPage) {
        if(!(fMainEntityOfPage instanceof CreativeWork) && !(fMainEntityOfPage instanceof URL)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'mainEntityOfPage': " + fMainEntityOfPage);
        }
        this.fMainEntityOfPage = fMainEntityOfPage;
    }

    private Text fAlternateName;

    /**
     * An alias for the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getAlternateName() {
        return fAlternateName;
    }

    /**
     * An alias for the item.
     *
     */
    @Override
    public void setAlternateName(Text fAlternateName) {
        this.fAlternateName = fAlternateName;
    }

    private Text fName;

    /**
     * The name of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getName() {
        return fName;
    }

    /**
     * The name of the item.
     *
     */
    @Override
    public void setName(Text fName) {
        this.fName = fName;
    }

    private Action fPotentialAction;

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     * @return {@link Action}
     */
    @Override
    public Action getPotentialAction() {
        return fPotentialAction;
    }

    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     *
     */
    @Override
    public void setPotentialAction(Action fPotentialAction) {
        this.fPotentialAction = fPotentialAction;
    }

    private Object fImage;

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     * @return {@link URL} or {@link ImageObject}
     */
    @Override
    public <T> T getImage() {
        return (T) fImage;
    }

    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     *
     */
    @Override
    public void setImage(Object fImage) {
        if(!(fImage instanceof URL) && !(fImage instanceof ImageObject)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'image': " + fImage);
        }
        this.fImage = fImage;
    }

    private URL fUrl;

    /**
     * URL of the item.
     *
     * @return {@link URL}
     */
    @Override
    public URL getUrl() {
        return fUrl;
    }

    /**
     * URL of the item.
     *
     */
    @Override
    public void setUrl(URL fUrl) {
        this.fUrl = fUrl;
    }

    private Text fDescription;

    /**
     * A description of the item.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDescription() {
        return fDescription;
    }

    /**
     * A description of the item.
     *
     */
    @Override
    public void setDescription(Text fDescription) {
        this.fDescription = fDescription;
    }

    private Object fSubjectOf;

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @return {@link Event} or {@link CreativeWork}
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public <T> T getSubjectOf() {
        return (T) fSubjectOf;
    }

    /**
     * A CreativeWork or Event about this Thing.
     *
     * @see <a href="https://github.com/schemaorg/schemaorg/issues/1670">https://github.com/schemaorg/schemaorg/issues/1670</a>
     */
    @Override
    public void setSubjectOf(Object fSubjectOf) {
        if(!(fSubjectOf instanceof Event) && !(fSubjectOf instanceof CreativeWork)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'subjectOf': " + fSubjectOf);
        }
        this.fSubjectOf = fSubjectOf;
    }

    private URL fAdditionalType;

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     * @return {@link URL}
     */
    @Override
    public URL getAdditionalType() {
        return fAdditionalType;
    }

    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     *
     */
    @Override
    public void setAdditionalType(URL fAdditionalType) {
        this.fAdditionalType = fAdditionalType;
    }

    private Text fDisambiguatingDescription;

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     * @return {@link Text}
     */
    @Override
    public Text getDisambiguatingDescription() {
        return fDisambiguatingDescription;
    }

    /**
     * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
     *
     */
    @Override
    public void setDisambiguatingDescription(Text fDisambiguatingDescription) {
        this.fDisambiguatingDescription = fDisambiguatingDescription;
    }

    private URL fSameAs;

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     * @return {@link URL}
     */
    @Override
    public URL getSameAs() {
        return fSameAs;
    }

    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     *
     */
    @Override
    public void setSameAs(URL fSameAs) {
        this.fSameAs = fSameAs;
    }

    private Object fIdentifier;

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     * @return {@link URL} or {@link Text} or {@link PropertyValue}
     */
    @Override
    public <T> T getIdentifier() {
        return (T) fIdentifier;
    }

    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     *
     */
    @Override
    public void setIdentifier(Object fIdentifier) {
        if(!(fIdentifier instanceof URL) && !(fIdentifier instanceof Text) && !(fIdentifier instanceof PropertyValue)) {
            throw new java.lang.IllegalArgumentException("Invalid value for property 'identifier': " + fIdentifier);
        }
        this.fIdentifier = fIdentifier;
    }
}
