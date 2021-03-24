package com.class15;

public class CharAtDemo {

	public static void main(String[] args) {

		String name = "Roheen";
		System.out.println(name.charAt(3));
		
		
		for (int i = 0; i < name.length(); i++) {
			
			if (name.charAt(i) == 'e') {
				System.out.println("found e");

			}
		}

		
	}

}
