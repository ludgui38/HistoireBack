package com.service.interfaces;

import java.util.List;

import com.entities.Role;

public interface IRoleService{
	
	List<Role> findAll();

	Role findOne(Long idRole);

	Role saveRole(Role role);
	
	void remove(Long idRole);
	
	Role findByIdRoleAndLibelle(Long idRole, String libelle);
	
	Role update(Role role);
}
