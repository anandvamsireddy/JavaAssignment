

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriteNamesToFile {
    public static void main(String[] args)  {
      Scanner scanner=new Scanner(System.in);
      try(FileWriter writer= new FileWriter("names.txt")){
        String name;
        System.out.println("Enter the name");
        while(true){
            name=scanner.nextLine();
            if(name.equalsIgnoreCase("END")){
                break;

            }
            writer.write(name + System.lineSeparator());
        }
    }
        catch(IOException e){
            e.printStackTrace();
        }

    
    }
    
}
