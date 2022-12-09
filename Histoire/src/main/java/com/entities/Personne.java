package com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
public class Personne {

	@Id
	@GeneratedValue
	private Long idPersonne;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private Date dateMort;
	private String desciption;
	

	
	

}
