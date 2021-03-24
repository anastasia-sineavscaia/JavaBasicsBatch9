package com.class06;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		String explanation, grade;
		Scanner input;

		input = new Scanner(System.in);
		System.out.println("What is your grade?");

		grade = input.next();

		switch (grade.toUpperCase()) {
		case "A":
			explanation = "Excellent";
			break;
		case "B":
			explanation = "Good";
			break;
		case "C":
			explanation = "Average";
		case "D":
			explanation = "Bad";
		default:
			explanation = "Not Acceptable";
		}
		System.out.println("You entered grade " + grade + " and it is " + explanation);
	}

}
