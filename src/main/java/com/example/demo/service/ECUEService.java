package com.example.demo.service;

import com.example.demo.entity.ECUE;
import com.example.demo.repository.ECUERepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ECUEService {

    @Autowired
    private ECUERepository ecueRepository;

    public List<ECUE> getAllECUEs() {
        return ecueRepository.findAll();
    }

    public Optional<ECUE> getECUEById(int id) {
        return ecueRepository.findById(id);
    }

    public ECUE createECUE(ECUE ecue) {
        return ecueRepository.save(ecue);
    }
}
/*
 * public ECUE updateECUE(int id, ECUE ecueDetails) { ECUE ecue =
 * ecueRepository.findById(id) .orElseThrow(() -> new
 * RuntimeException("ECUE not found for this id :: " + id));
 * 
 * ecue.setNom(ecueDetails.getNom()); ecue.setCode(ecueDetails.getCode()); //
 * Update other fields as needed
 * 
 * return ecueRepository.save(ecue); }
 * 
 * public void deleteECUE(int id) { ECUE ecue = ecueRepository.findById(id)
 * .orElseThrow(() -> new RuntimeException("ECUE not found for this id :: " +
 * id));
 * 
 * ecueRepository.delete(ecue); } }
 * 
 */