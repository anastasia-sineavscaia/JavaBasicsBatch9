package com.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean morning = true;
		boolean classToday = false;

		// is it morning?--> Good morning
		// if there is class--> Hello classmates
		// otherwise--> Hello my family

		if (morning) {
			System.out.println("Let me check if I have class today");
			if (classToday) {
				System.out.println("Good morning my classmates");
			} else {
				System.out.println("Good morning my family");
			}
		}

		System.out.println("-------End of the code-------");
		System.out.println("-----------------------Example 2------------------------------------------------------");

		boolean anyAllergy = true;
		boolean pollenAllergy = false;

		if (anyAllergy) {
			System.out.println("Let's check which allergies you have");
			if (pollenAllergy) {
				System.out.println("Do not get close to trees");
			} else {
				System.out.println("Ok I know you do not have pollen allergy");
			}
		} else {
			System.out.println("You are lucky to not have any allergies");
		}
		System.out.println(
				"-------------------------------Example 3-------------------------------------------------------------");
		/*
		 * if it is Friday --> go to the movies, otherwise stay at home and study if it
		 * is Friday then I will check if the date is 13--> if yes --> watch scary movie
		 * if no--> watch any movie you like
		 */
		boolean isFriday = false;
		int day = 13;

		if (isFriday) {
			System.out.println("It is a movie day!!!!!!");
			if (day == 13) {
				System.out.println("I will watch a scary movie");
			} else {
				System.out.println("I watch any available movies");
			}

		} else {
			System.out.println("I will stay at home and study Java");
		}
		System.out.println(
				"--------------------------------------Example 4---------------------------------------------------------------------");
		/*
		 * check assignment and based on the score we will display a message
		 */
		boolean completed = true;
		int score = 88;

		if (completed) {
			if (score > 90) {
				System.out.println("Great job");
			} else if (score > 80) {
				System.out.println("Good job");
			} else if (score > 70) {
				System.out.println("Good, but let's try to do better");
			} else {
				System.out.println("Good for trying, but study more!!!");
			}
		}else {
		System.out.println("Please make sure to complete all assignments on time");
		}
	}
}
