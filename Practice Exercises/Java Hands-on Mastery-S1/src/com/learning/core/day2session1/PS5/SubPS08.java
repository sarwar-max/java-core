package com.learning.core.day2session1.PS5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubPS08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = sc.nextLine();

		if (canBeSplit(input)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}

	public static boolean canBeSplit(String input) {
		if (input.length() < 4) {
			return false;
		}

		Set<Character> uniqueChars = new HashSet<>();
		for (char c : input.toCharArray()) {
			uniqueChars.add(c);
		}

		return uniqueChars.size() >= 4;
	}
}