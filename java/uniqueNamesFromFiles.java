import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class uniqueNamesFromFiles {
    public static void main(String[] args) {
        String file1 = "names1.txt";  
        String file2 = "names2.txt"; 

        Set<String> uniqueNames = new LinkedHashSet<>();

        try {
            List<String> names1 = Files.readAllLines(Paths.get(file1));
            uniqueNames.addAll(names1);

            List<String> names2 = Files.readAllLines(Paths.get(file2));
            uniqueNames.addAll(names2);
            System.out.println("Unique Names:");
            for (String name : uniqueNames) {
                System.out.println(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

