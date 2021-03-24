package com.class15;

public class ContainsDemo {

	public static void main(String[] args) {

		String var = "This is a demo of contain #+=-!%$#";
		System.out.println(var.contains("#"));
		if (var.contains("%")||var.contains("#")) {
			System.out.println("%,# are not allowed");
		}
		System.out.println(var.contains("demo"));
		System.out.println(var.contains("o"));
		
		System.out.println(var.startsWith("demo"));
		System.out.println(var.startsWith("T"));
		System.out.println(var.endsWith("#"));
	}

}
