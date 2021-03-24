package com.class04;

import java.util.Scanner;

public class Homework1Part1 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("What amount do you need for your loan?");
		int loan=scan.nextInt();
		
		if (loan <= 200000) {
			System.out.println("I will lend you the money");
		} else {
			System.out.println("I'msorry. I'll have to reject your request");
		}

		
		
		
		
		
		
		
	}

}
