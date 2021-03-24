package com.class09;

public class Recap {

	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {// outer loop controls the inner loop

			for (int j = 1; j < 5; j++) {// inner loop

				System.out.println("Good evening");
			}
			System.out.println("-----------------------------");
		}
		System.out.println("--------------------------------------------------------------");

		for (int i = 1; i < 3; i++) {

			for (int j = 1; j <= 4; j++) {

				System.out.println(i + " " + j);
			}
		}
		System.out.println("----------print numbers from 10 to 99 using nested loop------------------------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= 9; j++) {

				System.out.println(i + " " + j);
			}
		}

		System.out.println("---------------------Car odometer--------------------");

		for (int a = 0; a < 10; a++) {
			for (int b = 0; b <= 9; b++) {
				for (int c = 0; c <= 9; c++) {
					for (int d = 0; d <= 9; d++) {
						System.out.println(a + "" + b + "" + c + "" + d);
					}
				}
			}
		}
		System.out.println("-----------------------Clock---------------------------------");
		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				if (h < 10 && m < 10) {
					System.out.println("0" + h + ":0" + m);
				} else if (h < 10 && m >= 10) {
					System.out.println("0" + h + ":" + m);
				} else if (h >= 10 && m < 10) {
					System.out.println(h + ":0" + m);
				} else {
					System.out.println(h + ":" + m);
				}

			}
		}
		System.out.println("-------------------------------Clock-------------------------------------");
		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				if (h < 10) {
					if (m < 10) {
						System.out.println("0" + h + ":0" + m);
					} else {
						System.out.println("0" + h + ":" + m);
					}

				} else {
					if (m < 10) {
						System.out.println(h + ":0" + m);
					} else {
						System.out.println(h + ":" + m);
					}
				}

			}
		}
		System.out.println("--------------Multiplication Table----------------------------------------------");
		int result;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				result=i*j;
				System.out.println(i + " x " + j+" = "+result);
			}

		}

	}
}
