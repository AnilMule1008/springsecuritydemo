package com.spring.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.security.model.User;


@Service
public class UserService {
	List<User> users = new ArrayList<>();
	
	public UserService() {
		users.add(new User("Anil", "Mule", "anil.mule@gmail.com"));
		users.add(new User("Avinash", "Mule", "Avinash.mule@gmail.com"));
		users.add(new User("Pooja", "Mule", "Pooja.mule@gmail.com"));
	}
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public User getUser(String userName) {
		return this.users.stream().filter(user -> user.getUserName().equals(userName)).findAny().orElse(null);
	}
	
	public void addUser(User user) {
		users.add(user);
	}
}
