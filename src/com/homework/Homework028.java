package com.homework;

import java.util.Scanner;

public class Homework028 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length");
		int length = scan.nextInt();
		System.out.println("Please enter the width");
		int width = scan.nextInt();
		if (width > length) {
			System.out.println("The shape of your object is rectangle");
		} else if (width < length) {
			System.out.println("The shape of your object is rectangle");
		} else if (width == length) {
			System.out.println("the shape of your object is square");
		}

	}

}
