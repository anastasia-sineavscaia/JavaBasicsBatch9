package com.class17;

public class Students {
	
	String studentName;
	String studentID;
	static int numberOfStudents;
	
	public static void main(String[]args) {
		
		Students st1=new Students();
		st1.studentName="Anastasia";
		st1.studentID="1234567";
		st1.numberOfStudents++;
		System.out.println(st1.studentID+" name "+st1.studentName+" Number of Students "+st1.numberOfStudents);
		
		Students st2=new Students();
		st2.studentName="Nicholas";
		st2.studentID="34567890";
		st2.numberOfStudents++;
		System.out.println(st2.studentID+" name "+st2.studentName+" Number of Students "+st2.numberOfStudents);
		System.out.println(st2.numberOfStudents);
		
	
	}
	
}
