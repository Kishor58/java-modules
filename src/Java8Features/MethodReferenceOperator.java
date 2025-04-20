package Java8Features;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceOperator {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Instance method
    public void printMessageWithNonStatic(String message) {
        System.out.println(message);
    }


    public static void main(String[] args) {
        List<String> messages = Arrays.asList("Hello", "Java", "8");

        // Using method reference to refer to the static method
        messages.forEach(MethodReferenceOperator::printMessage);
    }
}
