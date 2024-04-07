package com.learning.core.day2session1.PS5;

import java.util.Scanner;

public class SubPS02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String!");
		String inputString = sc.nextLine();
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();

		System.out.println("Output:");
		System.out.println(countLastNVowels(inputString, n));

		sc.close();

	}

	public static String countLastNVowels(String inputString, int n) {
		String vowels = "aeiouAEIOU";
		StringBuilder lastNVouels = new StringBuilder();
		int count = 0;

		for (int i = inputString.length() - 1; i >= 0; i--) {
			char ch = inputString.charAt(i);
			if (vowels.contains(Character.toString(ch))) {
				count++;
				lastNVouels.insert(0, ch);
				if (count == n) {
					return lastNVouels.toString();
				}
			}
		}

		if (count < n) {
			return "Mismatch in Vowel Count";
		}

		return lastNVouels.toString();
	}

}
