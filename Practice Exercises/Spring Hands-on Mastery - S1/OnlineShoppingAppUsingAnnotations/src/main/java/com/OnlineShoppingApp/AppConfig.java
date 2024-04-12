package com.OnlineShoppingApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "com.OnlineShoppingApp")
@PropertySource("classpath:discounts.properties")
public class AppConfig {

	@Value("${specialcustomer.discount}")
	private double specialCustomerDiscount;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public Product AAAProduct() {
		return new Product("AAA Battery", 10.0, specialCustomerDiscount);
	}

	@Bean
	public Product DVDProduct() {
		return new Product("DVD Disc", 5.0, specialCustomerDiscount);
	}

	@Bean
	public Product BluRayProduct() {
		return new Product("Blu-ray Disc", 15.0, specialCustomerDiscount);
	}

	@Bean
	public ShoppingCart shoppingCart() {
		return new ShoppingCart();
	}
}
