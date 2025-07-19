// Queue implementation using Java Collection Framework (LinkedList)
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingCollectionFramework {
    private Queue<Integer> queue;

    public QueueUsingCollectionFramework() {
        queue = new LinkedList<>();
    }

    // Enqueue operation
    public void enqueue(int data) {
        queue.offer(data);
        System.out.println(data + " enqueued to queue");
    }

    // Dequeue operation
    public int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue.poll();
    }

    // Peek front element
    public int peek() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingCollectionFramework queue = new QueueUsingCollectionFramework();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front element is " + queue.peek());
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Queue elements: " + queue.queue);
    }
}
