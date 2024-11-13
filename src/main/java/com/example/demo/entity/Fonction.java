package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Fonction {
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private int id;
	
	
	  @OneToOne
	  //@JoinColumn(name="fonction_id")
	  private User user;
	 
	
	private String categorie;
	private String semestre;
	private String niveauinter;
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getNiveauinter() {
		return niveauinter;
	}
	public void setNiveauinter(String niveauinter) {
		this.niveauinter = niveauinter;
	}
	

}
