package com.learning.core.day3session2.PS8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubPS02 {
	public static void main(String[] args) {
		Map<String, String> phoneBook = new HashMap<>();

		phoneBook.put("Amal", "998787823");
		phoneBook.put("Manvitha", "937843978");
		phoneBook.put("Joseph", "7882221113");
		phoneBook.put("Smith", "8293893311");
		phoneBook.put("Kathe", "7234560011");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the for searching PhoneNumber");

		String nameToSearch = sc.nextLine();

		String phoneNumber = phoneBook.get(nameToSearch);
		System.out.println(phoneNumber);

	}
}
