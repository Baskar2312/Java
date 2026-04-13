import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");

        // Print the ArrayList
        System.out.println("ArrayList before removal: " + list);

        // Remove an element (e.g., "Banana")
        list.remove("Banana");

        // Print the ArrayList after removal
        System.out.println("ArrayList after removal: " + list);

        // Iterate through the list using a for-each loop
        System.out.println("Iterating through the list:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
