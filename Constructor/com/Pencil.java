package com;

public class Pencil {
	
	Pencil(int cost){ // Parameterized Custom Constructor
		System.out.println("Cost of Pencil:" +cost);
	}
	
	public static void main(String[] args) {
		
		Pencil p = new Pencil(10);
	}

}
