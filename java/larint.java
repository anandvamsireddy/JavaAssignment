import java.util.Scanner;
public class larint{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        largestValue();
    }
    public static void largestValue(){
        System.out.println("enter the no.of.numbers:");
        int UserCount=sc.nextInt();
        int[] array=new int[UserCount];
        int largest=1;
        for(int i=0;i<UserCount;i++){
            System.out.println("enter the "+(i+1)+" number");
            int num=sc.nextInt();
            if(num>largest){
                largest=num;
            }
        }
        System.out.println("the greatest number:"+largest);
    }
}