package com.class17;

public class Ram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int salary=10000100;
		StringBuilder sb=new StringBuilder(String.valueOf(salary));
		sb.reverse();
		
		salary=Integer.parseInt(sb.toString());
		System.out.println(salary);
		
	}

}
