import java.util.*;
import java.io.*;

public class problem {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
    try(BufferedReader reader= new BufferedReader(new FileReader("disply.txt"))){
        String name;
        int total=0;
        
        while((name=reader.readLine())!=null){
        String[] namex=name.split(",");
        for(String num:namex){
            total +=Integer.parseInt(num);

        }
       

        }
        names.forEach(System.out::println);
    
    }
    catch(IOException e){
        System.out.println(e.getLocalizedMessage());

    }
        
    }
    
    
}    


