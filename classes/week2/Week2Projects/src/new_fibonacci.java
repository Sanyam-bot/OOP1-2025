public class new_fibonacci {
    public static void main(String[] args) {
//        Scanner inputScanner = new Scanner(System.in);
//        System.out.print("Input: ");
        int userInput = 1;

        long firstResult = 0;
        long secondResult = 1;
        long finalResult = -1;
//        Logic

        for (int kack = 1; kack <= 93; kack++) {
            if (userInput == 1) {
                finalResult = 0;
            } else if (userInput == 2) {
                finalResult = 1;
            } else if (userInput == 3) {
                finalResult = 1;
                firstResult = secondResult;
                secondResult = finalResult;
            } else {
                finalResult = firstResult + secondResult;
                firstResult = secondResult;
                secondResult = finalResult;
            }
            System.out.println("Output" + kack + ": " + finalResult);
            userInput++;
        }
    }
}
