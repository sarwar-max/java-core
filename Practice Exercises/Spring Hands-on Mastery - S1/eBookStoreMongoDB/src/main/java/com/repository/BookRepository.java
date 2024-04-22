package com.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Book;

@Repository("bookRepository")
public interface BookRepository extends MongoRepository<Book, String> {

	List<Book> findByBookTitle(String bookTitle);

	List<Book> findByBookPublisherLike(String bookPublisher);

	@Query("{'bookYear' : ?0}")
	List<Book> findByYear(int bookYear);

}
