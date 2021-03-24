package com.homework;

import java.util.Scanner;

public class Homework035 {

	public static void main(String[] args) {

		String result;
		int creditScore;
		boolean loan;
		Scanner scan = new Scanner(System.in);

		System.out.println("Do you need a loan?");
		loan = scan.nextBoolean();

		if (loan) {
			System.out.println("What is your credit score?");
			creditScore = scan.nextInt();

			if (creditScore < 600) {
				result = "Not eligible";
			} else if (creditScore >= 600 && creditScore <= 700) {
				result = "Maybe eligible";
			} else if (creditScore >= 701 && creditScore <= 800) {
				result = "Eligible";
			} else {
				result = "Definitely eligible";
			}
		} else {
			result = "Unknown";
		}
		System.out.println("The eligibility is " + result);
	}

}
