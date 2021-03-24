package com.class19;

import java.util.Scanner;

public class ConstructorDemo {
	
	ConstructorDemo(){
		System.out.println("Constructor");
	}

	int returnNumber() {
		return 10;
	}
	
	public static void main(String[]args) {
	
	ConstructorDemo obj=new ConstructorDemo();
	int var1=obj.returnNumber();
	Scanner scanner=new Scanner(System.in);
	
	
}
}
