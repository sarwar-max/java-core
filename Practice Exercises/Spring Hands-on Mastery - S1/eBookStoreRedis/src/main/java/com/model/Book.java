package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash
public class Book {

	@Id
	private String id;
	private String bookTitle;
	private String bookPublisher;
	private String bookIsbn;
	private int bookNumberOfPages;
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
