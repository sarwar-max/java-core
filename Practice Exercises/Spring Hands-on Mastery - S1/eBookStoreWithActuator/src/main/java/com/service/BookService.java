package com.service;

import java.util.List;

import com.model.Book;

public interface BookService {

	Book addBook(Book book);

	Book updateBook(Book book);

	List<Book> findAllBooks();

	Book findAllByBookId(Long id);

	void deleteBookById(Long id);

	List<Book> findByBookTitle(String bookTitle);

	List<Book> findByBookPublisherLike(String bookPublisher);

	List<Book> findByYear(int bookYear);
}
