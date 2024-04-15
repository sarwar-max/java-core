package com;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	private static Scanner scanner = new Scanner(System.in);
	private static PassengerService passengerService;

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		passengerService = context.getBean(PassengerService.class);

		displayMenu();

		boolean quit = false;
		while (!quit) {
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				insertPassenger();
				break;
			case 2:
				updatePassenger();
				break;
			case 3:
				retrievePassenger();
				break;
			case 4:
				deletePassenger();
				break;
			case 5:
				quit = true;
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}

			if (!quit) {
				System.out.println(); // Blank line for readability
				displayMenu();
			}
		}

		scanner.close();
	}

	private static void displayMenu() {
		System.out.println("--Bus Booking System--");
		System.out.println("Press 1 for insert");
		System.out.println("Press 2 for update");
		System.out.println("Press 3 for retrieve");
		System.out.println("Press 4 for delete");
		System.out.println("Press 5 to Quit");
	}

	private static void insertPassenger() {
		System.out.println("Enter Passenger Details:");
		System.out.print("Passenger ID: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		System.out.print("Passenger Name: ");
		String name = scanner.nextLine();
		System.out.print("Passenger DOB (yyyy-mm-dd): ");
		LocalDate dob = LocalDate.parse(scanner.nextLine());
		System.out.print("Passenger Phone: ");
		String phone = scanner.nextLine();
		System.out.print("Passenger Email: ");
		String email = scanner.nextLine();

		PassengerDetails newPassenger = new PassengerDetails(id, name, dob, phone, email);
		passengerService.createPassenger(newPassenger);
		System.out.println("Passenger added successfully.");
	}

	private static void updatePassenger() {
		System.out.print("Enter Passenger ID to update: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		PassengerDetails passenger = passengerService.getPassengerById(id);
		if (passenger == null) {
			System.out.println("Passenger with ID " + id + " not found.");
		} else {
			System.out.println("Current Details: " + passenger);
			System.out.println("Enter new details:");

			System.out.print("Passenger Name: ");
			String name = scanner.nextLine();
			System.out.print("Passenger DOB (yyyy-mm-dd): ");
			LocalDate dob = LocalDate.parse(scanner.nextLine());
			System.out.print("Passenger Phone: ");
			String phone = scanner.nextLine();
			System.out.print("Passenger Email: ");
			String email = scanner.nextLine();

			passenger.setPassengerName(name);
			passenger.setPassengerDob(dob);
			passenger.setPassengerPhone(phone);
			passenger.setPassengerEmail(email);

			passengerService.updatePassenger(passenger);
			System.out.println("Passenger updated successfully.");
		}
	}

	private static void retrievePassenger() {

		List<PassengerDetails> passengers = passengerService.getAllPassengers();
		System.out.println("Retrieve Passenger details");
		System.out.println("---------------- Featch all records ---------------");
		System.out.printf("%-15s%-20s%-15s%-15s%-30s%n", "Passenger_id", "Passenger_name", "dob", "Phone", "Email");
		for (PassengerDetails passenger : passengers) {
			System.out.printf("%-15s%-20s%-15s%-15s%-30s%n", passenger.getPassengerId(), passenger.getPassengerName(),
					passenger.getPassengerDob(), passenger.getPassengerPhone(), passenger.getPassengerEmail());
		}
	}

	private static void deletePassenger() {
		System.out.print("Enter Passenger ID to delete: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		PassengerDetails passenger = passengerService.getPassengerById(id);
		if (passenger == null) {
			System.out.println("Passenger with ID " + id + " not found.");
		} else {
			passengerService.deletePassenger(id);
			System.out.println("Passenger with ID " + id + " deleted successfully.");
		}
	}
}
