package com.demo.expensetracker.services;

import com.demo.expensetracker.entity.Category;
import com.demo.expensetracker.entity.User;
import com.demo.expensetracker.repository.CategoryRepository;
import com.demo.expensetracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    UserRepository userRepo;
    @Autowired
    CategoryRepository categoryRepo;

    @Override
    public Category getCategoryById(Integer categoryId) {
        return categoryRepo.findById(categoryId).get();
    }

    @Override
    public Category addCategory(Integer userId,Category newCategory) {
        User user = userRepo.findById(userId).get();
        newCategory.setUser(user);
        categoryRepo.save(newCategory);
        return newCategory;
    }


    @Override
    public void deleteCategory(Integer categoryId) {
        Category category = categoryRepo.findById(categoryId).get();
        categoryRepo.delete(category);
    }

    @Override
    public Category updateCategory(Integer userId, Integer categoryId, String title, String description, Double totalExpense) {
        Category category = categoryRepo.findById(categoryId).get();
        category.setTitle(title);
        category.setDescription(description);
        category.setTotal_expense(totalExpense);
        categoryRepo.save(category);
        return category;
    }
}
