@FunctionalInterface
interface MathOperation {
    double operate(double a, double b);
}

public class Lamex2 {
    public static void main(String[] args) {
        // Implementing the multiplication operation using a lambda expression
        MathOperation multiplication = (a, b) -> a * b;

        // Testing the multiplication operation
        double result = multiplication.operate(5.5, 4.2);
        System.out.println("Result of multiplication: " + result);
    }
}