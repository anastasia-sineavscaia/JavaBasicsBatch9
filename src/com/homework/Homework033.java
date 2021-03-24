package com.homework;

import java.util.Scanner;

public class Homework033 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;

		System.out.println("Please enter a number");
		number = input.nextInt();

		if (number % 2 == 0) {
			System.out.println("Value is even");
			if (number > 1000) {
				System.out.println("Even value is large");
			} else {
				System.out.println("Even value is just right");
			}
		} else {
			System.out.println("Value is odd");
			if (number > 1000) {
				System.out.println("Odd value is large");
			} else {
				System.out.println("Odd value is just right");
			}
		}

	}

}
