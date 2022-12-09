
package com.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.entities.Role;
import com.entities.Utilisateur;
import com.model.UtilisateurDetail;
import com.service.interfaces.IUtilisateurService;

@Service
public class AppUserDetailsService implements UserDetailsService{
    @Autowired
	IUtilisateurService utilisateurService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Utilisateur utilisateur=utilisateurService.findByUsername(username);
		Set<Role> roles=utilisateur.getRoles();
		for (Role role : roles) {
			System.out.println(role.toString());
		}
		// Les profils
		Set<GrantedAuthority> authorities=new HashSet<GrantedAuthority>();
		
		for(Role role:roles) {
			authorities.add(new SimpleGrantedAuthority(role.getLibelle()));
		}
		
		UtilisateurDetail usDetail=new UtilisateurDetail();
		usDetail.setUtilisateur(utilisateur);
		usDetail.setAuthorities(authorities);
		
		return usDetail;
	}

}
