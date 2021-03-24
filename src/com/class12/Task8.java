package com.class12;

public class Task8 {

	public static void main(String[] args) {

		int[] largeArray = { -9, 20, 10, 9, 5, -1, 6, 7, 34, 88, 90, 156 };

		int smallest = largeArray[0];
		int largest = largeArray[0];

		for (int i = 1; i < largeArray.length; i++) {

			if (largeArray[i] < smallest) {
				smallest = largeArray[i];
			}
			if (largeArray[i] > largest) {
				largest = largeArray[i];
			}
		}
		System.out.println(smallest + " is the smallest number in the array");
		System.out.println(largest + " is the largest number in the array");

		System.out.println("----------------Another Way--------------------------");

		int[] num4 = { 4, 3, -2, 4, 7, 12, 13, 15, };

		int small = num4[0];
		int large = num4[0];

		for (int i = 0; i < num4.length; i++) {

			if (num4[i] < small)
				small = num4[i];
			if (num4[i] > large)
				large = num4[i];

		}
		System.out.println("The smallest number is  " + small + " and the largest number is " + large);

	}

}
