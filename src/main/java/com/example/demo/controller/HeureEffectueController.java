package com.example.demo.controller;

import com.example.demo.entity.HeureEffectue;
import com.example.demo.service.HeureEffectueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/heureEffectues")
public class HeureEffectueController {

    @Autowired
    private HeureEffectueService heureEffectueService;

    @GetMapping
    public List<HeureEffectue> getAllHeureEffectues() {
        return heureEffectueService.getAllHeureEffectues();
    }


    @PostMapping
    public HeureEffectue createHeureEffectue(@RequestBody HeureEffectue heureEffectue) {
        return heureEffectueService.createHeureEffectue(heureEffectue);
    }

	/*
	 * @PutMapping("/{id}") public ResponseEntity<HeureEffectue>
	 * updateHeureEffectue(@PathVariable(value = "id") int id,
	 * 
	 * @RequestBody HeureEffectue heureEffectueDetails) { HeureEffectue
	 * updatedHeureEffectue = heureEffectueService.updateHeureEffectue(id,
	 * heureEffectueDetails); return ResponseEntity.ok(updatedHeureEffectue); }
	 * 
	 * @DeleteMapping("/{id}") public ResponseEntity<Void>
	 * deleteHeureEffectue(@PathVariable(value = "id") int id) {
	 * heureEffectueService.deleteHeureEffectue(id); return
	 * ResponseEntity.noContent().build(); }
	 */
}

