package com.OnlineShoppingApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Online Shopping BAZAR!");

		// Bootstrap Spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		// Retrieve Battery bean from the Spring container
		Battery battery = (Battery) context.getBean("battery");
		System.out.println("Battery Details:");
		System.out.println(battery);

		// Retrieve Disc bean from the Spring container
		Disc disc = (Disc) context.getBean("disc");
		System.out.println("Disc Details:");
		System.out.println(disc);

		// Close the Spring container
//		((ClassPathXmlApplicationContext) context).close();
	}
}
