package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
public class Lieu {

	@Id
	@GeneratedValue
	private Long idLieu;
	private String nomLieu;
	private String regionEpoque;
	private String regionActuelle;
	

}
