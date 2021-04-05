package com.class24;

public class Car {
	void start() {
		System.out.println("Use the key to start me");
	}

	void stop() {
		System.out.println("Use the breaks to stop me");
	}

	void park() {
		System.out.println("Park me manually");
	}

}

class BMW extends Car {
	void start() {
		System.out.println("Use the Button to start me");}
	void drifting() {
		System.out.println("I can drift really good in the rain");
	}
}

class Tesla extends Car {
	void start() {
		System.out.println("Use App to start me");
	}

	void park() {
		System.out.println("Park me using the sensor and the camera");
	}
}