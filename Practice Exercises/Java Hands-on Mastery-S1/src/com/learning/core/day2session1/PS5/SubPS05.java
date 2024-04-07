package com.learning.core.day2session1.PS5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubPS05 {
	public static void main(String[] args) {
		String[] input1 = { "abc", "efg", "cde", "ghi", "ija" };
		String[] input2 = { "Ijk", "kji", "abc", "cba" };

		System.out.println("Output for input1: " + canFormCircle(input1));
		System.out.println("Output for input2: " + canFormCircle(input2));
	}

	public static boolean canFormCircle(String[] strings) {

		List<String> result = new ArrayList<String>();
		Set<Integer> visited = new HashSet<Integer>();
		return dfs(strings, result, visited);
	}

	private static boolean dfs(String[] strings, List<String> curr, Set<Integer> visited) {
		if (visited.size() == strings.length) {
			return curr.get(curr.size() - 1).charAt(curr.get(curr.size() - 1).length() - 1) == curr.get(0).charAt(0);
		}

		for (int i = 0; i < strings.length; i++) {
			if (!visited.contains(i) && (curr.isEmpty() || curr.get(curr.size() - 1)
					.charAt(curr.get(curr.size() - 1).length() - 1) == strings[i].charAt(0))) {
				curr.add(strings[i]);
				visited.add(i);
				if (dfs(strings, curr, visited)) {
					return true;
				}
				curr.remove(curr.size() - 1);
				visited.remove(i);
			}
		}
		return false;
	}
}