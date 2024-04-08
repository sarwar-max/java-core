package com.learning.core.day3session1.PS7;

import java.util.ArrayList;
import java.util.List;

public class SubPS01 {

	public static void main(String[] args) {

		List<String> studentNames = new ArrayList<String>();
		studentNames.add("Jack");
		studentNames.add("Paul");
		studentNames.add("Henry");
		studentNames.add("Mary");
		studentNames.add("Ronaldo");

		if (studentNames.contains("Henry")) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}

}
