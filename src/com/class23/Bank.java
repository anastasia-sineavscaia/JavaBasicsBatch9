package com.class23;

public class Bank {

	void chargeTransferFee(double amount) {
		System.out.println("Your fee is " + amount * 0.2);
	}

}

class BankOfAmerica extends Bank {
	void chargeTransferFee(double amount) {
		System.out.println("Your fee is " + amount * 0.5);
	}
}

class Chase extends Bank {
	void chargeTransferFee(double amount) {
		System.out.println("Your fee is " + amount * 0.3);
	}
}

class Citizen extends Bank {

}