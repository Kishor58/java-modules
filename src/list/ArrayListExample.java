package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

    public static void main(String[] args) {
        // Step 1: Create ArrayList
        ArrayList<Task> tasks = new ArrayList<>();

        // Step 2: Add tasks
        tasks.add(new Task("Write report"));
        tasks.add(new Task("Check emails"));
        tasks.add(new Task("Attend meeting"));
        tasks.add(new Task("Go for walk"));

        // Step 3: Display all tasks using for-each loop
        System.out.println("All Tasks (for-each):");
        for (Task task : tasks) {
            System.out.println(task);
        }

        // Step 4: Mark a task as completed
        tasks.get(0).markCompleted(); // Marking "Write report" as done

        // Step 5: Remove a task
        tasks.removeIf(task -> task.getName().equals("Go for walk"));

        // Step 6: Display using index-based for loop
        System.out.println("\nTasks (index-based for loop):");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        // Step 7: Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task t = iterator.next();
            System.out.println(t);
        }

        // Step 8: Using ListIterator (both directions)
        System.out.println("\nUsing ListIterator (forward):");
        ListIterator<Task> listIterator = tasks.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nUsing ListIterator (backward):");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Step 9: Check methods
        System.out.println("\nIs task list empty? " + tasks.isEmpty());
        System.out.println("Total tasks: " + tasks.size());

        // Step 10: Clear all tasks
        tasks.clear();
        System.out.println("Cleared all tasks. Size: " + tasks.size());
    }
}

class Task {
    private String name;
    private boolean completed;

    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return name + (completed ? " [Done]" : " [Pending]");
    }
}

