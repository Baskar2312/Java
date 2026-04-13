import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        // Create a Set of integers
        Set<Integer> numbers = new HashSet<>();
        
        // Add some elements to the set
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);

        // Print the original set
        System.out.println("Original Set: " + numbers);

        // Remove even numbers using an iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }

        // Print the set after removing even numbers
        System.out.println("Set after removing even numbers: " + numbers);
    }
}
