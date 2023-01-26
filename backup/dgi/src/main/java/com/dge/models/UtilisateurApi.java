package com.dge.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table
public class UtilisateurApi {

	@Id
	@SequenceGenerator(
		name = "utilisateurapi_sequence",
		sequenceName = "utilisateurapi_sequence",
		allocationSize=1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "utilisateurapi_sequence"
	)
	private String id;
	
	private String username;
	
	private String password;
	
	private String token;
	
	public UtilisateurApi() {
	}

	public UtilisateurApi(String id) {
		this.id = id;
	}

	public UtilisateurApi(String username, String password, String token) {
		this.username = username;
		this.password = password;
		this.token = token;
	}

	public UtilisateurApi(String id, String username, String password, String token) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.token = token;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "UtilisateurApi [id=" + id + ", username=" + username + ", password=" + password + ", token=" + token
				+ "]";
	}
	
}
