package com.class20;

public class Child extends Parent{
	
	void printInfo() {
		System.out.println(name);
		Parent parent =new Parent();
		
		System.out.println(parent.getName());
		
	}

}
