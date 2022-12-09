package com.service.impl;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Role;
import com.repositories.RoleRepository;
import com.service.interfaces.IRoleService;

@Service
public class RoleService implements IRoleService {
	
	@Autowired
	RoleRepository roleRepository;


	@Override
	public Role findByIdRoleAndLibelle(Long idRole, String libelle) {
		return roleRepository.findByIdRoleAndLibelle(idRole, libelle);
	}

	@Override
	public Role update(Role role) {
		return role;
		
	}

	@Override
	public void remove(Long idRole) {
		roleRepository.deleteById(idRole);
		
	}

	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public Role findOne( Long id) {
		return roleRepository.findById(id).get();
	}

	@Override
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}







}
