package com.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String answer;

		do {
			System.out.println("Please apply for a credit card");
			answer = scan.next();

		} while (!answer.equalsIgnoreCase("yes"));
		
	}

}
