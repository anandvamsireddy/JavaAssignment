import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Array in reverse order:");
        for (int i=array.length-1;i>=0;i--) {
            System.out.print(array[i] + " ");
        }
    }
}
