package edu.models;

public class Groupe {
	private String nom;
	Groupe(String name) {
		setNom(name);
	}
	
	
	@Override
	public String toString() {
		return(nom);
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	 
}
