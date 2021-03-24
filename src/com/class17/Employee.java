package com.class17;

public class Employee {

	String empID;
	int salary;
	String CEO = "Sumair";

	public static void main(String[] args) {

		Employee obj = new Employee();
		obj.empID = "12345678";
		obj.salary = 10000000;
		System.out.println(obj.empID+" salary "+obj.salary+" CEO "+obj.CEO);

		Employee obj1 = new Employee();
		obj1.empID = "4567890";
		obj1.salary = 200000;
		System.out.println(obj1.empID+" salary "+obj1.salary+" CEO "+obj1.CEO);
		

	}

}
