package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Fonction;
import com.example.demo.repository.FonctionRepository;

import java.util.List;

@Service
public class FonctionService {

    @Autowired
    private FonctionRepository fonctionRepository;

    public List<Fonction> getAllFonctions() {
        return fonctionRepository.findAll();
    }

    public Fonction getFonctionById(int id) {
        return fonctionRepository.findById(id);
    }

    public Fonction createFonction(Fonction fonction) {
        return fonctionRepository.save(fonction);
    }

    public Fonction updateFonction(int id, Fonction fonctionDetails) {
        Fonction fonction = fonctionRepository.findById(id);
        if (fonction != null) {
            fonction.setCategorie(fonctionDetails.getCategorie());
            fonction.setNiveauinter(fonctionDetails.getNiveauinter());
            fonction.setSemestre(fonctionDetails.getSemestre());
            // update other fields
            return fonctionRepository.save(fonction);
        }
        return null;
    }

    public void deleteFonction(int id) {
        fonctionRepository.deleteById(id);
    }
}
