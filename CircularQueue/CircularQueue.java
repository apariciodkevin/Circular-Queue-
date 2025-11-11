package CircularQueue;

public class CircularQueue {

    // Setup Nodes
    public class Node {
        private Object data;
        private Node next = null;
        private Node prev = null;

        // Constructor
        Node (Object data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }
    }

    private Node front = null;
    private Node rear = null;
    private int size;

    // Display Queue
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        Node temp = front;
        rear.next = front; // Set rear.next to front since it is circular queue.
        while(temp.next != front) { // Once it reaches the front again. Loop will stop.
            System.out.print(temp.data + " | ");
            temp = temp.next;// Set temp to the next node.
        }
        System.out.print(temp.data);
        System.out.println();
    }

    // Add to the back of the queue
    public void enqueue(Object data) {
        Node newNode = new Node(data); // Create the node

        // Check if rear is empty
        if (size == 0) {
            rear = newNode;
            front = newNode;
        } else {
            rear.next = newNode; // Queue is FIFO
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is clear");
            return;
        } else {
            front = front.next;
            front.prev = null;
        }
        size--;
    }

    public void getSize() {
        System.out.println("Size: " + size);
    }

    public void peek() {
        System.out.println("Peek: " + front);
    }
    public void front() {
        System.out.println("Front: " + front);
    }
    public void rear() {
        System.out.println("Rear: " + rear);
    }


}
