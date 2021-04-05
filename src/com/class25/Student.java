package com.class25;

public class Student {
	void grades() {
		System.out.println("Student gets graded on assignments");
	}
void learn() {
	System.out.println("Student learns a lot of new things");
}
	void sleep() {
		System.out.println("Student doesn't sleep enough");
	}
	

}
class SyntaxStudent extends Student {
	void learn() {
		System.out.println("Syntax student learns a lot of Java");
	}
	
}
class CollegeStudent extends Student{
	void sleep() {
		System.out.println("College student sleeps only 6 hours");
	}
	
}
class SchoolStudent extends Student{
	void grades() {
		System.out.println("School student: bad grades don't affect anything");
	}
	
}