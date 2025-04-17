package Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethodExample {
    public static void main(String[] args) {
        // Create a Map
        Map<String, Integer> map = new HashMap<>();

        // put() - Add entries
        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Orange", 8);
        System.out.println("After put(): " + map);

        // putIfAbsent() - Only put if key doesn't exist
        map.putIfAbsent("Apple", 20);  // Won't change "Apple" because it exists
        map.putIfAbsent("Mango", 12);  // Adds "Mango"
        System.out.println("After putIfAbsent(): " + map);

        // get() - Get value by key
        System.out.println("Get Banana: " + map.get("Banana"));

        // getOrDefault() - Get value or default if key is missing
        System.out.println("Get Papaya or default: " + map.getOrDefault("Papaya", 0));

        // containsKey() - Check if key exists
        System.out.println("Contains 'Orange'? " + map.containsKey("Orange"));

        // containsValue() - Check if value exists
        System.out.println("Contains value 5? " + map.containsValue(5));

        // remove(key) - Remove by key
        map.remove("Banana");
        System.out.println("After remove(): " + map);

        // remove(key, value) - Remove only if key and value match
        map.remove("Apple", 10);  // Will remove
        map.remove("Mango", 10);  // Won’t remove
        System.out.println("After remove(key, value): " + map);

        // replace(key, newValue) - Replace if key exists
        map.replace("Orange", 15);
        System.out.println("After replace(key, value): " + map);

        // replace(key, oldValue, newValue) - Replace only if current value matches
        map.replace("Mango", 12, 20);
        map.replace("Mango", 5, 30);  // Won’t replace
        System.out.println("After replace with condition: " + map);

        // compute() - Compute new value based on existing
        map.compute("Orange", (k, v) -> v + 5); // Orange = 20
        map.compute("Pineapple", (k, v) -> 7); // Adds Pineapple = 7
        System.out.println("After compute(): " + map);

        // computeIfAbsent() - Compute value only if key is missing
        map.computeIfAbsent("Grapes", k -> 9);
        map.computeIfAbsent("Orange", k -> 100);  // Won’t change Orange
        System.out.println("After computeIfAbsent(): " + map);

        // computeIfPresent() - Compute value only if key is present
        map.computeIfPresent("Grapes", (k, v) -> v + 1);
        map.computeIfPresent("Kiwi", (k, v) -> v + 1);  // Won’t do anything
        System.out.println("After computeIfPresent(): " + map);

        // merge() - Merge values
        map.merge("Orange", 5, (oldVal, newVal) -> oldVal + newVal);  // Orange = 25
        map.merge("Kiwi", 4, (oldVal, newVal) -> oldVal + newVal);  // Adds Kiwi = 4
        System.out.println("After merge(): " + map);

        // keySet() - Get all keys
        System.out.println("Keys: " + map.keySet());

        // values() - Get all values
        System.out.println("Values: " + map.values());

        // entrySet() - Get all entries
        System.out.println("Entries: " + map.entrySet());

        // size() - Number of entries
        System.out.println("Map size: " + map.size());

        // isEmpty() - Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());

        // forEach() - Loop through map
        System.out.println("Using forEach:");
        map.forEach((key, value) -> System.out.println(key + " = " + value));

        // clear() - Remove everything
        map.clear();
        System.out.println("After clear(): " + map);
        System.out.println("Is map empty now? " + map.isEmpty());
    }

}
