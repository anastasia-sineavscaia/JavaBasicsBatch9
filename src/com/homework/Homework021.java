package com.homework;

import java.util.Scanner;

public class Homework021 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		int result = age + 10;
		System.out.println("Your age after 10 years is " + result);
	}

}
