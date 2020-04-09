package com.kashannadeem.springframework.recipe.springrecipeapp.services;

import com.kashannadeem.springframework.recipe.springrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long l);
}
