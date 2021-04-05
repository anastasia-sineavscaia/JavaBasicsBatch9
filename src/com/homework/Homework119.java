package com.homework;

public class Homework119 {

	public static String censorLetter(String s, char c) {
		return s.replace(c, '*');
	}

	public static void main(String[] args) {
		System.out.println(censorLetter("computer science", 'e'));
		System.out.println(censorLetter("trick or treat", 't'));

	}

}
