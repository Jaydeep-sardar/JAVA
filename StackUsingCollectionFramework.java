// Stack implementation using Java Collection Framework (Stack class)
import java.util.Stack;

public class StackUsingCollectionFramework {
    private Stack<Integer> stack;

    public StackUsingCollectionFramework() {
        stack = new Stack<>();
    }

    // Push element onto stack
    public void push(int data) {
        stack.push(data);
        System.out.println(data + " pushed to stack");
    }

    // Push element at the bottom of the stack
    public void pushAtBottom(int data) {
        if (stack.isEmpty()) {
            stack.push(data);
        } else {
            int temp = stack.pop();
            pushAtBottom(data);
            stack.push(temp);
        }
        System.out.println(data + " pushed at bottom of stack");
    }

    // Pop element from stack
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack.pop();
    }

    // Peek top element
    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.peek();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingCollectionFramework stack = new StackUsingCollectionFramework();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Push at bottom example
        stack.push(40);
        stack.pushAtBottom(5);
        System.out.println("Stack after pushing 5 at bottom: " + stack.stack);
    }
}
