package com.service.interfaces;


import java.util.List;

import com.entities.ChefEtat;


public interface IChefEtatService {
	
	List<ChefEtat> findAll();

	ChefEtat findOne(Long idChefEtat);

	ChefEtat saveChefEtat(ChefEtat chefEtat);
	
	void remove(Long idChefEtat);
	
	ChefEtat findByIdChefEtatAndNom(Long idChefEtat, String nom);
}
