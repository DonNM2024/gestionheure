package com.example.demo.repository;

import com.example.demo.entity.HeureEffectue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeureEffectueRepository extends JpaRepository<HeureEffectue, Integer> {
}

