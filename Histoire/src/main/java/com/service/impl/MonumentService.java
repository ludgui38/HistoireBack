package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Monument;
import com.repositories.MonumentRepository;
import com.service.interfaces.IMonumentService;

@Service
public class MonumentService implements IMonumentService{

	@Autowired
	MonumentRepository monumentRepository;

	@Override
	public List<Monument> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Monument findOne(Long idMonument) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Monument save(Monument monument) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long idMonument) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Monument findByIdMonumentAndLibelle(Long idMonument, String libelle) {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
