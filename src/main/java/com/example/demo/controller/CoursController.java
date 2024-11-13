package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Cours;
import com.example.demo.service.CoursService;

import java.util.List;

@RestController
@RequestMapping("/api/cours")
public class CoursController {

    @Autowired
    private CoursService coursService;

    @GetMapping
    public List<Cours> getAllCours() {
        return coursService.getAllCours();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cours> getCoursById(@PathVariable int id) {
        Cours cours = coursService.getCoursById(id);
        if (cours != null) {
            return ResponseEntity.ok(cours);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Cours createCours(@RequestBody Cours cours) {
        return coursService.createCours(cours);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cours> updateCours(@PathVariable int id, @RequestBody Cours coursDetails) {
        Cours updatedCours = coursService.updateCours(id, coursDetails);
        if (updatedCours != null) {
            return ResponseEntity.ok(updatedCours);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCours(@PathVariable int id) {
        coursService.deleteCours(id);
        return ResponseEntity.noContent().build();
    }
}

