import java.util.*;
public class DeleteMiddleEleInStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Original Stack: " + stack);
        deleteMiddleElement(stack, stack.size() / 2 + 1);
        System.out.println("Stack after deleting middle element: " + stack);
    }
    public static void deleteMiddleElement(Stack<Integer> stack, int middle) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        if (middle == 1) {
            return; // Middle element found and removed
        }
        deleteMiddleElement(stack, middle - 1);
        stack.push(top); // Push the top element back after recursive call
    }
}
