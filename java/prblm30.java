import java.util.Scanner;

class NumberProcessor {
    public int processNumber(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }
}

public class prblm30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberProcessor processor = new NumberProcessor();
        int totalSum = 0;
        int validNumbers = 0;

        System.out.println("Please enter 5 strings numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            String input = scanner.nextLine();
            try {
                int number = processor.processNumber(input);
                totalSum += number;
                validNumbers++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Skipping input: " + input);
            }
        }
        System.out.println("Total sum of valid numbers: " + totalSum);
        System.out.println("Valid numbers processed: " + validNumbers);
    }
}

