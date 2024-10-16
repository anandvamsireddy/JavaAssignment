//  Create a class called Counter that stores a number and provides methods to increment, decrement and return the count. Provide the constructor without parameters that sets the values to zero and another constructor with parameters takes the values and starts from there.
package oops1;

public class prblm14 {
    public static void main(String[] args) {
        Counter c1= new Counter();
        Counter c2= new Counter(10);
        c1.increment();
        c2.increment();
        
    }
}
class Counter{
    int num;
    public Counter(int num){
        this.num=num;
    }
    public void increment(){
         num++;
         System.out.println(num);

    }
    public Counter() {
    }
    public void decrement(){
        num--;
        System.out.println(num);
    }
    
    
}

