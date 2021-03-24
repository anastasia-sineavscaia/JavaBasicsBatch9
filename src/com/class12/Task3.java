package com.class12;

public class Task3 {

	public static void main(String[] args) {
		
		int [][] numbers= {
				{3,4,7,8,},
				{30,15,34,78},
				{22,54,72,13},
		};
		int sumOdd=0;
		int sumEven=0;
		for(int r=0;r<numbers.length;r++) {
			for(int c=0;c<numbers[r].length;c++) {
				if(c%2!=0) {
					sumOdd+=numbers[r][c];
				}else {
					sumEven+=numbers[r][c];
				}
			
			}
		}
		System.out.println("The sum of all the odd numbers is "+sumOdd);
		System.out.println("The sum of all the even numbers is "+sumEven);

	}

}
