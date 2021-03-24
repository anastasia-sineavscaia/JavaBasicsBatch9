package com.class06;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		String country, language;
		Scanner scan;

		scan = new Scanner(System.in);
		System.out.println("What country are you from?");

		country = scan.nextLine();
		switch (country.toLowerCase()) {

		case "usa":
			language = "English";
			break;
		case "brazil":
			language = "Portuguese";
			break;
		case "moldova":
			language = "Romanian";
			break;
		case "germany":
			language = "German";
			break;
		case "italy":
			language = "Italian";
			break;
		case "spain":
			language = "Spanish";
			break;
		case "france":
			language = "French";
			break;
		case "ukraine":
			language = "Ukrainian";
			break;
		case "thailand":
			language = "Thai";
			break;
		case "israel":
			language = "Hebrew";
			break;
		default:
			language = "unknown";
		}
		System.out.println("The language you speak is " + language);
	}

}
