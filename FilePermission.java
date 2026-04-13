import java.io.File;
import java.util.Scanner;

public class FilePermissions{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the file or directory pathname as input
        System.out.print("Enter the file or directory path: ");
        String path = scanner.nextLine();

        // Creating a File object
        File file = new File(path);

        // Checking if the file or directory exists
        if (file.exists()) {
            // Checking read permission
            if (file.canRead()) {
                System.out.println("The path has read permission.");
            } else {
                System.out.println("The path does NOT have read permission.");
            }

            // Checking write permission
            if (file.canWrite()) {
                System.out.println("The path has write permission.");
            } else {
                System.out.println("The path does NOT have write permission.");
            }
        } else {
            System.out.println("The specified path does not exist.");
        }

        scanner.close();
    }
}
