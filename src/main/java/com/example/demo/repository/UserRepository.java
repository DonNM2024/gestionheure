package com.example.demo.repository;




import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findById(int id);

	List<User> findByNomContainingIgnoreCase(String nom);

	


	
	
	
}
