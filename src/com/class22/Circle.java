package com.class22;

public class Circle extends Shape{
	
	Circle(double radius){
		super(radius);
	}
	
	void calculateArea() {
		System.out.println(Math.pow(radius,2)*Math.PI);
		System.out.println(radius*radius*3.14);
	}

}
