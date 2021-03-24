package com.class09;

public class Patterns {

	public static void main(String[] args) {
		System.out.println("---------------------------------------SQUARE----------------------");
		for (int i = 0; i < 5; i++) {
			System.out.print("* ");
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.print("* ");
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.print("* ");
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.print("* ");
		}
		System.out.println();

		System.out.println("---------------------REVERSE NUMBERS' SQUARE------------------------------");

		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= 5; c++) {

				System.out.print(c + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------------------------------------------------------------------------");

		for (int r = 1; r <= 5; r++) {
			for (int c = 6; c >= 1; c--) {
				System.out.print(r + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------");
		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <=r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
