package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class HeureEffectue {
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
	  
	  //@JoinColumn(name="tp_id")
	private TP tp;
	  
	
	
	  public TP getTp() {
		return tp;
	}
	public void setTp(TP tp) {
		this.tp = tp;
	}


	@ManyToOne
	  
	 // @JoinColumn(name="cours_id")
	  private Cours cours;
	 
	
	public Cours getCours() {
		return cours;
	}
	public void setCours(Cours cours) {
		this.cours = cours;
	}
	private int nombreHeuff;
	public int getNombreHeuff() {
		return nombreHeuff;
	}
	public void setNombreHeuff(int nombreHeuff) {
		this.nombreHeuff = nombreHeuff;
	}
	

}
