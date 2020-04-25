package com.javaprograms;

/**
 * if we add even numbers in a Palindrome then it should be less than 25
 * if we add even numbers in a Palindrome then it should be greater than 25
 * Find out weather the given input is palindrome or not
 */
import java.util.*;

// Input retrieved does not match the pattern for the expected type
import java.util.InputMismatchException;

public class Palindrome{
    public static void main(String[] args){
        System.out.println("Enter the number");
        try {
            Scanner scanner = new Scanner(System.in);
            int number= scanner.nextInt();
            boolean sumofnumber= isPalindrome(number);
            if(sumofnumber) {
                int num=isEvennumber(number);
                // System.out.println(num);
                if(num>25) {
                    System.out.println(number + " is palindrome and the sum of the even number is greater than 25");
                }
                else if(num<25 && num>0){
                    System.out.println(number + " is palindrome and sum of the even number is less than 25");
                }
                else {
                    System.out.println(number + " is palindrome and don't have even nunmber");
                }
            }
            else {
                System.out.println(number + " is not palindrome ");
            }
        }catch (InputMismatchException e){
            System.out.println("Enter only positive integer");
        }
    }
    public static boolean isPalindrome(int number) {
        int sumofnumber = 0;
        int reminder;
        int temp=number;
        while (number > 0) {
            reminder = number % 10;
            sumofnumber = (sumofnumber * 10) + reminder;
            number = number / 10;
        }
        if(temp==sumofnumber) {
            return true;
        }
        else {
            return false;
        }
    }
    public static int isEvennumber(int sumofnumber) {
        int sumofevennumber=0;
        int evennumber;
        int count=0;
        while (sumofnumber > 0) {
            evennumber = sumofnumber % 10;
            if (evennumber % 2 == 0) {
                sumofevennumber = sumofevennumber + evennumber;
                count++;
            }
            sumofnumber = sumofnumber / 10;
        }
        return sumofevennumber;
    }
}