package com.example.demo.repository;


import com.example.demo.entity.ECUE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ECUERepository extends JpaRepository<ECUE, Integer> {
}

