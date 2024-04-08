package com.learning.core.day3session1.PS7;

import java.util.HashSet;
import java.util.Scanner;

public class SubPS03 {

	public static void main(String[] args) {

		HashSet<Product> products = new HashSet<>();

		products.add(new Product("P001", "Maruti 800"));
		products.add(new Product("P002", "Maruti Zen"));
		products.add(new Product("P003", "Maruti Dezire"));
		products.add(new Product("P004", "Maruti Alto"));

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter product ID to search: ");
		String searchProductId = scanner.nextLine();

		boolean found = false;
		for (Product product : products) {
			if (product.getProductId().equals(searchProductId)) {
				System.out.println("Product found: " + product);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Product not found with ID: " + searchProductId);
		}

		scanner.close();
	}
}
