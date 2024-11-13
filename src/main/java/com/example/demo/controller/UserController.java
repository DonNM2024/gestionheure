/*
 * package com.example.demo.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.
 * Pageable; import org.springframework.data.domain.Page; import
 * org.springframework.data.domain.PageRequest; import
 * org.springframework.data.web.PageableDefault; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.*;
 * 
 * import com.example.demo.entity.User; import
 * com.example.demo.repository.UserRepository; import
 * com.example.demo.service.UserService;
 * 
 * @Controller public class UserController {
 * 
 * @Autowired private UserRepository userRepository;
 * 
 * // Affiche la page de gestion des utilisateurs
 * 
 * @GetMapping("/users") public String getUsersPage(Model model) {
 * model.addAttribute("user", new User()); return "users"; }
 * 
 * // Gère la création ou la mise à jour de l'utilisateur
 * 
 * @PostMapping("/save") public String saveOrUpdateUser(@ModelAttribute User
 * user) { userRepository.save(user); return "redirect:/users"; }
 * 
 * 
 * // Gère la recherche par nom
 * 
 * @PostMapping("/search") public String
 * searchUserByName(@RequestParam("searchName") String searchName, Model model)
 * { List<User> users =
 * userRepository.findByNomContainingIgnoreCase(searchName);
 * model.addAttribute("users", users); model.addAttribute("user", new User());
 * // pour le formulaire de création return "users"; }
 * 
 * 
 * // Méthode pour rechercher un utilisateur par nom
 * 
 * @PostMapping("/search") public String searchUser(@RequestParam("nom") String
 * nom, Model model) { List<User> users =
 * userRepository.findByNomContainingIgnoreCase(nom); if (!users.isEmpty()) {
 * model.addAttribute("user", users.get(0)); // Affiche le premier résultat
 * trouvé } else { model.addAttribute("user", new User()); // Affiche un
 * formulaire vide si aucun résultat } return "users"; }
 * 
 * 
 * // Gère la suppression de l'utilisateur
 * 
 * @GetMapping("/delete/{id}") public String deleteUser(@PathVariable int id) {
 * userRepository.deleteById(id); return "redirect:/users"; }
 * 
 * // Gère l'affichage des détails pour modification
 * 
 * @GetMapping("/edit/{id}") public String editUser(@PathVariable int id, Model
 * model) { User user = userRepository.findById(id).orElse(null);
 * model.addAttribute("user", user); return "users"; } }
 */


  package com.example.demo.controller;
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.stereotype.Controller;
  import org.springframework.ui.Model;
  import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import java.util.List;

  @Controller
  public class UserController {

      // Injection du UserService
      @Autowired
      private UserService userService;

		
		  // Méthode pour afficher la page de gestion des utilisateurs
		  
			
			  @GetMapping("/users")
			  public String showUserForm(Model model) {
			  model.addAttribute("user", new User());
			  return "users"; }
			 
		
			  @PostMapping("/update")
			    public String updateUser(User user) {
			        userService.saveUser(user);
			        return "redirect:/listusers";
			    }

      // Méthode pour enregistrer ou mettre à jour un utilisateur
      @PostMapping("/save")
      public String saveUser(@ModelAttribute("user") User user) {
          userService.saveUser(user);
          return "redirect:/users"; // Rediriger vers le formulaire après l'enregistrement
      }

      @GetMapping("/search")
      public String searchUsers(@RequestParam("nom") String nom, Model model) {
          List<User> users = userService.findByNomContainingIgnoreCase(nom); // Modifier selon votre méthode de recherche
          model.addAttribute("users", users);
          model.addAttribute("user", new User()); // Pour le formulaire de création/mise à jour
          return "users"; // Remplacez par le nom de votre fichier HTML sans l'extension
      }

         
      @PostMapping("/delete/{id}")
      public String deleteUser(@PathVariable("id") int id) {
          userService.deleteById(id);
          return "redirect:/listusers"; // Redirige vers la liste des utilisateurs après suppression
      }

      // Méthode pour afficher la liste des utilisateurs
      @GetMapping("/listusers")
      public String listUsers(Model model) {
          model.addAttribute("users", userService.getAllUsers());
          return "listusers";
      }
      
      @GetMapping("/edit/{id}")
      public String showEditForm(@PathVariable("id") int id, Model model) {
          User user = userService.findById(id);
          model.addAttribute("user", user); // Vérifiez que l'attribut est nommé "user"
          return "edituser"; // Assurez-vous que ce nom correspond à votre fichier HTML
      }

  }
