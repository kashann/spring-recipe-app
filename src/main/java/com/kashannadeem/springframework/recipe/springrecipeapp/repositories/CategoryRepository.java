package com.kashannadeem.springframework.recipe.springrecipeapp.repositories;

import com.kashannadeem.springframework.recipe.springrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
