package com.spring.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.model.User;
import com.spring.security.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/user/{username}")
	public User getUser(@PathVariable("username")String userName) {
		return userService.getUser(userName);
	}
	
	@PostMapping("/add")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	

}
