package com.homework;

import java.util.Scanner;

public class Homework039 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int mark;
		String grade;

		System.out.println("Please enter your mark");
		mark = scan.nextInt();

		if (mark >= 1 && mark <= 25) {
			grade = "Your grade is F";
		} else if (mark >= 25 && mark <= 45) {
			grade = "Your grade is E";
		} else if (mark >= 45 && mark <= 50) {
			grade = "Your grade is D";
		} else if (mark >= 50 && mark <= 60) {
			grade = "Your grade is C";
		} else if (mark >= 60 && mark <= 80) {
			grade = "Your grade is B";
		} else if (mark >= 80) {
			grade = "Your grade is A";
		} else {
			grade = "Please enter valid mark";
		}
		System.out.println(grade);
		grade = scan.next();

	}

}
