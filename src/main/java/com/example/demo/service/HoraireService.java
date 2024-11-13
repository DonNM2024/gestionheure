package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Horaire;
import com.example.demo.repository.HoraireRepository;

import java.util.List;

@Service
public class HoraireService {

    @Autowired
    private HoraireRepository horaireRepository;

    public List<Horaire> getAllHoraires() {
        return horaireRepository.findAll();
    }

    public Horaire getHoraireById(int id) {
        return horaireRepository.findById(id).orElse(null);
    }

    public Horaire createHoraire(Horaire horaire) {
        return horaireRepository.save(horaire);
    }

    public Horaire updateHoraire(int id, Horaire horaireDetails) {
        Horaire horaire = horaireRepository.findById(id).orElse(null);
        if (horaire != null) {
            horaire.setDate(horaireDetails.getDate());
            horaire.setDuree(horaireDetails.getDuree());
            // update other fields
            return horaireRepository.save(horaire);
        }
        return null;
    }

    public void deleteHoraire(int id) {
        horaireRepository.deleteById(id);
    }
}
