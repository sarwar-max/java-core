package com.repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Book;

@Repository("bookRepository")
@Scope("singleton")
public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findByBookTitle(String bookTitle);

	List<Book> findByBookPublisherLike(String bookPublisher);

	@Query("SELECT new com.model.Book(b.id, b.bookTitle, b.bookPublisher, b.bookIsbn, b.bookNumberOfPages, b.bookYear) FROM Book b WHERE b.bookYear=:bookYear")
	List<Book> findByYear(@Param("bookYear") int bookYear);

}
