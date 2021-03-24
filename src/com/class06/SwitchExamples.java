package com.class06;

public class SwitchExamples {

	public static void main(String[] args) {

		/*
		 * store gender using M or F based on the gender we will specify if M --> Male
		 * if F --> Female otherwise --> not sure
		 * 
		 */
		
		char gender = 'A';
		String description;

		switch (gender) {

		case 'M':
			description = "Male";
			break;
		case 'F':
			description = "Female";
			break;
		default:
			description = "N/A";
	
		}
		System.out.println(description);
		
		/*
		 * LIMITATIONS:
		 * switch CANNOT use Relational or Logical Operators (it simply checks the value
		 * switch CANNOT be used with boolean, float, double, long
		 * switch CAN only work with: byte, short, char, int, String
		 */

	boolean sunny=true;
	if(sunny) {
		System.out.println("I am happy");
	}
	
	}

}
