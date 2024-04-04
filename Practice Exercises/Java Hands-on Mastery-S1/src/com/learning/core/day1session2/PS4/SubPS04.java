package com.learning.core.day1session2.PS4;

public class SubPS04 {

	public static void findCombinations(int[] nums, int k) {
		int[] combination = new int[k];
		backtrack(nums, k, 0, combination, 0);
	}

	private static void backtrack(int[] nums, int k, int index, int[] combination, int start) {
		if (index == k) {
			for (int i = 0; i < k; i++) {
				System.out.print(combination[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = start; i < nums.length; i++) {
			combination[index] = nums[i];
			backtrack(nums, k, index + 1, combination, i + 1);
		}
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3 };
		int k = 2;
		findCombinations(input, k);
	}
}