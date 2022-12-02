/*
 * This class is auto generated by the schema.org code generator program.
 * https://github.com/Kobee1203/schema-org-java
 * Do not edit the class manually.
 */
package org.schema.model;

import org.schema.model.datatype.Text;
import org.schema.model.CreativeWork;
import org.schema.model.ItemList;
import org.schema.model.RestrictedDiet;
import org.schema.model.NutritionInformation;
import org.schema.model.QuantitativeValue;
import org.schema.model.Duration;

/**
 * A recipe. For dietary restrictions covered by the recipe, a few common restrictions are enumerated via [[suitableForDiet]]. The [[keywords]] property can also be used to add more detail.
 *
 * @see <a href="https://schema.org/Recipe">https://schema.org/Recipe</a>
 */
public interface Recipe extends HowTo {

    /**
     * A step in making the recipe, in the form of a single item (document, video, etc.) or an ordered list with HowToStep and/or HowToSection items.
     *
     * @return {@link Text} or {@link CreativeWork} or {@link ItemList}
     */
    <T> T getRecipeInstructions();

    /**
     * A step in making the recipe, in the form of a single item (document, video, etc.) or an ordered list with HowToStep and/or HowToSection items.
     *
     * @param fRecipeInstructions Text value to set.
     */
    void setRecipeInstructions(Text fRecipeInstructions);
    /**
     * A step in making the recipe, in the form of a single item (document, video, etc.) or an ordered list with HowToStep and/or HowToSection items.
     *
     * @param fRecipeInstructions java.lang.String value to set.
     */
    void setRecipeInstructions(java.lang.String fRecipeInstructions);
    /**
     * A step in making the recipe, in the form of a single item (document, video, etc.) or an ordered list with HowToStep and/or HowToSection items.
     *
     * @param fRecipeInstructions CreativeWork value to set.
     */
    void setRecipeInstructions(CreativeWork fRecipeInstructions);
    /**
     * A step in making the recipe, in the form of a single item (document, video, etc.) or an ordered list with HowToStep and/or HowToSection items.
     *
     * @param fRecipeInstructions ItemList value to set.
     */
    void setRecipeInstructions(ItemList fRecipeInstructions);

    /**
     * A single ingredient used in the recipe, e.g. sugar, flour or garlic.
     *
     * @return {@link Text}
     */
    Text getIngredients();

    /**
     * A single ingredient used in the recipe, e.g. sugar, flour or garlic.
     *
     * @param fIngredients Text value to set.
     */
    void setIngredients(Text fIngredients);
    /**
     * A single ingredient used in the recipe, e.g. sugar, flour or garlic.
     *
     * @param fIngredients java.lang.String value to set.
     */
    void setIngredients(java.lang.String fIngredients);

    /**
     * The cuisine of the recipe (for example, French or Ethiopian).
     *
     * @return {@link Text}
     */
    Text getRecipeCuisine();

    /**
     * The cuisine of the recipe (for example, French or Ethiopian).
     *
     * @param fRecipeCuisine Text value to set.
     */
    void setRecipeCuisine(Text fRecipeCuisine);
    /**
     * The cuisine of the recipe (for example, French or Ethiopian).
     *
     * @param fRecipeCuisine java.lang.String value to set.
     */
    void setRecipeCuisine(java.lang.String fRecipeCuisine);

    /**
     * Indicates a dietary restriction or guideline for which this recipe or menu item is suitable, e.g. diabetic, halal etc.
     *
     * @return {@link RestrictedDiet}
     */
    RestrictedDiet getSuitableForDiet();

    /**
     * Indicates a dietary restriction or guideline for which this recipe or menu item is suitable, e.g. diabetic, halal etc.
     *
     * @param fSuitableForDiet RestrictedDiet value to set.
     */
    void setSuitableForDiet(RestrictedDiet fSuitableForDiet);

    /**
     * Nutrition information about the recipe or menu item.
     *
     * @return {@link NutritionInformation}
     */
    NutritionInformation getNutrition();

    /**
     * Nutrition information about the recipe or menu item.
     *
     * @param fNutrition NutritionInformation value to set.
     */
    void setNutrition(NutritionInformation fNutrition);

    /**
     * The method of cooking, such as Frying, Steaming, ...
     *
     * @return {@link Text}
     */
    Text getCookingMethod();

    /**
     * The method of cooking, such as Frying, Steaming, ...
     *
     * @param fCookingMethod Text value to set.
     */
    void setCookingMethod(Text fCookingMethod);
    /**
     * The method of cooking, such as Frying, Steaming, ...
     *
     * @param fCookingMethod java.lang.String value to set.
     */
    void setCookingMethod(java.lang.String fCookingMethod);

    /**
     * A single ingredient used in the recipe, e.g. sugar, flour or garlic.
     *
     * @return {@link Text}
     */
    Text getRecipeIngredient();

    /**
     * A single ingredient used in the recipe, e.g. sugar, flour or garlic.
     *
     * @param fRecipeIngredient Text value to set.
     */
    void setRecipeIngredient(Text fRecipeIngredient);
    /**
     * A single ingredient used in the recipe, e.g. sugar, flour or garlic.
     *
     * @param fRecipeIngredient java.lang.String value to set.
     */
    void setRecipeIngredient(java.lang.String fRecipeIngredient);

    /**
     * The quantity produced by the recipe (for example, number of people served, number of servings, etc).
     *
     * @return {@link Text} or {@link QuantitativeValue}
     */
    <T> T getRecipeYield();

    /**
     * The quantity produced by the recipe (for example, number of people served, number of servings, etc).
     *
     * @param fRecipeYield Text value to set.
     */
    void setRecipeYield(Text fRecipeYield);
    /**
     * The quantity produced by the recipe (for example, number of people served, number of servings, etc).
     *
     * @param fRecipeYield java.lang.String value to set.
     */
    void setRecipeYield(java.lang.String fRecipeYield);
    /**
     * The quantity produced by the recipe (for example, number of people served, number of servings, etc).
     *
     * @param fRecipeYield QuantitativeValue value to set.
     */
    void setRecipeYield(QuantitativeValue fRecipeYield);

    /**
     * The time it takes to actually cook the dish, in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @return {@link Duration}
     */
    Duration getCookTime();

    /**
     * The time it takes to actually cook the dish, in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     *
     * @param fCookTime Duration value to set.
     */
    void setCookTime(Duration fCookTime);

    /**
     * The category of the recipe—for example, appetizer, entree, etc.
     *
     * @return {@link Text}
     */
    Text getRecipeCategory();

    /**
     * The category of the recipe—for example, appetizer, entree, etc.
     *
     * @param fRecipeCategory Text value to set.
     */
    void setRecipeCategory(Text fRecipeCategory);
    /**
     * The category of the recipe—for example, appetizer, entree, etc.
     *
     * @param fRecipeCategory java.lang.String value to set.
     */
    void setRecipeCategory(java.lang.String fRecipeCategory);
}
