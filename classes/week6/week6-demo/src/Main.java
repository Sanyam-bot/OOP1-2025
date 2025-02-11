import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Pass by value
        int number = 15;
        System.out.println("The value of number is (before): " + number);
        changeValue(number);
        System.out.println("The value of number is (after): " + number);

//        Pass by reference
        int [] numbers = {1, 4, 2, 6, 7};
        System.out.println("The value of numbers before sorting: " + Arrays.toString(numbers));
        sort(numbers);
        System.out.println("The value of numbers after sorting: " + Arrays.toString(numbers));

//        Passing by reference for non-primitive data with a wrapper
        NumberWrapper numberWrapper = new NumberWrapper(number);
        System.out.println("The value of number is (before): " + numberWrapper.number);
        changeValue(numberWrapper);
        System.out.println("The value of number is (after): " + numberWrapper.number);


    }

//        Pass by value
    static void changeValue(int number){
        number++;
    }

//    Pass by reference
    static void changeValue(NumberWrapper number){
        number.number++;
    }

    static void sort(int[] numbers){
        Arrays.sort(numbers);
    }

    private static class NumberWrapper{
        public int number;
        public NumberWrapper(int number){
            this.number = number;
        }
    }

}