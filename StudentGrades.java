import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their grades
        HashMap<String, Integer> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Grades Menu ---");
            System.out.println("1. Add a new student");
            System.out.println("2. Update student grade");
            System.out.println("3. Print all student grades");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                // Add a new student
                System.out.print("Enter student name: ");
                String studentName = scanner.nextLine();
                System.out.print("Enter grade for " + studentName + ": ");
                int grade = scanner.nextInt();
                studentGrades.put(studentName, grade);
                System.out.println("Added " + studentName + " with grade " + grade);
            } else if (choice == 2) {
                // Update student grade
                System.out.print("Enter student name to update: ");
                String studentName = scanner.nextLine();
                if (studentGrades.containsKey(studentName)) {
                    System.out.print("Enter new grade for " + studentName + ": ");
                    int newGrade = scanner.nextInt();
                    studentGrades.put(studentName, newGrade);
                    System.out.println("Updated grade for " + studentName + " to " + newGrade);
                } else {
                    System.out.println("Student not found!");
                }
            } else if (choice == 3) {
                // Print all student grades
                if (studentGrades.isEmpty()) {
                    System.out.println("No student grades available.");
                } else {
                    System.out.println("Student Grades:");
                    for (String student : studentGrades.keySet()) {
                        System.out.println(student + " -> Grade: " + studentGrades.get(student));
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
