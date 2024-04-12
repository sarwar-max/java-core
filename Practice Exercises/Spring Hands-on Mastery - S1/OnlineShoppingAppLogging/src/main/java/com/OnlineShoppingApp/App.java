package com.OnlineShoppingApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Online Shopping BAZAR!");

		// Bootstrap Spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		// Retrieve ShoppingCart bean
		ShoppingCart cart = (ShoppingCart) context.getBean("shoppingCart");

		// Interact with ShoppingCart (AOP logging will be applied)
		cart.addItem(new Product("AAA Battery", 5.0));
		cart.addItem(new Product("DVD Disc", 10.0));
		cart.removeItem(new Product("DVD Disc", 10.0));
		cart.updateItem(new Product("Blu-ray Disc", 15.0));

		// Display items in the ShoppingCart after interactions
		System.out.println("Items in ShoppingCart:");
		for (Product item : cart.getItems()) {
			System.out.println(item);
		}

		// Close the Spring container
		((ClassPathXmlApplicationContext) context).close();
	}
}
