package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Presence;
import com.example.demo.repository.PresenceRepository;

import java.util.List;

@Service
public class PresenceService {

    @Autowired
    private PresenceRepository presenceRepository;

    public List<Presence> getAllPresences() {
        return presenceRepository.findAll();
    }

    public Presence getPresenceById(int id) {
        return presenceRepository.findById(id).orElse(null);
    }

    public Presence createPresence(Presence presence) {
        return presenceRepository.save(presence);
    }

    public Presence updatePresence(int id, Presence presenceDetails) {
        Presence presence = presenceRepository.findById(id).orElse(null);
        if (presence != null) {
            presence.setDate(presenceDetails.getDate());
            // update other fields
            return presenceRepository.save(presence);
        }
        return null;
    }

    public void deletePresence(int id) {
        presenceRepository.deleteById(id);
    }
}
