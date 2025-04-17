package list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of cart items
        Vector<String> cart = new Vector<>();

        // Step 1: Add items to the cart
        cart.add("Laptop");
        cart.add("Headphones");
        cart.add("Mouse");
        cart.add("Keyboard");

        System.out.println("🛒 Items in your cart:");
        printCart(cart);

        // Step 2: Access item at index
        System.out.println("\n First item: " + cart.get(0));

        // Step 3: Remove an item
        cart.remove("Mouse");
        System.out.println(" Removed 'Mouse' from cart.");

        // Step 4: Display using for-each
        System.out.println("\n Updated Cart (for-each loop):");
        for (String item : cart) {
            System.out.println("- " + item);
        }

        // SUsing Iterator
        System.out.println("\n Cart items (Iterator):");
        Iterator<String> iterator = cart.iterator();
        while (iterator.hasNext()) {
            System.out.println("> " + iterator.next());
        }

        // Using ListIterator (forward and backward)
        System.out.println("\n➡ Cart (forward with ListIterator):");
        ListIterator<String> listIterator = cart.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\n⬅ Cart (backward with ListIterator):");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Check size and clear
        System.out.println("\n Total items: " + cart.size());
        cart.clear();
        System.out.println(" Cart cleared. Is empty? " + cart.isEmpty());
    }

    // Helper method
    public static void printCart(Vector<String> cart) {
        for (String item : cart) {
            System.out.println("• " + item);
        }
    }
}
