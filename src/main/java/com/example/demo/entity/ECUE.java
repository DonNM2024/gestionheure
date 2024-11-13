package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class ECUE {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	 
		
		  @OneToMany(mappedBy = "ecue")
		  private List<Cours> cours;
		  
		  @OneToMany(mappedBy="ecue")
		  private List<TP> tp;
		  
		  public List<TP> getTp() {
			return tp;
		}
		public void setTp(List<TP> tp) {
			this.tp = tp;
		}
		public List<Cours> getCours() {
			return cours;
		}
		public void setCours(List<Cours> cours) {
			this.cours = cours;
		}
		@OneToMany(mappedBy = "ecue")
		  private List<Credit> credit;
		 
	 
	 
	 
	    public List<Credit> getCredit() {
			return credit;
		}
		public void setCredit(List<Credit> credit) {
			this.credit = credit;
		}
		private String nom;
	    private String code;
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
	 

}
