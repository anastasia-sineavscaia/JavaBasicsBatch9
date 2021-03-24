package com.homework;

import java.util.Scanner;

public class Homework042 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int rollNumber;
		String name;

		System.out.println("Enter the roll number of the Child");
		rollNumber = scan.nextInt();
		
		
		switch (rollNumber) {
	
		
		case 101:
			name = "Student name: Ramesh";
			break;
		case 102:
			name = "Student name: Mahesh";
			break;
		case 103:
			name = "Student name: Mukesh";
			break;
		default:
			name="Not found Student name: in Class";
		}
		System.out.println(name);
		
	}

}
