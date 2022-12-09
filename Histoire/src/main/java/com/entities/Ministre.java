package com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Ministre extends Personne {
//	@Id
//	@GeneratedValue
//	private Long idMinistre;
	private Date debutFonction;
	private Date finFonction;
	private String departement;

	
}
