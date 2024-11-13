package com.example.demo.service;

import com.example.demo.entity.HeureEffectue;
import com.example.demo.repository.HeureEffectueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeureEffectueService {

    @Autowired
    private HeureEffectueRepository heureEffectueRepository;

    public List<HeureEffectue> getAllHeureEffectues() {
        return heureEffectueRepository.findAll();
    }

    public Optional<HeureEffectue> getHeureEffectueById(int id) {
        return heureEffectueRepository.findById(id);
    }

    public HeureEffectue createHeureEffectue(HeureEffectue heureEffectue) {
        return heureEffectueRepository.save(heureEffectue);
    }
	/*
	 * public HeureEffectue updateHeureEffectue(int id, HeureEffectue
	 * heureEffectueDetails) { HeureEffectue heureEffectue =
	 * heureEffectueRepository.findById(id) .orElseThrow(() -> new
	 * RuntimeException("HeureEffectue not found for this id :: " + id));
	 * 
	 * heureEffectue.setNombreHeuff(heureEffectueDetails.getNombreHeuff()); //
	 * Update other fields as needed
	 * 
	 * return heureEffectueRepository.save(heureEffectue); }
	 * 
	 * public void deleteHeureEffectue(int id) { HeureEffectue heureEffectue =
	 * heureEffectueRepository.findById(id) .orElseThrow(() -> new
	 * RuntimeException("HeureEffectue not found for this id :: " + id));
	 * 
	 * heureEffectueRepository.delete(heureEffectue); }
	 */
}

