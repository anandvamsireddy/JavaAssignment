import java.util.Scanner;
public class avg {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Double sum=(double) 0;
        for(int i=1;i<=5;i++){
            System.out.print("the number"+i+":");
            double num=scanner.nextDouble();
            sum=sum+num;

        }
        double avg=sum/5;
        System.out.println(avg);
    }

    }
    

