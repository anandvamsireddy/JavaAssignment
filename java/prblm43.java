import java.util.Scanner;
import java.util.regex.Pattern;

public class prblm43 {
    public static boolean isValidPAN(String pan) {
        String panPattern = "[A-Z]{5}[0-9]{4}[A-Z]";
        return Pattern.matches(panPattern, pan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your PAN number: ");
        String pan = scanner.nextLine();
        
        if (isValidPAN(pan)) {
            System.out.println("PAN number is valid.");
        } else {
            System.out.println("PAN number is invalid.");
        }

        scanner.close();
    }
}

