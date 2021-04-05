package com.homework;

public class Homework128 {

	// test case below (dont change):
	public static void main(String[] args) {
		String firstValue = mixString("12345", "abcde");
		System.out.println(firstValue);
		String secondValue = mixString("howdy","hello");
		System.out.println(secondValue); 

	}

	static String mixString(String s1, String s2) {
		String retString = "";
		for (int i = 0; i < s1.length(); i++) {
			retString = retString + s1.charAt(i) + s2.charAt(i);
		}
		return retString;

	}

}
