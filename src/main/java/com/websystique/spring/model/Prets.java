package com.websystique.spring.model;

import java.util.Date;

public class Prets {

	private Long idPret;
	private Double valeurTotale;
	private Double retenueMensuelle;
	private Date dateAffectation;
	
	
	
	public Prets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prets(Double valeurTotale, Double retenueMensuelle,
			Date dateAffectation) {
		super();
		this.valeurTotale = valeurTotale;
		this.retenueMensuelle = retenueMensuelle;
		this.dateAffectation = dateAffectation;
	}
	public Long getIdPret() {
		return idPret;
	}
	public void setIdPret(Long idPret) {
		this.idPret = idPret;
	}
	public Double getValeurTotale() {
		return valeurTotale;
	}
	public void setValeurTotale(Double valeurTotale) {
		this.valeurTotale = valeurTotale;
	}
	public Double getRetenueMensuelle() {
		return retenueMensuelle;
	}
	public void setRetenueMensuelle(Double retenueMensuelle) {
		this.retenueMensuelle = retenueMensuelle;
	}
	public Date getDateAffectation() {
		return dateAffectation;
	}
	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}
	
	
}
