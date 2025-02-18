//Name: Sanyam Singh Sachdeva
//Date: Feb 18, 2025
//Description: Practice using loops (for, while, do-while) and arrays in Java.

//Bubble sort: It repeatedly swaps the adjacent elements if they are in the wrong order, until the array is sorted.
//             It has the O(n2) for the worst case scenario
//             It has the Ω(n) for the best case scenario
//             It has the Θ(n2) for the average case scenario

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Number Processor!");

        // Get the number of elements from the user
        int elementsCount = userInputElements("Enter the number of elements (1-20)", 1, 20);

        // Get the array of numbers from the user
        int[] numbers = userInputArrayOfNumbers(elementsCount);

        // Display results
        System.out.println("\nArray: " + Arrays.toString(numbers));
        System.out.println("Largest Number: " + largestInteger(numbers));
        System.out.println("Smallest Number: " + smallestInteger(numbers));
        System.out.println("Sum of Elements: " + sumOfIntegerArray(numbers));
        System.out.println("Average of Elements: " + (double) sumOfIntegerArray(numbers) / elementsCount);

        // Search for a number
        System.out.print("\nEnter a number to search in the array: ");
        int searchNumber = myScanner.nextInt();
        boolean found = searchArrayOfNumbers(numbers, searchNumber);
        System.out.println("Number " + searchNumber + (found ? " is found." : " is not found."));

//        Sort the array in ascending order
        bubbleSort(numbers);

//        Print the sorted array
        System.out.printf("Sorted array: %s %n", Arrays.toString(numbers));
    }

    private static int userInputElements(String prompt, int min, int max) {
        while (true) {
            try {
                System.out.print(prompt + ": ");
                int elements = myScanner.nextInt();
                myScanner.nextLine(); // To clear the buffer
                if (elements >= min && elements <= max) {
                    return elements;
                } else {
                    System.out.printf("\nThe input needs to be in the range of [%d, %d].%n", min, max);
                    System.out.println("------------------TRY AGAIN-------------------\n");
                }
            } catch (Exception e) {
                System.out.println("\nThe input needs to be an Integer.");
                System.out.println("-------------TRY AGAIN-----------\n");
                myScanner.nextLine(); // To clear the buffer
            }
        }
    }

    private static int[] userInputArrayOfNumbers(int elements){
        int [] numbers = new int[elements];
        do
        {
            System.out.printf("Enter %d integer%s: ", elements, (elements == 1? "": "s"));
            String numbersString = myScanner.nextLine().trim();
            String[] numbersStringArray = numbersString.split("\\s+");

            if (numbersStringArray.length != elements){
                System.out.printf("You need to provide %s integer%s.%n", elements, (elements == 1? "": "s"));
                continue;
            }

            try{
                for(int i = 0; i < elements; i++)
                {
                    numbers[i] = Integer.parseInt(numbersStringArray[i]);
                }
                return numbers;
            }
            catch (Exception e){
                System.out.println("The input can only be integers.");
            }
        }
        while (true);
    }

    private static int largestInteger(int[] elements){
        int largest = elements[0];
        for (int element: elements){
            if (element > largest){
                largest = element;
            }
        }
        return largest;
    }

    private static int smallestInteger(int[] elements){
        int smallest = elements[0];
        for (int element: elements){
            if (element < smallest){
                smallest = element;
            }
        }
        return smallest;
    }

    private static int sumOfIntegerArray(int[] elements){
        int sum = 0;
        for (int element: elements){
            sum+=element;
        }
        return sum;
    }

    private static boolean searchArrayOfNumbers(int[] elements, int number){
        for (int element: elements){
            if (element == number) {
                return true;
            }
        }
        return false;
    }

    private static void bubbleSort(int[] elements){
        int temp;
        boolean swapped;

        for (int j = elements.length - 1; j > 0; j--) {
            swapped = false;
            for (int i = 0; i < j; i++) {
                if (elements[i] > elements[i + 1]) {
                    temp = elements[i];
                    elements[i] = elements[i + 1];
                    elements[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Break the loop, if nothing was swapped in the last iteration.
        }
    }
}