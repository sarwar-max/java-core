package com;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		PassengerService passengerService = context.getBean(PassengerService.class);

		// Test CRUD operations
		PassengerDetails newPassenger = new PassengerDetails(1239, "John Doe", LocalDate.of(1995, 8, 20), "9876543210",
				"john.doe@example.com");

		passengerService.createPassenger(newPassenger);

		//
		passengerService.createPassenger(new PassengerDetails(1240, "Md Gulam Sarwar", LocalDate.of(1997, 12, 15),
				"8910652432", "sarwar@gmail.com"));

		PassengerDetails fetchedPassenger = passengerService.getPassengerById(1239);
		System.out.println("Fetched Passenger: " + fetchedPassenger);

		fetchedPassenger.setPassengerName("Jane Doe");
		passengerService.updatePassenger(fetchedPassenger);

		System.out.println("Updated Passenger: " + passengerService.getPassengerById(1239));

		passengerService.deletePassenger(1239);

		System.out.println("Passenger with ID 1239 deleted.");
	}
}
