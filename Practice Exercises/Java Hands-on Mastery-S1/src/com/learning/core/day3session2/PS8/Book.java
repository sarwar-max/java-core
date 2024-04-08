package com.learning.core.day3session2.PS8;

import java.util.Objects;

public class Book implements Comparable<Book> {

	private Integer bookId;
	private String title;
	private Double price;
	private String dateOfPublication;
	private String author;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDateOfPublication() {
		return dateOfPublication;
	}

	public void setDateOfPublication(String dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer bookId, String title, Double price, String dateOfPublication, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.dateOfPublication = dateOfPublication;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + ", dateOfPublication="
				+ dateOfPublication + ", author=" + author + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookId, dateOfPublication, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(bookId, other.bookId)
				&& Objects.equals(dateOfPublication, other.dateOfPublication) && Objects.equals(price, other.price)
				&& Objects.equals(title, other.title);
	}

	// based on bookId
//	@Override
//	public int compareTo(Book o) {
//		return this.bookId.compareTo(o.bookId);
//	}

	// based on author
	@Override
	public int compareTo(Book o) {
		return this.author.compareTo(o.author);
	}
}
