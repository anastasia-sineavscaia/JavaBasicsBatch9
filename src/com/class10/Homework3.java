package com.class10;

public class Homework3 {

	public static void main(String[] args) {

		int sum = 0;
		int sum1 = 0;
		int num[] = new int[6];

		num[0] = 5;
		num[1] = 7;
		num[2] = 4;
		num[3] = 9;
		num[4] = 11;
		num[5] = 3;

		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("The sum of all numbers equals to " + sum);

		System.out.println();
		System.out.println("--------------------------------------------------------------------------");

		for (int n : num) {
			sum1 += n;

		}
		System.out.println("The sum of all numbers equals to " + sum1);
	}

}
