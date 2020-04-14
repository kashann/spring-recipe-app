package com.kashannadeem.springframework.recipe.springrecipeapp.services;

import com.kashannadeem.springframework.recipe.springrecipeapp.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
