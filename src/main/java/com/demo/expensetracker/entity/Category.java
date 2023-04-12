package com.demo.expensetracker.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer categoryId;
    public String title;
    public String description;
    public Double total_expense;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    public Category() {}


    public Category(Integer categoryId, String title, String description, Double total_expense, User user) {
        this.categoryId = categoryId;
        this.title = title;
        this.description = description;
        this.total_expense = total_expense;
        this.user = user;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getTotal_expense() {
        return total_expense;
    }

    public void setTotal_expense(Double total_expense) {
        this.total_expense = total_expense;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}