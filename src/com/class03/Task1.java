package com.class03;

public class Task1 {

	public static void main(String[] args) {

		int temp = 30;

		if (temp < 32) {
			System.out.println("I am a if block.");
			System.out.println("Water will freeze with temperature " + temp);
			System.out.println("It is very cold");
		} else {
			System.out.println("Water will Not freeze with temperature " + temp);
			System.out.println("It is not that cold");
		}

		double money = 5;
		double $coke = 3;

		if (money == $coke) {
			System.out.println("I am buying soda");
		} else {
			System.out.println("I need an exact amount");
		}
		System.out.println("------------------------------------------------------");
		boolean snow = true;
		if (snow) {
			System.out.println("Yay, I will play with the snow");
		} else {
			System.out.println("I am going to ride my bicycle");
		}
		System.out.println("-----------------------------------------------------");

		boolean summer = true;
		if (summer) {
			System.out.println("I am going to Florida");
		} else {
			System.out.println("I will stay at home");
		}

	}

}
