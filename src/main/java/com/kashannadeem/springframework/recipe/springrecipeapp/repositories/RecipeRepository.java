package com.kashannadeem.springframework.recipe.springrecipeapp.repositories;

import com.kashannadeem.springframework.recipe.springrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
