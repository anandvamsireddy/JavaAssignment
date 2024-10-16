//Design classes that need to sort a collection of Product objects either by product name or by price.
package oops1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class prblm28 {
    public static void main(String[] args) {
        prob p = new prob("Anand", 450);
        prob p1=new prob("Sai", 500);
        List<prob> ac = new ArrayList<>();
        ac.add(p1);
        ac.add(p);
        Collections.sort(ac,new SortbyName());
        System.out.println(ac);
        Collections.sort(ac,new SortbyInt());
        System.out.println(ac);

        
    }
    
}
class prob{
    String name;
    int price;
    public prob(String name,int price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    } 
    public String toString(){
        return "prob["+ name +price+"]";

    }
}
     class SortbyName implements Comparator< prob> {

        @Override
        public int compare(prob p1, prob p2) {
            return p1.getName().compareTo(p2.getName());
        }

     }
     class SortbyInt implements Comparator<prob>{

        @Override
        public int compare(prob arg0, prob arg1) {
            return Integer.compare(arg0.getPrice(), arg1.getPrice());
        }

     }