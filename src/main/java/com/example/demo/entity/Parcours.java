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
public class Parcours {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private int id;
	
	
	 
	@ManyToOne
	  
	  //@JoinColumn(name="departement_id") 
	  private Departement departement;
	
	 public Departement getDepartement() {
			return departement;
		}
		public void setDepartement(Departement departement) {
			this.departement = departement;
		}
	  
	  @OneToMany(mappedBy = "parcours")
	  private List<Cours> cours;
	 
	
	public List<Cours> getCours() {
		return cours;
	}
	public void setCours(List<Cours> cours) {
		this.cours = cours;
	}
	private String nom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
