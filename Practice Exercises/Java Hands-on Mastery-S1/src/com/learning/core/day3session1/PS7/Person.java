package com.learning.core.day3session1.PS7;

class Person implements Comparable<Person> {
	private int id;
	private String name;
	private int age;
	private double salary;

	public Person(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Salary: " + salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id;
	}

	@Override
	public int compareTo(Person other) {
		return Integer.compare(this.id, other.id);
	}
}
