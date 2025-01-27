import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);

//        Take input
        System.out.print("Input: ");
        int number = inputScanner.nextInt();

        String result;
//        Logic
        if (number % 2 == 0){
            result = "Even";
        } else {
            result = "Odd";
        }

        System.out.println(result);
    }
}
