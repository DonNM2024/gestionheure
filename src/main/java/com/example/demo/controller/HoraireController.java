package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Horaire;
import com.example.demo.service.HoraireService;

import java.util.List;

@RestController
@RequestMapping("/api/horaires")
public class HoraireController {

    @Autowired
    private HoraireService horaireService;

    @GetMapping
    public List<Horaire> getAllHoraires() {
        return horaireService.getAllHoraires();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Horaire> getHoraireById(@PathVariable int id) {
        Horaire horaire = horaireService.getHoraireById(id);
        if (horaire != null) {
            return ResponseEntity.ok(horaire);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Horaire createHoraire(@RequestBody Horaire horaire) {
        return horaireService.createHoraire(horaire);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Horaire> updateHoraire(@PathVariable int id, @RequestBody Horaire horaireDetails) {
        Horaire updatedHoraire = horaireService.updateHoraire(id, horaireDetails);
        if (updatedHoraire != null) {
            return ResponseEntity.ok(updatedHoraire);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHoraire(@PathVariable int id) {
        horaireService.deleteHoraire(id);
        return ResponseEntity.noContent().build();
    }
}

