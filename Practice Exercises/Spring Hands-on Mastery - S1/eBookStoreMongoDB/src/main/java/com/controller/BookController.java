package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Book;
import com.service.BookService;
import com.service.BookServiceImpl;

@RestController
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
		return bookServiceImpl.findAllByBookId(id);
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
		return bookServiceImpl.findByBookPublisherLike(bookPublisher);
	}

	@GetMapping("/books/bookYear/{bookYear}")
	public List<Book> findByYear(@PathVariable int bookYear) {
		return bookServiceImpl.findByYear(bookYear);
	}

}
