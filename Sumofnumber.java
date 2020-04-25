package com. company;


// Input retrieved does not match the pattern for the expected type
import java.util.InputMismatchException;


// For tacking User inputs
import java.util.Scanner;


/*
Write a program that reads an unspecified number of integer arguments using Scanner Class and
adds them together.
*The program should display the total of the given number and should only consider integer value.
*The program should display an error message if there are non-integer vales.
*/


public class Sumofnumber {
    public static void sumOfNumbers(Scanner scan) {


// Java try-catch block is used to handle the Input Miss-match exceptions in the program

        try {
            System.out.println("Enter the numbers");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d=  scan.nextInt();
            if(a<0||b<0||c<0||d<0){
                System.out.println("Enter positive numbers only");
            }
            else
            System.out.println("Enter sum of numbers:" +(a+b+c+d));


        }
        catch (InputMismatchException e){
            System.out.println("Enter only integer values:");
        }
    }
}

