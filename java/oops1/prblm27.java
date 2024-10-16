//Write a program to create an interface called account operation with methods deposit(), getBalance().Implement this interface in Account class.
    
package oops1;

/**
 * prblm27
 */
public class prblm27 {

    public static void main(String[] args) {
     account ac = new account();
     ac.deposit(5000);
     ac.getBalance();
            
        
        
    }
}
interface AccountOperation{
    void deposit(int num);
    void getBalance();
}
class account implements AccountOperation{
    int balance;
    public void deposit(int num){
         balance += num;
    }
    public void getBalance(){
         System.out.println(balance);
    }
}