package com.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Roi extends ChefEtat {
	@Id
	@GeneratedValue
	private Long idRoi;
	private Lieu lieuSacre;
	private Date dateSacre;
	private Date inhumation;
	private Lieu lieuInhumation;
	private Roi predecesseur;
	private Roi successeur;
	private List<Personne> epouse;
	private List<Personne> enfant;
	private List<Personne> maitresse;

	public Roi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roi(String denomination, Date debutRegne, Date finRegne, Lieu lieuRegne) {
		super(denomination, debutRegne, finRegne, lieuRegne);
		// TODO Auto-generated constructor stub
	}

	public Roi(Lieu lieuSacre, Date dateSacre, Date inhumation, Lieu lieuInhumation, Roi predecesseur, Roi successeur,
			List<Personne> epouse, List<Personne> enfant, List<Personne> maitresse) {
		super();
		this.lieuSacre = lieuSacre;
		this.dateSacre = dateSacre;
		this.inhumation = inhumation;
		this.lieuInhumation = lieuInhumation;
		this.predecesseur = predecesseur;
		this.successeur = successeur;
		this.epouse = epouse;
		this.enfant = enfant;
		this.maitresse = maitresse;
	}

	public Lieu getLieuSacre() {
		return lieuSacre;
	}

	public void setLieuSacre(Lieu lieuSacre) {
		this.lieuSacre = lieuSacre;
	}

	public Date getDateSacre() {
		return dateSacre;
	}

	public void setDateSacre(Date dateSacre) {
		this.dateSacre = dateSacre;
	}

	public Date getInhumation() {
		return inhumation;
	}

	public void setInhumation(Date inhumation) {
		this.inhumation = inhumation;
	}

	public Lieu getLieuInhumation() {
		return lieuInhumation;
	}

	public void setLieuInhumation(Lieu lieuInhumation) {
		this.lieuInhumation = lieuInhumation;
	}

	public Roi getPredecesseur() {
		return predecesseur;
	}

	public void setPredecesseur(Roi predecesseur) {
		this.predecesseur = predecesseur;
	}

	public Roi getSuccesseur() {
		return successeur;
	}

	public void setSuccesseur(Roi successeur) {
		this.successeur = successeur;
	}

	public List<Personne> getEpouse() {
		return epouse;
	}

	public void setEpouse(List<Personne> epouse) {
		this.epouse = epouse;
	}

	public List<Personne> getEnfant() {
		return enfant;
	}

	public void setEnfant(List<Personne> enfant) {
		this.enfant = enfant;
	}

	public List<Personne> getMaitresse() {
		return maitresse;
	}

	public void setMaitresse(List<Personne> maitresse) {
		this.maitresse = maitresse;
	}

}
