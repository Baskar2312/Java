import java.io.File;
import java.util.Scanner;

public class FileOrDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking the file or directory pathname as input
        System.out.print("Enter the file or directory path: ");
        String path = scanner.nextLine();
        
        // Creating a File object
        File file = new File(path);
        
        // Checking if the file or directory exists
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The path exists and it is a file.");
            } else if (file.isDirectory()) {
                System.out.println("The path exists and it is a directory.");
            }
        } else {
            System.out.println("The specified path does not exist.");
        }
        
        scanner.close();
    }
}
