package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Fonction;
import com.example.demo.service.FonctionService;

import java.util.List;

@RestController
@RequestMapping("/api/fonctions")
public class FonctionController {

    @Autowired
    private FonctionService fonctionService;

    @GetMapping
    public List<Fonction> getAllFonctions() {
        return fonctionService.getAllFonctions();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fonction> getFonctionById(@PathVariable int id) {
        Fonction fonction = fonctionService.getFonctionById(id);
        if (fonction != null) {
            return ResponseEntity.ok(fonction);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Fonction createFonction(@RequestBody Fonction fonction) {
        return fonctionService.createFonction(fonction);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fonction> updateFonction(@PathVariable int id, @RequestBody Fonction fonctionDetails) {
        Fonction updatedFonction = fonctionService.updateFonction(id, fonctionDetails);
        if (updatedFonction != null) {
            return ResponseEntity.ok(updatedFonction);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFonction(@PathVariable int id) {
        fonctionService.deleteFonction(id);
        return ResponseEntity.noContent().build();
    }
}
