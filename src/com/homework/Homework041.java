package com.homework;

import java.util.Scanner;

public class Homework041 {

	public static void main(String[] args) {

		int age;
		String scenario=null;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age of the Child");
		age = scan.nextInt();

		switch (age) {

		case 1:
			scenario = "You can Crawl";
			break;
		case 2:
			scenario = "You can Talk";
			break;
		case 3:
			scenario = "You can Dance";
			break;
		case 4:
			scenario = "You can get Trouble";
			break;
		default:
			scenario="I don't know how old you are";
		}
		System.out.println(scenario);

	}

}
