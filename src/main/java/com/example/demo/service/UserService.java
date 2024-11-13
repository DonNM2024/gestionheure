/*
 * package com.example.demo.service;
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.data.domain.Page; import
 * org.springframework.data.domain.PageRequest; import
 * org.springframework.stereotype.Service;
 * 
 * import com.example.demo.entity.User; import
 * com.example.demo.repository.UserRepository;
 * 
 * import java.awt.print.Pageable; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service; import java.util.List;
 * 
 * @Service public class UserService {
 * 
 * @Autowired private UserRepository userRepository;
 * 
 * // Méthode pour créer ou mettre à jour un utilisateur public User
 * saveOrUpdateUser(User user) { return userRepository.save(user); }
 * 
 * // Méthode pour supprimer un utilisateur par ID public void
 * deleteUserById(int id) { userRepository.deleteById(id); }
 * 
 * // Méthode pour rechercher des utilisateurs par nom (insensible à la casse)
 * public List<User> findUsersByNom(String nom) { return
 * userRepository.findByNomContainingIgnoreCase(nom); }
 * 
 * 
 * // Méthode pour récupérer un utilisateur par ID public User getUserById(int
 * id) { return userRepository.findById(id).orElse(null); }
 * 
 * 
 * // Méthode pour récupérer tous les utilisateurs public List<User>
 * getAllUsers() { return userRepository.findAll(); } }
 */


  package com.example.demo.service;
  
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;

import java.util.List;
import java.util.Optional;

  @Service
  public class UserService {

      @Autowired
      private UserRepository userRepository;

      public void saveUser(User user) {
          userRepository.save(user);
      }

      public void deleteUser(int id) {
          userRepository.deleteById(id);
      }

      public List<User> getAllUsers() {
          return userRepository.findAll();
      }

	public List<User> findByNomContainingIgnoreCase(String nom) {
		// TODO Auto-generated method stub
		return userRepository.findByNomContainingIgnoreCase(nom);
	}

	public User findById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}
	public void deleteById(int id) {
        userRepository.deleteById(id);
    }
  }

	

	

