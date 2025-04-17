package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store unique student names
        HashSet<String> attendance = new HashSet<>();

        // Students enter the class
        attendance.add("Alice");
        attendance.add("Bob");
        attendance.add("Charlie");
        attendance.add("Diana");

        // Duplicate entry (should not be added)
        attendance.add("Alice"); // Already added
        attendance.add("Bob");   // Already added

        //Display all attendees (unordered)
        System.out.println("Students who attended:");
        for (String student : attendance) {
            System.out.println("- " + student);
        }

        //Check if a specific student attended
        String checkStudent = "Charlie";
        if (attendance.contains(checkStudent)) {
            System.out.println("\n " + checkStudent + " was present.");
        } else {
            System.out.println("\n " + checkStudent + " was absent.");
        }

        //Remove a student (left early)
        attendance.remove("Diana");
        System.out.println("\n Diana left early. Updated attendance:");
        attendance.forEach(System.out::println);

        //Iterator usage
        System.out.println("\n Using Iterator to print:");
        Iterator<String> iterator = attendance.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Clear all records at end of class
        attendance.clear();
        System.out.println("\n Attendance cleared: " + attendance.isEmpty());
    }
}
