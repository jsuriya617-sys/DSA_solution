// Q36. Implement a FIFO Queue using two Stacks.
import java.util.Stack;

public class QueueUsingStacks_Q36_Implement_a_FIFO_Queue_using_two_Stacks {
    static class QueueUsingStacks {
        Stack<Integer> in = new Stack<>();
        Stack<Integer> out = new Stack<>();

        void enqueue(int x) {
            in.push(x);
        }

        void shift() {
            if (out.isEmpty()) {
                while (!in.isEmpty()) out.push(in.pop());
            }
        }

        int dequeue() {
            shift();
            if (out.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return out.pop();
        }

        int peek() {
            shift();
            if (out.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return out.peek();
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
    }
}
