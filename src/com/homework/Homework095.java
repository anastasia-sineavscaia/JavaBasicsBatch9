package com.homework;

import java.util.Scanner;

public class Homework095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Input a String value");
		word=scan.next();
		
		System.out.println("The first 3 letters of "+word+" is "+word.substring(0,3));
		
		

	}

}
