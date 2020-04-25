package com.company;

/**
 * This code is about to find the Lucky number
 * Example: 12345
 *          1+2+3+4+5=15 (15>9) add the digits in number
 *          15=>1+5=6
 *          Lucky number is 6
 */

import java.util.Scanner;

// Input retrieved does not match the pattern for the expected type
import java.util.InputMismatchException;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter a positive number");
            int number = input.nextInt();
            if (number > 0) {
                if (number > 9) {
                    int result = sumOfNumber(number);
                    System.out.println(result);
                }
                else {
                    System.out.println(number);
                }
            }
            else {
                System.out.println("Enter positive Number!!");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
    public static int sumOfNumber(int number) {
        int sumOfNum = 0;
        int remainder;
        int index = 0;
        while (number != 0) {
            remainder = number % 10;
            sumOfNum = sumOfNum + remainder;
            number = number / 10;
        }
        if (sumOfNum > 9) {
            sumOfNum = sumOfNumber(sumOfNum);
        }
        return sumOfNum;
    }
}
