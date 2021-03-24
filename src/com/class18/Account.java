package com.class18;

public class Account {

	private double actualAccountBalance;
	private String actualUserName;
	private String actualPassword;

	public boolean login(String enteredUserName, String enteredPassword) {
		return enteredUserName.equals(actualUserName) && enteredPassword.equals(actualPassword);
	}

	public boolean signUp(String enteredUserName, String enteredPassword, double enteredBalance) {
		if (enteredUserName.length() > 15) {
			return false;
		} else {
			actualUserName = enteredUserName;
			actualPassword = enteredPassword;
			actualAccountBalance = enteredBalance;
			return true;
		}
	}

	boolean transferFunds(String Password, double enteredAccountBalance) {
		if (Password.equals(actualPassword) && enteredAccountBalance <= actualAccountBalance) {

			actualAccountBalance = actualAccountBalance - enteredAccountBalance;
			return true;

		} else {
			return false;
		}
	}
}
