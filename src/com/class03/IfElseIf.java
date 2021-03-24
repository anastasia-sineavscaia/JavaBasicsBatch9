package com.class03;

public class IfElseIf {
	public static void main(String[] args) {

		// compare 2 numbers --> 3 possible conditions
		double num1 = 10.20;
		double num2 = 15.20;

		if (num1 > num2) {
			System.out.println("Double value " + num1 + " is larger than " + num2);
		} else if (num1 < num2) {
			System.out.println("Double value " + num2 + " is larger than " + num1);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

		// 2. based on the day number define a day

		int day = 10;

		if (day == 1) {
			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 3) {
			System.out.println("Today is Wednesday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else if (day == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("This date is invalid day");
		}

		int month = 5;
		if (month == 1) {
			System.out.println("It is January");
		} else if (month == 2) {
			System.out.println("It is February");
		} else if (month == 3) {
			System.out.println("It is March");
		} else if (month == 4) {
			System.out.println("It is April");
		} else if (month == 5) {
			System.out.println("It is May");
		} else if (month == 6) {
			System.out.println("It is June");
		} else if (month == 7) {
			System.out.println("It is July");
		} else if (month == 8) {
			System.out.println("It is August");
		} else if (month == 9) {
			System.out.println("It is September");
		} else if (month == 10) {
			System.out.println("It is October");
		} else if (month == 11) {
			System.out.println("It is NOvember");
		} else if (month == 12) {
			System.out.println("It is December");
		} else {
			System.out.println("It is an invalid month");
		}

	}
}