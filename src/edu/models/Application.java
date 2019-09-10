package edu.models;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static Application instance;
	private List<Groupe> groupes;
	public List<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}

	private List<Utilisateur> utilisateurs;
	
	public Application() {
		groupes= new ArrayList<>();
		utilisateurs=new ArrayList<>();
	}
	
	public static Application create() {
		instance=new Application();
		/*Utilisateur u1=new Utilisateur("");*/
		instance.addUSers("Zorro","Bernardo","Garcia","Jolly Jumper","Rantanplan");
		instance.addGroupes("Animaux","Héros","Méchant");
		return instance;
	}
	
	private void addUSers(String...userNames) {
		for(String name:userNames) {
			utilisateurs.add(new Utilisateur(name));
		}
	}
	
	private void addGroupes(String...groupNames) {
		for(String name:groupNames) {
			groupes.add(new Groupe(name));
		}
	}
	
	@Override
	public String toString() {
		return "Application [groupes=" + groupes +", utilisateurs=" + utilisateurs +"]";
	}

	
	
}
