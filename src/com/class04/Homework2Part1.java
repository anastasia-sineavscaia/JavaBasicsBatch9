package com.class04;

import java.util.Scanner;

public class Homework2Part1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your age?");
		byte age = scan.nextByte();

		if (age >= 18) {
			System.out.println("I will issue your driver license");
		} else {
			System.out.println("You should get a learners permit");
		}

	}

}
