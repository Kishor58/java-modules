package Java8Features;

public class Functional_Interface_With_Static_Method {

    public static void main(String[] args) {
        Printer p = System.out::println;
        p.print("hello"); // hello
        p.printUpper("hello"); // HELLO
        Printer.welcome(); // Welcome to Functional Interfaces!
    }
}
@FunctionalInterface
interface Printer {
    void print(String message);

    default void printUpper(String message) {
        System.out.println(message.toUpperCase());
    }

    static void welcome() {
        System.out.println("Welcome to Functional Interfaces!");
    }
}
