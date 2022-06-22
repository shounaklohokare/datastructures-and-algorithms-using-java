public class Stack {

    private static final int DEFAULT_SIZE = 10;

    int size;
    int ptr = -1;

    int[] data;

    Stack() {
        this(DEFAULT_SIZE);
    }

    Stack(int size) {
        this.size = size;
        data = new int[size];
    }

    boolean isEmpty() {
        return this.ptr == -1;
    }

    boolean isFull() {
        return ptr == this.size - 1;
    }

    public void push(int ele) throws StackException {

        if (isFull()) {
            throw new StackException("Stack Overflow!");
        }

        data[++ptr] = ele;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack Underflow!");
        }

        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack Underflow!");
        }

        return data[ptr];
    }

    public void display() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack Underflow!");
        }
        int i;
        for (i = 0; i < ptr; i++) {
            System.out.print(data[i] + " -> ");
        }
        System.out.println(data[i]);
        System.out.println(" <- TOP");
    }

}

class StackMain {

    public static void main(String[] args) throws StackException {

        Stack stck = new Stack();

        stck.push(69);
        stck.push(420);
        stck.push(55);
        stck.push(66);
        stck.push(21);
        stck.push(432);
        stck.push(4354);
        stck.push(656);
        stck.push(435434);
        stck.push(65611);
        stck.push(434);

        System.out.println(stck.pop());
        System.out.println(stck.pop());
        System.out.println(stck.pop());
        System.out.println(stck.pop());
        System.out.println(stck.pop());

    }

}
