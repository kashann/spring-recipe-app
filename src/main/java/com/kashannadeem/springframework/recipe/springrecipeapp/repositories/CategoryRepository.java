package com.kashannadeem.springframework.recipe.springrecipeapp.repositories;

import com.kashannadeem.springframework.recipe.springrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
