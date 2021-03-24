package com.homework;

import java.util.Scanner;

public class Homework044 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String car, origin;

		System.out.println("Please enter your favorite car make");
		car = scan.next();

		switch (car) {

		case ("BMW"):
			origin = "german car";
			break;
		case ("Toyota"):
			origin = "japanese car";
			break;
		case ("Maserati"):
			origin = "italian car";
			break;
		default:
			origin = "unknown";
			break;
		}
		System.out.println("Your favorite car is " + origin);
	}

}
