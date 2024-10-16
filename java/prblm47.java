import java.io.*;
import java.util.Scanner;

public class prblm47 {
    private static boolean containsString(File file, String searchString) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchString)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();
        System.out.print("Enter the string to search for: ");
        String searchString = scanner.nextLine();

        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }
        File[] files = directory.listFiles();
    if (files != null && files.length > 0){
            for (File file : files) {
                if (file.isFile()) {
                    if (containsString(file, searchString)) {
                        System.out.println("File: " + file.getName() + " contains the string \"" + searchString + "\".");
                    }
                }
            }
        } else {
            System.out.println("The directory is empty or contains no files.");
        }

        scanner.close();
    }
}

