package com.class11;

public class Task2 {

	public static void main(String[] args) {

		String[][] named = new String[2][4];

		named[0][0] = "Mr";
		named[0][1] = "Mrs";
		named[0][2] = "Ms";
		named[0][3] = "Miss";

		named[1][0] = "Smith";
		named[1][1] = "Jordan";
		named[1][2] = "Jackson";
		named[1][3] = "Obama";

		System.out.println(named[0][1] + " " + named[1][0] + ", " + named[0][0] + " " + named[1][3] + ", " + named[0][2]
				+ " " + named[1][2] + ", " + named[0][3] + " " + named[1][1]);

		System.out.println();
		System.out.println("-----------------------------------------------------------------------");

		String[][] names = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Jordan", "Jackson", "Obama" }, };

		String name = names[0][1] + " " + names[1][0];
		System.out.println(name);

		String[][] grade = new String[2][4];

		grade[0][0] = "Anastasia";
		grade[0][1] = "Jennifer";
		grade[0][2] = "Erin";
		grade[0][3] = "Kevin";

		grade[1][0] = "A";
		grade[1][1] = "B";
		grade[1][2] = "C";
		grade[1][3] = "A";

		System.out.println(grade[0][0] + " " + grade[1][0] + " " + grade[0][1] + " " + grade[1][1] + " " + grade[0][3]
				+ " " + grade[1][3]);
	}

}
