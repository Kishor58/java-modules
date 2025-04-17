package Set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet to store student names
        TreeSet<String> studentNames = new TreeSet<>();

        // Adding student names
        studentNames.add("Rahul");
        studentNames.add("Ayesha");
        studentNames.add("Zara");
        studentNames.add("Imran");
        studentNames.add("Ayesha"); // Duplicate, will be ignored

        // Display student names (will be sorted automatically)
        System.out.println("Student List (sorted): " + studentNames);

        // First and last student in alphabetical order
        System.out.println("First student (alphabetically): " + studentNames.first());
        System.out.println("Last student (alphabetically): " + studentNames.last());

        // Check if a particular student is enrolled
        if (studentNames.contains("Zara")) {
            System.out.println("Zara is enrolled.");
        }
    }
}
