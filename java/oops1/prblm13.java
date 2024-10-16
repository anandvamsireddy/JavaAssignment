// Introduce multiple constructors in Product class.
package oops1;



public class prblm13 {
    public static void main(String[] args) {
        Product1 P=new Product1();
        Product1 Pp=new Product1("anand");
    }
}
    

class Product1{
    String name;
    int age;
    double price;
    Product1(){
       System.out.println();
    }
    Product1(String name){
        this.name=name;
        System.out.println(name);
    }

}
