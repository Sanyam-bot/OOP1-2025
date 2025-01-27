import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        float[] numbers = new float[3];

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        numbers[0] = inputScanner.nextFloat();
        System.out.println("Enter the second number");
        numbers[1] = inputScanner.nextFloat();
        System.out.println("Enter the third number");
        numbers[2] = inputScanner.nextFloat();

//        Sort the array
        Arrays.sort(numbers);

//        Print the result
        System.out.println("Maximum of the 3 numbers is: " + numbers[2]);
        System.out.println("Minimum of the 3 numbers is: " + numbers[0]);
    }
}