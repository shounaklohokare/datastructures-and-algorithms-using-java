public class DynamicQueue {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    DynamicQueue() {
        this(DEFAULT_SIZE);
    }

    DynamicQueue(int size) {
        this.data = new int[size];
    }

    boolean isFull() {
        return size == data.length;
    }

    boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) throws QueueException {
        if (this.isFull()) {

            int[] new_queue = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                new_queue[i] = data[(front + i) % data.length];
            }

            front = 0;
            end = data.length;
            data = new_queue;

        }
        data[end++] = item;
        end %= data.length;
        size++;
        return true;
    }

    public int remove() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty!!");
        }

        int removed = data[front++];
        front %= data.length;
        size--;
        return removed;
    }

    public int front() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty!!");
        }
        return data[front];
    }

    public void display() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty!!");
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }

}

class DynamicQueueMain {

    public static void main(String[] args) throws QueueException {
        DynamicQueue q = new DynamicQueue(5);

        q.insert(0);
        q.insert(55);
        q.insert(69);
        q.insert(770);
        q.insert(420);

        q.display();

        q.remove();

        q.display();

        q.insert(69420);

        q.display();

        q.insert(0);
        q.insert(55);
        q.insert(69);
        q.insert(770);
        q.insert(420);

        q.display();

        q.remove();

        q.display();

        q.insert(69420);

        q.display();

        q.insert(0);
        q.insert(55);
        q.insert(69);
        q.insert(770);
        q.insert(420);

        q.display();

        q.remove();

        q.display();

        q.insert(69420);

        q.display();

        q.insert(0);
        q.insert(55);
        q.insert(69);
        q.insert(770);
        q.insert(420);

        q.display();

        q.remove();

        q.display();

        q.insert(69420);

        q.display();

        q.insert(0);
        q.insert(55);
        q.insert(69);
        q.insert(770);
        q.insert(420);

        q.display();

        q.remove();

        q.display();

        q.insert(69420);

        q.display();

        q.insert(0);
        q.insert(55);
        q.insert(69);
        q.insert(770);
        q.insert(420);

        q.display();

        q.remove();

        q.display();

        q.insert(69420);

        q.display();

        q.insert(0);
        q.insert(55);
        q.insert(69);
        q.insert(770);
        q.insert(420);

        q.display();

        q.remove();

        q.display();

        q.insert(69420);

        q.display();

        q.insert(0);
        q.insert(55);
        q.insert(69);
        q.insert(770);
        q.insert(420);

        q.display();

        q.remove();

        q.display();

        q.insert(69420);

        q.display();

    }

}