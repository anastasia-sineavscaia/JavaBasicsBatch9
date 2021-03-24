package com.class07;

public class Task2 {

	public static void main(String[] args) {

		int num;
		num = 1;

		while (num <= 100) {

			System.out.print(num + " ");
			num++;
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------");

		int num1;
		num1 = 100;

		while (num1 >= 1) {
			System.out.print(num1 + " ");
			num1--;
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------");

		int num3;
		num3 = 0;

		while (num3 <= 20) {
			System.out.print(num3 + " ");
			num3 += 2;
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------");
		for (int a = 0; a <= 20; a += 2) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------");

		for (int i = 20; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------");
		for (int i = 21; i <= 50; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------");

		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
		}

		System.out.println(sum);
	}

}
