package com.demo.expensetracker.services;

import com.demo.expensetracker.entity.Category;
import com.demo.expensetracker.entity.User;
import com.demo.expensetracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepo;
    @Override
    public User createUser(Integer userId, String userName, String email, String password) {
        User newUser = new User(userId,userName,email,password);
        return userRepo.save(newUser);
    }

    @Override
    public Set<Category> getCategoriesByUserId(Integer userId) {
        User user = userRepo.findById(userId).get();
        Set<Category> categories = user.getCategories();
        return categories;
    }
}
