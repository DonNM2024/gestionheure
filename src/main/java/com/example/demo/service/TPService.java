package com.example.demo.service;

import com.example.demo.entity.TP;
import com.example.demo.repository.TPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TPService {

    @Autowired
    private TPRepository tpRepository;

    public List<TP> getAllTPs() {
        return tpRepository.findAll();
    }

    public Optional<TP> getTPById(int id) {
        return tpRepository.findById(id);
    }

    public TP createTP(TP tp) {
        return tpRepository.save(tp);
    }

	/*
	 * public TP updateTP(int id, TP tpDetails) { TP tp = tpRepository.findById(id)
	 * .orElseThrow(() -> new RuntimeException("TP not found for this id :: " +
	 * id));
	 * 
	 * tp.setNom(tpDetails.getNom()); // Update other fields as needed
	 * 
	 * return tpRepository.save(tp); }
	 * 
	 * public void deleteTP(int id) { TP tp = tpRepository.findById(id)
	 * .orElseThrow(() -> new RuntimeException("TP not found for this id :: " +
	 * id));
	 * 
	 * tpRepository.delete(tp); }
	 */
}
