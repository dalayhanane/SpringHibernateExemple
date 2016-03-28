package com.websystique.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="arret")
public class Arret_tr implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_arret;
	private String nom;
	
	@ManyToOne
	@JoinColumn
	private Quartier_tr quartier;
	
	public Arret_tr(int id_arret, String nom) {
		super();
		this.id_arret = id_arret;
		this.nom = nom;
	}

	public Arret_tr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_arret() {
		return id_arret;
	}

	public void setId_arret(int id_arret) {
		this.id_arret = id_arret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	

}
