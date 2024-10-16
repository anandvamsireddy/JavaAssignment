import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;  // Initialize largest to the smallest possible integer value
        
        // Loop to accept 10 numbers from the user
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            
            // Update largest if the current number is greater than the current largest
            if (num > largest) {
                largest = num;
            }
        }

        // Display the largest number
        System.out.println("The largest number is: " + largest);
        
        scanner.close();
    }
}
