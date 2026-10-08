// Q26. Implement a circular queue of size 5 with enqueue and dequeue operations.
public class CircularQueue_Q26_Implement_a_circular_queue_of_size_5_with_enqueue_and_dequeue_operations {
    static class CircularQueue {
        int[] arr;
        int front = 0, rear = -1, count = 0, size;

        CircularQueue(int size) {
            this.size = size;
            arr = new int[size];
        }

        boolean isFull() {
            return count == size;
        }

        boolean isEmpty() {
            return count == 0;
        }

        void enqueue(int x) {
            if (isFull()) {
                System.out.println("Queue is full, cannot insert " + x);
                return;
            }
            rear = (rear + 1) % size;
            arr[rear] = x;
            count++;
        }

        int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int x = arr[front];
            front = (front + 1) % size;
            count--;
            return x;
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue (front to rear): ");
            for (int i = 0, idx = front; i < count; i++, idx = (idx + 1) % size) {
                System.out.print(arr[idx] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        for (int i = 1; i <= 5; i++) q.enqueue(i * 10);
        q.enqueue(60); // full
        q.display();
        System.out.println("Dequeued: " + q.dequeue());
        q.enqueue(60); // slot reused
        q.display();
    }
}
