package com.homework;

public class Homework131 {
	 static String thirdLetter(String s) {
		 String retString="";
		 for(int i=0;i<s.length();i++) {
			 if(i%3==0) {
				 retString+=(s.charAt(i));
			 }
		 }
	return retString;
	 
	 }

		

		
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(thirdLetter("hello there")); //"hltr"
			System.out.println(thirdLetter("technology")); //"thly"
		}
	}


