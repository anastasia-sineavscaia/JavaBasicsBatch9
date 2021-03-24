package com.class04;

public class NestedIfLastExample {

	public static void main(String[] args) {

		/*
		 * to donate: you must be 18 and older, otherwise you cannot your weight must be
		 * more than 110 lbs, otherwise you can't donate
		 */

		int age = 19;
		int weight = 150;

		if (age > 18) {
			System.out.println("Let's check your weight");
			if (weight > 110) {
				System.out.println("You can donate");
			} else {
				System.out.println("You can't donate");
			}
		} else {
			System.out.println("You can't donate");
		}

	}

}
