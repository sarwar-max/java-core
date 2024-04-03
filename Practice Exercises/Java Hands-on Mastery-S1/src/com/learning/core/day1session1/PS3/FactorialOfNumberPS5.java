package com.learning.core.day1session1.PS3;

import java.util.Scanner;

public class FactorialOfNumberPS5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number for Factorial");

		int number = sc.nextInt();
		int fact = 1;
		for (int i = number; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is " + fact);

	}

}
