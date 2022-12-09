package com.service.interfaces;

import java.util.List;

import com.entities.Monument;


public interface IMonumentService {
	
	List<Monument> findAll();

	Monument findOne(Long idMonument);

	Monument save(Monument monument);
	
	void remove(Long idMonument);
	
	Monument findByIdMonumentAndLibelle(Long idMonument, String libelle);
	
}
