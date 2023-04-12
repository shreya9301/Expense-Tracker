package com.demo.expensetracker.services;

import com.demo.expensetracker.entity.Transaction;

public interface TransactionService {
    Transaction addTransaction(Integer userId, Integer categoryId, Transaction transaction);
}

