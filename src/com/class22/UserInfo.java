package com.class22;

public class UserInfo extends UserClass {

	String address;

	UserInfo(String name, String mobileNumber, String address) {
		super(name, mobileNumber);
		this.address = address;

	}

	void UserDetail() {
		System.out.println("name" + name + "Mobile Number " + mobileNumber + "Address " + address);
	}

	public static void main(String[] args) {
		UserInfo userInfo = new UserInfo(" Anastasia ", "12345678 ", "8 Hope Drive");
		userInfo.UserDetail();
	}
}
