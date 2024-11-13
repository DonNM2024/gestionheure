package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private int id;
	
	
	// Getter pour 'id'
    public int getId() {
        return id;
    }

    // Setter pour 'id'
    public void setId(int id) {
        this.id = id;
    }
	
	
	@OneToOne(cascade = CascadeType.ALL)
	  //@JoinColumn(name="fonction_id")
	  private Fonction fonction;
	  
		/*
		 * public Fonction getFonction() { return fonction; } public void
		 * setFonction(Fonction fonction) { this.fonction = fonction; }
		 */
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	  private List<Presence> presence;
	  
		/*
		 * public List<Presence> getPresence() { return presence; } public void
		 * setPresence(List<Presence> presence) { this.presence = presence; }
		 */
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	  private List<HeureEffectue> heureeffectuee;
	  
	  @OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	  private List<Cours> cours;
	  
		/*
		 * public List<HeureEffectue> getHeureeffectuee() { return heureeffectuee; }
		 * public void setHeureeffectuee(List<HeureEffectue> heureeffectuee) {
		 * this.heureeffectuee = heureeffectuee; } public List<Cours> getCours() {
		 * return cours; } public void setCours(List<Cours> cours) { this.cours = cours;
		 * }
		 */
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL) 
	  private List<Horaire> horaire;
	 
	
	
	
		/*
		 * public List<Horaire> getHoraire() { return horaire; } public void
		 * setHoraire(List<Horaire> horaire) { this.horaire = horaire; }
		 */
	private String nom;
	private String prenom;
	private String grade;
	private String etablissementorigine;
	
	//constructeur par defaut
	public User() {
		super();
	}
	
	
	//constructeur avec parametre 
	public User(int id, String nom, String prenom, String grade, String etablissementorigine) {
			
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.grade = grade;
		this.setEtablissementorigine(etablissementorigine);
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getEtablissementorigine() {
		return etablissementorigine;
	}

	public void setEtablissementorigine(String etablissementorigine) {
		this.etablissementorigine = etablissementorigine;
	}
	
	
}
