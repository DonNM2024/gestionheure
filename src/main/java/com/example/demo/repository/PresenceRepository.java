package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Presence;

public interface PresenceRepository extends JpaRepository<Presence, Integer> {
}

