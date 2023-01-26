package com.dge.utilisateur;
import java.util.*;

import org.springframework.web.bind.annotation.RestController;

import com.dge.exception.ExceptionEntity;
import com.dge.exception.UtilisateurAlreadyExistException;
import com.dge.exception.UtilisateurNotExistException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/v1/utilisateur")
public class UtilisateurController {
	
	/**
	 * @return
	 */
	
	 private final UtilisateurService utilisateurservice;
	@Autowired
	public UtilisateurController(UtilisateurService utilisateurservice) {
		this.utilisateurservice = utilisateurservice;
	}

	@GetMapping
    public List<Utilisateur> getUtilisateur(){
		return utilisateurservice.getUtilisateur();
    }

	@PostMapping
	public void insertUtilisateur(@RequestBody Utilisateur utilisateur){
		utilisateurservice.Addutilisateur(utilisateur);
	}

	@DeleteMapping(path="{utilisateurId}")
	public void deleteUtilisateur(@PathVariable("utilisateurId") Long id){
		utilisateurservice.deleteUtilisateurbyid(id);

	}

	@PutMapping(path="{utilisateurId}")
	public String updateUtilisateur(
		@PathVariable("utilisateurId") Long id,
		@RequestParam(required = false) String nom,
		@RequestParam(required = false) String email)
		{
			return  utilisateurservice.updateUtilisateurbyid(id,nom,email);			
		}
	@PostMapping(path="/inscrire")
		public ResponseEntity<Object> inscrire(@RequestBody Utilisateur u) throws Exception {
			try {
				Utilisateur result = utilisateurservice.inscrire(u);
				return new ResponseEntity<>(result, HttpStatus.OK);
			} catch (UtilisateurAlreadyExistException e) {
				e.printStackTrace();
				return new ResponseEntity<>(new ExceptionEntity(e), HttpStatus.BAD_REQUEST);
			} catch (Exception e) {
				return new ResponseEntity<>(new ExceptionEntity(e), HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}
	
	@PostMapping("/login")
		public ResponseEntity<Object> connexion(@RequestBody Utilisateur u) {
			try {
				return new ResponseEntity<>(utilisateurservice.connexion(u.getEmail(), u.getMdp()), HttpStatus.OK);
			} catch (UtilisateurNotExistException e) {
				e.printStackTrace();
				return new ResponseEntity<>(new ExceptionEntity(e), HttpStatus.BAD_REQUEST); 
			}
		}	
}
