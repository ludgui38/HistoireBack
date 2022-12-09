package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Lieu;
import com.repositories.LieuRepository;
import com.service.interfaces.ILieuService;

@Service
public class LieuService implements ILieuService {

	@Autowired
	LieuRepository lieuRepository;

	//TODO
//	@Override
//	public Lieu findByIdLieuAndNom(Long idLieu, String nom) {
//		return lieuRepository.findByIdLieuAndNom(idLieu, nom);
//	}

	@Override
	public void remove(Long idLieu) {
		lieuRepository.deleteById(idLieu);

	}

	@Override
	public List<Lieu> findAll() {
		return lieuRepository.findAll();
	}

	@Override
	public Lieu findOne(Long id) {
		return lieuRepository.findById(id).get();
	}

	@Override
	public Lieu saveLieu(Lieu lieu) {
		return lieuRepository.save(lieu);
	}
}
