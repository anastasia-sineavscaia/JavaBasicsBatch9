package com.homework;

import java.util.Scanner;

public class Homework037 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean thirsty, sleepy;

		System.out.println("Are you thirsty?");
		thirsty = scan.nextBoolean();

		System.out.println("Are you sleepy?");
		sleepy = scan.nextBoolean();

		if (thirsty && !sleepy) {
			System.out.println("Looks like you need to drink water");
		} else if (thirsty && sleepy) {
			System.out.println("Looks like you need to drink coffee");
		} else if (!thirsty && sleepy) {
			System.out.println("Looks like you need to drink tea");
		} else {
			System.out.println("Looks like you need to drink nothing");
		}

	}

}
