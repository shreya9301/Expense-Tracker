package com.demo.expensetracker.repository;

import com.demo.expensetracker.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface CategoryRepository extends JpaRepository<Category,Integer> {
//    @Modifying
//    @Query(value = "UPDATE categories SET categories.categoryId = :categoryId and categories.title = : title and categories.description = :description and categories.total_expense=:total_expense")
//    void update(Category category);
//    @Query(value = "SELECT c.category_id,c.title,c.description,c.total_expense from Categories c,Users u where c.user_id=:u.userId and u.user_id = :userId and c.category_id=:categoryId")
//    Category findByIds(Integer categoryId, Integer userId);
}
