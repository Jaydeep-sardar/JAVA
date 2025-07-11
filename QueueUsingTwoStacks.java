// Queue implementation using two stacks in Java
import java.util.Stack;

public class QueueUsingTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int data) {
        stack1.push(data);
        System.out.println(data + " enqueued to queue");
    }

    // Dequeue operation
    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return stack2.pop();
    }

    // Peek front element
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return stack2.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front element is " + queue.peek());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
