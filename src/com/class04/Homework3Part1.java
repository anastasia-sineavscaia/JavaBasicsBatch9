package com.class04;

import java.util.Scanner;

public class Homework3Part1 {

	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Please enter your city");
		String city = ask.nextLine();
		System.out.println("Please enter your temperature");
		double Fahrenheit = ask.nextDouble();
		double Celsius = (Fahrenheit - 30) / 2;
		System.out.println("The temperature in the city of " + city + " is " + Celsius);
	}

}
