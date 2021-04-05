package com.class23;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main from Parent");
		
		

	}

}
class Child2 extends Test{
	public static void main(String[]args) {
		System.out.println("Main from the Child");
		
	}
}
class Child3{
	public static void main(String[]args) {
		String[] args1= {"hi"};
		Child2.main(args1);
	}
}