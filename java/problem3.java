public class problem3 {
    public static void main(String[] args) {
        Method("5");
    }
    public static void method()
        try {
            
            n=Integer.parseInt(args[0]);
        if(99%n==0){
            System.out.printf("%d is a factor of 99",n);
        }
            
        } catch (NumberFormatException e) {
            System.out.println("INVALID NUMBER");
        
        } finally {
            System.out.println("parameters are not found");
        }
        System.out.println("Method Complete");

    }

