package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.entity.Role;
import com.service.RoleService;

@RestController
@RequestMapping(value="rest-role")
@CrossOrigin(allowCredentials="true",origins ="http://localhost:4100")
public class RoleController {

	@Autowired
	RoleService roleService;
	
	@GetMapping(value="/roles")
	public List<Role> getAllRoles(){
		return roleService.findAllRoles();
	}
	
	@GetMapping(value="/role/{id}")
	public Role getById(@PathVariable(name="id")Long id) {
		return roleService.findById(id);
	}
	
	@PostMapping(value="/role")
	public Role addNewRole(@RequestBody Role role) {
		return roleService.saveOrUpdate(role);
	}
	@PutMapping(value="/role")
	public Role updateRole(@RequestBody Role role) {
		return roleService.saveOrUpdate(role);
	}
	@DeleteMapping(value="/role/{id}")
	public void deleteById(@PathVariable(name="id")Long id) {
		roleService.deleteById(id);
	}
}
