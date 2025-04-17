package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap: Product -> Price
        Map<String, Double> productPrices = new HashMap<>();

        // Add products with prices
        productPrices.put("Laptop", 75000.00);
        productPrices.put("Smartphone", 35000.00);
        productPrices.put("Headphones", 1500.00);
        productPrices.put("Smartwatch", 5000.00);

        // Display all product prices
        System.out.println("Product Prices:");
        productPrices.forEach((product, price) ->
                System.out.println(product + " = ₹" + price));

        // Get the price of a specific product
        String searchProduct = "Smartphone";
        System.out.println("\nPrice of " + searchProduct + ": ₹" + productPrices.get(searchProduct));

        // Update the price of a product
        productPrices.put("Smartwatch", 4500.00);
        System.out.println("Updated price of Smartwatch: ₹" + productPrices.get("Smartwatch"));

        // Check if a product exists
        if (productPrices.containsKey("Tablet")) {
            System.out.println("Tablet price: ₹" + productPrices.get("Tablet"));
        } else {
            System.out.println("Tablet is not available.");
        }

        // Remove a discontinued product
        productPrices.remove("Headphones");
        System.out.println("\nAfter removing Headphones:");
        productPrices.forEach((product, price) ->
                System.out.println(product + " = ₹" + price));
    }
}
