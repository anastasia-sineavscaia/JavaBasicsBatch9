package com.class04;

public class Task {

	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 3.9;

		if (diploma) {
			System.out.println("Congratulations!!!");
			if (gpa > 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("You should get a degree");
		}
		System.out.println("----------------------------------------------------------------------------------");

		double rate = 3.5;
		int price = 1900;

		if (rate > 4.5) {
			System.out.println("User will not buy a house");
		} else {
			System.out.println("User will consider buying");

			if (price > 200000) {
				System.out.println("User will take a loan");
			} else {
				System.out.println("User will pay cash");
			}
		}
	}
}