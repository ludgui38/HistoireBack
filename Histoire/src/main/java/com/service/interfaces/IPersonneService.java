package com.service.interfaces;

import java.util.List;

import com.entities.Personne;



public interface IPersonneService {
	List<Personne> findAll();

	Personne findOne(Long idPersonne);

	Personne savePersonne(Personne personne);
	
	void remove(Long idPersonne);
	
	Personne findBydNom(String nom);
}

