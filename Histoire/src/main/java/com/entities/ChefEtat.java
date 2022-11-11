package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="Chef_Etat", schema = "histoire")
public class ChefEtat {
	
	@Id
	@GeneratedValue
	private Long identifier;
	private String nom;

}
