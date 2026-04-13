public class Exceptionhandling {
    public static void main(String[] args) {
        String[] numbers = {"42", "abc", "100"};
        
        for (String number : numbers) {
            try {
                // Attempt to parse each string as an integer
                int parsedNumber = Integer.parseInt(number);
                System.out.println("Parsed number: " + parsedNumber);
            } catch (NumberFormatException e) {
                // Catch and handle NumberFormatException if parsing fails
                System.out.println("Error: '" + number + "' is not a valid number.");
            } finally {
                // This block executes regardless of whether an exception was thrown or not
                System.out.println("Attempted to parse '" + number + "'");
            }
        }
    }
}