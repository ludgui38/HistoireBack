package com.service.interfaces;

import java.util.List;

import com.entities.Lieu;


public interface ILieuService {
	List<Lieu> findAll();

	Lieu findOne(Long idLieu);

	Lieu saveLieu(Lieu lieu);
	
	void remove(Long idLieu);
	
	//TODO
//	Lieu findByIdLieuAndNom(Long idLieu, String nom);
	
}
