package com.class18;

public class AccessModifierTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifierDemo obj1=new AccessModifierDemo();
		//System.out.println(obj1.bankAccountPassword);it's Private, we cannot access it from a different class
		System.out.println(obj1.name);
		System.out.println(obj1.SSNNumber);
		obj1.park();
		//obj1.toothbrush();
		obj1.car();
		
		

	}

}
