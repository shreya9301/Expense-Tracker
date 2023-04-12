package com.demo.expensetracker.controller;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.demo.expensetracker.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.expensetracker.entity.User;
import com.demo.expensetracker.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	public UserService userService;
	
	@PostMapping("/create")
	public User createUser(HttpServletRequest request, @RequestBody Map<String,Object> userMap) {
		Integer userId = (Integer)userMap.get("userId");
		String userName = (String)userMap.get("userName");
		String email = (String)userMap.get("email");
		String password = (String)userMap.get("password");
		User newUser = userService.createUser(userId,userName,email,password);
		return newUser;
	}

	@GetMapping("/{userId}/categories")
	public Set<Category> getCategoriesByUserId(@PathVariable Integer userId) {
		return userService.getCategoriesByUserId(userId);
	}
}
