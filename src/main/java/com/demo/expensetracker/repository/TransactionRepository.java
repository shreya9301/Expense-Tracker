package com.demo.expensetracker.repository;

import com.demo.expensetracker.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
