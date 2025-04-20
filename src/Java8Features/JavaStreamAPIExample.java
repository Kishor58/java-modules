package Java8Features;
import java.util.*;
import java.util.stream.*;

public class JavaStreamAPIExample {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            List<Integer> evenNumbers = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());

            System.out.println("Even numbers: " + evenNumbers);

            List<Integer> squaredNumbers = numbers.stream()
                    .map(n -> n * n)
                    .collect(Collectors.toList());

            System.out.println("Squared numbers: " + squaredNumbers);

            int sum = numbers.stream()
                    .reduce(0, (a, b) -> a + b);

            System.out.println("Sum of numbers: " + sum);

            List<Integer> parallelEvenNumbers = numbers.parallelStream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());

            System.out.println("Parallel even numbers: " + parallelEvenNumbers);
        }


}
