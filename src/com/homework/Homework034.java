package com.homework;

import java.util.Scanner;

public class Homework034 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1, num2, num3;
		System.out.println("Please enter 3 distinct numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("The largest number is " + num1);
			}
		} else if (num2 > num3) {
			if (num2 > num1) {
				System.out.println("The largest number is " + num2);
			}
		} else {

			System.out.println("The largest number is " + num3);
		}

	}

}
