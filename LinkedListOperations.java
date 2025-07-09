public class LinkedListOperations {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node head;

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete by value
    void delete(int data) {
        if (head == null) return;
        if (head.data == data) { head = head.next; return; }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    // Search
    boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) return true;
            temp = temp.next;
        }
        return false;
    }

    // Print list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse the linked list
    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertAtBeginning(5);
        System.out.print("List after insertions: ");
        list.printList();
        list.delete(20);
        System.out.print("List after deleting 20: ");
        list.printList();
        System.out.println("Search 30: " + list.search(30));
        System.out.println("Search 100: " + list.search(100));
        list.reverse();
        System.out.print("List after reversing: ");
        list.printList();
    }
}
