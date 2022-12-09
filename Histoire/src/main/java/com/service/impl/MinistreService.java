package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Ministre;
import com.repositories.MinistreRepository;
import com.service.interfaces.IMinistreService;

@Service
public class MinistreService implements IMinistreService{

	@Autowired
	MinistreRepository ministreRepository;

	@Override
	public List<Ministre> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ministre findOne(Long idMinistre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ministre save(Ministre ministre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long idMinistre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ministre findByIdMinistreAndLibelle(Long idMinistre, String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
