
import java.util.Scanner;

/*
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * if hasNextInt() method to get the number and add it to the sum.
 * before the user enters each number, print the message Enter number #x: where x represents the count, i.e. 1,2,3,4,etc.
 * for example, the first message printed to the user would be entered number #1:, the next enter number #2:, and so on.
 * Hint:
 * use a while loop.
 * use a counter variable for counting valid numbers.
 * close the scanner after you don't need it anymore.
 * Create a class with the name ReadingUserInputChallenge.
 */

public class Programme_1_ReadNumbersAndSum {

    public static void readTenNumbersAndSum() {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            int order = counter + 1;
            System.out.println("Enter number # " + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;

                }

            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line(enter key)
        }
        System.out.println("sum = " + sum);
        //Closing the scanner object
        scanner.close();
    }

    public static void main(String[] args) {
        readTenNumbersAndSum();
    }
}
