// Create a class(Product) to store details of a product and provide required methods with the details prod_id, prod_name, price,quantity_on_hand
// Methods are:  init(prod_id,prod_name, price)
//                  getNetPrice() (returns the price after adding 12% tax)
//                  purchase()
//                 sell()

package oops1;

/**
 * prblm12
 */
public class prblm12 {

    public static void main(String[] args) {
       Product p = new Product();
       p.init(1,"cement",50.0);
       p.getNetPrice();
       p.purchase(67);
       p.sell(32);

    }
}
class Product{
    int prod_id;
    String name;
    double price;
    int quantity_on_hand=0;
    double tax=0.12;

    public void init(int prod_id,String name,double price) {
        this.prod_id=prod_id;
        this.name=name;
        this.price=price;


    }
    public double getNetPrice(){
        return price+=(price*tax);

    }
    public void purchase(int i){
        quantity_on_hand+=i;

    }
    public void sell(int v){
       if(quantity_on_hand>=v&&v>0){
        quantity_on_hand-=v;
        System.out.println(v+"no of products of sold");

       }else{
        System.out.println("Insufficient storage");
       }

    }
}