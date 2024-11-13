package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Salle {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private int id;
	
	
	  @OneToMany(mappedBy = "salle")
	  private List<Cours> cours;
	 
	
	public List<Cours> getCours() {
		return cours;
	}
	public void setCours(List<Cours> cours) {
		this.cours = cours;
	}
	private String nom;
	private String filiere;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

}
