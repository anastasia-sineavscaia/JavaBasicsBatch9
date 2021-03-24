package com.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {

		Scanner anyVariableName;
		anyVariableName = new Scanner(System.in);

		// to capture the entire sentence

		String sentence = anyVariableName.nextLine();
		System.out.println(sentence);

		// ctrl+space to autocomplete
		// to capture a number
		int num = anyVariableName.nextInt();
		System.out.println(num);

		// to capture a double
		double d = anyVariableName.nextDouble();
		System.out.println(d);

		// to capture a single character
		char singleCharacter = anyVariableName.next().charAt(0);
		System.out.println(singleCharacter);

	}

}
