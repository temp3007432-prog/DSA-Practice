package LinkedList.SinglyLinkedList;

public class StackUsingLL {
    public static void main(String[] args) {
        StackUsingLL myStack = new StackUsingLL();

        myStack.push(10);
    }
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    public void push (int data){
        Node myNode = new Node(data);
        if (head == null){
            head = myNode;
        }
        else{
            myNode.next = head;
            head = myNode;
        }
    }

    public int pop(){
        if (head == null){
            return 1;
        }
        else{
            head = head.next;
            return head.next.data;
        }
    }

    public void display(){
        
    }

}
