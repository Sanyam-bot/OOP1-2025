import java.util.*;

class Solution {
    public int romanToInt(String s) {
        Map <Character, Integer> map = new HashMap<>();  // Creating a HashMap

        // Putting Values
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int[] values = new int[s.length()];

        // Put all the individual values of the string into an integer array
        for (int i = 0; i < s.length(); i++){
            values[i] = map.get(s.charAt(i));
        }

//        Iterate over the values, and if in a pair, the right is a larger number than
//        left, change the left to negative.
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] < values[i + 1]) {
                values[i] = -values[i];
            }
        }

        int sum = 0;

        for (int value: values) {
            sum+=value;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.print(solution.romanToInt("MCMXCIV"));  // Calling the method
    }
}
