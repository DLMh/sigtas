package com.dge.utilisateur;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
public class Utilisateur {
	@Id
	@SequenceGenerator(
		name = "utilisateur_sequence",
		sequenceName = "utilisateur_sequence",
		allocationSize=1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "utilisateur_sequence"
	)
    private Long id;

	@Column(name = "nom")
	private String nom;
	@Column(name = "email")
	private String email;
	@Column(name = "mdp")
	private String mdp;
	public Utilisateur() {
	}


	public Utilisateur(String nom, String email, String mdp) {
		this.nom = nom;
		this.email = email;
		this.mdp = mdp;
	}
	public Utilisateur(Long i, String nom, String email, String mdp) {
		this.id = i;
		this.nom = nom;
		this.email = email;
		this.mdp = mdp;
	}
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return this.mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", nom='" + getNom() + "'" +
			", email='" + getEmail() + "'" +
			", mdp='" + getMdp() + "'" +
			"}";
	}



}
