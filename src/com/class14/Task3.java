package com.class14;

public class Task3 {

	String getGrade(int grade) {

		if (grade > 90) {
			return "A";
		} else if (grade > 80) {
			return "B";

		} else if (grade > 70) {
			return "C";

		} else if (grade > 50) {
			return "D";
		} else {
			return "F";
		}
	}

	public static void main(String[] args) {

		Task3 grades = new Task3();

		System.out.println("Your current grade is " + grades.getGrade(23));

	}
}
