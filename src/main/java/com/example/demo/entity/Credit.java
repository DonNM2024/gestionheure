package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Credit {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private int id;
	
	
	  @ManyToOne
	  
	  //@JoinColumn(name = "ecue_id")
	  private ECUE ecue;
	 
	
	public ECUE getEcue() {
		return ecue;
	}
	public void setEcue(ECUE ecue) {
		this.ecue = ecue;
	}
	private double C;
	private double GP;
	public double getC() {
		return C;
	}
	public void setC(double c) {
		C = c;
	}
	public double getGP() {
		return GP;
	}
	public void setGP(double gP) {
		GP = gP;
	}
}
