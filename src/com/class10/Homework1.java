package com.class10;

public class Homework1 {

	public static void main(String[] args) {

		String[] car = new String[6];

		car[0] = "Toyota";
		car[1] = "Honda";
		car[2] = "Subaru";
		car[3] = "Ford";
		car[4] = "Nissan";
		car[5] = "Chevrolet";

		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
	
	for(String cars:car) {
		System.out.println(cars+" ");
	}
	
	
	}

}
