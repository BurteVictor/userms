package com.service.imp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Role;
import com.repository.RoleRepository;
import com.service.RoleService;

@Service
public class RoleServiceImp implements RoleService {

	@Autowired
	RoleRepository dao;
	@Override
	public Role findById(Long id) {
		return dao.getOne(id);
	}

	@Override
	public List<Role> findAllRoles() {
		return dao.findAll();
	}

	@Override
	public void deleteById(Long id) {
		dao.deleteById(id);
	}

	@Override
	public Role saveOrUpdate(Role role) {
		dao.save(role);
		return role;
	}

}
