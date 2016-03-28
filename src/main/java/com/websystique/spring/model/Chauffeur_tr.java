package com.websystique.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chauffeur_tr")
public class Chauffeur_tr extends Fonctionnaire{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_chauffeur;
	private int num_permis;
	
	public int getId_chauffeur() {
		return id_chauffeur;
	}

	public void setId_chauffeur(int id_chauffeur) {
		this.id_chauffeur = id_chauffeur;
	}

	public Chauffeur_tr(int num_permis) {
		super();
		this.num_permis = num_permis;
	}

	public int getNum_permis() {
		return num_permis;
	}

	public void setNum_permis(int num_permis) {
		this.num_permis = num_permis;
	} 
	
	

}
