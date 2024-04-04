package com.learning.core.day1session2.PS4;

public class SubPS02 {

	public static void main(String[] args) {
		int A[] = { 3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0 };

		int sum = 0;
		int average = 0;

		// Compute the sum of elements from index 0 to 14 and stores it at element 15.
		for (int i = 0; i <= 14; i++) {
			sum += A[i];
		}

		A[15] = sum;

		// Compute the average of all numbers and stores it at element 16.
		average = sum / A.length;
		A[16] = average;

		// Identifies the smallest value from the Array and stores it at elements 17.
		int min = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] < min) {
				min = A[i];
			}
		}
		A[17] = min;

		for (int n : A) {
			System.out.print(n + " ");
		}
	}

}
