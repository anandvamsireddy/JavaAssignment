import java.util.*;
import java.io.*;
public class SortedOrder {
    public static void main(String[] args) {
        Set<String> names=new TreeSet<>();
        try{
            FileReader fr1= new FileReader("names.txt");
            BufferedReader br1=new BufferedReader(fr1);
            FileReader fr2= new FileReader("names1.txt");
            BufferedReader br2=new BufferedReader(fr2);

            String name;
             while((name=br1.readLine())!= null){
                names.add(name.trim());
             }
             String name1;
             while((name1=br2.readLine())!= null){
                names.add(name1.trim());
             }

              names.forEach(System.out::println);
            
            }
            catch(IOException e){
                e.printStackTrace();
            }
        
    }
    
}
