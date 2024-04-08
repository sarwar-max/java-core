package com.learning.core.day3session1.PS7;

import java.util.TreeSet;

public class SubPS05 {
	public static void main(String[] args) {

		TreeSet<Person> persons = new TreeSet<>();

		persons.add(new Person(1, "Jon", 32, 19000));
		persons.add(new Person(2, "Bob", 28, 17000));
		persons.add(new Person(3, "Tom", 42, 3999));
		persons.add(new Person(4, "David", 25, 1000));
		persons.add(new Person(5, "Eva", 23, 12000));
		persons.add(new Person(6, "Mark", 25, 14000));

		System.out.println("Persons with age greater than 25:");
		for (Person person : persons) {
			if (person.getAge() > 25) {
				System.out.println(person);
			}
		}
	}
}