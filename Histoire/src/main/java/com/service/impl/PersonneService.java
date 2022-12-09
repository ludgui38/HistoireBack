package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Personne;
import com.repositories.PersonneRepository;
import com.service.interfaces.IPersonneService;

@Service
public class PersonneService implements IPersonneService{

	@Autowired
	PersonneRepository personneRepository;


	@Override
	public void remove(Long idPersonne) {
		personneRepository.deleteById(idPersonne);
		
	}

	@Override
	public List<Personne> findAll() {
		return (List<Personne>) personneRepository.findAll();
	}

	@Override
	public Personne findOne( Long id) {
		return (Personne) personneRepository.findById(id).get();
	}

	@Override
	public Personne savePersonne(Personne personne) {
		return personne;
	}

	@Override
	public Personne findBydNom(String nom) {
		return personneRepository.findBy(null, null);
	}

	

	

	


}
