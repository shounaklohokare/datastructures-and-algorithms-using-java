public class DLL {

    private Node head;
    private Node tail;

    private int size = 0;

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node next, Node prev) {
            this.value = val;
            this.next = next;
            this.prev = prev;
        }

    }

    public void insertFirst(int val) {

        Node node = new Node(val);

        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;

    }

    public int deleteFirst() {

        if (head == null) {
            System.out.println("Empty Linked List");
            return -1;
        }

        int val = head.value;

        if (head.next != null)
            head.next.prev = null;

        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return val;

    }

    public void insertLast(int val) {

        if (head == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);

        node.next = null;
        tail.next = node;
        node.prev = tail;
        tail = node;

        size--;

    }

    public int deleteLast() {

        if (tail == null) {
            System.out.println("Empty Linked List");
            return -1;
        }
        if (size == 1) {
            return deleteFirst();
        }

        int val = tail.value;

        tail.prev.next = null;
        tail = tail.prev;

        size--;
        return val;

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

    public void insertAfter(int afterVal, int val) {

        Node prev = find(afterVal);

        if (prev == null) {
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(val);

        node.next = prev.next;

        if (prev.next != null) {
            prev.next.prev = node;
        }

        prev.next = node;
        node.prev = prev;

        size++;
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
        prev.next.prev = node;
        prev.next = node;
        node.prev = prev;

        size++;
    }

    public int delete(int index) {

        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = getNode(index);

        int val = prev.next.value;

        prev.next = prev.next.next;
        prev.next.prev = prev;

        size--;
        return val;

    }

    public int deleteVal(int val) {

        Node node = find(val);

        if (node == null) {
            System.out.println("Node with value not found");
            return -1;
        }

        if (node.prev == null) {
            return deleteFirst();
        }

        if (node.next == null) {
            return deleteLast();
        }

        Node prev = node.prev;

        prev.next = prev.next.next;
        prev.next.prev = prev;

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

    public void displayReverse() {
        Node node = tail;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.prev;
        }
        System.out.println("START");
    }

    public void display() {
        Node node = head;

        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

}
