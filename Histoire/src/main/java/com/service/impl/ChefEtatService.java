package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.ChefEtat;
import com.repositories.ChefEtatRepository;
import com.service.interfaces.IChefEtatService;

@Service
public class ChefEtatService implements IChefEtatService {

	@Autowired
	ChefEtatRepository chefEtatRepository;

	@Override
	public void remove(Long idChefEtat) {
		chefEtatRepository.deleteById(idChefEtat);

	}

	@Override
	public List<ChefEtat> findAll() {
		return chefEtatRepository.findAll();
	}

	@Override
	public ChefEtat findOne(Long id) {
		return chefEtatRepository.findById(id).get();
	}

	@Override
	public ChefEtat saveChefEtat(ChefEtat chefEtat) {
		return chefEtatRepository.save(chefEtat);
	}

	//TODO
	@Override
	public ChefEtat findByIdChefEtatAndNom(Long idChefEtat, String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
