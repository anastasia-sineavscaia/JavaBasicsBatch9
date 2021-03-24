package com.homework;

import java.util.Scanner;

public class Homework076 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		String []day=new String [7];
		
		
		
		
		for(int i=0;i<day.length;i++) {
			System.out.println("Please enter day of the week");
			day[i]=scan.next();
			
			
		
			
		}for(String week:day) {
			System.out.println(week);

		}
		
	}

}
