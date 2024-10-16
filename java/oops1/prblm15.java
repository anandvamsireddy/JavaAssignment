// Create a class Student that stores the details like admin_no, stu_name, course_joined and fees_paid.
// —> Courses are: JAVA, PYTHON.
// —> The total fees for java is 10k and for python is 7.5k.
// —> Provide a constructor to take required details.The default course is JAVA.
// —> Provide the following methods: getTotalFee(), getDue(), getFeePaid(), payment(amount).
package oops1;

public class prblm15 {
    public static void main(String[] args) {
        
    
    Student s1=new Student(1, "Anand", "JAVA", 8000);

    System.out.println(s1.getTotalFee());
    System.out.println(s1.getFeePaid());
    System.out.println(s1.getDue());
    s1.payment(2000);
    System.out.println(s1.getDue());
    

    } 
    
}
class Student{
    int admin_no;
    String stu_name;
    String course_joined;
    double fees_paid;
    double total_fee;
    int amount;
    

    public Student(int admin_no,String stu_name,String course_joined,double fees_paid ){
        this.admin_no=admin_no;
        this.stu_name=stu_name;
        this.course_joined=course_joined;
        if(course_joined.equalsIgnoreCase("java")){
            this.total_fee=10000;
        }
        else if(course_joined.equalsIgnoreCase("python")){
            this.total_fee=7500;
        }
        this.fees_paid=fees_paid;
        

    }
    public double getTotalFee(){
        return total_fee;
        

    }
    public double getFeePaid(){
        return fees_paid;
    }
    public double getDue(){
        return getTotalFee()-fees_paid;
    }
    public void payment(int amount){
        if(total_fee>=amount+fees_paid){
            fees_paid+=amount;
        }
        else{
            System.out.println("not able to proceed payment");
        }
    }
}
