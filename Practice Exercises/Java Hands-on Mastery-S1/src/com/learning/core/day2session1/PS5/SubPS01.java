package com.learning.core.day2session1.PS5;

import java.util.Scanner;

public class SubPS01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String as Input");

		String str = sc.nextLine();

		// Display the Length of String
		System.out.println("Length of the string: " + str.length());

		// Display the String in uppercase
		System.out.println("Uppercase String: " + str.toUpperCase());

		// Checking weather a given String is palindrome or not
		String reverseString = "";
		for (int i = 0; i < str.length(); i++) {
			reverseString = str.charAt(i) + reverseString;
		}

		if (str.equals(reverseString)) {
			System.out.println("It is a palindrome.");
		} else {
			System.out.println("It is not a palindrome.");
		}
	}
}
