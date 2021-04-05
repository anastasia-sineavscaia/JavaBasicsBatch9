package com.class19;

public class Book {

	String bookName;
	String ISBN;

	Book() {
		System.out.println("Important Line");
	}

	Book(String bookName, String ISBN) {
        this();
		this.bookName = bookName;
		this.ISBN = ISBN;
	}

	public static void main(String[] args) {
		Book book = new Book("Head first Java", "12346");
	}

}
