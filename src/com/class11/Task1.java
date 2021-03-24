package com.class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		double sum = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("How many values would you like to enter?");
		int size = scan.nextInt();
		double[] a = new double[size];

		for (int i = 0; i < size; i++) {
			a[i] = scan.nextDouble();
			sum += a[i];

		}

		System.out.println("The sum of " + size + " elements from an array = " + sum);
		System.out.println("-----------------Calculating sum using for each loop---------------------------");
		sum = 0;

		for (double num : a) {
			sum += num;
		}
		System.out.println("The sum of " + size + " elements from an array = " + sum);

	}

}
