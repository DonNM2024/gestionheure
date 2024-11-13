package com.example.demo.service;

import com.example.demo.entity.Departement;
import com.example.demo.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartementService {

    @Autowired
    private DepartementRepository departementRepository;

    public List<Departement> getAllDepartements() {
        return departementRepository.findAll();
    }

    public Optional<Departement> getDepartementById(int id) {
        return departementRepository.findById(id);
    }

    public Departement createDepartement(Departement departement) {
        return departementRepository.save(departement);
    }
}
/*
 * public Departement updateDepartement(int id, Departement departementDetails)
 * { Departement departement = departementRepository.findById(id)
 * .orElseThrow(() -> new
 * RuntimeException("Departement not found for this id :: " + id));
 * 
 * departement.setNom(departementDetails.getNom()); // Update other fields as
 * needed
 * 
 * return departementRepository.save(departement); }
 * 
 * public void deleteDepartement(int id) { Departement departement =
 * departementRepository.findById(id) .orElseThrow(() -> new
 * RuntimeException("Departement not found for this id :: " + id));
 * 
 * departementRepository.delete(departement); } }
 */