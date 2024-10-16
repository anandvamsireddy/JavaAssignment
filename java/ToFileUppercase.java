import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class ToFileUppercase{
    public static void main(String[] args) {
        String filePath = "input.txt"; 
        String outputFilePath = "output.txt";  

        try {
            Files.write(Paths.get(outputFilePath), 
                        new String(Files.readAllBytes(Paths.get(filePath))).toUpperCase().getBytes());
            System.out.println("File converted to uppercase and written to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

