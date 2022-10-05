public class doublylinkedList {
    public class Node {
        int data;
        Node prev;
        Node next;

        /**
         * @param data
         */
        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

    }

    Node head = null;
    Node tail = null;

    public void insert(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            head.prev = new_node;
            // head = new_node;
            new_node.next = head;
            head = new_node;
        }
    }

    public void insertFirst(int data) {
        insert(data);
    }

    public void insertLast(int data) {
        Node new_node = new Node(data);
        tail.next = new_node;
        new_node.prev = tail;
        tail = new_node;
    }

    public void insertAtSpecific(int data, int x) {
        Node new_node = new Node(data);
        Node temp = head;
        Node ptr = temp.next;
        for (int i = 0; i < (x - 1); i++) {
            temp = ptr;
            ptr = temp.next;
        }
        temp.next = new_node;
        ptr.prev = new_node;
        new_node.prev = temp;
        new_node.next = ptr;

    }

    public void deletefirst() {
        Node temp = head;
        temp = temp.next;
        temp.prev = null;
        head = temp;

    }

    public void deleteEnd() {
        Node temp = tail;
        temp = temp.prev;
        temp.next = null;
        tail = temp;
    }

    public void deleteAtspecific(int p) {
        Node temp = head;
        Node ptr = temp.next;
        for (int i = 0; i < (p - 1); i++) {
            temp = ptr;
            ptr = temp.next;
        }
        temp.next = ptr.next;
        ptr.next.prev = temp;
    }

    public void disply() {
        // Node new_node = new Node();
        Node temp = head;

        if (head == null) {
            System.out.println("LL does not exist");

        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("end");
        System.out.println();

    }

    public static void main(String[] args) {
        doublylinkedList ll = new doublylinkedList();
        ll.insert(15);
        ll.insert(20);
        ll.insert(25);
        ll.insert(30);
        ll.insert(35);
        ll.insert(40);
        ll.insert(45);
        ll.disply();
        ll.insertLast(52);
        ll.disply();
        ll.insertFirst(85);
        ll.disply();
        ll.insertAtSpecific(96, 3);
        ll.disply();
        ll.deletefirst();
        ll.disply();
        ll.deleteEnd();
        ll.disply();
        ll.deleteAtspecific(2);
        ll.disply();
    }
}