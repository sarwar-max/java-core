package com.learning.core.day3session2.PS8;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SubPS03 {

	public static void main(String[] args) {
		Set<Book> books = new TreeSet<Book>();

		books.add(new Book(1001, "Python Learning", 715.0, "2/2/2020", "Martic C. Brown"));
		books.add(new Book(1002, "Modern Mainframe", 295.0, "19/5/1997", "Sharad"));
		books.add(new Book(1003, "Java Programming", 523.0, "23/11/1984", "Gilad Bracha"));
		books.add(new Book(1004, "Read C++", 295.0, "19/11/1984", "Henry Harvin"));
		books.add(new Book(1005, ".Net Platform", 3497.0, "6/3/1984", "Mark J. Price"));

//		books.forEach(System.out::println);

		// using Stream API
		books.stream().sorted(Comparator.comparing(Book::getAuthor)).forEach(System.out::println);
	}
}
