package com.learning.core.day2session1.PS5;

public class SubPS06 {
	public static void main(String[] args) {
		String input1 = "aabcdaabc";
		String input2 = "abcab";

		System.out.println("Output for input1: " + longestPrefixSuffix(input1));
		System.out.println("Output for input2: " + longestPrefixSuffix(input2));
	}

	public static int longestPrefixSuffix(String s) {
		int n = s.length();
		int[] lps = computeLPSArray(s);
		return lps[n - 1];
	}

	public static int[] computeLPSArray(String s) {
		int n = s.length();
		int[] lps = new int[n];
		lps[0] = 0;
		int len = 0;
		int i = 1;

		while (i < n) {
			if (s.charAt(i) == s.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len != 0) {
					len = lps[len - 1];
				} else {
					lps[i] = 0;
					i++;
				}
			}
		}
		return lps;
	}
}