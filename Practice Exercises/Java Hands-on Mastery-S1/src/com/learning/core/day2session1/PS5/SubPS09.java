package com.learning.core.day2session1.PS5;

public class SubPS09 {

	public static void main(String[] args) {

		String input = "Mr John Smith";
		String output = replaceSpaces(input);
		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}

	public static String replaceSpaces(String input) {
		// Trim the input string to remove space
		input = input.trim();

		StringBuilder sb = new StringBuilder();

		for (char c : input.toCharArray()) {
			if (c == ' ') {
				sb.append("%20");
			} else {
				sb.append(c);
			}
		}

		return sb.toString();
	}
}
