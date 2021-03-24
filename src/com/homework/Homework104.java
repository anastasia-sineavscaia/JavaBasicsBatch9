package com.homework;

import java.util.Scanner;

public class Homework104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		// leave above alone! write your code below

		System.out.println("Please enter 5 names");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.next();
			System.out.println(arr[i].substring(0, 3));
			System.out.println();
		}

		

	}

}
