package com.websystique.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Club implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id_club;
	
	private String nom_club;

    @ManyToOne	
    @JoinColumn
	private Admin admin;
	
	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Club(String nom_club) {
		super();
		this.nom_club = nom_club;
	}

	public String getNom_club() {
		return nom_club;
	}

	public void setNom_club(String nom_club) {
		this.nom_club = nom_club;
	}
	

}
