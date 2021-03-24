package com.class06;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1, num2, result = 0;

		System.out.println("Please enter two numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();

		System.out.println("Please enter the operation you would like to perform");
		char operator = input.next().charAt(0);

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		default:
			result = 0;
			System.out.println("You entered invalid operator");
		}
		if (result != 0) {
			System.out.println("Based on your input " + num1 + " " + operator + " " + num2 + " equals to " + result);
		}

	}

}
