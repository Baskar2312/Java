import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecopy {
    public static void main(String[] args) {
        // Specify the source and destination file paths
        String sourceFile = "path/to/sourcefile.txt";   // Change this to the source file path
        String destinationFile = "path/to/destinationfile.txt";  // Change this to the destination file path

        // Use try-with-resources to automatically close the streams
        try {
            FileInputStream inputStream = new FileInputStream(sourceFile);
            FileOutputStream outputStream = new FileOutputStream(destinationFile); 

            int byteData;
            
            // Read the file byte by byte and write to the destination file
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            // Handle any I/O exceptions that occur during the file copy process
            System.out.println("An error occurred during file copy: " + e.getMessage());
        }
    }
}
