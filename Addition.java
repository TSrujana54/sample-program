package ibm;

// Input retrieved does not match the pattern for the expected type
import java.util.InputMismatchException;

// For tacking User inputs
import java.util.Scanner;
public class Addition {

    public static void sumOfNumbers(Scanner scan) {

// Java try-catch block is used to handle the Input Miss-match exceptions in the program
        try {
            System.out.println("Enter the numbers");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if(a<0 || b<0|| c<0){
                System.out.println("Enter positive numbers");
            }
            else
                System.out.println("Sum of enter numbers are:" + (a+b+c));
        }
        catch (InputMismatchException e){
            System.out.println("Please enter only integer values");
        }
    }
}

