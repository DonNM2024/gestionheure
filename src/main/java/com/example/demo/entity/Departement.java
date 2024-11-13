package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Departement {
	
	@Id
	
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private int id;
	
	
	
	  @OneToMany(mappedBy = "departement")
	  private List<Parcours> parcours;
	 
	 
	
	private String nom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
