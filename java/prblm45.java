import java.io.*;
public class prblm45 {
    public static void main(String[] args) {
        // String s = "karthik Naidu";
        // System.out.println(s.replaceAll("\\s+", " "));
        StringBuilder sb = new StringBuilder("");
        String filename = "Problem45.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line.replaceAll("\\s+", " ")).append(System.lineSeparator());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (FileWriter file = new FileWriter("Problem45.txt", false)) {
            file.write(sb.toString());
            file.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
