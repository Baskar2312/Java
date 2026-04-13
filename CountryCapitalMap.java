import java.util.HashMap;
import java.util.Scanner;

public class CountryCapitalMap {
    public static void main(String[] args) {
        // Create a HashMap to store country-capital pairs
        HashMap<String, String> countryCapitalMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Country-Capital Menu ---");
            System.out.println("1. Add a new country and capital");
            System.out.println("2. Get capital of a country");
            System.out.println("3. Display all countries and capitals");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                // Add a new country-capital pair
                System.out.print("Enter country name: ");
                String country = scanner.nextLine();
                System.out.print("Enter capital name: ");
                String capital = scanner.nextLine();
                countryCapitalMap.put(country, capital);
                System.out.println("Added: " + country + " -> " + capital);
            } else if (choice == 2) {
                // Retrieve the capital by country
                System.out.print("Enter country name: ");
                String country = scanner.nextLine();
                String capital = countryCapitalMap.get(country);
                if (capital != null) {
                    System.out.println("The capital of " + country + " is " + capital);
                } else {
                    System.out.println("Country not found!");
                }
            } else if (choice == 3) {
                // Display all countries and capitals
                if (countryCapitalMap.isEmpty()) {
                    System.out.println("No countries in the list.");
                } else {
                    System.out.println("Country -> Capital:");
                    for (String country : countryCapitalMap.keySet()) {
                        System.out.println(country + " -> " + countryCapitalMap.get(country));
                    }
                }
            } else if (choice == 4) {
                // Exit the program
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
