import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Setduplicate {
    public static void main(String[] args) {
        // Create a List of integers with duplicate elements
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        // Remove duplicates using a Set
        TreeSet<Integer> uniqueNumbers = new TreeSet<>(numbers);
        
        // Convert back to a List (if needed)
        List<Integer> resultList = new ArrayList<>(uniqueNumbers);

        // Print the List after removing duplicates
        System.out.println("List after removing duplicates: " + resultList);
    }
}
