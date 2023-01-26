package com.dge.models;

public interface UtilisateurApiService {

	public UtilisateurApi findByUsername(String username);
	public UtilisateurApi findByToken(String token) throws Exception;
	public UtilisateurApi insert(UtilisateurApi u) throws Exception;
	public UtilisateurApi updateToken(String username, String token) throws Exception;
}
