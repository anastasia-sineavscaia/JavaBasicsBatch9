package com.homework;

import java.util.Scanner;

public class Homework064 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int end;
		System.out.println("Please enter an end number");
		end=scan.nextInt();

		for(int i=0;i<=(end*2)-1;i++) {
			System.out.print(i+" ");
		}
	}

}
