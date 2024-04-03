package com.learning.core.day1session1;

public class D01P01 {

	public static Book createBooks(String title, Double price) {
		Book book = new Book();
		book.setBookTitle(title);
		book.setBookPrice(price);
		return book;
	}

	public static void showBooks(Book book) {
		System.out.println("Book Title: " + book.getBookTitle() + " and Price: " + book.getBookPrice());
	}

	public static void main(String[] args) {

		Book myBook = createBooks("Java Programming", 350.00);
		showBooks(myBook);
	}

}
