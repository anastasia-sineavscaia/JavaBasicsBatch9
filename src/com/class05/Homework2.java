package com.class05;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num1, num2, num3, largest;

		System.out.println("Please enter 3 numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		if (num1 == num2 && num2 == num3) {
			System.out.println("Numbers are equal");

		} else {

			if (num1 > num3) {// we assume number 1 is bigger than number 2
				if (num1 > num3) {
					largest = num1;
				} else {
					largest = num3;
				}
			} else { // assuming number 2 is bigger than number 1

				if (num2 > num3) {
					largest = num2;
				} else {
					largest = num3;
				}

			}
			System.out.println("The largest number is " + largest);

		}
		System.out.println("--------------------------I am done--------------------------------------------------");
	}
}
