package com.class20;

public class SpecialTeacherTester {

	public static void main(String[] args) {
		
		ChemistryTeacher teacher=new ChemistryTeacher();
		teacher.name="Saleem";
		teacher.age=34;
		teacher.salary=10000.60;
		teacher.subjects="Chemistry";
		teacher.teachesChemistry();
		
		MathTeacher teacher1=new MathTeacher();
		teacher1.name="Nicholas";
		teacher1.age=33;
		teacher1.salary=1000000;
		teacher1.subjects="Mathematics";
		teacher1.teachesMath();
		
		PianoTeacher teacher2=new PianoTeacher();
		teacher2.name="Anastasia";
		teacher2.age=31;
		teacher2.salary=500000;
		teacher2.subjects="Piano";
		teacher2.teachesPiano();
		

	}

}
