package com.class02;

public class NamingConvention {

	public static void main(String[] args) {
		// keywords - a special word that is reserved in java memory: class, public, static, final, for

		//identifiers - name that we give to classes, variables and methods
	/*
	 * RULE !!!!
	 * DO NOT USE KEYWORDS AS IDENTIFIERS
	 * Identifiers CANNOT contain space
	 * Identifiers CANNOT start with numbers
	 * Identifiers CANNOT have special characters,except: _ or $
	 */

	    //1. int final=10; error: invalid identifier

		//2. byte variable one=12;
	
		//3. short 1b=12;
		short b1=12;
		
		//4. long *l=2000;
		    //long l*=2000;
		
		long _l=2000;
		long long_=29990;
		
		double $price=12.99;
		double price$=10.99;
		
		//Naming Convention 
	         //1. we use camel casing
		     //2. classes start with Upper cases and will follow camel casing
	         //3. variables start with lower case and will follow camel casing
		     //4. packages we use lower case and use name as reverse way of url
		     //5. use meaningful names for your variables
		
		        int Number=12; //try not to use upper case names
				int number=12; //preferable
		
		int numberOne=12;
		int numberTwo=13;	
		
		boolean isSnow=true;
		boolean snow=true;
		
		double applePrice=12.99;
		double mangoPrice=13.89;
	
	
	}

}
