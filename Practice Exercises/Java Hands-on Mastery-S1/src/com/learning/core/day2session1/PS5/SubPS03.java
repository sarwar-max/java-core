package com.learning.core.day2session1.PS5;

public class SubPS03 {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println("All subsequences of " + str);

		subsequences(str);
	}

	public static void subsequences(String str) {
		subsequencesHelp(str, "");
	}

	private static void subsequencesHelp(String remaining, String current) {
		if (remaining.isEmpty()) {
			System.out.println(current);
			return;
		}

		subsequencesHelp(remaining.substring(1), current + remaining.charAt(0));
		subsequencesHelp(remaining.substring(1), current);
	}

}
