package com;

public class Pen {
	
	public Pen()// Non-parameterized Constructor
	{
		System.out.println("Hey");
	}
	
	public static void main(String[] args) {
		
		System.out.println("start");
		Pen p = new Pen(); // constructor call
		System.out.println("end");
	}

}
