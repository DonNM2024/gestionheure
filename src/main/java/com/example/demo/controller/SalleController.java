package com.example.demo.controller;

import com.example.demo.entity.Salle;
import com.example.demo.service.SalleService;
import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/api/salles")
    public class SalleController {

        @Autowired
        private SalleService salleService;

        @GetMapping
        public List<Salle> getAllSalles() {
            return salleService.getAllSalles();
        }
		/*
		 * @GetMapping("/{id}") public ResponseEntity<Salle>
		 * getSalleById(@PathVariable(value = "id") int id) { Salle salle =
		 * salleService.getSalleById(id) .orElseThrow(() -> new
		 * RuntimeException("Salle not found for this id :: " + id)); return
		 * ResponseEntity.ok().body(salle); }
		 */

        @PostMapping
        public Salle createSalle(@RequestBody Salle salle) {
            return salleService.createSalle(salle);
        }

		/*
		 * @PutMapping("/{id}") public ResponseEntity<Salle>
		 * updateSalle(@PathVariable(value = "id") int id,
		 * 
		 * @RequestBody Salle salleDetails) { Salle updatedSalle =
		 * salleService.updateSalle(id, salleDetails); return
		 * ResponseEntity.ok(updatedSalle); }
		 * 
		 * @DeleteMapping("/{id}") public ResponseEntity<Void>
		 * deleteSalle(@PathVariable(value = "id") int id) {
		 * salleService.deleteSalle(id); return ResponseEntity.noContent().build(); }
		 */
    }
