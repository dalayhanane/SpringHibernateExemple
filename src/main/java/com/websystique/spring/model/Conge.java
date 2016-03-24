package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="conge")

public class Conge implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConge;
	private int dureeConge; 
	private Date dateDebut;
	
	@ManyToOne
	private Fonctionaire fonctionaire;
	
	
	public Conge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Conge(int dureeConge, Date dateDebut) {
		super();
		this.dureeConge = dureeConge;
		this.dateDebut = dateDebut;
	}
	public Long getIdConge() {
		return idConge;
	}
	public void setIdConge(Long idConge) {
		this.idConge = idConge;
	}
	public int getDureeConge() {
		return dureeConge;
	}
	public void setDureeConge(int dureeConge) {
		this.dureeConge = dureeConge;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	
	
	
}
