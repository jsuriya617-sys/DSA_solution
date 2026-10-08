// Q28. Detect whether a circular queue is full or empty.
public class CircularQueue_Q28_Detect_whether_a_circular_queue_is_full_or_empty {
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
        CircularQueue q = new CircularQueue(3);
        System.out.println("Empty? " + q.isEmpty() + ", Full? " + q.isFull());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Empty? " + q.isEmpty() + ", Full? " + q.isFull());
        q.dequeue();
        System.out.println("Empty? " + q.isEmpty() + ", Full? " + q.isFull());
    }
}
