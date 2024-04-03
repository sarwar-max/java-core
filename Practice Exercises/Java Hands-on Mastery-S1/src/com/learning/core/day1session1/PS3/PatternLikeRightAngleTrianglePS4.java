package com.learning.core.day1session1.PS3;

import java.util.Scanner;

public class PatternLikeRightAngleTrianglePS4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of triangle");

		int size = sc.nextInt();

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
