package com;

public class Employee {
	Employee(int id){
		this("Tom");
		System.out.println("Id:"+id);
	}
	
	Employee(String name){
		System.out.println("Name:" +name);
	}
	
	Employee(double salary){
		this(25);
		System.out.println("Salary:"+salary);
	}
	public static void main(String[] args) {
		new Employee(5500.45);
	}

}
