package com.learning.core.day3session2.PS8;

import java.util.Hashtable;
import java.util.Scanner;

public class SubPS10 {

	public static void main(String[] args) {
		Hashtable<Integer, Employee> employees = new Hashtable<>();

		// Create Employee objects
		Employee emp1 = new Employee(1001, "Daniel", "Analyst", "L&D");
		Employee emp2 = new Employee(1002, "Thomas", "Tester", "Testing");
		Employee emp3 = new Employee(1003, "Robert", "Production Manager", "Development");
		Employee emp4 = new Employee(1004, "Grace", "Tech Support", "HR");

		// Add Employee objects to the Hashtable using employee ID as the key
		employees.put(emp1.getId(), emp1);
		employees.put(emp2.getId(), emp2);
		employees.put(emp3.getId(), emp3);
		employees.put(emp4.getId(), emp4);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee ID to search for a specific Employee:");
		int id = sc.nextInt();

		Employee searchedEmployee = employees.get(id);
		if (searchedEmployee != null) {
			System.out.println(searchedEmployee);
		} else {
			System.out.println("Employee with ID " + id + " not found.");
		}

		// Close the Scanner
		sc.close();
	}
}