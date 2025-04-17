package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet to store student names
        LinkedHashSet<String> attendanceList = new LinkedHashSet<>();

        // Students arriving
        attendanceList.add("Ayesha");
        attendanceList.add("Rahul");
        attendanceList.add("Imran");
        attendanceList.add("Zara");
        attendanceList.add("Rahul"); // Duplicate, will be ignored

        // Print the attendance list (in order of arrival)
        System.out.println("Attendance List: " + attendanceList);
    }
}
