package com.class14;

public class MoreMethodTester {

	public static void main(String[] args) {

		MoreMethodExamples obj1 = new MoreMethodExamples();
		System.out.println(obj1.print());
		System.out.println(obj1.doubleTheValue(10));
		obj1.isRaining(true);
		obj1.Batch9(null);
		
		System.out.println(obj1.number(122, 56));
		
		obj1.oddEven(13);
	
		double [] arr= {10.2,25,30};
		System.out.println(obj1.returnTheArraySum(arr));
	
		System.out.println(obj1.isMirror("aba"));
		System.out.println(obj1.isMirror("abcdef"));
	}

}
