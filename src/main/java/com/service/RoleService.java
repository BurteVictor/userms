package com.service;

import java.util.List;

import com.entity.Role;

public interface RoleService {
	public Role findById(Long id);
	public List<Role> findAllRoles();
	public void deleteById(Long id);
	public Role saveOrUpdate(Role role);
}
