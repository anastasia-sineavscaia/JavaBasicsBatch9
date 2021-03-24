package com.class15;

public class Task3 {

	public static void main(String[] args) {
		
		String word="Hello";
		
		if(!word.isEmpty()) {
			if(word.length()%2!=0) {
				if(word.length()>3) {
					System.out.println(word.charAt(3));
				}
			}
			
		}

		String day="Sunday";
		
		for(int i=day.length()-1;i>=0;i--) {
			System.out.print(day.charAt(i));
		}
		
	}

}
