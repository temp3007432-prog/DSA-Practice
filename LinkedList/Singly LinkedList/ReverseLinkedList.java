package LinkedList;

public class ReverseLinkedList {

    static public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static public class LinkedListReversal {

        public static Node reverse(Node head) {
            Node prev = null;
            Node current = head;
            Node next = null;

            while (current != null) {
                next = current.next;    // 1. Store next node
                current.next = prev;     // 2. Reverse current node's pointer
                prev = current;          // 3. Move prev one step forward
                current = next;          // 4. Move current one step forward
            }
            return prev; // New head of the reversed list
        }

        // Helper method to print the list
        public static void printList(Node node) {
            while (node != null) {
                System.out.print(node.data + " -> ");
                node = node.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            // Create a list: 1 -> 2 -> 3 -> 4 -> 5
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
