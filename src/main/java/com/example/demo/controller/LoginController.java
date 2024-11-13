package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Ce renvoie à login.html dans src/main/resources/templates
    }

    @GetMapping("/home")
    public String home() {
        return "home"; // Ce renvoie à home.html dans src/main/resources/templates
    }
	/*
	 * @GetMapping("/users") public String hometeacher() { return "users"; // Ce
	 * renvoie à home.html dans src/main/resources/templates }
	 * 
	 * @Autowired private UserService service;
	 * 
	 * @PostMapping("/ajouter") public User ajouterUtilisateur(@RequestBody User
	 * user) { return service.enregistrer(user); }
	 * 
	 * @GetMapping("/tous") public List<User> obtenirTousLesUtilisateurs() { return
	 * service.obtenirTous(); }
	 * 
	 * @GetMapping("/{id}") public User obtenirUtilisateurParId(@PathVariable int
	 * id) { return service.obtenirParId(id); }
	 * 
	 * @DeleteMapping("/supprimer/{id}") public void
	 * supprimerUtilisateur(@PathVariable int id) { service.supprimer(id); }
	 */
    
}

