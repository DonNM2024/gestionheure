package com.example.demo.controller;

import com.example.demo.entity.Credit;
import com.example.demo.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/credits")
public class CreditController {

    @Autowired
    private CreditService creditService;

    @GetMapping
    public List<Credit> getAllCredits() {
        return creditService.getAllCredits();
    }

	/*
	 * @GetMapping("/{id}") public ResponseEntity<Credit>
	 * getCreditById(@PathVariable(value = "id") int id) { Credit credit =
	 * creditService.getCreditById(id) .orElseThrow(() -> new
	 * RuntimeException("Credit not found for this id :: " + id)); return
	 * ResponseEntity.ok().body(credit); }
	 */

    @PostMapping
    public Credit createCredit(@RequestBody Credit credit) {
        return creditService.createCredit(credit);
    }

	/*
	 * @PutMapping("/{id}") public ResponseEntity<Credit>
	 * updateCredit(@PathVariable(value = "id") int id,
	 * 
	 * @RequestBody Credit creditDetails) { Credit updatedCredit =
	 * creditService.updateCredit(id, creditDetails); return
	 * ResponseEntity.ok(updatedCredit); }
	 * 
	 * @DeleteMapping("/{id}") public ResponseEntity<Void>
	 * deleteCredit(@PathVariable(value = "id") int id) {
	 * creditService.deleteCredit(id); return ResponseEntity.noContent().build(); }
	 */
}
