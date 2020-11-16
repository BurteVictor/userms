package com.service.imp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.repository.UserRepository;
import com.service.UserService;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	UserRepository dao;

	@Override
	public User findById(Long id) {
		return dao.getOne(id);
	}

	@Override
	public List<User> findAllUsers() {
		return dao.findAll();
	}

	@Override
	public void deleteById(Long id) {
		dao.deleteById(id);
	}

	@Override
	public User saveOrUpdate(User user) {
		dao.save(user);
		return user;
	}

}
