package com.learning.core.day1session1.PS3;

import java.util.Scanner;

public class MarksObtainedByStudentsPS3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total marks obtained: ");

		int totalMarks = sc.nextInt();

		double percentage = (double) totalMarks / 100 * 100;

		if (percentage >= 60) {
			System.out.println("Grade A.");
		} else if (percentage >= 45) {
			System.out.println("Grade B.");
		} else if (percentage >= 35) {
			System.out.println("Grade C.");
		} else if (percentage < 35) {
			System.out.println("Fail");
		}
	}

}
