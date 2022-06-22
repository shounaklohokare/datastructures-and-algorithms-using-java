public class Queue {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    Queue() {
        this(DEFAULT_SIZE);
    }

    Queue(int size) {
        this.data = new int[size];
    }

    boolean isFull() {
        return end == data.length;
    }

    boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) throws QueueException {
        if (isFull()) {
            throw new QueueException("Queue is full!!");
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty!!");
        }

        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty!!");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

}

class QueueMain {

    public static void main(String[] args) throws QueueException {
        Queue q = new Queue();

        q.insert(0);
        q.insert(55);
        q.insert(69);
        q.insert(770);
        q.insert(567);

        System.out.println(q.front());

        q.display();

    }

}