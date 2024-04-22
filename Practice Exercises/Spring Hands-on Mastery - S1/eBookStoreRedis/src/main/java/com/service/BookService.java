package com.service;

import com.model.Book;

import java.util.List;

public interface BookService {

	Book addBook(Book book);

	Book updateBook(Book book);

	List<Book> findAllBooks();

	Book findByBookId(String id);

	void deleteBookById(String id);

	List<Book> findByBookTitle(String bookTitle);

	List<Book> findByBookPublisher(String bookPublisher);

	List<Book> findByBookYear(int bookYear);
}
