package com.javaprograms;
/**
 * This code is about to know the Vowels and Consonant of each letter in the string
 */
import java.util.*;
public class Consonent {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String string1= scanner.nextLine();
        String string=string1.toLowerCase();
        System.out.println(string);

        // String string2=string1.toUpperCase();
        //System.out.println(string2);

        if(string.contains("0")|| string.contains("1")||string.contains("2")||string.contains("3")||
                string.contains("4")||string.contains("5")||string.contains("6")||string.contains("7")||string.contains("8")||string.contains("9")) {
            System.out.println("invalid input, please enter only alphabets");
        }
        else {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                    System.out.print("Vowel  ");
                } else {
                    System.out.print("consonant ");
                }
            }
        }
        System.out.println();
    }
}



