package com.learning.core.day3session1.PS7;

import java.util.TreeSet;

public class SubPS06 {

	public static void main(String[] args) {

		TreeSet<Person> persons = new TreeSet<>();

		persons.add(new Person(1, "Jerry", 30, 999.00));
		persons.add(new Person(2, "Smith", 35, 2999.0));
		persons.add(new Person(3, "Popeye", 40, 5999.0));
		persons.add(new Person(4, "Jones", 25, 6999.0));
		persons.add(new Person(5, "John", 28, 1999.0));
		persons.add(new Person(6, "Tom", 26, 3999.0));

		System.out.println("Person Details:");
		for (Person person : persons) {
			System.out.println(person.getId() + ", " + person.getName() + ", " + person.getSalary());
		}
	}
}