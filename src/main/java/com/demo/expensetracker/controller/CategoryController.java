package com.demo.expensetracker.controller;

import com.demo.expensetracker.entity.Category;
import com.demo.expensetracker.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @PostMapping("/{userId}/create")
    public Category addCategory(@PathVariable Integer userId, @RequestBody Category category) {
        return categoryService.addCategory(userId, category);
    }

    @GetMapping("/{userId}/category/{categoryId}")
    public Category getCategoryById(@PathVariable Integer categoryId){
        return categoryService.getCategoryById(categoryId);
    }

    @PutMapping("/{userId}/update/{categoryId}")
    public Category updateCategory(@PathVariable Integer userId,@PathVariable Integer categoryId, @RequestBody Map<String, Object> categoryMap ){
        String title = (String)categoryMap.get("title");
        String description = (String)categoryMap.get("description");
        Double total_expense = (Double) categoryMap.get("total_expense");
        return categoryService.updateCategory(userId,categoryId,title,description,total_expense);
    }

    @DeleteMapping("/{userId}/delete/{categoryId}")
    public void deleteCategory(@PathVariable Integer userId,@PathVariable Integer categoryId){
        categoryService.deleteCategory(categoryId);
    }


}
