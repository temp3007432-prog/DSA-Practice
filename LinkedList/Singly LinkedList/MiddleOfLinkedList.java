package LinkedList;

public class MiddleOfLinkedList {

    static public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static public class MiddleNode {
        Node head;
        Node node = new Node(10);
        MiddleNode() {
            this.head = null;
        }
        public void addAtEnd(int data) {
            Node node = new Node(data);
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
            }
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public Node returnMiddle(Node head) {
            int count = 1;
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
                count++;
            }

            temp = head;
            int mid = count/2;
            for (int i = 0; i < mid; i++){
                temp = temp.next;
            }
            return temp;
        }

        static void main(String[] args) {
            MiddleNode LL = new MiddleNode();

            LL.addAtEnd(10);
            LL.addAtEnd(20);
            LL.addAtEnd(30);
            LL.addAtEnd(40);
            LL.addAtEnd(50);

            LL.display();
            System.out.println();

            System.out.println("Middle node: " + LL.returnMiddle(LL.head).data);


        }
    }
}
