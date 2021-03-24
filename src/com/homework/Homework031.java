package com.homework;

import java.util.Scanner;

public class Homework031 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean isSunny;
		int temperature;

		System.out.println("Is it sunny outside?");
		isSunny = scan.nextBoolean();

		if (isSunny) {
			System.out.println("It is a sunny day, I should go somewhere!");
			System.out.println("What is the temperature otside?");
			temperature = scan.nextInt();
			
			if (temperature > 85) {
				System.out.println("I am going to the beach");
			} else {
				System.out.println("I am going to the park");
			}

		} else {
			System.out.println("I stay home and practice Java");
		}

	}

}
