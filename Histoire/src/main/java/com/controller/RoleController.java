package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Role;
import com.service.interfaces.IRoleService;

//RestFul WS (Http: Post, Put, Get, Delete)
@RestController
@CrossOrigin
public class RoleController {
	@Autowired
	IRoleService roleService;
    // localhost:9090/roles => Afficher la liste des roles
	@RequestMapping(value = "roles", method = RequestMethod.GET)
	public List<Role> findAll() {
		return roleService.findAll();
	}
	// localhost:9090/roles/{idR}
	// {idR} : param de la requête http
	// {idR} => idRole
	@RequestMapping(value = "roles/{idR}", method = RequestMethod.GET)
	public Role findOne(@PathVariable("idR") Long idRole) {
		return roleService.findOne(idRole);
	}
	@RequestMapping(value = "roles/{idR}/{libelle}", method = RequestMethod.GET)
	public Role findByIdRoleAndLibelle(@PathVariable("idR") Long idRole,@PathVariable("libelle") 
	String libelle) {
		return roleService.findByIdRoleAndLibelle(idRole, libelle);
	}
	// localhost:9090/roles?idR=1
	/*@RequestMapping(value = "roles", method = RequestMethod.GET)
	public Role findOne(@RequestParam("idR") Long idRole) {
		return roleService.findOne(idRole);
	}*/
	// localhost:9090/roles?idR=1&libelle=Admin
	/*@RequestMapping(value = "roles", method = RequestMethod.GET)
	public Role findByIdRoleAndLibelle(@RequestParam("idR") Long idRole,@RequestParam("libelle") 
	String libelle) {
		return roleService.findByIdRoleAndLibelle(idRole, libelle);
	}*/
	@RequestMapping(value="roles",method=RequestMethod.POST)
	public Role saveRole(@RequestBody Role role) {
		return roleService.saveRole(role);
	}
	@RequestMapping(value="roles/{idR}",method=RequestMethod.PUT)
	public Role updateRole(@PathVariable("idR") Long idRole, @RequestBody Role role) {
		Role currentRole=roleService.findOne(idRole); // { "idRole": 3,"libelle" :"RH"} => RH : TIC
		currentRole.setLibelle(role.getLibelle());  // currentRole.setLibelle("TIC");
		return roleService.saveRole(currentRole); // {"idRole": 3, "libelle" : "TIC}
	}
	
	@RequestMapping(value="roles/{idRole}",method = RequestMethod.DELETE)
	public void deleteRole(@PathVariable("idRole") Long idRole) {
		roleService.delete(idRole);
	}
}
