package com.class02;

public class Exercise {

	public static void main(String[] args) {
		double number1=13.87;
		double number2=56.76;
		double sum=number1+number2;
		double sub=number1-number2;
		double div=number1/number2;
		double mult=number1*number2;
		double square=number1*number1;
			
		int width=5;
		int height=8;
		int perim=width+height;
		int area=width*height;
				
		System.out.println("The difference of 2 numbers "+number1+" and "+number2+" is equal to "+sub);
		System.out.println("The multiplication of 2 numbers "+number1+" and "+number2+" is equal to "+mult);
		System.out.println("The division of 2 numbers "+number1+" and "+number2+" is equal to "+div);
		System.out.println("The sum of 2 numbers "+number1+" and " + number2+" is equal to "+sum);
		System.out.println("The square of the "+number1+" is "+square);
		System.out.println("The perimeter of rectangle with width "+width +" and height "+height +" is equal to " +perim+" and the area is "+area);		
		
		
	}

}
