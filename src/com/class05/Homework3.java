package com.class05;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("What is the month of you birthday?");
		
		String month=scan.next();
		String season=null;
		
		if (month.equalsIgnoreCase("june") || month.equalsIgnoreCase("july") || month.equalsIgnoreCase("august")) {
			season = "Summer";
		} else if (month.equalsIgnoreCase("september") || month.equalsIgnoreCase("october")
				|| month.equalsIgnoreCase("november")) {
			season = "Fall";
		} else if (month.equalsIgnoreCase("december") || month.equalsIgnoreCase("january")
				|| month.equalsIgnoreCase("february")) {
			season = "Winter";
		} else if (month.equalsIgnoreCase("march") || month.equalsIgnoreCase("april")
				|| month.equalsIgnoreCase("may")) {
			season = "Spring";
		}
			
		System.out.println("You were born in "+season);
		
		

	}

}
