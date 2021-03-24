package com.homework;

import java.util.Scanner;

public class Homework026 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("In:");
		String name = inp.nextLine();
		if (name.equals("Chen")) {
			System.out.println("teacher");
		} else if (name.equals("Faa")) {
			System.out.println("student");
		}
	}

}
