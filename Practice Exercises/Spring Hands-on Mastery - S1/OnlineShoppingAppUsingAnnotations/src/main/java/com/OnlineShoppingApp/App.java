package com.OnlineShoppingApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Online Shopping BAZAR!");

		// Bootstrap Spring container using Beans.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		// Retrieve ShoppingCart bean
		ShoppingCart cart = (ShoppingCart) context.getBean("shoppingCart");

		// Interact with ShoppingCart
		cart.addItem(context.getBean("battery", Product.class));
		cart.addItem(context.getBean("disc", Product.class));

		// Display items in the ShoppingCart
		System.out.println("Items in ShoppingCart:");
		for (Product item : cart.getItems()) {
			System.out.println(item);
		}

		// Close the Spring container
		((ClassPathXmlApplicationContext) context).close();
	}
}
