package com.dge.utilisateur;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    
    // Select * from Utilisateur where email=?
    @Query("SELECT u FROM Utilisateur u WHERE u.email=?1")
    Optional<Utilisateur> findUtilisateurByemail(String email);
	
	@Query("SELECT r FROM Utilisateur r WHERE r.email = :email AND r.mdp = :mdp")
	Optional<Utilisateur> findByLoginAndMdp(String email, String mdp);

}