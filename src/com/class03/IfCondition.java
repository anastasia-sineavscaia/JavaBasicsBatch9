package com.class03;

public class IfCondition {
	public static void main(String[] args) {
		System.out.println("Beginning of my program");
		int a = 10;
		int b = 70;

		if (a > b) {// if true
			System.out.println("a is larger than b");
		} else { // otherwise
			System.out.println("b is larger than a");
		}
		System.out.println("-----------------------------");

		int temp = 29;

		if (temp > 30) {
			System.out.println("I am going for a walk");

		} else {// otherwise --> false
			System.out.println("I stay at home");
		}

		System.out.println("End of the program");

	}
}
