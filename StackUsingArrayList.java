// Stack implementation using ArrayList in Java
import java.util.ArrayList;

public class StackUsingArrayList {
    private ArrayList<Integer> stack;

    public StackUsingArrayList() {
        stack = new ArrayList<>();
    }

    // Push element onto stack
    public void push(int data) {
        stack.add(data);
        System.out.println(data + " pushed to stack");
    }

    // Pop element from stack
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = stack.remove(stack.size() - 1);
        return popped;
    }

    // Peek top element
    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingArrayList stack = new StackUsingArrayList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
