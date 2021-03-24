package com.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
      int num1=100;
      int num2=50;

      //+,*,/,-,%
      System.out.println(num1+num2);
      System.out.println(num1-num2);
      System.out.println(num1*num2);
      System.out.println(num1/num2);

    int sum=num1+num2;
    int sub=num1-num2;  
    int mult=num1*num2;
    int div=num1/num2;
    
    //sum of number 10 and 5 is = 15
      
    System.out.println("Sum of number "+num1+" and "+num2+" is = "+ sum);
	System.out.println("Sum of number 10 and 5 is = 15");
	
	double number1=10.99;
	double number2=90.99;
	
	double sumOfDouble=number1+number2;
	double subOfDouble=number1-number2;
	double divOfDouble=number2/number1;
	
	System.out.println("Result of division of 2 double values "+divOfDouble);
	
	float n1=10.99f;
	float n2=90.99f;
	float divOfFloat=n2/n1;
	System.out.println("Result of division of 2 float values "+divOfFloat);
	
	//precedence () --> * & /--> + &-
	int result=10+2*5;
	System.out.println(result);
	
	//modulus operator --> shows the remainder of the division
	
	int mod=10%3;
	System.out.println("Remainder is = "+mod);
	
	int mod1=10%2;
	System.out.println("Remainder is = "+mod1);	
	
	int mod2=15%4;
	System.out.println("Remainder is = "+mod2);
	
	int r=(20%7)*3;
	System.out.println("Remainder is = "+r);
	
	
	
	}

}
