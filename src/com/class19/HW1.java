package com.class19;

public class HW1 {
	String name;
	int sub1;
	int sub2;
	int sub3;
	int grade;
	
	HW1 (String name1, int sub1, int sub2, int sub3) {
	   this.name=name1;
	   this.sub1=sub1;
	   this.sub2=sub2;
	   this.sub3=sub3;
	  
	}
	int everage() {
	   grade=(sub1+sub2+sub3)/3;
	   System.out.println(grade);
	   return grade;
	}
	public static void main(String[] args) {
	   // TODO Auto-generated method stub
	   HW1 obj1=new HW1("Shah", 80,60,70);
	   obj1.everage();
	   HW1 obj2=new HW1("ali", 100,89,70);
	   obj2.everage();
	   HW1 obj3=new HW1("jhon", 100,100,80);
	   obj3.everage();
	}
}
