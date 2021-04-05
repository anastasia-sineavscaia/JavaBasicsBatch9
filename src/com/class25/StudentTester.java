package com.class25;

public class StudentTester {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.sleep();
		student.learn();
		student.grades();
		
		Student student1=new SyntaxStudent();
		student1.learn();
		
		Student student2=new CollegeStudent();
		student2.sleep();
		
		SchoolStudent student3=new SchoolStudent();
		student3.grades();
		

	}

}
