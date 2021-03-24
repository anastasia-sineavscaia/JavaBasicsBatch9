package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		/*
		 * we need to calculate final price after the discount
		 * 
		 * we check if there is a sale if no sale --> I am not going for shopping if
		 * there is a sale we will ask about the item we will ask the price
		 * 
		 * if price is less than 10 --> apply 5% discount if price is between 10 and 100
		 * --> apply 10% discount if price is between 100 and 500 --> apply 20% discount
		 * if price is more than 500 --> apply 30% discount
		 */
		double price, finalPrice = 0, discount = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Is there a sale going on?");

		boolean sale = scan.nextBoolean();
		String item;

		if (!sale) {
			System.out.println("I am not going for shopping");
		} else {
			System.out.println("Do you have the item?");
			item = scan.next();
			System.out.println("What's the price of that item?");
			price = scan.nextDouble();

			if (price > 0 && price < 10) {
				discount = price * 0.05;

			} else if (price >= 10 && price <= 100) {
				discount = price * 0.10;

			} else if (price >= 100 && price <= 500) {
				discount = price * 0.20;

			} else if (price > 500) {
				discount = price * 0.30;

			}

			finalPrice = price - discount;
			System.out.println("You are buying a " + item + " with original price of " + price + " after the discount "
					+ discount + " and your final price is " + finalPrice);
			
			if (price - discount < 500) {
				System.out.println("I did not go crazy");
			}
		}
	}
}
