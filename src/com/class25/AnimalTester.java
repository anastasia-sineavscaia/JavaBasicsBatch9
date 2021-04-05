package com.class25;

public class AnimalTester {

	public static void main(String[] args) {
		
		Animal animal=new Cat();
		animal.eat();
		animal.sleep();
		
		Cat cat=(Cat) animal;
		cat.speak();
		
		Animal animal1=new Dog();
		
		Dog dog=(Dog)animal1;
		dog.bark();
		dog.eat();

	}

}
