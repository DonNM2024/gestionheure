package com.example.demo.controller;

import com.example.demo.entity.Departement;
import com.example.demo.service.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departements")
public class DepartementController {

    @Autowired
    private DepartementService departementService;

    @GetMapping
    public List<Departement> getAllDepartements() {
        return departementService.getAllDepartements();
    }

    @PostMapping
    public Departement createDepartement(@RequestBody Departement departement) {
        return departementService.createDepartement(departement);
    }

	/*
	 * @PutMapping("/{id}") public ResponseEntity<Departement>
	 * updateDepartement(@PathVariable(value = "id") int id,
	 * 
	 * @RequestBody Departement departementDetails) { Departement updatedDepartement
	 * = departementService.updateDepartement(id, departementDetails); return
	 * ResponseEntity.ok(updatedDepartement); }
	 * 
	 * @DeleteMapping("/{id}") public ResponseEntity<Void>
	 * deleteDepartement(@PathVariable(value = "id") int id) {
	 * departementService.deleteDepartement(id); return
	 * ResponseEntity.noContent().build(); }
	 */
}

