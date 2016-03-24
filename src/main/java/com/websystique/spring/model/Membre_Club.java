package com.websystique.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Membre_Club {
	
	@Id
	@GeneratedValue
	private Long id_membre;
	private String nom;
	private String prenom;
	private String tel;
	private String etat;
	
	
	public Membre_Club() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Membre_Club(String nom, String prenom, String tel, String etat) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.etat = etat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}

}
