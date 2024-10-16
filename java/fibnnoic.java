public class fibnnoic {
    public static void main(String[] args) {
        int n=10;
        int num1=0,num2=1;
        System.out.print(num1+" "+num2);
        for(int i=2;i<n;i++){
            int nextNum=num1+num2;
            System.out.print(" "+nextNum);
            num1=num2;
            num2=nextNum;
        }
    }
}

