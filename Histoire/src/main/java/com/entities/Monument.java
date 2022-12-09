package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Monument {
	@Id
	@GeneratedValue
	private Long IdMonument;
//	private Personne constructeur;
//	private Personne ordonateur;
//	private Lieu lieu;
	private String nomMonument;

	
}
