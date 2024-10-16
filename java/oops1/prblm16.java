// Create classes to store details for two different types of Products,
//    a) ImportedProducts which have import duty.
//    b) DiscountedProducts which have a discount rate.
// All products have name and base_price.Create required Constructors and following methods: print(), getNetPrice(), setPrice(), setImportDuty(), setDiscountRate() also experiment with upcasting and downcasting.
package oops1;

public class prblm16 {
    public static void main(String[] args) {
        
        
    }
    
}
class Products{
    int name;
    double base_price;

    public Products(int name,double base_price){
        this.name=name;
        this.base_price=base_price;
        
    }
    public double getNetPrice(){
        return base_price;
    }
    public double getPrice(){
        return base_price;
    }
    public void setPrice(double base_price){
         this.base_price=base_price;

    }
    
}
 class ImportDuty extends Products{
    double Importuty;
    
    public ImportDuty(int name, double base_price,double Importuty) {
        super(name, base_price);
        this.Importuty=Importuty;
    }

    public void setImportuty(double importuty) {
        Importuty = importuty;
    }

    public double getImportuty() {
        return Importuty;
    }
    public double getNetPrice(){
        return base_price+=base_price*Importuty;   

}
 }
 class DiscountedProducts extends Products{
    double dp;
    
    public DiscountedProducts(int name, double base_price,double dp) {
        super(name, base_price);
        this.dp=dp;
    }

    public void setdp(double dp) {
        this.dp = dp;
    }

    public double getdp() {
        return dp;
    }
    public double getNetPrice(){
        return base_price+=base_price*dp;   

}
 }

