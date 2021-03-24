package com.class16;

public class ReplaceAllDemo {

	public static void main(String[] args) {


		String var1="Syntax is the best34343. Batch nine is great";
		System.out.println(var1.replaceAll("[0-9]", ""));
		var1="978678jvchvjASDFvh";
		System.out.println(var1.replaceAll("[a-zA-Z]", ""));
		var1="943855hfvdvjhHGFFVBJKK&&**^&^%%%$";
		System.out.println(var1.replaceAll("[^A-Z]",""));
		System.out.println(var1.replaceAll("[A-Za-z0-9]", ""));
		

	}

}
