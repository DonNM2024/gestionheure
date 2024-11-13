package com.example.demo.controller;

import com.example.demo.entity.TP;
import com.example.demo.service.TPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/api/tps")
    public class TPController {

        @Autowired
        private TPService tpService;

        @GetMapping
        public List<TP> getAllTPs() {
            return tpService.getAllTPs();
        }

		/*
		 * @GetMapping("/{id}") public ResponseEntity<TP> getTPById(@PathVariable(value
		 * = "id") int id) { TP tp = tpService.getTPById(id) .orElseThrow(() -> new
		 * RuntimeException("TP not found for this id :: " + id)); return
		 * ResponseEntity.ok().body(tp); }
		 */

        @PostMapping
        public TP createTP(@RequestBody TP tp) {
            return tpService.createTP(tp);
        }

		/*
		 * @PutMapping("/{id}") public ResponseEntity<TP> updateTP(@PathVariable(value =
		 * "id") int id,
		 * 
		 * @RequestBody TP tpDetails) { TP updatedTP = tpService.updateTP(id,
		 * tpDetails); return ResponseEntity.ok(updatedTP); }
		 * 
		 * @DeleteMapping("/{id}") public ResponseEntity<Void>
		 * deleteTP(@PathVariable(value = "id") int id) { tpService.deleteTP(id); return
		 * ResponseEntity.noContent().build(); }
		 */
    }

