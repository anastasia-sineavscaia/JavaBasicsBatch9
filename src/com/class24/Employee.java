package com.class24;

public class Employee {

	double salary;

	void work() {
		System.out.println("Employee is working");
	}

	void getPaid() {
		System.out.println("Employee is getting paid " + salary + " other benefits");
	}

	void goOnLeaves() {
		System.out.println("Employee is gaining on leaves ");
	}

}

class FullTimeEmp extends Employee {

}

class PartTimeEmployee extends Employee {
	@Override
	void goOnLeaves() {
		System.out.println("Part time employees don't get leaves");
	}

}

class Contractor extends Employee {
	@Override
	void goOnLeaves() {
		System.out.println("Contractor employees don't get leaves");
	}

	@Override
	void getPaid() {
		System.out.println(" paid on hourly bases");
	}
}