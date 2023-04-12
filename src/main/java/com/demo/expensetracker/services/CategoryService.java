package com.demo.expensetracker.services;

import com.demo.expensetracker.entity.Category;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

public interface CategoryService {
    Category getCategoryById(Integer categoryId);

    Category addCategory(Integer userId, Category newCategory);

    Category updateCategory(Integer userId, Integer categoryId, String title, String description, Double totalExpense);

    void deleteCategory(Integer categoryId);

}
