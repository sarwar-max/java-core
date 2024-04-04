package com.learning.core.day1session2.PS4;

import java.util.Scanner;

public class ArrayElementsCheckerPS01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter 5 numbers in the range from 1 to 40 : ");

        for (int i = 0; i < arr.length; i++) {
            int input = sc.nextInt();
            if (input < 1 || input > 40) {
                System.out.println("Please enter 5 numbers between 1 and 40.");
                i--; // Decrementing i to re-enter the number for this index
            } else {
                arr[i] = input;
            }
        }

        System.out.println("Enter two numbers in the range from 1 to 40 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 < 1 || num1 > 40 || num2 < 1 || num2 > 40) {
            System.out.println("Please enter both numbers between 1 and 40.");
        } else {
            boolean foundNum1 = false;
            boolean foundNum2 = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num1) {
                    foundNum1 = true;
                }
                if (arr[i] == num2) {
                    foundNum2 = true;
                }
            }

            if (foundNum1 && foundNum2) {
                System.out.println("It's Bingo");
            } else {
                System.out.println("Not Found");
            }
        }
    }
}
