package com.kashannadeem.springframework.recipe.springrecipeapp.services;

import com.kashannadeem.springframework.recipe.springrecipeapp.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class ImageServiceImplTest {

    @Mock
    RecipeRepository recipeRepository;

    ImageService imageService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        //imageService = new ImageServiceImpl(recipeRepository);
    }

    @Test
    void saveImageFile() {
        //todo
    }
}