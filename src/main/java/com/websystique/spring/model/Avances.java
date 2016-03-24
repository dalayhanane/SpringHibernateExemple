package com.websystique.spring.model;

import java.util.Date;

public class Avances {
	private Long idAvance;
	private Double valeurAvance;
	private Date dateAffectation;
	
	
	public Avances() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Avances(Double valeurAvance, Date dateAffectation) {
		super();
		this.valeurAvance = valeurAvance;
		this.dateAffectation = dateAffectation;
	}

	public Long getIdAvance() {
		return idAvance;
	}
	public void setIdAvance(Long idAvance) {
		this.idAvance = idAvance;
	}
	public Double getValeurAvance() {
		return valeurAvance;
	}
	public void setValeurAvance(Double valeurAvance) {
		this.valeurAvance = valeurAvance;
	}
	public Date getDateAffectation() {
		return dateAffectation;
	}
	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}
	
	

}
