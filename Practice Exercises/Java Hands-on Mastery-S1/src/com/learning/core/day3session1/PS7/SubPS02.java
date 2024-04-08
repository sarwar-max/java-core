package com.learning.core.day3session1.PS7;

import java.util.HashSet;

public class SubPS02 {

	public static void main(String[] args) {

		HashSet<Product> products = new HashSet<>();

		products.add(new Product("P001", "Maruti 800"));
		products.add(new Product("P002", "Maruti Zen"));
		products.add(new Product("P003", "Maruti Dezire"));
		products.add(new Product("P004", "Maruti Alto"));

		System.out.println("Product Details:");
		for (Product product : products) {
			System.out.println(product);
		}
	}
}
