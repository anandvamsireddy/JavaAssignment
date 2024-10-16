package oops1;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0; 
        int validNumbers = 0; 

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter number " + i + ": ");
            String input = scanner.nextLine();

            try {
                double number = Double.parseDouble(input);
                total += number;
                validNumbers++;
            } catch (NumberFormatException e){
                System.out.println("Invalid input: '" + input + "' is not a valid number. Please try again.");
            }
        }

        System.out.println("Total sum of valid numbers: " + total);
        System.out.println("You entered " + validNumbers + " valid numbers.");
    }
}

