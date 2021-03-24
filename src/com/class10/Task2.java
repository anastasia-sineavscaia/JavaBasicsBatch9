package com.class10;

public class Task2 {

	public static void main(String[] args) {

		String[] name;
		name = new String[7];

		name[0] = "Kamil";
		name[1] = "Anastasia";
		name[2] = "Nadya";
		name[3] = "Meerim";
		name[4] = "Anusha";
		name[5] = "Aimen";
		name[6] = "Ali";

		System.out.println(name[1]);

		System.out.println("---------------------------------------------------------------------------------");

		String[] names = { "Kamil", "Anastasia", "Nadya", "Meerim", "Anusha", "Aimen", "Ali" };
		System.out.println(names[1]);

		System.out.println("-----------------------------------------------------------------");

		String[] words;
		words = new String[5];

		words[0] = "Java";
		words[1] = "Saturday";
		words[2] = "day";
		words[3] = "coding";
		words[4] = "is";

		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);
		System.out.println("------------------------------------------------------------");

		String[] word = { "Java", "Saturday", "day", "coding", "is" };
		System.out.println(word[1] + " " + word[4] + " " + word[0] + " " + word[3] + " " + word[2]);

		System.out.println("================================================");
		String[] named = { "Grey", "Ali", "Jose", "Alec", "Aman", "Ozoda", "Angelo", "Karina", "Anastasia", "Alina" };
		System.out.println(named[0]);

		System.out.println("==========ALL ELEMENTS FROM AN ARRAY==========================");
		// how to get all elements from an array

		for (int i = 0; i <=named.length; i++) {
			System.out.println(named[i]);
		}

	}

}
