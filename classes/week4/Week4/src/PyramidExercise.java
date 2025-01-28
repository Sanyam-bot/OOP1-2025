import java.util.Scanner;

public class PyramidExercise {

    public static void main(String[] args){
        pyramid();
    }

    private static void pyramid() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int temp = 0;
        for(int i = 0; i < n; i++){ // rows
            for (int k = 0; k < n - i - 1; k++){ //columns
                System.out.print(" ");
            }
            for (int j = 0; j <= temp; j++){
                System.out.print("*");
                System.out.print(" ");
            }
            temp++;
            System.out.print("\n");
        }
    }
}
