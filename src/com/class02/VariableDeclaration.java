package com.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		//1 way to create a variable
        short b=200; //create a variable and assign value
	                //declare a variable and initialized it
	
	   //2 way
	   int sum; //declaration happens ONLY ONCE
	   sum=20; //initialized the variable
	
	   sum=30;//reassign the value
	
	   /*
	    * int x;
	    * int y;
	    * int z;
	    */
	   int x,y,z;
	
	x=10;
	y=20;
	z=30;
	//z=30.9; Error: Type mismatch, since variable can store only int type of values
	
	//I would liketo change the value of x
	x=70;
    System.out.println(x);
	
	int num=33;
	//we are using value of different variable to initialize the 
	int num2=num;//33
	System.out.println(num2);
	}
	

}
