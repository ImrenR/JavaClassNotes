package j102_OCA.Q152;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();

        // Add only unique numbers
        // Remove duplicates
        numbers.removeIf(number -> !uniqueNumbers.add(number));

        System.out.println(numbers);  // Output: [1, 2, 3, 4, 5]
    }
}
