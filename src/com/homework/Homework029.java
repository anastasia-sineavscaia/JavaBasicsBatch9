package com.homework;

import java.util.Scanner;

public class Homework029 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		int x = scan.nextInt();

		System.out.println("Please enter second number");
		int y = scan.nextInt();
		int result = x * y;

		if (result > 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}