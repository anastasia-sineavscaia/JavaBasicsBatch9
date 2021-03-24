package com.class16;

public class Task {

	public static void main(String[] args) {

		String sentence = "       I am going for a walk right now.  ";
		System.out.println(sentence.trim());
		System.out.println(sentence.replace(" ",""));

		
		String mix = "87r943kfdhvkd*&&^%%$$##";
		String alpha = mix.replaceAll("[^a-zA-Z]", "");
		System.out.println(alpha.length());

		
		String sentences = "Is it Saturday?Is it raining?Do we have a Java class today?";
		String[] howMany = sentences.split("[?]");
		System.out.println();
		for (int i = 0; i < howMany.length; i++) {
			System.out.println(howMany[i]);
			
		}
		System.out.println(howMany.length);
	}

}
