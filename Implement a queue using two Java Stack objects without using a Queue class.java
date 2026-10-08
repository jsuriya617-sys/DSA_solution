// Q38. Implement a queue using two Java Stack objects without using a Queue class.
import java.util.Stack;

public class QueueUsingStacks_Q38_Implement_a_queue_using_two_Java_Stack_objects_without_using_a_Queue_class {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>(); // input stack
        Stack<Integer> stack2 = new Stack<>(); // output stack

        // enqueue 5, 10, 15, 20
        stack1.push(5);
        stack1.push(10);
        stack1.push(15);
        stack1.push(20);

        // dequeue everything (FIFO)
        System.out.print("Dequeue order: ");
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) stack2.push(stack1.pop());
            }
            System.out.print(stack2.pop() + " ");
        }
        System.out.println();
    }
}
