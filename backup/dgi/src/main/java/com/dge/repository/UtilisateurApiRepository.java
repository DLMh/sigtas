package com.dge.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dge.models.UtilisateurApi;

@Repository
public interface UtilisateurApiRepository extends JpaRepository<UtilisateurApi, String> {

	Optional<UtilisateurApi> findByUsername(String username);
	Optional<UtilisateurApi> findByToken(String token);
}
