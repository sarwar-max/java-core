package com.learning.core.day4session2.PS10;

import java.util.Scanner;

public class MergeSort {

	// Method to perform Merge sort on an array
	public static void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2; // Calculate the middle index

			// Recursively sort the left and right halves
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);

			// Merge the sorted halves
			merge(arr, low, mid, high);
		}
	}

	// Method to merge two sub-arrays into a single sorted array
	private static void merge(int[] arr, int low, int mid, int high) {
		// Calculate sizes of the two sub-arrays
		int n1 = mid - low + 1;
		int n2 = high - mid;

		// Create temporary arrays for left and right sub-arrays
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		// Copy data to temporary arrays
		for (int i = 0; i < n1; i++) {
			leftArray[i] = arr[low + i];
		}
		for (int j = 0; j < n2; j++) {
			rightArray[j] = arr[mid + 1 + j];
		}

		// Merge the temporary arrays back into the original array
		int i = 0, j = 0, k = low;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k++] = leftArray[i++];
			} else {
				arr[k++] = rightArray[j++];
			}
		}

		// Copy remaining elements of leftArray, if any
		while (i < n1) {
			arr[k++] = leftArray[i++];
		}

		// Copy remaining elements of rightArray, if any
		while (j < n2) {
			arr[k++] = rightArray[j++];
		}
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

		// Perform Merge sort
		mergeSort(arr, 0, arr.length - 1);

		System.out.println("Sorted Array:");
		printArray(arr);
	}
}
