package singleLinkedList;

import java.util.*;

public class LL {
    public class Node {
        int data;
        Node next;

        /**
         * @param data
         * @param next
         */
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head = null;

    public void creation() {
        int data, n, m, p;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter data : ");
            data = scan.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            } else {
                System.out.print(
                        "ente : 1 to insert the item at the begining , 2 to insert the item at the end , 3 to insert the item at the specific position");
                m = scan.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;

                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;

                    case 3:

                        System.out.print("enter postion of node to the position");
                        p = scan.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < p - 1; i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;

                }
            }
            System.out.print("Do u want to add more data. if yes , press 1:");
            n = scan.nextInt();
            // scan.close();
        } while (n == 1);
        // System.out.print("end");
        scan.close();
    }
    // System.out.print("end");
    // scan.close();

    public void traverse() {
        Node temp = head;

        if (head == null) {
            System.out.println("LL does not exist");

        } else {
            while (temp != null) {
                System.out.print(temp.data + "   ");
                temp = temp.next;
            }
        }
    }
}
