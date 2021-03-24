package com.class07;

public class HomeworkAnotherWay {

	public static void main(String[] args) {

		int odd = 0;
		int even = 0;

		for (int i = 1; i <= 50; i++) {

			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}

		System.out.println("Sum of odd numbers equals to " + odd);
		System.out.println("Sum of even numbers equals to " + even);
	}

}
