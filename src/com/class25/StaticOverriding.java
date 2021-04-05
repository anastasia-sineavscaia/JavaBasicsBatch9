package com.class25;

public class StaticOverriding {

	static void printInfo() {
		System.out.println("Blah blah");
	}

}

class Child extends StaticOverriding {

	static void printInfo() {
		System.out.println("Blah blah from child class");
	}
}