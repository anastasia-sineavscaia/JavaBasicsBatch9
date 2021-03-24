package com.class07;

public class Homework {

	public static void main(String[] args) {

		int sumOdd = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				sumOdd = sumOdd + i;
			}
		}
		System.out.print("The sum of all the odd numbers equals to " + sumOdd);

		System.out.println();
		System.out.println("------------------------------------------------------------------------");

		int sumEven = 0;

		for (int i = 0; i <= 50; i++) {
			if (i % 2 != 0) {
				sumEven = sumEven + i;
			}
		}
		System.out.println("The sum of all the odd numbers equals to " + sumEven);
	}
}