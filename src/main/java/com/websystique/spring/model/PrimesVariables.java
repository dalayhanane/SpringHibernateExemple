package com.websystique.spring.model;

import java.util.Date;

public class PrimesVariables {
	private Long idPrimeVariable;
	private String nomPrimeVariable;
	private int code;
	private Double valeur;
	private String type;
	private Date dateAffectation;
	private boolean axoneree;
	
	
	public PrimesVariables() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PrimesVariables(String nomPrimeVariable, int code, Double valeur,
			String type, Date dateAffectation, boolean axoneree) {
		super();
		this.nomPrimeVariable = nomPrimeVariable;
		this.code = code;
		this.valeur = valeur;
		this.type = type;
		this.dateAffectation = dateAffectation;
		this.axoneree = axoneree;
	}
	public Long getIdPrimeVariable() {
		return idPrimeVariable;
	}
	public void setIdPrimeVariable(Long idPrimeVariable) {
		this.idPrimeVariable = idPrimeVariable;
	}
	public String getNomPrimeVariable() {
		return nomPrimeVariable;
	}
	public void setNomPrimeVariable(String nomPrimeVariable) {
		this.nomPrimeVariable = nomPrimeVariable;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Double getValeur() {
		return valeur;
	}
	public void setValeur(Double valeur) {
		this.valeur = valeur;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDateAffectation() {
		return dateAffectation;
	}
	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}
	public boolean isAxoneree() {
		return axoneree;
	}
	public void setAxoneree(boolean axoneree) {
		this.axoneree = axoneree;
	}
	
	
	
}
