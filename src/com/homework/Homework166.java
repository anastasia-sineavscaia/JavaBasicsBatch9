package com.homework;

public class Homework166 {

	void eat() {

	}

	void sleep() {

	}
}

class Cat extends Homework166 {
	void eat() {
		System.out.println("Cat eats");
	}

	void sleep() {
		System.out.println("Cat sleeps a lot");
	}
}

class Kitten1 extends Cat {
	void eat() {
		System.out.println("Kitten1 eats milk");
	}

	void sleep() {
		System.out.println("Kitten1 sleeps a lot");
	}
}

class Kitten2 extends Cat {
	void eat() {
		System.out.println("Kitten2 eats a snack");
	}

	void sleep() {
		System.out.println("Kitten2 sleeps a lot");
	}
}

class Kitten3 extends Cat {
	void eat() {
		System.out.println("Kitten3 eats everything");
	}

	void sleep() {
		System.out.println("Kitten3 sleeps a lot");
	}
}