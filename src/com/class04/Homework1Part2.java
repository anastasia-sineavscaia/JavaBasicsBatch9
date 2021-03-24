package com.class04;

import java.util.Scanner;

public class Homework1Part2 {

	public static void main(String[] args) {

		String creditCard;
		double balance;
		Scanner scan;

		scan = new Scanner(System.in);

		System.out.println("Do you have a Credit Card?");
		creditCard = scan.next();

		if (creditCard.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on your Credit Card");

			balance = scan.nextDouble();

			if (balance > 1000) {
				System.out.println("You should pay it off immediately!!");
			} else {
				System.out.println("You can spend more money");
			}
		}

		else {
			System.out.println("You should definitely get a Credit Card");
		}

	}

}
