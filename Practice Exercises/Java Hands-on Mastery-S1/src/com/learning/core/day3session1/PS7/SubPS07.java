package com.learning.core.day3session1.PS7;

import java.util.TreeSet;

public class SubPS07 {
	public static void main(String[] args) {

		TreeSet<Person> persons = new TreeSet<>();

		persons.add(new Person(1, "Jerry", 30, 50000));
		persons.add(new Person(2, "Smith", 35, 60000));
		persons.add(new Person(3, "Popeye", 40, 70000));
		persons.add(new Person(4, "Jones", 25, 45000));
		persons.add(new Person(5, "John", 28, 55000));
		persons.add(new Person(6, "Tom", 26, 48000));

		System.out.println("Person Details:");
		for (Person person : persons) {
			System.out.println(person.getName().toUpperCase());
		}
	}
}