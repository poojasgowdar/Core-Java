package com;

public class Student {
	String name;
	
	Student(String a){
		name = a; 
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Dinga");
		Student s2 = new Student("Dingi");
		
		System.out.println("Age:" +s1.name+ " Age:"+s2.name);

		
	}
	
	
}
