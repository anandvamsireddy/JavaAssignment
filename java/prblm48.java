import java.io.*;
import java.util.*;

public class prblm48 {
    static class Customer implements Comparable<Customer> {
        String name;
        String mobile;
         public Customer(String name, String mobile) {
            this.name = name;
            this.mobile = mobile;
        }
        @Override
        public String toString() {
            return "Name: " + name + ", Mobile: " + mobile;
        }
        @Override
        public int compareTo(Customer other) {
            return this.name.compareTo(other.name);
        }
    }
     public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        String fileName = "customers.txt";  

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");  // Split by comma
                if (parts.length == 2) {  
                    String name = parts[0].trim();
                    String mobile = parts[1].trim();
                    customers.add(new Customer(name, mobile));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        Collections.sort(customers);
        System.out.println("Customers sorted by name:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}

