// Q21. Implement a Queue using an array with enqueue(), dequeue(), peek(), and display().
public class Queue_Q21_Implement_a_Queue_using_an_array_with_enqueue_dequeue_peek_and_display {
    static int[] arr = new int[10];
    static int front = 0, rear = -1;

    static void enqueue(int x) {
        if (rear == arr.length - 1) {
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = x;
    }

    static int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front++];
    }

    static int peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    static void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue (front to rear): ");
        for (int i = front; i <= rear; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        display();
        System.out.println("Dequeued: " + dequeue());
        System.out.println("Peek: " + peek());
        display();
    }
}
