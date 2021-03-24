package com.class15;

public class Task {

	public static void main(String[] args) {
		
		String username="Anastasia";
		String password="As12345678";
		String confirmPassword="As12345678";
		
		if(username.isEmpty()||password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
			
		}else if(password.length()<8) {
			System.out.println("Password is too short");
		}else if(username.equals(password)) {
			System.out.println("Password cannot contain username");
		}else if(!password.equals(confirmPassword)) {
			System.out.println("Passwords do not match");
		}else {
			System.out.println("Your username and password has been created");
		}

	}

}
