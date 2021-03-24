package com.class18;

public class TypesOfVars {
	
	String name;
	static String CompanyName="Syntax";
	
	void printInfo() {
		System.out.println(name+"Company "+CompanyName);
	}
	
	static void printCompanyInfo() {
		//System.out.println(name);
		System.out.println(CompanyName);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TypesOfVars obj1=new TypesOfVars();
		obj1.name="Ram";
		
		TypesOfVars obj2=new TypesOfVars();
		obj2.name="Aiman";
		
		
		
		

	}

}
