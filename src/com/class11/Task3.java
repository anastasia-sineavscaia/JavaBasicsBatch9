package com.class11;

public class Task3 {

	public static void main(String[] args) {
		
		
		
		
		String[][] cars= {
				
				{"Ford","Cadillac","Chevrolet","Dodge","Tesla"},
				{"Volkswagen","Mercedes-Benz","BMW","Audi","Porshe","Opel"},
				{"Hyundai","Kia","Renault","Daewoo"},
				{"Alfa Romeo","Lamborghini","Maserati","Ferrari","Fiat"}
		};
		
		for(int row=0; row<cars.length;row++) {
			
			for(int col=0;col<cars[row].length;col++) {
				System.out.print(cars[row][col]+" ");
			}
		System.out.println();
		}

		
		System.out.println("---------------------------------------------");
		
		for(String car []:cars) {
			for(String c:car) {
				System.out.print(c+" ");
			}
			
		}
	}

}
