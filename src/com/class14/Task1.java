package com.class14;

public class Task1 {

	public String languages(String country) {

		String hello = "";
		if (country.equals("USA")) {
			return "Hello";
		} else if (country.equals("Moldova")) {
			return "Salut";
		} else if (country.equals("Cuba")) {
			return "Hola";
		} else if (country.equals("Germany")) {
			return "Hallo";
		} else if (country.equals("France")) {
			return "Bonjour";
		}
		return country;
	}

	public static void main(String[] args) {

		Task1 language = new Task1();

		System.out.println(language.languages("Moldova"));

	}

}
