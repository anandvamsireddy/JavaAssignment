import java.util.Scanner;

public class prblm29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSum = 0;
        int validNumbers = 0;
        
        System.out.println("Please enter 5 strings numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                totalSum += number;
                validNumbers++;
            } catch (NumberFormatException e) {
    
                System.out.println("the num" + input);
            }
        }
        System.out.println("Total sum of valid numbers: " + totalSum);
        System.out.println("Valid numbers processed: " + validNumbers);
    }
}
