package com.learning.core.day1session2.PS4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubPS03 {
	public static int firstRepeatingElement(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					return i;
				}
			}
		}
		// if no repeating element then return -1
		return -1;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int N = scanner.nextInt();
		int[] arr = new int[N];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}

		int index = firstRepeatingElement(arr, N);

		// checking if any repeating element is found or not
		if (index == -1) {
			System.out.println("No repeating element found!");
		} else {
			// printing the first repeating element
			System.out.println("First repeating element is " + arr[index]);
		}
	}
}