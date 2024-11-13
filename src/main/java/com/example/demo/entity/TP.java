package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class TP {
	
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private int id;
	
	
	  @ManyToOne
	  
	  //@JoinColumn(name="ecue_id")
	  private ECUE ecue;
	  
	  
	  @OneToMany(mappedBy="tp")
	  private List<HeureEffectue> heureeffectue;
	 
	
	public ECUE getEcue() {
		return ecue;
	}
	public void setEcue(ECUE ecue) {
		this.ecue = ecue;
	}
	private String nom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<HeureEffectue> getHeureeffectue() {
		return heureeffectue;
	}
	public void setHeureeffectue(List<HeureEffectue> heureeffectue) {
		this.heureeffectue = heureeffectue;
	}
	

}
