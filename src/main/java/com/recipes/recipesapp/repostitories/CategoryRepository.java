package com.recipes.recipesapp.repostitories;

import com.recipes.recipesapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
