package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.model.Book;
import com.repository.BookRepository;

import jakarta.transaction.Transactional;

@Service("bookServiceImpl")
@Scope("singleton")
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	@Qualifier("bookRepository")
	private BookRepository bookRepository;

	@Override
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> findAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book findAllByBookId(Long id) {
		return bookRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteBookById(Long id) {
		bookRepository.deleteById(id);

	}

	@Override
	public List<Book> findByBookTitle(String bookTitle) {
		return bookRepository.findByBookTitle(bookTitle);
	}

	@Override
	public List<Book> findByBookPublisherLike(String bookPublisher) {
		return bookRepository.findByBookPublisherLike(bookPublisher);
	}

	@Override
	public List<Book> findByYear(int bookYear) {
		return bookRepository.findByYear(bookYear);
	}

}
