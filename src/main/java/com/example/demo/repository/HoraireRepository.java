package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Horaire;

public interface HoraireRepository extends JpaRepository<Horaire, Integer> {
	
}

