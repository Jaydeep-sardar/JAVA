// Queue implementation using Linked List in Java
class QueueNode {
    int data;
    QueueNode next;
    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueUsingLinkedList {
    private QueueNode front, rear;

    public QueueUsingLinkedList() {
        front = rear = null;
    }

    // Enqueue operation
    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " enqueued to queue");
    }

    // Dequeue operation
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int removed = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return removed;
    }

    // Peek front element
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front element is " + queue.peek());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
