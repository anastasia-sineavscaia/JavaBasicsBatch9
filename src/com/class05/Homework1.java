package com.class05;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int one, two, three, largest;
		largest = 0;

		System.out.println("Please enter a number");
		one = scan.nextInt();

		System.out.println("Please enter another number");
		two = scan.nextInt();

		System.out.println("Please enter another number");
		three = scan.nextInt();

		if (one > two && two > three) {
			largest = one;
		} else if (two > one && two > three) {
			largest = two;
		} else if (three > one && three > two) {
			largest = three;

		}
		System.out.println("The largest number is " + largest);
	}

}
