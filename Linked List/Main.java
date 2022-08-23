public class Main {

    public static void main(String[] args) {

        // LL ll = new LL();

        // ll.insertFirst(19);
        // ll.insertFirst(4);
        // ll.insertFirst(2000);
        // ll.insertFirst(69);
        // ll.insertLast(23);
        // ll.insert(1, 435);

        // ll.display();

        // ll.delete(3);

        // ll.display();

        DLL ll = new DLL();

        ll.insertFirst(19);
        ll.insertFirst(4);
        ll.insertFirst(2000);
        ll.insertFirst(69);

        ll.display();

        ll.deleteVal(2000);

        ll.display();

        // ll.displayReverse();

    }

}
