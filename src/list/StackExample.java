package list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack for actions
        Stack<String> undoStack = new Stack<>();

        //Perform actions (push to stack)
        undoStack.push("Typed 'Hello'");
        undoStack.push("Bolded 'Hello'");
        undoStack.push("Typed 'World'");
        undoStack.push("Italicized 'World'");

        System.out.println("✍ Actions performed:");
        printStack(undoStack);

        // Peek at the last action
        System.out.println("\n Last action (peek): " + undoStack.peek());

        // Undo last action (pop)
        String undone = undoStack.pop();
        System.out.println("↩ Undoing: " + undone);

        // Display stack after undo
        System.out.println("\n Current undo stack:");
        printStack(undoStack);

        // Check if empty
        System.out.println("\n Is undo stack empty? " + undoStack.isEmpty());

        //  Clear all actions
        undoStack.clear();
        System.out.println(" Cleared all actions. Stack empty? " + undoStack.isEmpty());
    }

    // Helper method to print stack (top to bottom)
    public static void printStack(Stack<String> stack) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println("• " + stack.get(i));
        }
    }
}
