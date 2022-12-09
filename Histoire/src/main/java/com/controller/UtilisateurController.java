//package com.inti.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.inti.entities.Utilisateur;
//import com.inti.service.interfaces.IUtilisateurService;
//
//@RestController
//@CrossOrigin
//public class UtilisateurController {
//	@Autowired
//	IUtilisateurService utilisateurService;
//
//	@GetMapping("/utilisateurs")
//	public List<Utilisateur> findAll() {
//		return utilisateurService.findAll();
//	}
//
//	@RequestMapping(value = "utilisateurs/{idU}", method = RequestMethod.GET)
//	public Utilisateur findOne(@PathVariable("idU") Long idUtilisateur) {
//		return utilisateurService.findOne(idUtilisateur);
//	}
//
//	/*
//	 * @PostMapping("/utilisateurs") public Utilisateur saveUtilisateur(@RequestBody
//	 * Utilisateur utilisateur) { return utilisateurService.save(utilisateur); }
//	 */
//	@PostMapping("/utilisateurs")
//	public String saveUtilisateur(@RequestParam("nom") String nom, @RequestParam("prenom") String prenom,
//			@RequestParam("username") String username, @RequestParam("password") String password,
//			@RequestParam("file") MultipartFile file) {
//		try {
//			Utilisateur currentUser=new Utilisateur();
//			currentUser.setNomUtilisateur(nom);
//			currentUser.setPrenomUtilisateur(prenom);
//			currentUser.setUsername(username);
//			currentUser.setPassword(password);
//			currentUser.setImage(file.getBytes());
//			utilisateurService.save(currentUser);
//			return "File uploaded successfully! filename="+file.getOriginalFilename();
//		}catch(Exception ex) {
//			ex.printStackTrace();
//			return "Fail! maybe ya had uploaded the file before or the file's size > 500KB";
//		}
//	}
//
//	@PutMapping("/utilisateurs/{idU}")
//	public Utilisateur updateUtilisateur(@PathVariable("idU") Long idUtilisateur,
//			@RequestBody Utilisateur utilisateur) {
//		Utilisateur currentUtilisateur = utilisateurService.findOne(idUtilisateur);
//		currentUtilisateur.setNomUtilisateur(utilisateur.getNomUtilisateur());
//		currentUtilisateur.setPrenomUtilisateur(utilisateur.getPrenomUtilisateur());
//		currentUtilisateur.setUsername(utilisateur.getUsername());
//		currentUtilisateur.setPassword(utilisateur.getPassword());
//		return utilisateurService.save(currentUtilisateur);
//	}
//
//	@DeleteMapping("/utilisateurs/{idUtilisateur}")
//	public void deleteUtilisateur(@PathVariable("idUtilisateur") Long idUtilisateur) {
//		utilisateurService.delete(idUtilisateur);
//	}
//}
