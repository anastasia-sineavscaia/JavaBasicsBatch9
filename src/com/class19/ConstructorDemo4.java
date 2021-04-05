package com.class19;

public class ConstructorDemo4 {
	String name;

	ConstructorDemo4() {
		System.out.println("Empty parameter constructor");

	}

	ConstructorDemo4(String name) {
		this();
		System.out.println("Parameterized constructor");
	}

	void printInfo() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		new ConstructorDemo4();
		new ConstructorDemo4("Alec");
		
	
	}
}
