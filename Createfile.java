import java.io.File;
import java.io.IOException;

public class Createfile {
    public static void main(String[] args) {
        try {
            // Specify the file name and path
            File file = new File("example1.txt");
            
            // Create the file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}