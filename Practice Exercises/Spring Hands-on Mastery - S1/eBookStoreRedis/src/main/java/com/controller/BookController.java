package com.controller;

import com.model.Book;
import com.service.BookServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Scope("request")
public class BookController {

	@Autowired
	@Qualifier("bookServiceImpl")
	private BookServiceImpl bookServiceImpl;

	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return bookServiceImpl.addBook(book);
	}

	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		return bookServiceImpl.updateBook(book);
	}

	@GetMapping("/books")
	public List<Book> findAllBooks() {
		return bookServiceImpl.findAllBooks();
	}

	@GetMapping("/books/{id}")
	public Book findAllByBookId(@PathVariable String id) {
		return bookServiceImpl.findByBookId(id);
	}

	@DeleteMapping("/books/{id}")
	public void deleteBookById(@PathVariable String id) {
		bookServiceImpl.deleteBookById(id);
	}

	@GetMapping("/books/title/{bookTitle}")
	public List<Book> findByBookTitle(@PathVariable String bookTitle) {
		return bookServiceImpl.findByBookTitle(bookTitle);
	}

	@GetMapping("/books/publisher/{bookPublisher}")
	public List<Book> findByBookPublisherLike(@PathVariable String bookPublisher) {
		return bookServiceImpl.findByBookPublisher(bookPublisher);
	}

	@GetMapping("/books/bookYear/{bookYear}")
	public List<Book> findByYear(@PathVariable int bookYear) {
		return bookServiceImpl.findByBookYear(bookYear);
	}

}
