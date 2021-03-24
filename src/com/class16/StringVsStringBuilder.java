package com.class16;

public class StringVsStringBuilder {

	public static void main(String[] args) {
		
		String var1="USA";
		String var2="USA";
		String var3="USA";
		String var4=new String("USA");
		System.out.println(var1==var2);
		System.out.println(var1==var4);//only checks the address(the location) of the variable
		System.out.println(var1.equals(var2));
		System.out.println(var1.equals(var4));//checks the location of the variable and what CONTENT is stored inside of it
		
		StringBuilder sb=new StringBuilder("USA");
		

	}

}
