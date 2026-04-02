package LinkedList.DoublyLinkedList;

public class DoublyLinkedListSyntax {
    public static void main(String[] args) {
        LinkedList myDLL = new LinkedList();

        myDLL.insertAtTail(10);
        myDLL.insertAtTail(20);
        myDLL.insertAtTail(30);
        myDLL.insertAtTail(40);
        myDLL.insertAtTail(50);

        myDLL.displayBackwards();
        System.out.println();
        myDLL.displayForwards();

        myDLL.insertAtHead(9);
        myDLL.insertAtHead(8);

        System.out.println();
        myDLL.displayForwards();
        System.out.println();
        myDLL.displayBackwards();
        System.out.println();

        myDLL.insertAtPosition(25,4);
        myDLL.displayForwards();
        System.out.println();
        myDLL.displayBackwards();
        myDLL.displayForwards();
        System.out.println();

        myDLL.deleteHead();
        myDLL.displayForwards();

        System.out.println();

        myDLL.deleteTail();
        myDLL.displayForwards();

         System.out.println();

        myDLL.deleteAtIndex(1);
        myDLL.displayForwards();

    }

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static class LinkedList {
        Node head;
        Node tail;

        public LinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertAtTail(int data) {
            Node myNode = new Node(data);
            if (head == null) {
                head = tail = myNode;
                return;
            } else {
                tail.next = myNode;
                myNode.prev = tail;
                tail = myNode;
            }
        }

        public void displayBackwards() {
            Node trav;
            trav = tail;

            while (trav != null) {
                System.out.print(trav.data + " ");
                trav = trav.prev;
            }

        }

        public void displayForwards() {
            Node trav;
            trav = head;

            while (trav != null) {
                System.out.print(trav.data + " ");
                trav = trav.next;
            }
        }

        public void insertAtHead(int data) {
            Node myNode = new Node(data);

            if (head == null) {
                head = tail = myNode;
                return;
            }

            myNode.next = head;
            head.prev = myNode;
            head = myNode;
        }

        public void insertAtPosition(int data, int position) {
            Node myNode = new Node(data);

            if (position == 0) {
                insertAtHead(data);
            }

            Node trav = head;
            for (int i = 0; i < position - 1 && trav != null; i++) {
                trav = trav.next;
            }
            myNode.next = trav.next;
            myNode.prev = trav;
            trav.next.prev = myNode;
            trav.next = myNode;
            if (trav == tail) {
                insertAtTail(data);
            }
        }

        public void deleteHead() {
            if (head == null) {
                return;
            }
            if (head == tail) {
                head = tail = null;
                return;
            }
            head = head.next;
            head.prev = null;
        }

        public void deleteTail() {
            if (head == null) {
                return;
            }
            if (head == tail) {
                head = tail = null;
            }
            tail = tail.prev;
            tail.next = null;
        }

        public void deleteAtIndex(int position) {
            if (position == 0) {
                deleteHead();
            }

            Node trav = head;
            for (int i = 0; i < position - 1 && trav != null; i++) {
                trav = trav.next;
            }

            Node toBeDeleted = trav.next;
            trav.next = toBeDeleted.next;
            toBeDeleted.next.prev = trav;
            toBeDeleted.next = null;
            toBeDeleted.prev = null;
        }
    }
}
