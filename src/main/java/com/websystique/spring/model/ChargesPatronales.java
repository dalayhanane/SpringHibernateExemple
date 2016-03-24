package com.websystique.spring.model;

import java.util.Date;

public class ChargesPatronales {
	private Long idChargesPatronales;
	private Date date;
	private Double chargesCnss;
	private Double chargesIGR;
	private Double chargesMutuelle;
	
	
	
	
	public ChargesPatronales() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChargesPatronales(Date date, Double chargesCnss, Double chargesIGR,
			Double chargesMutuelle) {
		super();
		this.date = date;
		this.chargesCnss = chargesCnss;
		this.chargesIGR = chargesIGR;
		this.chargesMutuelle = chargesMutuelle;
	}
	public Long getIdChargesPatronales() {
		return idChargesPatronales;
	}
	public void setIdChargesPatronales(Long idChargesPatronales) {
		this.idChargesPatronales = idChargesPatronales;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getChargesCnss() {
		return chargesCnss;
	}
	public void setChargesCnss(Double chargesCnss) {
		this.chargesCnss = chargesCnss;
	}
	public Double getChargesIGR() {
		return chargesIGR;
	}
	public void setChargesIGR(Double chargesIGR) {
		this.chargesIGR = chargesIGR;
	}
	public Double getChargesMutuelle() {
		return chargesMutuelle;
	}
	public void setChargesMutuelle(Double chargesMutuelle) {
		this.chargesMutuelle = chargesMutuelle;
	}

	
	

}
