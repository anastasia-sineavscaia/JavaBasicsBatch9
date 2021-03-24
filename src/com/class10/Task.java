package com.class10;

public class Task {

	public static void main(String[] args) {

		char[] grade = new char[6];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';

		System.out.println(grade[1]);

		System.out.println("-------------------------Another way of creating an array------------------------------");

		char[] grades= {'A','B','C','D','E','F','G'};
		
		//char[] grades1;
		//grades1={}; --> won't work
	
	System.out.println(grades);
	System.out.println("Number of elements in 2 array "+grades.length);
	}

}
