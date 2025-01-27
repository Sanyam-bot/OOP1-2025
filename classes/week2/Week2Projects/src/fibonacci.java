import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input: ");
        int userInput = inputScanner.nextInt();

        int firstResult = 0;
        int secondResult = 1;
        int finalResult = -1;
//        Logic
        if (userInput == 1) {
            finalResult = 0;
        } else if (userInput == 2) {
            finalResult = 1;
        } else if (userInput == 3) {
            finalResult = 1;
            firstResult = secondResult;
            secondResult = finalResult;
        } else {
            for(int i = 3; i <= userInput; i++) {
                finalResult = firstResult + secondResult;
                firstResult = secondResult;
                secondResult = finalResult;
            }
        }
        System.out.println("Output: " + finalResult);
    }
}
