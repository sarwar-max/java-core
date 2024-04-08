package com.learning.core.day3session2.PS8;

import java.util.Hashtable;
import java.util.Scanner;

public class SubPS11 {

	public static void main(String[] args) {
		Hashtable<Integer, Employee> employees = new Hashtable<>();

		// Sample employees in the Hashtable
		employees.put(1001, new Employee(1001, "Daniel", "L&D", "Analyst"));
		employees.put(1002, new Employee(1002, "Thomas", "Testing", "Tester"));
		employees.put(1003, new Employee(1003, "Robert", "Development", "Production Manager"));
		employees.put(1004, new Employee(1004, "Grace", "HR", "Tech Support"));

		// Prompt user to enter Employee ID for search or add
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee ID to search or add a new Employee:");

		// Read the user input for Employee ID
		int id = sc.nextInt();

		// Check if the employee with the specified ID exists
		if (employees.containsKey(id)) {
			// Employee exists, display employee details
			System.out.println("Employee Details:");
			System.out.println(employees.get(id));
		} else {
			// Employee does not exist, prompt user to add new employee details
			System.out.println("Employee with ID " + id + " does not exist.");

			// Consume the newline character left by nextInt()
			sc.nextLine();

			// Prompt user to enter new employee details
			System.out.println("Enter new employee name:");
			String name = sc.nextLine(); // Read employee name

			System.out.println("Enter new employee department:");
			String department = sc.nextLine(); // Read employee department

			System.out.println("Enter new employee designation:");
			String designation = sc.nextLine(); // Read employee designation

			// Create and add the new Employee object to the Hashtable
			Employee newEmployee = new Employee(id, name, department, designation);
			employees.put(id, newEmployee);

			System.out.println("New Employee added successfully:");
			System.out.println(newEmployee);
		}

		// Close the Scanner
		sc.close();

		// Display all employees in the Hashtable
		System.out.println("All Employees:");
		employees.forEach((employeeId, employee) -> System.out.println(employeeId + ": " + employee));
	}
}