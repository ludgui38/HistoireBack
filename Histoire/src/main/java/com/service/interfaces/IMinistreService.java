package com.service.interfaces;

import java.util.List;

import com.entities.Ministre;


public interface IMinistreService{
	List<Ministre> findAll();

	Ministre findOne(Long idMinistre);

	Ministre save(Ministre ministre);
	
	void remove(Long idMinistre);
	
	Ministre findByIdMinistreAndLibelle(Long idMinistre, String libelle);
	
}
