package com.homework;

import java.util.Scanner;

public class Homework032 {

	public static void main(String[] args) {

		int age;
		char gender=0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your gender: M or F");
		gender = scan.next().charAt(gender);

		System.out.println("Please enter your age");
		age = scan.nextInt();

		if (age > 25) {
			if (gender == 'F') {
				System.out.println("Woman");
			} else {
				System.out.println("Man");
			}
		} else if (age < 25) {
			if (gender == 'F') {
				System.out.println("Girl");
			} else {
				System.out.println("Boy");
			}
		}

	}

}
