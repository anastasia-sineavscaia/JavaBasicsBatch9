package com.class24;

public class CarTester {
	
	public static void main(String[]args) {
		
		Car bmw=new BMW();
		bmw.start(); //method from child will be called because we have overridden it
		bmw.stop(); //method from parent will be called because we have not overridden it
		//bmw.drifting(); CE not allowed by using parent reference
		
		BMW bmw1=(BMW)bmw; //because now we have converted our reference back to BMW
		bmw1.drifting();
		
		
		
		
	}

}
