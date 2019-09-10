package edu.models;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
	private String login;
	private String password;
	private int age;
	private List<Groupe> groupes;
	private List<Connexion> connexions;
	private List<Preference> preferences;
	
	
	public Utilisateur (String login) {
		this.login = login;
		connexions=new ArrayList<>();
		groupes=new ArrayList<>();
		preferences=Preference.getDefault();
	}
	

	
	/*M�thode post connexion de l'utilisateur � l'application
	 * Ajoute une instance de connexion dans les connexions de l'utilisateur*/
	
	public void postLogin() {
		try {
			connexions.add(new Connexion(this));
		} catch (UnknownHostException e) {
			System.out.println("Probl�me de connexion, impossible de r�cup�rer l'adresse Ip du client");
		}
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=0 && age<130) {
		this.age = age;
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    @Override
	public String toString() {
		return this.login+connexions;
	}
	
    public boolean addToGroup(String nomGroupe) {
    	for(Groupe groupe:Application.instance.getGroupes()) {
    		if(nomGroupe.contentEquals(groupe.getNom())&& !groupes.contains(groupe)) {
    			groupes.add(groupe);
    			return true;
    		}
    	}
    	
    	Application.instance.getGroupes().forEach(groupe->{
    		
    	});
    	return false;
    }
	
}
