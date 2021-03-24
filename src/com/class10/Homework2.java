package com.class10;

public class Homework2 {

	public static void main(String[] args) {
		
		String[] animal= {"cat","dog","ferret","rabbit","lizard","hamster"};
		
		for(int i=0;i<animal.length;i++) {
			System.out.println(animal[i]);
		}
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println();

		for(String pet:animal) {
			System.out.println(pet+" ");
		}
		
	}

}
