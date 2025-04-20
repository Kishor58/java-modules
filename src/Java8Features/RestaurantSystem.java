package Java8Features;

import java.util.*;
import java.util.stream.*;

enum Category {
    STARTER, MAIN_COURSE, DESSERT, DRINK
}

class MenuItem {
    private String name;
    private double price;
    private Category category;

    public MenuItem(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public Category getCategory() { return category; }

    public String toString() {
        return name + " - " + category + " - ₹" + price;
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        List<MenuItem> menu = Arrays.asList(
                new MenuItem("Burger", 150, Category.MAIN_COURSE),
                new MenuItem("Pizza", 250, Category.MAIN_COURSE),
                new MenuItem("Fries", 100, Category.STARTER),
                new MenuItem("Ice Cream", 90, Category.DESSERT),
                new MenuItem("Cola", 60, Category.DRINK)
        );

        List<String> customerOrder = Arrays.asList("Pizza", "Fries", "Cola", "Fries", "Pasta");

        Map<String, MenuItem> menuMap = menu.stream()
                .collect(Collectors.toMap(MenuItem::getName, item -> item));

        Set<String> validItems = customerOrder.stream()
                .filter(menuMap::containsKey)
                .collect(Collectors.toSet());

        System.out.println("✔ Valid & Unique Items: " + validItems);

        List<MenuItem> orderedItems = validItems.stream()
                .map(menuMap::get)
                .sorted(Comparator.comparingDouble(MenuItem::getPrice).reversed()) // Highest price first
                .collect(Collectors.toList());

        System.out.println("\n📋 Sorted Ordered Items:");
        orderedItems.forEach(System.out::println);

        // 6. Calculate total bill
        double totalBill = orderedItems.stream()
                .mapToDouble(MenuItem::getPrice)
                .sum();

        System.out.println("\nTotal Bill: ₹" + totalBill);

        // 7. Group items by Category
        Map<Category, List<MenuItem>> groupedByCategory = orderedItems.stream()
                .collect(Collectors.groupingBy(MenuItem::getCategory));

        System.out.println("\n Items Grouped by Category:");
        groupedByCategory.forEach((category, items) -> {
            System.out.println(category + ": " + items);
        });

        // 8. Build Map of item name → price
        Map<String, Double> itemPriceMap = orderedItems.stream()
                .collect(Collectors.toMap(MenuItem::getName, MenuItem::getPrice));

        System.out.println("\n Item → Price Map:");
        itemPriceMap.forEach((name, price) ->
                System.out.println(name + " = ₹" + price)
        );
    }
}
