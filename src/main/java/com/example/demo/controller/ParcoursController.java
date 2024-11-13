package com.example.demo.controller;

import com.example.demo.entity.Parcours;
import com.example.demo.service.ParcoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parcours")
public class ParcoursController {

    @Autowired
    private ParcoursService parcoursService;

    @GetMapping
    public List<Parcours> getAllParcours() {
        return parcoursService.getAllParcours();
    }

	/*
	 * @GetMapping("/{id}") public ResponseEntity<Parcours>
	 * getParcoursById(@PathVariable(value = "id") int id) { Parcours parcours =
	 * parcoursService.getParcoursById(id) .orElseThrow(() -> new
	 * RuntimeException("Parcours not found for this id :: " + id)); return
	 * ResponseEntity.ok().body(parcours); }
	 */
    @PostMapping
    public Parcours createParcours(@RequestBody Parcours parcours) {
        return parcoursService.createParcours(parcours);
    }

	/*
	 * @PutMapping("/{id}") public ResponseEntity<Parcours>
	 * updateParcours(@PathVariable(value = "id") int id,
	 * 
	 * @RequestBody Parcours parcoursDetails) { Parcours updatedParcours =
	 * parcoursService.updateParcours(id, parcoursDetails); return
	 * ResponseEntity.ok(updatedParcours); }
	 * 
	 * @DeleteMapping("/{id}") public ResponseEntity<Void>
	 * deleteParcours(@PathVariable(value = "id") int id) {
	 * parcoursService.deleteParcours(id); return
	 * ResponseEntity.noContent().build(); }
	 */
}
