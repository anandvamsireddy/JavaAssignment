public class Count {
    private int number;

    // Default constructor (initializes number to 0)
    public Count() {
        this.number = 0;
    }

    // Parameterized constructor (initializes number with the given value)
    public Count(int number) {
        this.number = number;
    }

    // Method to increment the count
    public void increment() {
        this.number++;
    }

    // Method to decrement the count
    public void decrement() {
        this.number--;
    }

    // Method to get the current count value
    public int getCount() {
        return this.number;
    }

    // Main method to test the class functionality
    public static void main(String[] args) {
        // Using default constructor
        Count count1 = new Count();
        System.out.println("Initial count (default): " + count1.getCount()); // Should be 0
        count1.increment();
        System.out.println("After increment: " + count1.getCount()); // Should be 1
        count1.decrement();
        System.out.println("After decrement: " + count1.getCount()); // Should be 0

        // Using parameterized constructor
        Count count2 = new Count(10);
        System.out.println("Initial count (parameterized): " + count2.getCount()); // Should be 10
        count2.increment();
        System.out.println("After increment: " + count2.getCount()); // Should be 11
        count2.decrement();
        count2.decrement();
        System.out.println("After two decrements: " + count2.getCount()); // Should be 9
    }
}


// public class Count {
//     private int number;
//     public Count(){
//         this.number=0;
//     }
//     public Count(int number){
//         this.number=number;

//     }
//     public void increament(){
//         this.number++;
//     }
//     public void decrement(){
//         this.number--;
//     }
//     public int getCount(){
//         return this.number;
//     }
//     public static void main(String[] args) {
        
//     }
// }
