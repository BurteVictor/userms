package com.service;

import java.util.List;

import com.entity.User;

public interface UserService {

	public User findById(Long id);
	public List<User> findAllUsers();
	public void deleteById(Long id);
	public User saveOrUpdate(User user);
}
