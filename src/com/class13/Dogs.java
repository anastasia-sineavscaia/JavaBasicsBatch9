package com.class13;

public class Dogs {

	public String breed;
	public String color;
	public int age;
	public String size;

	public void bark() {
		System.out.println("ruff ruff and woof woof woof");
	}

	public void sleep() {
		System.out.println("ZZZZZZZZZZZZzzzzzzzzz.........");
	}

	public void eat() {
		
	for(int i=0; i<5;i++) {
		System.out.println("Omnomnomnomnom......");
	}
	}

	public void look() {
		System.out.println("Hi I am a dog, my color is " + color);
	}

	public static void main(String[] args) {

		Dogs Bulldog = new Dogs();
		Bulldog.breed = "American Bulldog";
		Bulldog.age = 5;
		Bulldog.size = "Large";
		Bulldog.color = "Light Gray";
		Bulldog.bark();
		Bulldog.eat();
		Bulldog.sleep();
		Bulldog.look();
		
		Dogs Beagle = new Dogs();
		Beagle.breed = "Beagle";
		Beagle.age = 6;
		Beagle.size = "Large";
		Beagle.color = "Orange";
		
		Dogs GermanShepherd = new Dogs();
		GermanShepherd.breed = "German Shepherd";
		GermanShepherd.age = 6;
		GermanShepherd.size = "Large";
		GermanShepherd.color = "White and Orange";
		

	}

}
