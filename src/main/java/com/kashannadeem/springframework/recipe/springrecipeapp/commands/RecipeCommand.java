package com.kashannadeem.springframework.recipe.springrecipeapp.commands;

import com.kashannadeem.springframework.recipe.springrecipeapp.domain.Category;
import com.kashannadeem.springframework.recipe.springrecipeapp.domain.Difficulty;
import com.kashannadeem.springframework.recipe.springrecipeapp.domain.Ingredient;
import com.kashannadeem.springframework.recipe.springrecipeapp.domain.Notes;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Difficulty difficulty;
    private Set<IngredientCommand> ingredients = new HashSet<>();
    private NotesCommand notes;
    private Set<CategoryCommand> categories = new HashSet<>();
}