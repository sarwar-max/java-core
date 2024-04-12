package com.OnlineShoppingApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class App {
	public static void main(String[] args) {
		System.out.println("Online Shopping BAZAR!");

		// Bootstrap Spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		// Retrieve ShoppingCart bean
		ShoppingCart cart = (ShoppingCart) context.getBean("shoppingCart");
		cart.addItem(new Battery(1, "AAA Battery", 5.0, true, 0.1));
		cart.addItem(new Disc(2, "DVD Disc", 10.0, 700, 0.15));

		// Retrieve Cashier bean
		Cashier cashier = (Cashier) context.getBean("cashier");

		try {
			// Perform checkout using Cashier
			cashier.checkout(cart);
			System.out.println("Checkout completed successfully.");
		} catch (IOException e) {
			System.err.println("Error during checkout: " + e.getMessage());
		}

		// Close the Spring container
		((ClassPathXmlApplicationContext) context).close();
	}
}
