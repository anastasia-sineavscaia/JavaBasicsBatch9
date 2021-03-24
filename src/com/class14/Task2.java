package com.class14;

public class Task2 {

	boolean isPrime;

	boolean prime(int num) {

		if (num > 1) {
			for (int i = 2; i <= num; i++) {
				if (num % 2 == 0) {
					isPrime = true;
				} else {
					isPrime = false;
				}

			}
		}
		return isPrime;
	}

	public static void main(String[] args) {

		Task2 ifNumberisPrime = new Task2();
		System.out.println(ifNumberisPrime.prime(23));
	}

}
