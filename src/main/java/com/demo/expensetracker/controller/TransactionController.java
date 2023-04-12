package com.demo.expensetracker.controller;

import com.demo.expensetracker.entity.Transaction;
import com.demo.expensetracker.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @PostMapping("/{userId}/{categoryId}/create")
    public Transaction addTransaction(@PathVariable Integer userId, @PathVariable Integer categoryId, @RequestBody Transaction transaction){
        return transactionService.addTransaction(userId,categoryId,transaction);
    }

}
