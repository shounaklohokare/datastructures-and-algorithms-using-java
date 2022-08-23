public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public void insertFirst(int val) {

        Node node = new Node(val);

        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;

    }

    public int deleteFirst() {

        int val = head.value;

        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void insert(int index, int val) {

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node node = new Node(val);
        Node prev = getNode(index);

        node.next = prev.next;
        prev.next = node;

        size++;
    }

    public Node find(int val) {

        Node node = head;
        while (node != null) {

            if (node.value == val) {
                return node;
            }
            node = node.next;

        }
        return null;

    }

    public int delete(int index) {

        if (index == 0) {
            return deleteFirst();
        }

        Node prev = getNode(index - 1);

        int val = prev.next.value;
        prev.next = prev.next.next;

        size--;
        return val;

    }

    private Node getNode(int index) {
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public void insertLast(int value) {

        if (tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);

        tail.next = node;
        tail = node;

        size++;

    }

    public int deleteLast() {

        if (size <= 1) {
            return deleteFirst();
        }

        int val = tail.value;

        Node secondLast = getNode(size - 1);

        secondLast.next = null;
        tail = secondLast;
        size--;
        return val;

    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}