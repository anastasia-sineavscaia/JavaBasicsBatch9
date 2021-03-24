package com.class14;

public class MoreMethodExamples {

	/*
	 * Create a method that does not take any values and always returns String Hi
	 */

	String print() {
		return "Hi";
	}
	/*
	 * Create a method that takes a number and returns the double of that number
	 */

	double doubleTheValue(double input) {
		return input * 2;
	}

	/*
	 * Create a method that will take a boolean as input if the value is true i want
	 * to say "Take the umbrella" if the value is false print "Please go for a walk"
	 */

	void isRaining(boolean isRain) {
		if (isRain) {
			System.out.println("Please take the umbrella");
		} else {
			System.out.println("Please go for a walk");
		}
	}

	void Batch9(String Batch) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Batch 9 is great");
		}
	}

	/*
	 * Create a method that takes 2 numbers as input and returns a greater number
	 */

	double number(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	/*
	 * Create a method that takes a number. If number is even print
	 * "Numbers is even" otherwise print "Number is odd"
	 */

	void oddEven(double num) {
		if (num % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}

	/*
	 * Write a method that takes an array and returns the sum of the elements that
	 * are present in the array
	 */

	double returnTheArraySum(double[] arr) {
		double sum = 0;
		for (double element : arr) {
			sum = sum + element;
		}
		return sum;
	
	}
	/*
	 * Write a method that returns true if a string is a mirror of itself aba yes
	 * bbb yes bba no
	 */

	boolean isMirror(String str) {
		String newStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(i + " " + str.charAt(i));
			newStr += str.charAt(i);
		}
		System.out.println(newStr);
		if (str.equals(newStr)) {
			return true;
		} else {
			return false;
		}

	}
}
