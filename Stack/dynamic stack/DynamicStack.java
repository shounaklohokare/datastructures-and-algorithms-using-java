public class DynamicStack {

    private static final int INITAL_SIZE = 10;

    int ptr = -1;

    int[] data;

    DynamicStack() {
        this.data = new int[INITAL_SIZE];
    }

    boolean isEmpty() {
        return this.ptr == -1;
    }

    boolean isFull() {
        return ptr == data.length - 1;
    }

    public void push(int ele) {

        if (this.isFull()) {
            int[] new_stack = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                new_stack[i] = data[i];
            }

            data = new_stack;
        }
        ptr++;
        data[ptr] = ele;
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

class DynamicStackMain {

    public static void main(String[] args) throws StackException {

        DynamicStack dstck = new DynamicStack();

        dstck.push(69);
        dstck.push(420);
        dstck.push(55);
        dstck.push(66);
        dstck.push(21);
        dstck.push(432);
        dstck.push(4354);
        dstck.push(656);
        dstck.push(435434);
        dstck.push(55);
        dstck.push(66);
        dstck.push(21);
        dstck.push(432);
        dstck.push(4354);
        dstck.push(656);
        dstck.push(435434);
        dstck.push(4354);
        dstck.push(656);
        dstck.push(435434);
        dstck.push(55);
        dstck.push(66);
        dstck.push(21);
        dstck.push(432);
        dstck.push(4354);
        dstck.push(656);
        dstck.push(435434);
        dstck.push(4354);
        dstck.push(656);
        dstck.push(435434);
        dstck.push(55);
        dstck.push(66);
        dstck.push(21);
        dstck.push(432);
        dstck.push(4354);
        dstck.push(656);
        dstck.push(435434);
        dstck.push(4354);
        dstck.push(656);
        dstck.push(435434);
        dstck.push(55);
        dstck.push(66);
        dstck.push(21);
        dstck.push(432);
        dstck.push(4354);
        dstck.push(656);
        dstck.push(435434);

        System.out.println(dstck.pop());
        System.out.println(dstck.pop());
        System.out.println(dstck.pop());
        System.out.println(dstck.pop());
        System.out.println(dstck.peek());

        dstck.display();

    }

}
