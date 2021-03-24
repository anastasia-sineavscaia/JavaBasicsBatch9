package com.class12;

public class Task4 {

	public static void main(String[] args) {
		
		String[][] countries= {
				{"Uited States","Canada","Greenland","Mexico","Cuba","Puerto Rico","Costa Rica","Panama","Barbados"},
				{"Brazil", "Argentina","Colombia","Peru","Chile","Venezuela","Ecuador"},
				{"Germany","France","Italy","United Kingdon","Netherlands","Switzerland","Greece","Poland","Austria","Romania"},
				{"Japan","Indonesia","China","Thailand","India","Philippines","Hong Kong","Vietnam","Maldives"},
				{"Nigeria","Ghana","Kenya","Ethiopia","Tanzania","Morocco","Senegal","Algeria"}
		};
		
		int sum=0;
		
		for(int row=0;row<countries.length;row++) {
			for(int col=0;col<countries[row].length;col++) {
				
				System.out.print(countries[row][col]+", ");
			sum++;
			}
		System.out.println();
		}
System.out.println("-----------------------------------------------------------------------------------");
		for(String world[]:countries) {
			for(String w:world) {
				
				System.out.print(w+", ");
			}
		System.out.println();
		
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("The total numbers of countries is "+sum);

	}

}
