package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.entities.Roi;
import com.repositories.RoiRepository;
import com.service.interfaces.IRoiService;


@Service
public class RoiService implements IRoiService {

	@Autowired
	@Qualifier("roiService")
	RoiRepository roiRepository;

	@Override
	public List<Roi> findAll() {
		return roiRepository.findAll();
	}

	@Override
	public Roi findOne(Long idRoi) {
		return roiRepository.findById(idRoi).get();
	}

	@Override
	public Roi save(Roi roi) {
				return roiRepository.save(roi);
	}

	@Override
	public void remove(Long idRoi) {
		roiRepository.deleteById(idRoi);
	}

	

}
