package LinkedList;

public class SinglyLinkedListSyntax {

    public static void main(String[] args) {
        LinkedList myLL = new LinkedList();
        myLL.addAtEnd(10);
        myLL.addAtEnd(20);
        myLL.addAtEnd(30);
        myLL.addAtEnd(40);

        myLL.display();
        System.out.println();

        myLL.addAtBegining(9);
        myLL.addAtBegining(8);
        myLL.addAtEnd(50);

        myLL.display();
        System.out.println();

        myLL.addAtPosition(90, 2);
        myLL.display();

    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head;

        public LinkedList() {
            this.head = null;
        }

        public void addAtEnd(int data) {
            Node myNode = new Node(data);
            if (head == null) {
                head = myNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = myNode;
            }
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public void addAtBegining(int data) {
            Node myNode = new Node(data);
            if (head == null) {
                head = myNode;
            } else {
                myNode.next = head;
                head = myNode;
            }
        }

        public void addAtPosition(int data, int position){
            if(head == null){
                addAtBegining(data);
                return;
            }
            Node myNode = new Node(data);
            Node temp = head;

            for (int i = 0; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }

            myNode.next = temp.next;
            temp.next = myNode;
        }
    }
}
