package com.learning.core.day1session1.PS3;

import java.util.Scanner;

public class PrintWeekDayPS2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number between 1 to 7 for Week Day selection");

		int weekDay = sc.nextInt();

		if (weekDay == 1) {
			System.out.println("Monday");
		} else if (weekDay == 2) {
			System.out.println("Tuesday");
		} else if (weekDay == 3) {
			System.out.println("Wednesday");
		} else if (weekDay == 4) {
			System.out.println("Thursday");
		} else if (weekDay == 5) {
			System.out.println("Friday");
		} else if (weekDay == 6) {
			System.out.println("Saturday");
		} else if (weekDay == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Invalid Input");
		}

	}

}
