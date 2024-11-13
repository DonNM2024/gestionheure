package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Fonction;



public interface FonctionRepository extends JpaRepository<Fonction,Integer> {
	
	Fonction findById(int id);
	Fonction deleteById(int id);
	
	
}
