// Q37. Using two stacks, perform enqueue(10), enqueue(20), enqueue(30), dequeue(), and peek().
import java.util.Stack;

public class QueueUsingStacks_Q37_Using_two_stacks_perform_enqueue_10_enqueue_20_enqueue_30_dequeue_and_peek {
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
            return out.pop();
        }

        int peek() {
            shift();
            return out.peek();
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Peek: " + q.peek());
    }
}
