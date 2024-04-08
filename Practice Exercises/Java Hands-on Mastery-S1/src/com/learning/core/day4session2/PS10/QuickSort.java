package com.learning.core.day4session2.PS10;

import java.util.Scanner;

public class QuickSort {

	// Method to perform Quick sort on an array
	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			// Partition the array and get the index of the pivot element
			int pivotIndex = partition(arr, low, high);

			// Recursively sort the left and right sub-arrays
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	// Method to partition the array and return the index of the pivot element
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; // Choose the last element as the pivot
		int i = low - 1; // Index of smaller element

		for (int j = low; j < high; j++) {
			// If current element is less than or equal to the pivot
			if (arr[j] <= pivot) {
				i++; // Increment index of smaller element
				// Swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// Swap arr[i+1] (the element after the last smaller element) and arr[high]
		// (pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1; // Return the index of the pivot element
	}

	// Method to print the array elements
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
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

		scanner.close(); // Close the scanner after input is read

		System.out.println("Input Array:");
		printArray(arr);

		// Perform Quick sort
		quickSort(arr, 0, arr.length - 1);

		System.out.println("Sorted Array:");
		printArray(arr);
	}
}
