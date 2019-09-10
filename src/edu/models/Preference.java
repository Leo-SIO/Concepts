package edu.models;

import java.util.Arrays;
import java.util.List;

public class Preference {
	private String nom;
	private Object valeur;
	
	public Preference(String nom,Object valeur) {
		this.nom=nom;
		this.valeur=valeur;
	}
	
	public static List<Preference> getDefault(){
		return Arrays.asList(new Preference("admin", true),new Preference("bgColor", "black"));
		
	}
	
	

}
