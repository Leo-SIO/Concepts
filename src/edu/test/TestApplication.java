package edu.test;

import edu.models.Application;

public class TestApplication {
	
	public static void main(String[] args) {
		Application.create();
		
		System.out.println(Application.instance);
	}

}
