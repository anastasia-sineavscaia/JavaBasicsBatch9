package com.class06;

public class SwitchDemo {

	public static void main(String[] args) {

		int day = 5;
		String weekDay;

		if (day == 1) {// works with conditions, it evaluates if the condition is true or false
			weekDay = "Monday";
		} else if (day == 2) {
			weekDay = "Tuesday";
		} else if (day == 3) {
			weekDay = "Wednesday";
		} else if (day == 4) {
			weekDay = "Thursday";
		} else if (day == 5) {
			weekDay = "Friday";
		} else if (day == 6) {
			weekDay = "Saturday";
		} else if (day == 7) {
			weekDay = "Sunday";
		} else {
			weekDay = "Invalid";
		}
		if (!weekDay.equals("Invalid")) {
			System.out.println("Today is " + weekDay);
		}
		System.out.println("--------------------using switch---------------------");
		String weekDay1;

		switch (day) {// is value based
        
		//we CANNOT have duplicate cases
		//values MUST match a variable type
		//we MUST have break in every case
		
		case 1:
			weekDay1 = "Monday";
			break;
		case 2:
			weekDay1 = "Tuesday";
			break;
		case 3:// it jumps right away into the matching case
			weekDay1 = "Wednesday";
			break;
		case 4:
			weekDay1 = "Thursday";
			break;
		case 5:
			weekDay1 = "Friday";
			break;
		case 6:
			weekDay1 = "Saturday";
			break;
		case 7:
			weekDay1 = "Sunday";
			break;
		default:
			weekDay1 = "Invalid";
			break;
		}
		System.out.println(weekDay1);// ???????
		if (!weekDay.equals("Invalid")) {
			System.out.println("Today is " + weekDay);
		}
	}
}
