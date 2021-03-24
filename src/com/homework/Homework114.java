package com.homework;

public class Homework114 {

	int mult(int num1, int num2) {
		return num1 * num2;
	}

	int add(int num1, int num2) {
		return num1 + num2;
	}

	int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static void main(String[]args) {
		
		Homework114 calc=new Homework114();
		
		System.out.println("Addition "+calc.add(15,15));
		System.out.println("Multiplication "+calc.mult(5, 6));
		System.out.println("Subtraction "+calc.sub(30,10));
		
	}
}
