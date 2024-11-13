package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Horaire {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private int id;
	
	
	  @ManyToOne
	  
	  //@JoinColumn(name="cours_id")
	  private Cours cours;
	  
	  public Cours getCours() {
		return cours;
	}
	public void setCours(Cours cours) {
		this.cours = cours;
	}
	@ManyToOne
	  
	  //@JoinColumn(name="user_id")
	private User user;
	 
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	private Date date;
	private int duree;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}

}
