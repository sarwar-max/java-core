package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.model.Book;
import com.repository.BookRepository;

@SpringBootApplication
public class EBookStoreRedisApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EBookStoreRedisApplication.class, args);
	}

	@Autowired
	@Qualifier("bookRepository")
	private BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {

		bookRepository
				.save(new Book(".NET Development Using the Compiler API", "Sarwar", "978-1-61729-427-3", 288, 2018));

		System.out.println(bookRepository.findAll());

	}

}
