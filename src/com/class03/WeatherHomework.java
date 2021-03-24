package com.class03;

public class WeatherHomework {

	public static void main(String[] args) {
		int num = 0;

		if (num % 2 != 0) {
			System.out.println(num + " Odd number");
		} else {
			System.out.println(num + " Even number");
		}
		System.out.println("-----------------------------------------------------------------------------");
		if (num % 2 == 0) {
			System.out.println(num + " Even number");
		} else {
			System.out.println(num + " Odd number");
		}

		System.out.println("---------------------------------------------------------------------");
		int temp2 = 0;

		if (temp2 < 0) {
			System.out.println(temp2 + " is negative");
		} else if (temp2 > 0) {
			System.out.println(temp2 + " is positive");
		} else {
			System.out.println(temp2 + " is neither negative nor positive");
		}

	}
}
