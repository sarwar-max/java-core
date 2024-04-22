package com.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.persistence.Id;

@Document(collection = "book_details")
public class Book {

	@Id
	private String id;

	@Field(name = "book_title")
	private String bookTitle;

	@Field(name = "book_publisher")
	private String bookPublisher;

	@Field(name = "book_isbn")
	private String bookIsbn;

	@Field(name = "book_number_of_pages")
	private int bookNumberOfPages;

	@Field(name = "book_year")
	private int bookYear;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public String getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public int getBookNumberOfPages() {
		return bookNumberOfPages;
	}

	public void setBookNumberOfPages(int bookNumberOfPages) {
		this.bookNumberOfPages = bookNumberOfPages;
	}

	public int getBookYear() {
		return bookYear;
	}

	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String id, String bookTitle, String bookPublisher, String bookIsbn, int bookNumberOfPages,
			int bookYear) {
		super();
		this.id = id;
		this.bookTitle = bookTitle;
		this.bookPublisher = bookPublisher;
		this.bookIsbn = bookIsbn;
		this.bookNumberOfPages = bookNumberOfPages;
		this.bookYear = bookYear;
	}

	public Book(String bookTitle, String bookPublisher, String bookIsbn, int bookNumberOfPages, int bookYear) {
		super();
		this.bookTitle = bookTitle;
		this.bookPublisher = bookPublisher;
		this.bookIsbn = bookIsbn;
		this.bookNumberOfPages = bookNumberOfPages;
		this.bookYear = bookYear;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookTitle=" + bookTitle + ", bookPublisher=" + bookPublisher + ", bookIsbn="
				+ bookIsbn + ", bookNumberOfPages=" + bookNumberOfPages + ", bookYear=" + bookYear + "]";
	}

}
