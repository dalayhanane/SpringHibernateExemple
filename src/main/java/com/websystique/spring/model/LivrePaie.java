package com.websystique.spring.model;

import java.util.Date;

public class LivrePaie {

	private int idLivrePaie;
	private Date dateSaisie;
	
	
	
	public LivrePaie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LivrePaie(Date dateSaisie) {
		super();
		this.dateSaisie = dateSaisie;
	}
	public int getIdLivrePaie() {
		return idLivrePaie;
	}
	public void setIdLivrePaie(int idLivrePaie) {
		this.idLivrePaie = idLivrePaie;
	}
	public Date getDateSaisie() {
		return dateSaisie;
	}
	public void setDateSaisie(Date dateSaisie) {
		this.dateSaisie = dateSaisie;
	}
	
	
}
