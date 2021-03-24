package com.class15;

public class Task2 {
	public static void main(String[]args) {

	String mom="Mary";
	String dad="Daniel";
	String gender="boy";
	
		
		if(gender.equals("girl")) {
			System.out.println(mom.substring(0,2)+dad.substring(3));
			
		}else {
			System.out.println(dad.substring(0,3)+mom.substring(2));
		}
		
	}
	
	
}
