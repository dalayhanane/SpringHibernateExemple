package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.OneToMany;

public class Circuit_tr implements Serializable  {
	
	private int id_circuit;
	
	@OneToMany(mappedBy="")
	private Collection<Quartier_tr> quartiers;
	private Collection<Vehicule> vehicules;
	

	public int getId_circuit() {
		return id_circuit;
	}


	public void setId_circuit(int id_circuit) {
		this.id_circuit = id_circuit;
	}


	public Collection<Quartier_tr> getQuartiers() {
		return quartiers;
	}


	public void setQuartiers(Collection<Quartier_tr> quartiers) {
		this.quartiers = quartiers;
	}


	public Collection<Vehicule> getVehicules() {
		return vehicules;
	}


	public void setVehicules(Collection<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}


	public Circuit_tr() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
