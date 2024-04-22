package com.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.model.Book;

import java.util.List;

@Repository("bookRepository")
@Scope("singleton")
public interface BookRepository extends CrudRepository<Book, String> {

	List<Book> findByBookTitle(String bookTitle);

	List<Book> findByBookPublisher(String bookPublisher);

	List<Book> findByBookYear(int bookYear);

}
