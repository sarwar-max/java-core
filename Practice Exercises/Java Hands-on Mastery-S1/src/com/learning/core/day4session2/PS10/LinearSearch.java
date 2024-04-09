package com.learning.core.day4session2.PS10;

import java.util.Scanner;

public class LinearSearch {

	// Method to perform linear search in an array
	public static boolean linearSearch(int[] arr, int target) {
		for (int num : arr) {
			if (num == target) {
				return true; // Element found
			}
		}
		return false; // Element not found
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt user to enter the size of the array
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		// Create an array of the specified size
		int[] arr = new int[size];

		// Prompt user to enter the elements of the array
		System.out.println("Enter " + size + " elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		// Prompt user to enter the element to search for
		System.out.print("Enter the element to search for: ");
		int target = scanner.nextInt();

		// Perform linear search in the array
		boolean found = linearSearch(arr, target);

		// Display the result of the linear search
		if (found) {
			System.out.println("Element " + target + " is present.");
		} else {
			System.out.println("Element " + target + " is not present.");
		}

		scanner.close(); // Close the scanner
	}
}
