// Stack implementation using Linked List in Java

class StackNode {
    int data;
    StackNode next;
    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkedList {
    private StackNode top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    // Push element onto stack
    public void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed to stack");
    }

    // Pop element from stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    // Peek top element
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
