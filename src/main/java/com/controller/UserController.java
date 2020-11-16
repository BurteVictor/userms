package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.entity.User;
import com.service.UserService;

@RestController
@RequestMapping(value="rest-user")
@CrossOrigin(allowCredentials="true",origins ="http://localhost:4100")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(value="/users")
	public List<User> getAllUsers(){
		return userService.findAllUsers();
	}
	
	@GetMapping(value="/user/{id}")
	public User getById(@PathVariable(name="id")Long id) {
		return userService.findById(id);
	}
	
	@PostMapping(value="/user")
	public User addNewUser(@RequestBody User user) {
		return userService.saveOrUpdate(user);
	}
	@PutMapping(value="/user")
	public User updateUser(@RequestBody User user) {
		return userService.saveOrUpdate(user);
	}
	@DeleteMapping(value="/user/{id}")
	public void deleteById(@PathVariable(name="id")Long id) {
		userService.deleteById(id);
	}
}
