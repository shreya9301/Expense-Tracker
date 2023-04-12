package com.demo.expensetracker.services;

import com.demo.expensetracker.entity.Category;
import com.demo.expensetracker.entity.User;

import java.util.Optional;
import java.util.Set;

public interface UserService {
    User createUser(Integer userId, String userName, String email, String password);
    Set<Category> getCategoriesByUserId(Integer userId);
}
