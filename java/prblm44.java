
import java.util.Scanner;
public class prblm44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + System.lineSeparator());
        }
    }
}