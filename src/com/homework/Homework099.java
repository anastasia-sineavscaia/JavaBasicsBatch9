package com.homework;

import java.util.Scanner;

public class Homework099 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = inp.nextLine();
	   	//write your code below
	
	    
		int length=givenString.length();
		boolean isPalidrome;
		for(int beginIndex=0;beginIndex<length;beginIndex++) {
			if(givenString.charAt(beginIndex)!=givenString.charAt(length-1-beginIndex)) {
				isPalidrome=false;
				System.out.println(isPalidrome);
				break;
			}else {
				isPalidrome=true;
				System.out.println(isPalidrome);
				break;
			}
		}
	
	}

}
