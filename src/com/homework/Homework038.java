package com.homework;

import java.util.Scanner;

public class Homework038 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean weekend;
		String learning;

		System.out.println("Is it weekend?");
		weekend = scan.nextBoolean();
		

		if (!weekend) {
			learning = "Today you will be learning manual testing";
		} else {
			learning = "Today you will be learning Java";
		}
		
	}

}
