package com.class04;

import java.util.Scanner;

//shortcut to import for windows: ctrl+shift+o
public class Demo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter any text");
		// captures entire text with spaces
		String text = scan.nextLine();// scan.nextLine();-->captures your input from your console
										// once you enter the text you must hit ENTER

		System.out.println("Text that I entered is " + text);

		System.out.println("Please enter your name");

		String name = scan.next();// captures 1 word till space

		System.out.println("Nice to meet you " + name);
		
		System.out.println("Please enter your age");
		
		int age = scan.nextInt();
		
		System.out.println("My name is " + name + " and I am " + age + " years old");

	}

}
