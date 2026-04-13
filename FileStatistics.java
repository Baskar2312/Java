import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStatistics {
    public static void main(String[] args) {
        // Specify the path to the file
        String filePath = "path/to/your/textfile.txt";  // Change this to your file path

        // Variables to hold counts
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        // Try-with-resources to ensure the file is closed after reading
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                lineCount++;  // Increment line count
                charCount += line.length();  // Add the number of characters in this line

                // Split the line into words using whitespace as the delimiter
                String[] words = line.split("\\s+");
                wordCount += words.length;  // Add the number of words in this line
            }

            // Print the results
            System.out.println("Number of Lines: " + lineCount);
            System.out.println("Number of Words: " + wordCount);
            System.out.println("Number of Characters: " + charCount);

        } catch (IOException e) {
            // Handle any I/O exceptions
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
