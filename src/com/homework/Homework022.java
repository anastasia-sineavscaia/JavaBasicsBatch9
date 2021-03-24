package com.homework;

import java.util.Scanner;

public class Homework022 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.next();
		System.out.println("Enter your mobile number");
		String mobile = scan.next();

		System.out.println("Enter your age");
		byte age = scan.nextByte();
		System.out.println("Your name is " + name + ", your age is " + age + " and your mobile number is " + mobile);
	}

}
