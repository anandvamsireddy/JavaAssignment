import java.util.Scanner;
public class prame {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=s.nextInt();
        if(isPrime(num)){
            System.out.println(num+" is the prime Number");
        }else{
            System.out.println(num+" Not a prime number");
        }

        s.close();
    }
    public static boolean isPrime(int num) {
        if (num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){
                return false;
            }

        }
        return true;

    }
    
}
