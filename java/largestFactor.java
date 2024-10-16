import java.util.Scanner;

public class largestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number=scanner.nextInt();
        int factorial=1;
        for (int i=number/2;i>=1;i--){
            if(number%i==0){
                factorial=i;
                break;
            }
            
        }
        System.out.println("the factorial "+number+" is the largest number of number:"+factorial);
     
    }
}
