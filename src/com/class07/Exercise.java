package com.class07;

public class Exercise {

	public static void main(String[] args) {

		int num;
		num = 1;

		while (num <= 100) {

			System.out.print(num + " ");
			num++;
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		int num1 = 100;

		while (num1 >= 1) {
			System.out.print(num1 + " ");
			num1--;
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------------------");

		int e = 20;

		while (e <= 100) {
			System.out.print(e + " ");
			e += 2;
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		int b = 20;

		while (b >= 100) {
			if (b % 2 == 0) {
				System.out.println(b + " ");
				b++;
			}

		}
		
	}
}
