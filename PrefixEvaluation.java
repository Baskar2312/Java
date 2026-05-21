import java.util.Stack;

public class PrefixEvaluation {
    
    // Function to check if a character is an operator
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();

        // Iterate from right to left
        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);

            // Skip spaces if any
            if (c == ' ') continue;

            if (Character.isDigit(c)) {
                // If character is operand, push it to stack
                stack.push(c - '0'); // Convert char to int
            } else if (isOperator(c)) {
                // Pop two elements
                int o1 = stack.pop();
                int o2 = stack.pop();

                // Apply operator and push result back
                switch (c) {
                    case '+': stack.push(o1 + o2); break;
                    case '-': stack.push(o1 - o2); break;
                    case '*': stack.push(o1 * o2); break;
                    case '/': stack.push(o1 / o2); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String prefix = "+*235"; // Corresponds to (2 * 3) + 5 = 11
        System.out.println("Result: " + evaluatePrefix(prefix));
    }
}
