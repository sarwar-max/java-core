package com.learning.core.day3session1.PS7;

import java.util.TreeSet;

public class SubPS09 {

	public static void main(String[] args) {

		TreeSet<Person> persons = new TreeSet<>();

		persons.add(new Person(1, "Serry", 30, 999.00));
		persons.add(new Person(2, "Smith", 35, 2999.0));
		persons.add(new Person(3, "Popeye", 40, 5999.0));
		persons.add(new Person(4, "Jones", 25, 6999.0));
		persons.add(new Person(5, "John", 28, 1999.0));
		persons.add(new Person(6, "Tom", 26, 3999.0));

		for (Person person : persons) {
			if (person.getName().startsWith("J")) {
				System.out.println("First person whose name starts with 'J':");
				System.out.println(person);
				break;
			}
		}
	}
}