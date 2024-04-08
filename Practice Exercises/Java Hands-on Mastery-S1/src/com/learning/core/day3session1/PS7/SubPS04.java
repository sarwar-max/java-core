package com.learning.core.day3session1.PS7;

import java.util.HashSet;
import java.util.Scanner;

public class SubPS04 {

	public static void main(String[] args) {

		HashSet<Product> products = new HashSet<>();

		products.add(new Product("P001", "Maruti 800"));
		products.add(new Product("P002", "Maruti Zen"));
		products.add(new Product("P003", "Maruti Dezire"));
		products.add(new Product("P004", "Maruti Alto"));

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter product ID to remove: ");
		String productIdToRemove = scanner.nextLine();

		boolean removed = false;
		Product productToRemove = null;
		for (Product product : products) {
			if (product.getProductId().equals(productIdToRemove)) {
				productToRemove = product;
				removed = true;
				break;
			}
		}

		if (productToRemove != null) {
			products.remove(productToRemove);
		}

		if (removed) {
			System.out.println("Product removed successfully.");
			System.out.println("Remaining products:");
			for (Product product : products) {
				System.out.println(product);
			}
		} else {
			System.out.println("Product with ID " + productIdToRemove + " not found.");
		}

		scanner.close();
	}
}