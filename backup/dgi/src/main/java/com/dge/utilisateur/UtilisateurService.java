package com.dge.utilisateur;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dge.exception.UtilisateurAlreadyExistException;
import com.dge.exception.UtilisateurNotExistException;


@Service
public class UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    @Autowired
    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    // private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
    public Utilisateur findByLogin(String email) throws UtilisateurNotExistException {
      Optional<Utilisateur> result = utilisateurRepository.findUtilisateurByemail(email);
      if(!result.isPresent())
        throw new UtilisateurNotExistException("Cet utilisateur n'existe pas!!");
      return result.get();
    }

    public Utilisateur inscrire(Utilisateur u) throws UtilisateurAlreadyExistException {
      // u.setMdp(passwordEncoder.encode(u.getMdp()));
      Optional<Utilisateur> userTemp = utilisateurRepository.findUtilisateurByemail(u.getEmail());
      if(userTemp.isPresent())
        throw new UtilisateurAlreadyExistException("Cet utilisateur existe déjà!!");
      Utilisateur result = utilisateurRepository.save(u); 
      return result;
    }

    public Utilisateur connexion(String email, String mdp) throws UtilisateurNotExistException {
      Optional<Utilisateur> userTemp = utilisateurRepository.findUtilisateurByemail(email);
      if(!userTemp.isPresent())
        throw new UtilisateurNotExistException("Login ou mot de passe incorrects!!");
      else 
        if(!mdp.equals(userTemp.get().getMdp()))
        // if(!passwordEncoder.matches(mdp, userTemp.get().getMdp()))
          throw new UtilisateurNotExistException("Login ou mot de passe incorrects!!");
      Utilisateur user = userTemp.get();
      user.setMdp(null);
      return user;
    }
    
    public List<Utilisateur> getUtilisateur(){
		return utilisateurRepository.findAll();
    }

    public void Addutilisateur(Utilisateur utilisateur) {
      Optional<Utilisateur> findbyemail= utilisateurRepository.findUtilisateurByemail(utilisateur.getEmail());
      if(findbyemail.isPresent()){
        throw new IllegalStateException("email taken");
      }
      utilisateurRepository.save(utilisateur);
    }

    public void deleteUtilisateurbyid(Long id) {
      boolean exist=utilisateurRepository.existsById(id);
      if(!exist){
        throw new IllegalStateException("Utilisateur avec id= " +id+ " n'existe pas");
      }
      utilisateurRepository.deleteById(id);
    }

    @Transactional
    public String updateUtilisateurbyid(Long id, String nom, String email) {
      Utilisateur u=utilisateurRepository.findById(id).orElseThrow(
        () -> new IllegalStateException("utilisateur avec Id=" +id+ " n'existe pas")
      );
      if(nom!= null && nom.length()>0 && !Objects.equals(u.getNom(),nom) ){
          u.setNom(nom);
      }
      if(email!= null && email.length()>0 && !Objects.equals(u.getEmail(),email) ){
        Optional<Utilisateur> findbyemail=utilisateurRepository.findUtilisateurByemail(email);
        if(findbyemail.isPresent()){
          throw new IllegalStateException("email deja existant");
        }
        u.setEmail(email);
      }
      return "Update with success";
    }
}
