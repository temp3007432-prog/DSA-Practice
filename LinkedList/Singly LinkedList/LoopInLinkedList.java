package LinkedList;

public class LoopInLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class isLoop{
        Node head;
        Node node = new Node(10);
        isLoop(){
            this.head = node;
        }

        public void addAtEnd(int data) {
            Node Node = new Node(data);
            if (head == null) {
                head = Node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = Node;
            }
        }


        public boolean checkLoop(){
            Node fast = head;
            Node slow = head;

            while(fast.next != null && fast.next.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }

            if (fast == slow)
                return true;
            else return false;
        }

        static void main(String[] args) {
           Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);

        }
    }
}
