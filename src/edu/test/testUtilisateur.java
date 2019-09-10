package edu.test;

import edu.models.Utilisateur;

public class testUtilisateur {
	public static void main(String[]args) {
		Utilisateur user=new Utilisateur("Zorro");
		System.out.println(user.getLogin());
		user.setLogin("Bernardo");
		user.postLogin();
		System.out.println(user.toString());
		
		
		
	}

}
