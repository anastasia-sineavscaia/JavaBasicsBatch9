package com.class08;

import java.util.Scanner;

public class WhileLoopReview {

	public static void main(String[] args) {

		/*
		 * we need to make user to pay for a soda keep asking user to pay until it
		 * enters 3
		 * 
		 * if user gives more > 3--> please give less money if user gives less than 3
		 * --> please give more money
		 */
		Scanner scan = new Scanner(System.in);

		int money;
		System.out.println("Please pay for your soda");

		do {

			money = scan.nextInt();
			if (money > 3) {
				System.out.println("Please pay less money");

			} else if (money < 3) {
				System.out.println("Please pay more money");
			}
		} while (money != 3);
		System.out.println("That's the correct amount");

	}

}
