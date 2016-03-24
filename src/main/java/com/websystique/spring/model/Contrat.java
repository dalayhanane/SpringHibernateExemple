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
@Table(name="CONTRAT")
public class Contrat implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContrat;
	private Date dateEmbauche;
	private Double salaireBase;
	private String modeRegelemnt;
	
	@ManyToOne
	private Fonctionaire fonctionaire;
	
	@ManyToOne
	private Profession profession;
	@ManyToOne 
	private TypeContrat typecontrat;
	
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contrat(Date dateEmbauche, Double salaireBase, String modeRegelemnt) {
		super();
		this.dateEmbauche = dateEmbauche;
		this.salaireBase = salaireBase;
		this.modeRegelemnt = modeRegelemnt;
	}
	public Long getIdContrat() {
		return idContrat;
	}
	public void setIdContrat(Long idContrat) {
		this.idContrat = idContrat;
	}
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public Double getSalaireBase() {
		return salaireBase;
	}
	public void setSalaireBase(Double salaireBase) {
		this.salaireBase = salaireBase;
	}
	public String getModeRegelemnt() {
		return modeRegelemnt;
	}
	public void setModeRegelemnt(String modeRegelemnt) {
		this.modeRegelemnt = modeRegelemnt;
	}
	public Fonctionaire getFonctionaire() {
		return fonctionaire;
	}
	public void setFonctionaire(Fonctionaire fonctionaire) {
		this.fonctionaire = fonctionaire;
	}
	public Profession getProfession() {
		return profession;
	}
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	public TypeContrat getTypecontrat() {
		return typecontrat;
	}
	public void setTypecontrat(TypeContrat typecontrat) {
		this.typecontrat = typecontrat;
	}
	
	
	
	

}
