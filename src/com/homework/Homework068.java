package com.homework;

public class Homework068 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			System.out.print("$");
		}
		System.out.println();
		for (int j = 1; j <= 1; j++) {
			System.out.print("$  $");
		}
		System.out.println();
		for (int k = 1; k <= 1; k++) {
			System.out.print("$  $");
		}
		System.out.println();
		for (int l = 1; l <= 4; l++) {
			System.out.print("$");
		}
		System.out.println();

		System.out.println();
		System.out.println("------------------------------------------------------------------------------");

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {
				if ((i == 2 && j == 2)||(i==2&&j==3)||(i==3&&j==2)||(i==3&&j==3)) {
					System.out.print(" ");
				} else {
					System.out.print("$");
				}

			}
			System.out.println();
		}
	}

}
