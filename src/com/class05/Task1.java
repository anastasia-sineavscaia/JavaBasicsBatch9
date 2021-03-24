package com.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner input;
		double height;

		input = new Scanner(System.in);

		System.out.println("Please enter your height in inches");
		height = input.nextDouble();

		if (height >0&&height< 60) {
			System.out.println("Your height is short");
			
		} else if (height >= 60 && height <= 72) {
			System.out.println("Your height is medium");
			
		} else {
			System.out.println("Your height is tall");
		}

	}

}
