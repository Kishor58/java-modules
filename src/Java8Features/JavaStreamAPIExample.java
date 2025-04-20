package Java8Features;
import java.util.*;
import java.util.stream.*;

public class JavaStreamAPIExample {

        public static void main(String[] args) {
            // List of integers
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Example 1: Filtering and collecting even numbers
            List<Integer> evenNumbers = numbers.stream()
                    .filter(n -> n % 2 == 0)    // Intermediate operation
                    .collect(Collectors.toList()); // Terminal operation

            System.out.println("Even numbers: " + evenNumbers);

            // Example 2: Squaring each number and collecting results
            List<Integer> squaredNumbers = numbers.stream()
                    .map(n -> n * n)            // Intermediate operation
                    .collect(Collectors.toList()); // Terminal operation

            System.out.println("Squared numbers: " + squaredNumbers);

            // Example 3: Summing numbers using reduce
            int sum = numbers.stream()
                    .reduce(0, (a, b) -> a + b); // Terminal operation

            System.out.println("Sum of numbers: " + sum);

            // Example 4: Using parallel stream
            List<Integer> parallelEvenNumbers = numbers.parallelStream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());

            System.out.println("Parallel even numbers: " + parallelEvenNumbers);
        }


}
