package com.class11;

public class Task4 {

	public static void main(String[] args) {
		
		String [][]food= {
				{"Carrot","Potato","Eggplant","Onion","Pepper"},
				{"Grapes","Strawberries","Apples","Oranges","Kiwis"},
				{"Cheese","Milk","Sour Cream"},
				{"Cake","Candy","Ice Cream"}
		};
		
		for(int row=0;row<food.length;row++) {
			for(int col=0;col<food[row].length;col++) {
				
				System.out.print(food[row][col]+" ");
			}
		System.out.println();
		}
		
		System.out.println("-----------------------------------------");
		
		
		for(String yum[]:food) {
			for(String y:yum) {
				System.out.print(y+" ");
			}
		System.out.println();
		}

	}

}
