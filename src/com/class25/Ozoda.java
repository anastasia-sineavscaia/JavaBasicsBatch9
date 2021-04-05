package com.class25;

public class Ozoda extends KFather {
	Ozoda(String name) {
		super(name);
	}

	@Override
	void sleep() {
		
		System.out.println(name + " likes to sleep " + 16);
	}

	@Override
	void eat() {
		
		System.out.println(name + " likes to eat burger");
	}

}
