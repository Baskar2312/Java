import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        // Create a List of integers
        List<Integer> numbers = new ArrayList<>();
        
        // Add some elements to the list
        numbers.add(10);
        numbers.add(25);
        numbers.add(3);
        numbers.add(56);
        numbers.add(12);
        numbers.add(8);
        
        // Initialize variables to store the largest and smallest elements
        int largest = numbers.get(0);
        int smallest = numbers.get(0);
        int sum = 0;

        // Iterate through the list to find the largest, smallest, and sum
        for (int num : numbers) {
            // Find the largest number
            if (num > largest) {
                largest = num;
            }
            // Find the smallest number
            if (num < smallest) {
                smallest = num;
            }
            // Calculate the sum of the elements
            sum += num;
        }

        // Print the results
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Sum of elements: " + sum);
    }
}
