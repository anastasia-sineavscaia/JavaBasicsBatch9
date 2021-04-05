package com.class23;

public class Parent1 {

	static void printInfo(String name) {
		System.out.println("name from parent " + name);
	}

}

class Child1 extends Parent1 {

	public static void main(String[] args) {
		Child1.printInfo("Anastasia");
	}
}