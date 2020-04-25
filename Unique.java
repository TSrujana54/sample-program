import java.util.*;

/**
 * The code is about to find the unique number
 * Example1: 12344 is unique number
 * Example: 12133 is not unique number
 */

public class Unique {
    public static void main(String[] args) {
        try {
            System.out.println("Enter the number");
            Scanner scanner = new Scanner(System.in);
            String number = scanner.next();

            // String string = Integer.toString(number);

            System.out.println(number);
            int count = uniqueNumber(number);
            System.out.println(count);
            if (count > 0) {
                System.out.println("Not Unique");
            } 
	else {
                System.out.println("Unique");
            }
        }
	 catch (Exception e) {
            System.out.println("please enter valid input");
        }
    }
    static int count = 0;
    public static int uniqueNumber(String number) {
        if (number.charAt(0) == '0') {
            count++;
        } 
	else {
            for (int i = 0; i < number.length() - 1; i++) {
                for (int j = i + 1; j < number.length(); j++) {
                    if (number.charAt(i) == number.charAt(j)) {
                        count++;
                    }
                }
            }
        }
        //System.out.println(count);
        return count;
    }
}
