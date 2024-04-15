package com.OnlineShoppingApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Online Shopping BAZAR!");

		// For XML
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		// For @annotaion
//		ApplicationContext context = new AnnotationConfigApplicationContext();

		// For config file
//		ApplicationContext context = new FileSystemXmlApplicationContext();

		Battery battery = (Battery) context.getBean("battery");
		System.out.println(battery);

		Disc disc = (Disc) context.getBean("disc");
		System.out.println(disc);

	}
}
