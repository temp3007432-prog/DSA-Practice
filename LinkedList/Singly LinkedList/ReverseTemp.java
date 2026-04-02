package LinkedList;

public class ReverseTemp {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class ReverseLogic{

        public static Node reverse(Node head){
            Node prev = null;
            Node current = head;
            Node next = null;
            while(current != null){
                next  = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }

        public static void printList(Node node){
            while (node != null){
                System.out.print(node.data + " -> ");
                node = node.next;
            }
            System.out.println("Null");
        }

        static void main(String[] args) {
          Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);

            System.out.println("Original Linked List:");
            printList(head);

            // Reverse the list
            head = reverse(head);

            System.out.println("Reversed Linked List:");
            printList(head);
        }
    }
}
