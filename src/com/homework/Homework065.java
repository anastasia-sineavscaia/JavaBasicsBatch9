package com.homework;

import java.util.Scanner;

public class Homework065 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x;
		System.out.println("Please enter an end number");
		x = scan.nextInt();
		for(int i=x-1;i>=0;i--) {
			System.out.println(i);
		}

	}

}
