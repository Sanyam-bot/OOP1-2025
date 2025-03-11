//Name: Sanyam Singh Sachdeva
//Date: Mar 3, 2025
//Description: Practice using Methods and Functions in Java.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in); // Initialising a Scanner object

    public static void main(String[] args) {

        int[] elements = {12, 34, 56, 78, 90}; // Sample array

        System.out.printf("%nAssignment-3 : Methods and Functions%n%n");

//        Get three numbers from the user to use in the methods as arguments.
        int num1 = userInputInt("Enter first number", Integer.MIN_VALUE, Integer.MAX_VALUE);
        int num2 = userInputInt("Enter second number", Integer.MIN_VALUE, Integer.MAX_VALUE);
        int num3 = userInputInt("Enter third number", Integer.MIN_VALUE, Integer.MAX_VALUE);

//        Using calculateSum method
        System.out.printf("%n------ Basic Method Definition ------ %n");
        System.out.printf("Sum of first two numbers: %d %n", calculateSum(num1, num2));

//        Using Method Overloading
        System.out.printf("%n------ Method Overloading ------ %n");
        System.out.printf("Product of first two numbers: %d %n", multiply(num1, num2));
        System.out.printf("Product of three numbers: %d %n", multiply(num1, num2, num3));

//        Method with an Array Parameter
        System.out.printf("%n------ Method with an Array Parameter ------ %n");
        System.out.printf("Sample array: %s %n", Arrays.toString(elements));
        System.out.printf("Maximum Value: %d %n", findMax(elements));

//        Recursive Method
        System.out.printf("%n------ Recursive Method  ------ %n");
        System.out.print("Enter a String: ");
        String text = scanner.nextLine();
        System.out.printf("Reversed String: %s", reverseString(text, text.length() - 1));
    }

    /**
     * Calculate the sum of the two integers
     *
     * @param num1 the first number to add.
     * @param num2 the second number to add.
     * @return Sum of the two integers.
     */
    private static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Multiplies two integers
     *
     * @param num1 the first number to multiply.
     * @param num2 the second number to multiply.
     * @return The product of the two integers.
     */
    private static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Multiplies three integers
     *
     * @param num1 the first number to multiply.
     * @param num2 the second number to multiply.
     * @param num3 the third number to multiply.
     * @return The product of the three integers.
     */
    private static int multiply(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    /**
     * Find the maximum value in an integer array
     *
     * @param integerArray the array of integers to search.
     * @return the largest integer in the array.
     */
    private static int findMax(int[] integerArray) {
        int maxValue = Integer.MIN_VALUE;

        for (int element: integerArray) {
            if (element > maxValue){
                maxValue = element;
            }
        }
        return maxValue;
    }

    /**
     * Reverse the text using recursion, by moving the pointer
     * from the rightmost character to leftmost character, while
     * adding them all up.
     *
     * @param text the string to reverse.
     * @param lastIndex the index of the last character to process.
     * @return the reversed String.
     */
    private static String reverseString(String text, int lastIndex) {
//        Base Case
        if (lastIndex < 0) {
            return "";
        }
//        Recursive Case
        return text.charAt(lastIndex) + reverseString(text, --lastIndex);
    }

    /**
     * Prompts the user for an integer input within a specified range.
     * This method continuously asks for input until the user provides a valid integer
     * within the given `min` and `max` values.
     *
     * @param prompt The message displayed to the user when asking for input.
     * @param min The minimum allowed value (inclusive).
     * @param max The maximum allowed value (inclusive).
     * @return A valid integer entered by the user within the specified range.
     * @throws IllegalArgumentException If `min` is greater than `max`.
     */
    private static int userInputInt(String prompt, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Minimum value cannot be greater than maximum value.");
        }

        while (true) {
            try {
                System.out.print(prompt + ": ");
                int elements = scanner.nextInt();
                scanner.nextLine(); // To clear the buffer
                if (elements >= min && elements <= max) {
                    return elements;
                } else {
                    System.out.printf("\nThe input needs to be in the range of [%d, %d].%n", min, max);
                    System.out.println("------------------TRY AGAIN-------------------\n");
                }
            } catch (Exception e) {
                System.out.println("\nThe input needs to be an Integer.");
                System.out.println("-------------TRY AGAIN-----------\n");
                scanner.nextLine(); // To clear the buffer
            }
        }
    }
}