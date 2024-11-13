package com.example.demo.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Cours {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private int id;
	
	
	  @ManyToOne
	  
	  //@JoinColumn(name="user_id")
	  private User user;
	  
	  
	  public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@ManyToOne
	  
	  //@JoinColumn(name="cours")
	  private Salle salle;
	  
	  
	  public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	@ManyToOne
	  
	  //@JoinColumn(name="parcours_id")
	  private Parcours parcours;
	  
	  public Parcours getParcours() {
		return parcours;
	}
	public void setParcours(Parcours parcours) {
		this.parcours = parcours;
	}
	@ManyToOne
	  
	  //@JoinColumn(name = "ecue_id")
	  private ECUE ecue;
	  
	  public ECUE getEcue() {
		return ecue;
	}
	public void setEcue(ECUE ecue) {
		this.ecue = ecue;
	}
	public List<HeureEffectue> getHeureffectueList() {
		return heureffectueList;
	}
	public void setHeureffectueList(List<HeureEffectue> heureffectueList) {
		this.heureffectueList = heureffectueList;
	}
	@OneToMany(mappedBy="cours")
	  private List<HeureEffectue> heureffectueList;
	  
	  @OneToMany(mappedBy="cours")
	  private List<Presence> presence;
	  
	  public List<Presence> getPresence() {
		return presence;
	}
	public void setPresence(List<Presence> presence) {
		this.presence = presence;
	}
	@OneToMany(mappedBy="cours")
	  private List<Horaire> horaireList;
	 
	
	

	public List<Horaire> getHoraireList() {
		return horaireList;
	}
	public void setHoraireList(List<Horaire> horaireList) {
		this.horaireList = horaireList;
	}
	private String nom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	

}
