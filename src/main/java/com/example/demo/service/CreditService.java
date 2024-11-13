package com.example.demo.service;

import com.example.demo.entity.Credit;
import com.example.demo.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreditService {

    @Autowired
    private CreditRepository creditRepository;

    public List<Credit> getAllCredits() {
        return creditRepository.findAll();
    }

    public Optional<Credit> getCreditById(int id) {
        return creditRepository.findById(id);
    }

    public Credit createCredit(Credit credit) {
        return creditRepository.save(credit);
    }
	/*
	 * public Credit updateCredit(int id, Credit creditDetails) { Credit credit =
	 * creditRepository.findById(id) .orElseThrow(() -> new
	 * RuntimeException("Credit not found for this id :: " + id));
	 * 
	 * credit.setC(creditDetails.getC()); credit.setGP(creditDetails.getGP()); //
	 * Update other fields as needed
	 * 
	 * return creditRepository.save(credit); }
	 */
	/*
	 * public void deleteCredit(int id) { Credit credit =
	 * creditRepository.findById(id) .orElseThrow(() -> new
	 * RuntimeException("Credit not found for this id :: " + id));
	 * 
	 * creditRepository.delete(credit); }
	 */
}

