import java.util.Scanner;
public class exaswitch{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Consider the days as 1-Monday,2-Tuesday up to sunday:");
        int noDays=scanner.nextInt();
        System.out.println("No of hours worked:");
        int hoursWorked=scanner.nextInt();
        int wagePerHour = switch(noDays) {
                    case 1,2,3 ->200;
                    case 4-> 400;
                    case 5-> 600;
                    case 6,7 -> 800;
                    default -> 0;
        };
        int totalWageWorked=wagePerHour*hoursWorked;
        if(totalWageWorked>2000){
            totalWageWorked=(int) (totalWageWorked+totalWageWorked*0.10);
        }
        System.out.println(totalWageWorked);


        
    }
}

