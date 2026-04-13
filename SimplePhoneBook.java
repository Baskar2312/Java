import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class SimplePhoneBook {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {   
            System.out.println("\nPhone Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Remove Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) { // Add Contact
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Phone Number: ");
                String phoneNumber = scanner.nextLine();
                phoneBook.put(name, phoneNumber);
                System.out.println("Contact added!");

            } else if (choice == 2) { // Search Contact
                System.out.print("Enter Name to Search: ");
                String name = scanner.nextLine();
                if (phoneBook.containsKey(name)) {
                    System.out.println(name + "'s Phone Number: " + phoneBook.get(name));
                } else {
                    System.out.println("Contact not found.");
                }

            } else if (choice == 3) { // Remove Contact
                System.out.print("Enter Name to Remove: ");
                String name = scanner.nextLine();
                if (phoneBook.remove(name) != null) {
                    System.out.println("Contact removed.");
                } else {
                    System.out.println("Contact not found.");
                }

            } else if (choice == 4) { // Display All Contacts
                if (phoneBook.isEmpty()) {
                    System.out.println("Phone book is empty.");
                } else {
                    System.out.println("All Contacts:");
                    for (String name : phoneBook.keySet()) {
                        System.out.println("Name: " + name + ", Phone: " + phoneBook.get(name));
                    }
                }

            } else if (choice == 5) { // Exit
                System.out.println("Exiting. Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

