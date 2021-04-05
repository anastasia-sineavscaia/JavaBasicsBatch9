package com.homework;

public class Homework120 {

	int year;
	String schoolName;
	int batch;

	public static void main(String[] args) {

		Homework120 obj = new Homework120();

		obj.year = 2021;
		obj.schoolName = "Syntax";
		obj.batch = 9;

		System.out.println("I am a student ob batch " + obj.batch + " studying at " + obj.schoolName
				+ " in the year of " + obj.year);

	}
}
