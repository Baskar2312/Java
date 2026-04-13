@FunctionalInterface
interface Operation {
    int operate(int a, int b);
}

public class Lamex {
    public static void main(String[] args) {
        // Implementing the addition operation using a lambda expression
        Operation addition = (a, b) -> a + b;

        // Testing the addition operation
        int result = addition.operate(5, 10);
        System.out.println("Result of addition: " + result);
    }
}
