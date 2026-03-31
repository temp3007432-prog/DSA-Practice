package Queue;

public class LinearQueue {
    int[] arr = new int[10];
    int maxValue = arr.length;
    int front = 0;
    int rear = -1;

    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue();
        queue.enqueue(10);
    }

    public boolean isEmpty() {
        if (rear < front) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (rear == maxValue - 1) {
            return true;
        }
        return false;
    }

    public void enqueue(int x) {
        if (!isFull()) {
            arr[++rear] = x;   
        }
        else System.out.println("Queue is full!");
    }
    public void dqueue(int x) {
        if (!isEmpty()) {
            arr[front++] = x;   
        }
        else System.out.println("Queue is Empty!");
    }
    public void size(){
        System.out.println("Size is " + (rear - front + 1));
    }

}



