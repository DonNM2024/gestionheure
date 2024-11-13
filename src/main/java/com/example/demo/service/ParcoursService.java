package com.example.demo.service;

import com.example.demo.entity.Parcours;
import com.example.demo.repository.ParcoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParcoursService {

    @Autowired
    private ParcoursRepository parcoursRepository;

    public List<Parcours> getAllParcours() {
        return parcoursRepository.findAll();
    }

    public Optional<Parcours> getParcoursById(int id) {
        return parcoursRepository.findById(id);
    }

    public Parcours createParcours(Parcours parcours) {
        return parcoursRepository.save(parcours);
    }

	/*
	 * public Parcours updateParcours(int id, Parcours parcoursDetails) { Parcours
	 * parcours = parcoursRepository.findById(id) .orElseThrow(() -> new
	 * RuntimeException("Parcours not found for this id :: " + id));
	 * 
	 * parcours.setNom(parcoursDetails.getNom()); // Update other fields as needed
	 * 
	 * return parcoursRepository.save(parcours); }
	 * 
	 * public void deleteParcours(int id) { Parcours parcours =
	 * parcoursRepository.findById(id) .orElseThrow(() -> new
	 * RuntimeException("Parcours not found for this id :: " + id));
	 * 
	 * parcoursRepository.delete(parcours); }
	 */
}
