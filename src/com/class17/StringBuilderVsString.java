package com.class17;

public class StringBuilderVsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1 = "Meerim";
		String var2 = "Aziz";
		String var3 = "Afzal";
		String var4 = "MJ";
		var4 = "Ram";

		StringBuilder sb1=new StringBuilder("Meerim");
		StringBuilder sb2=new StringBuilder("Aziz");
		StringBuilder sb3=new StringBuilder("Afzal");
		StringBuilder sb4=new StringBuilder("MJ");
		
		System.out.println(sb1.reverse());
		
		var1=sb1.toString();
		
	}

}
