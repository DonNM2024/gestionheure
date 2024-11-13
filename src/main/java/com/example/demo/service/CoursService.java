package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cours;
import com.example.demo.repository.CoursRepository;

import java.util.List;

@Service
public class CoursService {

    @Autowired
    private CoursRepository coursRepository;

    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }

    public Cours getCoursById(int id) {
        return coursRepository.findById(id).orElse(null);
    }

    public Cours createCours(Cours cours) {
        return coursRepository.save(cours);
    }

    public Cours updateCours(int id, Cours coursDetails) {
        Cours cours = coursRepository.findById(id).orElse(null);
        if (cours != null) {
            cours.setNom(coursDetails.getNom());
            // update other fields
            return coursRepository.save(cours);
        }
        return null;
    }

    public void deleteCours(int id) {
        coursRepository.deleteById(id);
    }
}
