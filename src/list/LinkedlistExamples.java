package list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistExamples {
    public static void main(String[] args) {
        // Create LinkedList for browser history
        LinkedList<String> history = new LinkedList<>();

        // Visit websites (add to history)
        history.add("google.com");
        history.add("wikipedia.org");
        history.add("stackoverflow.com");
        history.add("github.com");

        System.out.println("🌐 Visited websites:");
        printHistory(history);

        //  Use ListIterator to simulate going back & forward
        ListIterator<String> iterator = history.listIterator();

        System.out.println("\nGoing Backward:");
        while (iterator.hasNext()) {
            iterator.next(); // Move to the end
        }
        while (iterator.hasPrevious()) {
            System.out.println("← " + iterator.previous());
        }

        System.out.println("\n Going Forward:");
        while (iterator.hasNext()) {
            System.out.println("→ " + iterator.next());
        }

        // Add a new site (like a fresh visit after going back)
        history.add("chat.openai.com");
        System.out.println("\n New visit after back navigation:");
        printHistory(history);

        // Step 4: Remove a specific site
        history.remove("stackoverflow.com");
        System.out.println("\n Removed 'stackoverflow.com':");
        printHistory(history);

        // Step 5: Clear history
        history.clear();
        System.out.println("\n History cleared: " + history.isEmpty());
    }

    public static void printHistory(LinkedList<String> history) {
        for (String site : history) {
            System.out.println("• " + site);
        }
    }
}
