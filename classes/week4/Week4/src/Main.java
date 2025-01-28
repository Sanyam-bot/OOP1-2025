import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        demonstrateSwitchCase();
    }

    private static void demonstrateSwitchCase(){
        String[] fruits = {"apple", "banana", "orange", "pear", "pineapple"};

        Scanner inputScanner = new Scanner(System.in);
        String choice;
        choice = inputScanner.nextLine();

        switch (choice){
            case "apple":
                System.out.println("Apple");
                break;
            case "banana":
                System.out.println("Banana");
                break;
            case "orange":
                System.out.println("Orange");
                break;
            case "pear":
                System.out.println("Pear");
                break;
            case "pineapple":
                System.out.println("Pineapple");
                break;
            default:
                System.out.println("Not a valid fruit.");
                break;
        }
    }

}
