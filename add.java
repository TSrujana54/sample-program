package com.ibm;

// Input retrieved does not match the pattern for the expected type

import java.util.InputMismatchException;

// For tacking User inputs
import java.util.Scanner;


import static ibm.Addition.sumOfNumbers;

public class add{
    private static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        sumOfNumbers(scan);
    }
}