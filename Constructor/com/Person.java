package com;

public class Person {
	
	int age;
	String name;
	
	Person(int age,String name){
		this.age = age;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person(15, "Tom");
		Person p2 = new Person(18, "Tim");
		
		System.out.println("Age: "+p1.age+ " Name:" +p1.name);
		System.out.println("Age: "+p2.age+ " Name:" +p2.name);
	}

}
