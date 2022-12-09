package com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ChefEtat extends Personne {

	@Id
	@GeneratedValue
	private Long idChefEtat;
	private String denomination;
	private Date debutRegne;
	private Date finRegne;
	private Lieu lieuRegne;

	public ChefEtat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChefEtat(String denomination, Date debutRegne, Date finRegne, Lieu lieuRegne) {
		super();
		this.denomination = denomination;
		this.debutRegne = debutRegne;
		this.finRegne = finRegne;
		this.lieuRegne = lieuRegne;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public Date getDebutRegne() {
		return debutRegne;
	}

	public void setDebutRegne(Date debutRegne) {
		this.debutRegne = debutRegne;
	}

	public Date getFinRegne() {
		return finRegne;
	}

	public void setFinRegne(Date finRegne) {
		this.finRegne = finRegne;
	}

	public Lieu getLieuRegne() {
		return lieuRegne;
	}

	public void setLieuRegne(Lieu lieuRegne) {
		this.lieuRegne = lieuRegne;
	}

}
