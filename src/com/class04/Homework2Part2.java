package com.class04;

import java.util.Scanner;

public class Homework2Part2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("How many years have you been working for?");
		int years = input.nextInt();

		if (years >= 5) {
			System.out.println("Congratulations! You are eligible for a bonus!");
			System.out.println("What is your annual salary?");
			int salary = input.nextInt();

			if (salary > 50000) {
				System.out.println("You get a bonus of 5000$");
			} else {
				System.out.println("You get a bonus of 3000$");
			}

		} else {
			System.out.println("I'm sorry. You don't qualify for a bonus");
		}

	}

}
