package com.learning.core.day2session1.PS5;

public class SubPS04 {
	public static int minimumNumberOfDeletions(String s) {
		int n = s.length();
		int[] dp = new int[n];

		for (int i = n - 2; i >= 0; i--) {
			int prev = 0;
			for (int j = i + 1; j < n; j++) {
				int temp = dp[j];
				if (s.charAt(i) == s.charAt(j)) {
					dp[j] = prev;
				} else {
					dp[j] = Math.min(dp[j], dp[j - 1]) + 1;
				}
				prev = temp;
			}
		}
		return dp[n - 1];
	}

	public static void main(String[] args) {
		String str = "aebcbda";
		System.out.println("Minimum number of deletions = " + minimumNumberOfDeletions(str));
	}
}
