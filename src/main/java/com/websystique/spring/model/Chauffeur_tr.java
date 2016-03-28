package com.websystique.spring.model;

public class Chauffeur_tr extends Fonctionnaire{
	
	private int num_permis;

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
