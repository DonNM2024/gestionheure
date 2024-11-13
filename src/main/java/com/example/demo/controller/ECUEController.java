package com.example.demo.controller;

import com.example.demo.entity.ECUE;
import com.example.demo.service.ECUEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ecues")
public class ECUEController {

    @Autowired
    private ECUEService ecueService;

    @GetMapping
    public List<ECUE> getAllECUEs() {
        return ecueService.getAllECUEs();
    }


    @PostMapping
    public ECUE createECUE(@RequestBody ECUE ecue) {
        return ecueService.createECUE(ecue);
    }

	/*
	 * @PutMapping("/{id}") public ResponseEntity<ECUE>
	 * updateECUE(@PathVariable(value = "id") int id,
	 * 
	 * @RequestBody ECUE ecueDetails) { ECUE updatedECUE =
	 * ecueService.updateECUE(id, ecueDetails); return
	 * ResponseEntity.ok(updatedECUE); }
	 * 
	 * @DeleteMapping("/{id}") public ResponseEntity<Void>
	 * deleteECUE(@PathVariable(value = "id") int id) { ecueService.deleteECUE(id);
	 * return ResponseEntity.noContent().build(); }
	 */
}
