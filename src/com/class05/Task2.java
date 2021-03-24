package com.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter what day of the week it si today");
		int day = input.nextInt();

		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("Today is a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("Todays is a weekend");
		} else {
			System.out.println("Invalid day");
		}

		System.out.println("---------------------------------------------------------------");

		if (day >= 1 && day <= 5) {
			System.out.println("Today is a weekday");
		} else if (day >= 6 && day <= 7) {
			System.out.println("Todays is a weekend");
		} else {
			System.out.println("Invalid day");
		}

	}

}
