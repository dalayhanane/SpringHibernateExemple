package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.OneToMany;

public class Circuit_tr implements Serializable  {
	
	private int id_circuit;
	
	

	public Circuit_tr(int id_circuit) {
		super();
		this.id_circuit = id_circuit;
	}


	public int getId_circuit() {
		return id_circuit;
	}


	public void setId_circuit(int id_circuit) {
		this.id_circuit = id_circuit;
	}


	public Circuit_tr() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
