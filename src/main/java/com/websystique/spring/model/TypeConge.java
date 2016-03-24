package com.websystique.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="type_conge")

public class TypeConge implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTypeConge;
	private String type;
	

	public TypeConge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeConge(String type) {
		super();
		this.type = type;
	}
	public Long getIdTypeConge() {
		return idTypeConge;
	}
	public void setIdTypeConge(Long idTypeConge) {
		this.idTypeConge = idTypeConge;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
