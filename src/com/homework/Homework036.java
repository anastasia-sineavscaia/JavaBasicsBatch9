package com.homework;

import java.util.Scanner;

public class Homework036 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word1, word2;
		int int1, int2;
		

		System.out.println("Please enter two strings. Please enter two numbers.");
		word1 = input.next();
		word2 = input.next();
		int1 = input.nextInt();
		int2 = input.nextInt();

		if (int1 == int2 && word1.equals(word2)) {
			System.out.println("AND");
		} else if (int1 == int2 || word1.equals(word2)) {
			System.out.println("OR");
		} else {
			System.out.println("NONE");
		}

	}

}
