package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Presence;
import com.example.demo.service.PresenceService;

import java.util.List;

@RestController
@RequestMapping("/api/presences")
public class PresenceController {

    @Autowired
    private PresenceService presenceService;

    @GetMapping
    public List<Presence> getAllPresences() {
        return presenceService.getAllPresences();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Presence> getPresenceById(@PathVariable int id) {
        Presence presence = presenceService.getPresenceById(id);
        if (presence != null) {
            return ResponseEntity.ok(presence);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Presence createPresence(@RequestBody Presence presence) {
        return presenceService.createPresence(presence);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Presence> updatePresence(@PathVariable int id, @RequestBody Presence presenceDetails) {
        Presence updatedPresence = presenceService.updatePresence(id, presenceDetails);
        if (updatedPresence != null) {
            return ResponseEntity.ok(updatedPresence);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePresence(@PathVariable int id) {
        presenceService.deletePresence(id);
        return ResponseEntity.noContent().build();
    }
}
