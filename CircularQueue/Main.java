package CircularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(30);
        q.enqueue(15);
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(78);
        q.enqueue(34);
        q.front();
        q.rear();
        q.getSize();
        q.display();
        q.peek();



    }
}