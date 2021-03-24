package com.homework;

public class Homework088 {

	String breed;
	String name;
	String color;

	public void bark() {
	
	}

	public void run() {
	}

	public void play() {
	}

	public static void main(String[] args) {

	Homework088 dog1=new Homework088();
	
	dog1.breed="Husky";
	dog1.name="Fluffy";
	dog1.color="Black and White";
	
	dog1.bark();
	dog1.run();
	dog1.play();
	
	Homework088 dog2=new Homework088();
	
	dog2.breed="Bulldog";
	dog2.name="Coco";
	dog2.color="Brown";
	dog2.bark();
	dog2.run();
	dog2.play();
	
	Homework088 dog3=new Homework088();
	
	dog3.breed="Labrador";
	dog3.name="Peanut";
	dog3.color="Golden";
	dog3.bark();
	dog3.run();
	dog3.play();
	
	System.out.println(dog1.breed+" can bark");
	System.out.println(dog1.breed+" can run");
	System.out.println(dog1.breed+" can play");
	System.out.println(dog2.breed+" can bark");
	System.out.println(dog2.breed+" can run");
	System.out.println(dog2.breed+" can play");
	System.out.println(dog3.breed+" can bark");
	System.out.println(dog3.breed+" can run");
	System.out.println(dog3.breed+" can play");
	}
}
