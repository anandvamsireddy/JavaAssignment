public class product{
    private int prod_id;
    private String prod_name;
    private double price;
    private int quantity_on_hand;
    
    public product(int prod_id, String prod_name, double price) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
        this.quantity_on_hand = 0;
    }
    public double getNetPrice() {
        return price + (price * 0.12); 
    }
    public void purchase(int quantity) {
        if (quantity > 0) {
            this.quantity_on_hand += quantity;
            System.out.println(quantity + " units purchased. Total stock: " + quantity_on_hand);
        } else {
            System.out.println("Invalid purchase quantity");
        }
    }
    public void sell(int quantity) {
        if (quantity > 0 && quantity <= quantity_on_hand) {
            this.quantity_on_hand -= quantity;
            System.out.println(quantity + " units sold. Remaining stock: " + quantity_on_hand);
        } else {
            System.out.println("Invalid sale quantity or insufficient stock");
        }
    }
    public void displayProductDetails() {
        System.out.println("Product ID: " + prod_id);
        System.out.println("Product Name: " + prod_name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity on Hand: " + quantity_on_hand);
    }


    public static void main(String[] args) {
        product prod1 = new product(101, "Laptop", 850.00);
        
        prod1.displayProductDetails();
        
        prod1.purchase(50);
    
        prod1.sell(10);
        double netPrice = prod1.getNetPrice();
        System.out.println("Net Price after 12% tax: $" + netPrice);
        prod1.displayProductDetails();
    }
}
