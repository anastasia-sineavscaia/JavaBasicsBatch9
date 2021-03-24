package com.homework;

public class Homework116 {

	void oddEven(int num1, int num2) {
		if (num1 % 2 == 0 && num2 % 2 == 0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

	public static void main(String[]args) {
		
		Homework116 even=new Homework116();
		even.oddEven(3, 3);
	}
	
}
