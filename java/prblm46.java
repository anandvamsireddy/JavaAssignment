import java.io.*;
import java.util.*;
import java.util.regex.Pattern;


public class prblm46 {
    private static final String VALID_STRING_PATTERN = "[a-zA-Z]+[0-9]+";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> validStrings = new ArrayList<>();
        while (true) {
            System.out.print("Enter a string (or type 'end' to stop): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            if (isValidString(input)) {
                validStrings.add(input);
            } else {
                System.out.println("Invalid string! It must have one or more alphabets followed by one or more digits.");
            }
        }
        Collections.sort(validStrings);
        writeToFile(validStrings, "Codes.txt");

        scanner.close();
        System.out.println("Valid strings have been written to Codes.txt.");
    }
    private static boolean isValidString(String input) {
        return Pattern.matches(VALID_STRING_PATTERN, input);
    }
    private static void writeToFile(List<String> strings, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String str : strings) {
                writer.write(str);
                writer.newLine(); 
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

