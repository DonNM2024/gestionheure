package com.example.demo.service;

import com.example.demo.entity.Salle;
import com.example.demo.repository.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalleService {

    @Autowired
    private SalleRepository salleRepository;

    public List<Salle> getAllSalles() {
        return salleRepository.findAll();
    }

    public Optional<Salle> getSalleById(int id) {
        return salleRepository.findById(id);
    }

    public Salle createSalle(Salle salle) {
        return salleRepository.save(salle);
    }

	/*
	 * public Salle updateSalle(int id, Salle salleDetails) { Salle salle =
	 * salleRepository.findById(id) .orElseThrow(() -> new
	 * RuntimeException("Salle not found for this id :: " + id));
	 * 
	 * salle.setNom(salleDetails.getNom());
	 * salle.setFiliere(salleDetails.getFiliere()); // Update other fields as needed
	 * 
	 * return salleRepository.save(salle); }
	 * 
	 * public void deleteSalle(int id) { Salle salle = salleRepository.findById(id)
	 * .orElseThrow(() -> new RuntimeException("Salle not found for this id :: " +
	 * id));
	 * 
	 * salleRepository.delete(salle); }
	 */
}

