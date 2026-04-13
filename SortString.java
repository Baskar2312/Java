import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortString {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> fruits = new ArrayList<>();
        
        // Add some elements to the list
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Pineapple");

        // Print the original list
        System.out.println("Original List: " + fruits);

        // Sort the list in alphabetical order
        Collections.sort(fruits);

        // Print the sorted list
        System.out.println("Sorted List: " + fruits);

        Collections.sort(fruits,Collections.reverseOrder());
        System.out.println(fruits);
    }
}
