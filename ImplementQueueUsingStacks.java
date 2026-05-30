import java.util.Stack;
import java.util.*;
class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;
    public MyQueue() {
        in=new Stack<>();
        out=new Stack<>();
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        if(!out.isEmpty()){
            return out.pop();
        }
        else{
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        return out.pop();
    }
    
    public int peek() {
        if(!out.isEmpty()){
            return out.peek();
        }
        else{
            while(!in.isEmpty()){
                out.push(in.pop());
            }
        }
        return out.peek();
    }
    
    public boolean empty() {
        return out.isEmpty() && in.isEmpty();
    }
}

public class ImplementQueueUsingStacks {
    public static void main(String[] args){
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop()); // Output: 1
        System.out.println(queue.peek()); // Output: 2
        System.out.println(queue.empty()); // Output: false
    }
}