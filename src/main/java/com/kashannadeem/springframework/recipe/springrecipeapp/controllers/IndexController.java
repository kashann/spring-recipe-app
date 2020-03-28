package com.kashannadeem.springframework.recipe.springrecipeapp.controllers;

import com.kashannadeem.springframework.recipe.springrecipeapp.domain.Category;
import com.kashannadeem.springframework.recipe.springrecipeapp.domain.UnitOfMeasure;
import com.kashannadeem.springframework.recipe.springrecipeapp.repositories.CategoryRepository;
import com.kashannadeem.springframework.recipe.springrecipeapp.repositories.UnitOfMeasureRepository;
import com.kashannadeem.springframework.recipe.springrecipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
