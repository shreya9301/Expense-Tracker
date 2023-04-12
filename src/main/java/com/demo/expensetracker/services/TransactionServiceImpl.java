package com.demo.expensetracker.services;

import com.demo.expensetracker.entity.Category;
import com.demo.expensetracker.entity.Transaction;
import com.demo.expensetracker.entity.User;
import com.demo.expensetracker.repository.CategoryRepository;
import com.demo.expensetracker.repository.TransactionRepository;
import com.demo.expensetracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    UserRepository userRepo;
    @Autowired
    CategoryRepository categoryRepo;
    @Autowired
    TransactionRepository transactionRepo;
    @Override
    public Transaction addTransaction(Integer userId, Integer categoryId,Transaction transaction) {
        User user = userRepo.findById(userId).get();
        Category category = categoryRepo.findById(categoryId).get();
        transaction.setUser(user);
        transaction.setCategory(category);
        transactionRepo.save(transaction);
        return transaction;
    }
}
