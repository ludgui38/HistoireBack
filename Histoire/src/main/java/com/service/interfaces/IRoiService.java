package com.service.interfaces;

import java.util.Date;
import java.util.List;

import com.entities.Roi;



public interface IRoiService  {
	
	List<Roi> findAll();

	Roi findOne(Long idRoi);

	Roi save(Roi roi);
	
	void remove(Long idRoi);
	
	
	
}
