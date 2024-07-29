package com.example.recipe;

import java.util.*;

import org.springframework.web.bind.annotation.*;
import com.example.recipe.Recipe;

public interface RecipeRepository {
    ArrayList<Recipe> getAllRecipes();

    Recipe getRecipeById(int recipeId);

    Recipe addRecipe(Recipe recipe);

    Recipe updateRecipe(int recipeId, Recipe recipe);

    void deleteRecipe(int recipeId);

}
